package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum iax0 implements od50 {
    ITEM_RESULT_UNSPECIFIED(0),
    ITEM_RESULT_SUCCESS(1),
    ITEM_RESULT_NOT_AVAILABLE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f100363a;

    iax0(int i) {
        this.f100363a = i;
    }

    /* JADX INFO: renamed from: a */
    public static iax0 m50104a(int i) {
        if (i == 0) {
            return ITEM_RESULT_UNSPECIFIED;
        }
        if (i == 1) {
            return ITEM_RESULT_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ITEM_RESULT_NOT_AVAILABLE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f100363a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
