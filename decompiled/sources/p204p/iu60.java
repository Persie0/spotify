package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/iu60;", "Lp/ixh0;", "Lp/ku60;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class iu60 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f105872a;

    /* JADX INFO: renamed from: b */
    public final gh00 f105873b;

    public iu60(gh00 gh00Var, gh00 gh00Var2) {
        this.f105872a = gh00Var;
        this.f105873b = gh00Var2;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        ku60 ku60Var = new ku60();
        ku60Var.f126464M0 = this.f105872a;
        ku60Var.f126465N0 = this.f105873b;
        return ku60Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ku60 ku60Var = (ku60) exh0Var;
        ku60Var.f126464M0 = this.f105872a;
        ku60Var.f126465N0 = this.f105873b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu60)) {
            return false;
        }
        iu60 iu60Var = (iu60) obj;
        return this.f105872a == iu60Var.f105872a && this.f105873b == iu60Var.f105873b;
    }

    public final int hashCode() {
        gh00 gh00Var = this.f105872a;
        int iHashCode = (gh00Var != null ? gh00Var.hashCode() : 0) * 31;
        gh00 gh00Var2 = this.f105873b;
        return iHashCode + (gh00Var2 != null ? gh00Var2.hashCode() : 0);
    }
}
