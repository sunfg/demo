package com.sun.demo.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EntityMsg {
    /**
     * 通用设置新增人信息.
     *
     * @param object javaBean
     */
    public static void setInsertInfo(Object object) throws Exception {
        invokeSet(object, "recCreator", "System");
        invokeSet(object, "recCreateTime", DateUtils.curDateTimeStr14());
        invokeSet(object, "recRevistor", " ");
        invokeSet(object, "recreviseTime", " ");
    }

    /**
     * 通用设置修改人信息.
     *
     * @param object javaBean
     */
    public static void setUpdateInfo(Object object) throws Exception {
        invokeSet(object, "recRevistor", "System");
        invokeSet(object, "recReviseTime", DateUtils.curDateTimeStr14());
    }

    /**
     * 反射执行set方法.
     *
     * @param object
     * @param fieldName
     * @param value
     */
    private static void invokeSet(Object object, String fieldName, Object value) throws Exception {
        try {
            Method method = getSetMethod(object.getClass(), fieldName);
            method.invoke(object, new Object[]{value});
        } catch (IllegalAccessException e) {
            throw new Exception(e.getMessage());
        } catch (InvocationTargetException e) {
            throw new Exception(e.getMessage());
        }

    }

    /**
     * java反射bean的set方法.
     *
     * @param objectClass
     * @param fieldName
     * @return
     */
    private static Method getSetMethod(Class objectClass, String fieldName) throws Exception {
        try {
            Class[] parameterTypes = new Class[1];
            Field field = objectClass.getDeclaredField(fieldName);
            parameterTypes[0] = field.getType();
            StringBuffer sb = new StringBuffer();
            sb.append("set");
            sb.append(fieldName.substring(0, 1).toUpperCase());
            sb.append(fieldName.substring(1));
            Method method = objectClass.getMethod(sb.toString(), parameterTypes);
            return method;
        } catch (NoSuchMethodException e) {
            throw new Exception(e.getMessage());
        } catch (NoSuchFieldException e) {
            throw new Exception(e.getMessage());
        }
    }

}
