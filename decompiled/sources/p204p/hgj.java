package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/hgj;", "Lp/ixh0;", "Lp/igj;", "glimmer"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class hgj extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final long f91169a;

    public hgj(long j) {
        this.f91169a = j;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new igj(this.f91169a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((igj) exh0Var).f101996M0.setValue(new n6f(this.f91169a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgj)) {
            return false;
        }
        long j = ((hgj) obj).f91169a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f91169a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f91169a);
    }
}
