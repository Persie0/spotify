package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/ooz;", "Lp/ixh0;", "Lp/poz;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class ooz extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f167717a;

    public ooz(gh00 gh00Var) {
        this.f167717a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        poz pozVar = new poz();
        pozVar.f179828M0 = this.f167717a;
        return pozVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((poz) exh0Var).f179828M0 = this.f167717a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ooz) {
            return this.f167717a == ((ooz) obj).f167717a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f167717a.hashCode();
    }
}
