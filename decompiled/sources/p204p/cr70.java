package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/cr70;", "Lp/ixh0;", "Lp/dr70;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class cr70 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final float f41199a;

    /* JADX INFO: renamed from: b */
    public final boolean f41200b;

    public cr70(float f, boolean z) {
        this.f41199a = f;
        this.f41200b = z;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        dr70 dr70Var = new dr70();
        dr70Var.f52183M0 = this.f41199a;
        dr70Var.f52184N0 = this.f41200b;
        return dr70Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        dr70 dr70Var = (dr70) exh0Var;
        dr70Var.f52183M0 = this.f41199a;
        dr70Var.f52184N0 = this.f41200b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        cr70 cr70Var = obj instanceof cr70 ? (cr70) obj : null;
        return cr70Var != null && this.f41199a == cr70Var.f41199a && this.f41200b == cr70Var.f41200b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41200b) + (Float.hashCode(this.f41199a) * 31);
    }
}
