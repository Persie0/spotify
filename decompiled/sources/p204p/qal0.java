package p204p;

import kotlin.Metadata;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/qal0;", "Lp/ixh0;", "Lp/sal0;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class qal0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f186900a;

    public qal0(eh00 eh00Var) {
        this.f186900a = eh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new sal0(this.f186900a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        sal0 sal0Var = (sal0) exh0Var;
        sal0Var.getClass();
        sal0Var.f207229M0 = this.f186900a;
        o0w0 o0w0Var = sal0Var.f207233Q0;
        if (o0w0Var != null) {
            sal0Var.m77643H1(o0w0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qal0.class == obj.getClass() && this.f186900a == ((qal0) obj).f186900a;
    }

    public final int hashCode() {
        return this.f186900a.hashCode() + AbstractC0000a.m8g(Long.hashCode(0L) * 31, 961, 1.0f);
    }
}
