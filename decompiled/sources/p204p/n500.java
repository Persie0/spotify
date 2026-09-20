package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class n500 implements rr1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150445a = 0;

    /* JADX INFO: renamed from: b */
    public final rr1 f150446b;

    public n500(uca ucaVar) {
        this.f150446b = ucaVar;
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: a */
    public final void mo63695a() {
        switch (this.f150445a) {
            case 0:
                ((ay8) this.f150446b).getClass();
                break;
            default:
                ((uca) this.f150446b).mo63695a();
                break;
        }
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: b */
    public final int mo27506b(tca tcaVar) {
        switch (this.f150445a) {
            case 0:
                return ((ay8) this.f150446b).mo27506b(tcaVar);
            default:
                return ((uca) this.f150446b).mo27506b(tcaVar);
        }
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: c */
    public final boolean mo27507c() {
        switch (this.f150445a) {
            case 0:
                return !((ay8) this.f150446b).f21133c;
            default:
                return ((uca) this.f150446b).mo27507c();
        }
    }

    public n500(Resources resources, tl4 tl4Var, qr1 qr1Var) {
        this.f150446b = new ay8(resources, tl4Var.m81037g(), qr1Var.f191700i || tl4Var.m81039i() == sl4.EXPANDED);
    }
}
