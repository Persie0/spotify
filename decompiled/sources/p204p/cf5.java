package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m24212d2 = {"Lp/cf5;", "Lp/ixh0;", "Lp/zsk;", "Lp/yoz0;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class cf5 extends ixh0 implements yoz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f37269a;

    /* JADX INFO: renamed from: b */
    public final gh00 f37270b;

    public cf5(gh00 gh00Var, boolean z) {
        this.f37269a = z;
        this.f37270b = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new zsk(this.f37269a, false, this.f37270b);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        zsk zskVar = (zsk) exh0Var;
        zskVar.f285957M0 = this.f37269a;
        zskVar.f285959O0 = this.f37270b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5)) {
            return false;
        }
        cf5 cf5Var = (cf5) obj;
        return this.f37269a == cf5Var.f37269a && this.f37270b == cf5Var.f37270b;
    }

    public final int hashCode() {
        return this.f37270b.hashCode() + (Boolean.hashCode(this.f37269a) * 31);
    }

    @Override // p204p.yoz0
    /* JADX INFO: renamed from: r1 */
    public final voz0 mo32625r1() {
        voz0 voz0Var = new voz0();
        voz0Var.f243557c = this.f37269a;
        this.f37270b.invoke(voz0Var);
        return voz0Var;
    }
}
