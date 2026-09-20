package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum pzl implements od50 {
    CTA_STYLE_UNKNOWN(0),
    CTA_STYLE_PRIMARY(1),
    CTA_STYLE_SECONDARY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f183732a;

    pzl(int i) {
        this.f183732a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f183732a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
