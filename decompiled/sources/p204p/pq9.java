package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/pq9;", "Lp/ixh0;", "Lp/qq9;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class pq9 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f180215a;

    public pq9(gh00 gh00Var) {
        this.f180215a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new qq9(this.f180215a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        qq9 qq9Var = (qq9) exh0Var;
        gh00 gh00Var = this.f180215a;
        qq9Var.f191511M0 = gh00Var;
        bxg1.m30844u(qq9Var, gh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pq9) {
            return this.f180215a == ((pq9) obj).f180215a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f180215a.hashCode();
    }
}
