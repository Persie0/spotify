package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum x1t0 implements pd50 {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: a */
    public final int f257276a;

    x1t0(int i) {
        this.f257276a = i;
    }

    @Override // p204p.pd50
    public final int getNumber() {
        return this.f257276a;
    }
}
