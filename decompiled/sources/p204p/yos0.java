package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum yos0 implements od50 {
    UNSPECIFIED(0),
    MANUAL(1),
    SCHEDULED(2),
    OUTDATED_PROMPT_VERSION_TRIGGER(3),
    OVERDUE_SCHEDULED_PLAYLIST_OPENED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f274728a;

    yos0(int i) {
        this.f274728a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f274728a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
