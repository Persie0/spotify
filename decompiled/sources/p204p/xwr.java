package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xwr {

    /* JADX INFO: renamed from: a */
    public final boolean f266738a;

    /* JADX INFO: renamed from: b */
    public final boolean f266739b;

    /* JADX INFO: renamed from: c */
    public final ibj f266740c;

    public xwr(ibj ibjVar, boolean z, boolean z2) {
        this.f266738a = z;
        this.f266739b = z2;
        this.f266740c = ibjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwr)) {
            return false;
        }
        xwr xwrVar = (xwr) obj;
        return this.f266738a == xwrVar.f266738a && this.f266739b == xwrVar.f266739b && wj50.m88271j(this.f266740c, xwrVar.f266740c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f266738a) * 31, 31, this.f266739b);
        ibj ibjVar = this.f266740c;
        return iM77245d + (ibjVar == null ? 0 : ibjVar.hashCode());
    }

    public /* synthetic */ xwr() {
        this(null, false, false);
    }
}
