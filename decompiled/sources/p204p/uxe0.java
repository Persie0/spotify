package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum uxe0 implements h2t0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: a */
    public final int f234909a;

    uxe0(int i) {
        this.f234909a = i;
    }

    @Override // p204p.h2t0
    public final int getNumber() {
        return this.f234909a;
    }
}
