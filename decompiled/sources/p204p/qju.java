package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qju extends wju {

    /* JADX INFO: renamed from: e */
    public final int f189316e;

    public qju(int i) {
        super(i, 12, bwt.f31709X0);
        this.f189316e = i;
    }

    @Override // p204p.wju
    /* JADX INFO: renamed from: a */
    public final int mo72951a() {
        return this.f189316e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qju) && this.f189316e == ((qju) obj).f189316e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f189316e);
    }
}
