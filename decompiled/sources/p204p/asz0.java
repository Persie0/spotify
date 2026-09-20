package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum asz0 implements od50 {
    OPTION_UNSPECIFIED(0),
    OPTION_INCORRECT(1),
    OPTION_OFFENSIVE(2),
    OPTION_BORING(3),
    /* JADX INFO: Fake field, exist only in values array */
    OPTION_UNREADABLE(4),
    OPTION_OTHER(5),
    OPTION_OUTDATED(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f19535a;

    asz0(int i) {
        this.f19535a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19535a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
