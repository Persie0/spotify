package com.spotify.hubs.moshi;

import android.annotation.SuppressLint;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import p204p.edb;
import p204p.gk60;
import p204p.grl0;
import p204p.i2s;
import p204p.k0e1;
import p204p.vj30;
import p204p.wj30;

/* JADX INFO: loaded from: classes7.dex */
public final class HubsJsonComponentBundle {

    /* JADX INFO: renamed from: b */
    private static final String f4180b = "data";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4180b)
    private Map<String, Object> f4181a;

    public static class HubsJsonComponentBundleCompatibility extends HubsImmutableComponentBundle {
        public HubsJsonComponentBundleCompatibility(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            super(hubsImmutableComponentBundle);
        }
    }

    public HubsJsonComponentBundle() {
    }

    /* JADX INFO: renamed from: a */
    private static <T> T[] m11898a(List<?> list, Class<T> cls) {
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, list.size()));
        for (int i = 0; i < list.size(); i++) {
            tArr[i] = cls.cast(list.get(i));
        }
        return tArr;
    }

    /* JADX INFO: renamed from: b */
    private static Object m11899b(List<?> list) {
        int i = 0;
        if (list.isEmpty()) {
            return new String[0];
        }
        Object obj = list.get(0);
        obj.getClass();
        Class<?> cls = obj.getClass();
        if (obj instanceof String) {
            return m11898a(list, String.class);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return m11898a(list, Map.class);
        }
        if (obj instanceof Integer) {
            return k0e1.m54979N(list);
        }
        if (obj instanceof Long) {
            Object[] array = list.toArray();
            int length = array.length;
            long[] jArr = new long[length];
            while (i < length) {
                Object obj2 = array[i];
                obj2.getClass();
                jArr[i] = ((Number) obj2).longValue();
                i++;
            }
            return jArr;
        }
        if (obj instanceof Float) {
            return grl0.m45519O(list);
        }
        if (obj instanceof Double) {
            int i2 = i2s.f97916b;
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            double[] dArr = new double[length2];
            while (i < length2) {
                Object obj3 = array2[i];
                obj3.getClass();
                dArr[i] = ((Number) obj3).doubleValue();
                i++;
            }
            return dArr;
        }
        if (!(obj instanceof Boolean)) {
            throw new Error(edb.m38566o("Not Implemented. Convert List to Array. Type: ", String.valueOf(list.getClass()), ", elm: ", String.valueOf(cls)));
        }
        Object[] array3 = list.toArray();
        int length3 = array3.length;
        boolean[] zArr = new boolean[length3];
        while (i < length3) {
            Object obj4 = array3[i];
            obj4.getClass();
            zArr[i] = ((Boolean) obj4).booleanValue();
            i++;
        }
        return zArr;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: c */
    public wj30 m11900c() {
        vj30 vj30VarBuilder = HubsImmutableComponentBundle.builder();
        Map<String, Object> map = this.f4181a;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    Class<?> cls = value.getClass();
                    if (List.class.isAssignableFrom(cls)) {
                        value = m11899b((List) value);
                        cls = value.getClass();
                    }
                    if (value instanceof String) {
                        vj30VarBuilder = vj30VarBuilder.mo33717r(key, (String) value);
                    } else if (value instanceof Integer) {
                        vj30VarBuilder = vj30VarBuilder.mo33711l(((Integer) value).intValue(), key);
                    } else if (value instanceof Long) {
                        vj30VarBuilder = vj30VarBuilder.mo33714o(((Long) value).longValue(), key);
                    } else if (value instanceof Float) {
                        vj30VarBuilder = vj30VarBuilder.mo33710k(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        vj30VarBuilder = vj30VarBuilder.mo33708i(key, ((Double) value).doubleValue());
                    } else if (value instanceof Boolean) {
                        vj30VarBuilder = vj30VarBuilder.mo33701b(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof wj30) {
                        vj30VarBuilder = vj30VarBuilder.mo33704e(key, (wj30) value);
                    } else if (String[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33718s(key, (String[]) value);
                    } else if (int[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33712m(key, (int[]) value);
                    } else if (byte[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33706g(key, (byte[]) value);
                    } else if (long[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33713n(key, (long[]) value);
                    } else if (float[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33709j(key, (float[]) value);
                    } else if (double[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33707h(key, (double[]) value);
                    } else if (boolean[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33702c(key, (boolean[]) value);
                    } else if (Map[].class.equals(cls)) {
                        Map[] mapArr = (Map[]) value;
                        wj30[] wj30VarArr = new wj30[mapArr.length];
                        for (int i = 0; i < mapArr.length; i++) {
                            wj30VarArr[i] = new HubsJsonComponentBundle(mapArr[i]).m11900c();
                        }
                        vj30VarBuilder = vj30VarBuilder.mo33705f(key, wj30VarArr);
                    } else if (wj30[].class.equals(cls)) {
                        vj30VarBuilder = vj30VarBuilder.mo33705f(key, (wj30[]) value);
                    } else {
                        if (!Map.class.isAssignableFrom(cls)) {
                            throw new Error("Not Implemented. Type: ".concat(cls.getSimpleName()));
                        }
                        vj30VarBuilder = vj30VarBuilder.mo33704e(key, new HubsJsonComponentBundle((Map) value).m11900c());
                    }
                }
            }
        }
        return new HubsJsonComponentBundleCompatibility(vj30VarBuilder.mo33703d());
    }

    public HubsJsonComponentBundle(Map<String, Object> map) {
        this.f4181a = map;
    }
}
