package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/mka;", "Lp/ixh0;", "Lp/oka;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class mka extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final eu4 f144540a;

    public mka(eu4 eu4Var) {
        this.f144540a = eu4Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new oka(this.f144540a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        oka okaVar = (oka) exh0Var;
        eu4 eu4Var = this.f144540a;
        okaVar.f166310M0 = eu4Var;
        if (okaVar.f63766L0) {
            eu4Var.invoke(okaVar.f166311N0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mka) {
            return this.f144540a == ((mka) obj).f144540a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f144540a.hashCode();
    }
}
