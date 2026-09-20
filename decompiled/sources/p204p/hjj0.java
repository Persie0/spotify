package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class hjj0 {

    /* JADX INFO: renamed from: a */
    public static final djj0 f92062a;

    /* JADX INFO: renamed from: b */
    public static final djj0 f92063b;

    static {
        djj0 djj0Var = null;
        try {
            djj0Var = (djj0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f92062a = djj0Var;
        f92063b = new djj0();
    }
}
