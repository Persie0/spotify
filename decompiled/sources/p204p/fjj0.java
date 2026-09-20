package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class fjj0 {

    /* JADX INFO: renamed from: a */
    public static final bjj0 f70299a;

    /* JADX INFO: renamed from: b */
    public static final bjj0 f70300b;

    static {
        bjj0 bjj0Var = null;
        try {
            bjj0Var = (bjj0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f70299a = bjj0Var;
        f70300b = new bjj0();
    }
}
