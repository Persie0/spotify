package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/r471;", "Lp/ixh0;", "Lp/t471;", "foundation"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class r471 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final th00 f195679a;

    public r471(th00 th00Var) {
        this.f195679a = th00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new t471(this.f195679a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((t471) exh0Var).f216932O0 = this.f195679a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r471) {
            return this.f195679a == ((r471) obj).f195679a;
        }
        return false;
    }

    public final int hashCode() {
        th00 th00Var = this.f195679a;
        if (th00Var != null) {
            return th00Var.hashCode();
        }
        return 0;
    }
}
