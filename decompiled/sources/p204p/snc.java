package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class snc extends tnc {

    /* JADX INFO: renamed from: a */
    public final Throwable f210878a;

    public snc(Throwable th) {
        this.f210878a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof snc) {
            return wj50.m88271j(this.f210878a, ((snc) obj).f210878a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f210878a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p204p.tnc
    public final String toString() {
        return "Closed(" + this.f210878a + ')';
    }
}
