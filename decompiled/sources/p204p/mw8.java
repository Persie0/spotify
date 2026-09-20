package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum mw8 implements od50 {
    BANNER_TYPE_UNSPECIFIED(0),
    ALL_SUCCESS(1),
    PARTIAL_SUCCESS(2),
    ALL_FAIL(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f147736a;

    mw8(int i) {
        this.f147736a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f147736a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
