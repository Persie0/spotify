package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jux {

    /* JADX INFO: renamed from: a */
    public static final gux f116189a = new gux();

    /* JADX INFO: renamed from: b */
    public static final gux f116190b;

    static {
        gux guxVar = null;
        try {
            guxVar = (gux) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f116190b = guxVar;
    }

    /* JADX INFO: renamed from: a */
    public static gux m54348a() {
        gux guxVar = f116190b;
        if (guxVar != null) {
            return guxVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
