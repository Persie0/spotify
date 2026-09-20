package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum mit0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_STATUS_NONE(0),
    OFFLINE_STATUS_AVAILABLE_OFFLINE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f144099a;

    mit0(int i) {
        this.f144099a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f144099a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
