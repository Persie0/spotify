package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xco0 {

    /* JADX INFO: renamed from: a */
    public static final sf4 f260270a;

    /* JADX INFO: renamed from: b */
    public static final t5m0 f260271b;

    /* JADX INFO: renamed from: c */
    public static final e45 f260272c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f260270a = null;
            f260271b = new t5m0();
            f260272c = new e45(2);
        } else if (property.equals("Dalvik")) {
            f260270a = new sf4();
            f260271b = new opv0();
            f260272c = new rqa(2);
        } else {
            f260270a = null;
            f260271b = new ppv0();
            f260272c = new rqa(2);
        }
    }
}
