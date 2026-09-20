package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hnr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f93384a;

    /* JADX INFO: renamed from: b */
    public final boolean f93385b;

    public hnr(boolean z, boolean z2) {
        this.f93384a = z;
        this.f93385b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnr)) {
            return false;
        }
        hnr hnrVar = (hnr) obj;
        return this.f93384a == hnrVar.f93384a && this.f93385b == hnrVar.f93385b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93385b) + (Boolean.hashCode(this.f93384a) * 31);
    }
}
