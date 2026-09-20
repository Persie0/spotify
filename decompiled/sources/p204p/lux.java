package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class lux {

    /* JADX INFO: renamed from: a */
    public static final hux f137165a = new hux();

    /* JADX INFO: renamed from: b */
    public static final hux f137166b;

    static {
        hux huxVar = null;
        try {
            huxVar = (hux) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f137166b = huxVar;
    }
}
