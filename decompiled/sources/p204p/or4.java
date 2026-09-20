package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum or4 implements uzv {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    EMULATOR("emulator"),
    /* JADX INFO: Fake field, exist only in values array */
    ADB_FORWARD("adb_forward");


    /* JADX INFO: renamed from: a */
    public final String f168437a;

    or4(String str) {
        this.f168437a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f168437a;
    }
}
