package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ats0 implements cts0 {

    /* JADX INFO: renamed from: a */
    public final String f19741a;

    /* JADX INFO: renamed from: b */
    public final boolean f19742b;

    /* JADX INFO: renamed from: c */
    public final boolean f19743c;

    public /* synthetic */ ats0(String str, boolean z, int i) {
        this(str, (i & 2) != 0 ? false : z, false);
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: a */
    public final boolean mo27152a() {
        return this.f19743c;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: b */
    public final boolean mo27153b() {
        return this.f19742b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ats0)) {
            return false;
        }
        ats0 ats0Var = (ats0) obj;
        return wj50.m88271j(this.f19741a, ats0Var.f19741a) && this.f19742b == ats0Var.f19742b && this.f19743c == ats0Var.f19743c;
    }

    @Override // p204p.cts0
    public final boolean getEnabled() {
        return false;
    }

    @Override // p204p.cts0
    public final String getUri() {
        return this.f19741a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19743c) + s571.m77245d(this.f19741a.hashCode() * 31, 31, this.f19742b);
    }

    public ats0(String str, boolean z, boolean z2) {
        this.f19741a = str;
        this.f19742b = z;
        this.f19743c = z2;
    }
}
