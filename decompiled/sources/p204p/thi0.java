package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum thi0 implements uzv {
    OFF("off"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("video"),
    /* JADX INFO: Fake field, exist only in values array */
    ALL("all");


    /* JADX INFO: renamed from: a */
    public final String f220442a;

    thi0(String str) {
        this.f220442a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f220442a;
    }
}
