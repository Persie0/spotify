package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/cye1;", "Lp/ixh0;", "Lp/dye1;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class cye1 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final float f43252a;

    public cye1(float f) {
        this.f43252a = f;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        dye1 dye1Var = new dye1();
        dye1Var.f54323M0 = this.f43252a;
        return dye1Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((dye1) exh0Var).f54323M0 = this.f43252a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cye1) && Float.compare(this.f43252a, ((cye1) obj).f43252a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43252a);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("ZIndexElement(zIndex="), this.f43252a, ')');
    }
}
