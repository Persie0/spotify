package p204p;

import org.msgpack.value.ValueType;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class ptz0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f181278a;

    static {
        int[] iArr = new int[ValueType.values().length];
        f181278a = iArr;
        try {
            iArr[ValueType.NIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f181278a[ValueType.BOOLEAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f181278a[ValueType.INTEGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f181278a[ValueType.FLOAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f181278a[ValueType.STRING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f181278a[ValueType.BINARY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f181278a[ValueType.ARRAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f181278a[ValueType.MAP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f181278a[ValueType.EXTENSION.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
