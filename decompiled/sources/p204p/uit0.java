package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum uit0 implements od50 {
    UNKNOWN_QUERY_TYPE(0),
    IMPLICIT(1),
    EXPLICIT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f230813a;

    uit0(int i) {
        this.f230813a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f230813a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
