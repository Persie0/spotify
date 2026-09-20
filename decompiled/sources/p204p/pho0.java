package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pho0 extends tho0 {

    /* JADX INFO: renamed from: a */
    public final boolean f177694a;

    /* JADX INFO: renamed from: b */
    public final String f177695b;

    /* JADX INFO: renamed from: c */
    public final yzv f177696c;

    /* JADX INFO: renamed from: d */
    public final long f177697d;

    public pho0(boolean z, String str, yzv yzvVar, long j) {
        this.f177694a = z;
        this.f177695b = str;
        this.f177696c = yzvVar;
        this.f177697d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pho0)) {
            return false;
        }
        pho0 pho0Var = (pho0) obj;
        return this.f177694a == pho0Var.f177694a && wj50.m88271j(this.f177695b, pho0Var.f177695b) && this.f177696c == pho0Var.f177696c && this.f177697d == pho0Var.f177697d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f177697d) + ((this.f177696c.hashCode() + s571.m77243b(Boolean.hashCode(this.f177694a) * 31, 31, this.f177695b)) * 31);
    }
}
