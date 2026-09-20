package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/zga;", "Lp/ixh0;", "Lp/aha;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class zga extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final ob3 f282557a;

    /* JADX INFO: renamed from: b */
    public final boolean f282558b;

    public zga(ob3 ob3Var, boolean z) {
        this.f282557a = ob3Var;
        this.f282558b = z;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        aha ahaVar = new aha();
        ahaVar.f15648M0 = this.f282557a;
        ahaVar.f15649N0 = this.f282558b;
        return ahaVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        aha ahaVar = (aha) exh0Var;
        ahaVar.f15648M0 = this.f282557a;
        ahaVar.f15649N0 = this.f282558b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        zga zgaVar = obj instanceof zga ? (zga) obj : null;
        return zgaVar != null && wj50.m88271j(this.f282557a, zgaVar.f282557a) && this.f282558b == zgaVar.f282558b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282558b) + (this.f282557a.hashCode() * 31);
    }
}
