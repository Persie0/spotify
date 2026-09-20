package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum xrm0 implements od50 {
    headline_large(0),
    headline_medium(1),
    title_large(3),
    title_medium(4),
    title_small(5),
    title_xsmall(17),
    body_medium(6),
    body_medium_bold(7),
    body_small(10),
    body_small_bold(11),
    marginal(13),
    marginal_bold(14),
    body_monospace(18),
    body_small_monospace(19),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f265392a;

    xrm0(int i) {
        this.f265392a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f265392a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
