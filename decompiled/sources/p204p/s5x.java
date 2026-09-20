package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum s5x implements od50 {
    EVENT_HERO_TREATMENT_UNSPECIFIED(0),
    EVENT_HERO_TREATMENT_STANDARD(1),
    EVENT_HERO_TREATMENT_CAMPAIGN_RESERVED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f205951a;

    s5x(int i) {
        this.f205951a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f205951a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
