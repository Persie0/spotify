package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum x8j implements od50 {
    CONSUMER_UNSPECIFIED(0),
    CONSUMER_DJ(1),
    CONSUMER_AGENT(2),
    CONSUMER_AUDIO_RECOGNITION(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f259169a;

    x8j(int i) {
        this.f259169a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f259169a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
