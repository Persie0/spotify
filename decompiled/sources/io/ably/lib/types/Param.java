package io.ably.lib.types;

/* JADX INFO: loaded from: classes16.dex */
public class Param {
    public String key;
    public String value;

    public Param(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public static Param[] array(Param param) {
        return new Param[]{param};
    }

    public static boolean containsKey(Param[] paramArr, String str) {
        return getFirst(paramArr, str) != null;
    }

    public static String getFirst(Param[] paramArr, String str) {
        if (paramArr == null) {
            return null;
        }
        for (Param param : paramArr) {
            if (param.key.equals(str)) {
                return param.value;
            }
        }
        return null;
    }

    public static Param[] push(Param[] paramArr, Param param) {
        if (paramArr == null) {
            return new Param[]{param};
        }
        int length = paramArr.length;
        Param[] paramArr2 = new Param[length + 1];
        System.arraycopy(paramArr, 0, paramArr2, 0, length);
        paramArr2[length] = param;
        return paramArr2;
    }

    public static Param[] set(Param[] paramArr, Param param) {
        if (paramArr == null) {
            return new Param[]{param};
        }
        for (int i = 0; i < paramArr.length; i++) {
            if (paramArr[i].key.equals(param.key)) {
                paramArr[i] = param;
                return paramArr;
            }
        }
        return push(paramArr, param);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Param param = (Param) obj;
            String str = this.key;
            if (str == null ? param.key != null : !str.equals(param.key)) {
                return false;
            }
            String str2 = this.value;
            String str3 = param.value;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.key + ":" + this.value;
    }

    public Param(String str, Object obj) {
        this(str, obj.toString());
    }

    public static Param[] push(Param[] paramArr, String str, String str2) {
        return push(paramArr, new Param(str, str2));
    }

    public static Param[] set(Param[] paramArr, String str, String str2) {
        return set(paramArr, new Param(str, str2));
    }
}
