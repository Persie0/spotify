package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m24212d2 = {"Lp/yge;", "Lp/ixh0;", "Lp/zsk;", "Lp/yoz0;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class yge extends ixh0 implements yoz0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f272570a;

    public yge(gh00 gh00Var) {
        this.f272570a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new zsk(false, true, this.f272570a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((zsk) exh0Var).f285959O0 = this.f272570a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yge) {
            return this.f272570a == ((yge) obj).f272570a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f272570a.hashCode();
    }

    @Override // p204p.yoz0
    /* JADX INFO: renamed from: r1 */
    public final voz0 mo32625r1() {
        voz0 voz0Var = new voz0();
        voz0Var.f243557c = false;
        voz0Var.f243558d = true;
        this.f272570a.invoke(voz0Var);
        return voz0Var;
    }
}
