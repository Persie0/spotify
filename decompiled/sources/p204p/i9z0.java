package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum i9z0 implements od50 {
    SECTION_TYPE_UNDEFINED(0),
    SECTION_TYPE_CAROUSEL(1),
    SECTION_TYPE_MDC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f100111a;

    i9z0(int i) {
        this.f100111a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f100111a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
