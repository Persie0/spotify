package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum gdl implements od50 {
    ORIGIN_TYPE_UNSPECIFIED(0),
    ORIGIN_TYPE_FRESH(1),
    ORIGIN_TYPE_CLONED(2),
    ORIGIN_TYPE_AGENTIC(3);


    /* JADX INFO: renamed from: a */
    public final int f78894a;

    gdl(int i) {
        this.f78894a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f78894a;
    }
}
