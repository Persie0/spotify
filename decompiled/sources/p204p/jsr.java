package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum jsr implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    DISMISSAL_TRIGGER_UNSPECIFIED(0),
    ACTION_TAPPED(1),
    SWIPED_AWAY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f115544a;

    jsr(int i) {
        this.f115544a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f115544a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
