package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/ofb1;", "Lp/ixh0;", "Lp/pfb1;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class ofb1 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final vb9 f164699a;

    public ofb1(vb9 vb9Var) {
        this.f164699a = vb9Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        pfb1 pfb1Var = new pfb1();
        pfb1Var.f177024M0 = this.f164699a;
        return pfb1Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((pfb1) exh0Var).f177024M0 = this.f164699a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ofb1 ofb1Var = obj instanceof ofb1 ? (ofb1) obj : null;
        if (ofb1Var == null) {
            return false;
        }
        return this.f164699a.equals(ofb1Var.f164699a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f164699a.f239440a);
    }
}
