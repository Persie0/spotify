package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum ra4 implements uzv {
    /* JADX INFO: Fake field, exist only in values array */
    LOW("low"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM("medium"),
    HIGH("high"),
    /* JADX INFO: Fake field, exist only in values array */
    VERY_HIGH("very_high");


    /* JADX INFO: renamed from: a */
    public final String f197187a;

    ra4(String str) {
        this.f197187a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f197187a;
    }
}
