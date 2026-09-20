package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xj5 {

    /* JADX INFO: renamed from: a */
    public static final int f262048a;

    static {
        Object c6x0Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c6x0Var = property != null ? bm51.m29807r0(property) : null;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Integer num = (Integer) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        f262048a = num != null ? num.intValue() : 2097152;
    }
}
