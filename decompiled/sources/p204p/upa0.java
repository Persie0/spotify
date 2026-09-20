package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum upa0 implements h2t0 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a */
    public final int f232615a;

    upa0(int i) {
        this.f232615a = i;
    }

    @Override // p204p.h2t0
    public final int getNumber() {
        return this.f232615a;
    }
}
