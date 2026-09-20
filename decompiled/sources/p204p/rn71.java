package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum rn71 {
    CPU("device.cpu"),
    /* JADX INFO: Fake field, exist only in values array */
    GC("device.gc"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOCKING_GC("device.blocking_gc"),
    NATIVE_PSS("device.native_pss"),
    DALVIK_PSS("device.dalvik_pss"),
    OTHER_PSS("device.other_pss");


    /* JADX INFO: renamed from: a */
    public final String f200748a;

    rn71(String str) {
        this.f200748a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m75990a() {
        return this.f200748a;
    }
}
