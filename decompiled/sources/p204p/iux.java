package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iux {

    /* JADX INFO: renamed from: a */
    public static final fux f106047a = new fux();

    /* JADX INFO: renamed from: b */
    public static final fux f106048b;

    static {
        b3t0 b3t0Var = b3t0.f23129c;
        fux fuxVar = null;
        try {
            fuxVar = (fux) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f106048b = fuxVar;
    }
}
