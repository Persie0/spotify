package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum nje implements od50 {
    CLIENT_CAPABILITY_UNSPECIFIED(0),
    EDITORIAL_SHELF_CTA_V1(1),
    LEF_MIXED_CAROUSEL_CONTENT_V1(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f154577a;

    nje(int i) {
        this.f154577a = i;
    }

    /* JADX INFO: renamed from: a */
    public static nje m64606a(int i) {
        if (i == 0) {
            return CLIENT_CAPABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return EDITORIAL_SHELF_CTA_V1;
        }
        if (i != 2) {
            return null;
        }
        return LEF_MIXED_CAROUSEL_CONTENT_V1;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f154577a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
