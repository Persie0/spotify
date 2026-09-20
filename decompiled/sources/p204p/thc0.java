package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class thc0 {

    /* JADX INFO: renamed from: a */
    public static final phc0 f220398a;

    /* JADX INFO: renamed from: b */
    public static final phc0 f220399b;

    static {
        phc0 phc0Var = null;
        try {
            phc0Var = (phc0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f220398a = phc0Var;
        f220399b = new phc0();
    }
}
