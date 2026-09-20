package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum zy61 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    TEMPLATE_VERSION_UNSPECIFIED(0),
    TEMPLATE_VERSION_V1(1),
    TEMPLATE_VERSION_V2(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f287506a;

    zy61(int i) {
        this.f287506a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f287506a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
