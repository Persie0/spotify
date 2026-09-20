package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum iyt0 implements od50 {
    QUIZ_ICON_TYPE_UNSPECIFIED(0),
    QUIZ_ICON_TYPE_INFO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f107067a;

    iyt0(int i) {
        this.f107067a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f107067a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
