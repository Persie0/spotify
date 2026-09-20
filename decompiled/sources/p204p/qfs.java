package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/qfs;", "Lp/ixh0;", "Lp/i3b;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class qfs extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f188288a;

    public qfs(gh00 gh00Var) {
        this.f188288a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new i3b(new l3b(), this.f188288a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        i3b i3bVar = (i3b) exh0Var;
        i3bVar.f98089P0 = this.f188288a;
        i3bVar.m49584H1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qfs) {
            return this.f188288a == ((qfs) obj).f188288a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f188288a.hashCode();
    }
}
