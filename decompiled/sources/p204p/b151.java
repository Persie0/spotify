package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum b151 implements od50 {
    INVALID_STATUS_CODE(0),
    SUCCESS(1),
    ERROR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f22219a;

    b151(int i) {
        this.f22219a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f22219a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
