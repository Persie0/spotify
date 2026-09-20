package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum d1t0 implements pd50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MUST_USE(1),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICITLY_IGNORABLE(2);


    /* JADX INFO: renamed from: a */
    public final int f44355a;

    d1t0(int i) {
        this.f44355a = i;
    }

    @Override // p204p.pd50
    public final int getNumber() {
        return this.f44355a;
    }
}
