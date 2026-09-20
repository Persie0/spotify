package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum tp6 implements od50 {
    ATTACHMENT_VALIDATION_STATUS_UNSPECIFIED(0),
    ATTACHMENT_VALIDATION_STATUS_PENDING(1),
    ATTACHMENT_VALIDATION_STATUS_SAFE(2),
    ATTACHMENT_VALIDATION_STATUS_REJECTED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f222443a;

    tp6(int i) {
        this.f222443a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f222443a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
