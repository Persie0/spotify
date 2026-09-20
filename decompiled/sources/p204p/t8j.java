package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/t8j;", "Lp/ixh0;", "Lp/u8j;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class t8j extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f218092a;

    public t8j(gh00 gh00Var) {
        this.f218092a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        u8j u8jVar = new u8j();
        u8jVar.f227962O0 = this.f218092a;
        return u8jVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        u8j u8jVar = (u8j) exh0Var;
        gh00 gh00Var = u8jVar.f227962O0;
        gh00 gh00Var2 = this.f218092a;
        if (gh00Var2 != gh00Var) {
            u8jVar.f227962O0 = gh00Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8j) && ((t8j) obj).f218092a == this.f218092a;
    }

    public final int hashCode() {
        return this.f218092a.hashCode();
    }
}
