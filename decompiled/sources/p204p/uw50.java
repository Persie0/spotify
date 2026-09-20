package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uw50 {

    /* JADX INFO: renamed from: a */
    public static final Integer f234575a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f234575a = num2;
    }
}
