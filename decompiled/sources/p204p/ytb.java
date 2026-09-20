package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum ytb implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    RESERVED(0),
    AUDIO_ONLY(1),
    DISTRACTED_DRIVER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f276074a;

    ytb(int i) {
        this.f276074a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f276074a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
