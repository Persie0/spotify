package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ltx implements od50 {
    UNKNOWN(0),
    GENRE(1),
    MOOD(2),
    ACTIVITY(3),
    INSTRUMENT(4),
    TIME(5),
    ERA(6),
    AESTHETIC(7),
    AUDIENCE(8),
    CULTURAL_REFERENCE(9),
    GEOGRAPHIC_LOCATION(10),
    LANGUAGE(11),
    LOCATION(12),
    MEDIA(13),
    MUSIC_FESTIVAL(14),
    MUSIC_VENUE(15),
    MUSICAL_DESCRIPTOR(16),
    MUSICAL_TERM(17),
    PLACE(18),
    PUBLICATION(19),
    RADIO(20),
    RECORD_LABEL(21),
    RECORD_STORE(22),
    RELIGION(23),
    SLANG(24),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f136901a;

    ltx(int i) {
        this.f136901a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f136901a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
