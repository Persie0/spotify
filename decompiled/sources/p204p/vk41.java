package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vk41 {

    /* JADX INFO: renamed from: a */
    public final boolean f242133a;

    /* JADX INFO: renamed from: b */
    public final boolean f242134b;

    /* JADX INFO: renamed from: c */
    public final qas f242135c;

    /* JADX INFO: renamed from: d */
    public final qf40 f242136d;

    public vk41(boolean z, boolean z2, qas qasVar, qf40 qf40Var) {
        this.f242133a = z;
        this.f242134b = z2;
        this.f242135c = qasVar;
        this.f242136d = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk41)) {
            return false;
        }
        vk41 vk41Var = (vk41) obj;
        return this.f242133a == vk41Var.f242133a && this.f242134b == vk41Var.f242134b && wj50.m88271j(this.f242135c, vk41Var.f242135c) && wj50.m88271j(this.f242136d, vk41Var.f242136d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f242133a) * 31, 31, this.f242134b);
        qas qasVar = this.f242135c;
        return this.f242136d.hashCode() + ((iM77245d + (qasVar == null ? 0 : qasVar.hashCode())) * 31);
    }
}
