package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum yrm0 implements od50 {
    bass(0),
    forte(1),
    brio(2),
    alto(3),
    canon(4),
    cello(5),
    ballad(6),
    ballad_bold(7),
    viola(8),
    viola_bold(9),
    mesto(10),
    mesto_bold(11),
    metronome(12),
    finale(13),
    finale_bold(14),
    minuet(15),
    minuet_bold(16),
    headlineLarge(17),
    headlineMedium(18),
    titleLarge(19),
    titleMedium(20),
    titleSmall(21),
    bodyMedium(22),
    bodyMediumBold(23),
    bodySmall(24),
    bodySmallBold(25),
    marginal(26),
    marginalBold(27),
    titleXsmall(28),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f275537a;

    yrm0(int i) {
        this.f275537a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f275537a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
