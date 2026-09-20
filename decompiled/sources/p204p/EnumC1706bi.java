package p204p;

/* JADX INFO: renamed from: p.bi */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1706bi implements od50 {
    UNKNOWN_IMAGE_STYLE(0),
    CIRCLE(1),
    SQUARE(2),
    FULL_WIDTH(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f27296a;

    EnumC1706bi(int i) {
        this.f27296a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f27296a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
