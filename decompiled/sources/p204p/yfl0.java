package p204p;

import kotlin.Metadata;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/yfl0;", "Lp/ixh0;", "Lp/zfl0;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class yfl0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f272283a;

    public yfl0(gh00 gh00Var) {
        this.f272283a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new zfl0(this.f272283a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        zfl0 zfl0Var = (zfl0) exh0Var;
        zfl0Var.getClass();
        zfl0Var.f282341M0 = this.f272283a;
        o0w0 o0w0Var = zfl0Var.f282346R0;
        if (o0w0Var != null) {
            zfl0Var.m96029H1(o0w0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yfl0.class == obj.getClass() && this.f272283a == ((yfl0) obj).f272283a;
    }

    public final int hashCode() {
        return this.f272283a.hashCode() + AbstractC0000a.m8g(Long.hashCode(0L) * 31, 961, 1.0f);
    }
}
