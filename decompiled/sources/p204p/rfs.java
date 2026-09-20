package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/rfs;", "Lp/ixh0;", "Lp/sfs;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class rfs extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f198726a;

    public rfs(gh00 gh00Var) {
        this.f198726a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        sfs sfsVar = new sfs();
        sfsVar.f208633M0 = this.f198726a;
        return sfsVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((sfs) exh0Var).f208633M0 = this.f198726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rfs) {
            return this.f198726a == ((rfs) obj).f198726a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f198726a.hashCode();
    }
}
