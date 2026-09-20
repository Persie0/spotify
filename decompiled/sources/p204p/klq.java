package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/klq;", "Lp/ixh0;", "Lp/llq;", "glimmer"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class klq extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final C2245p6 f123940a;

    public klq(C2245p6 c2245p6) {
        this.f123940a = c2245p6;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        llq llqVar = new llq();
        llqVar.f134685M0 = this.f123940a;
        return llqVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        llq llqVar = (llq) exh0Var;
        C2245p6 c2245p6 = this.f123940a;
        llqVar.f134685M0 = c2245p6;
        c2245p6.invoke(llqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof klq) {
            return this.f123940a == ((klq) obj).f123940a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123940a.hashCode();
    }
}
