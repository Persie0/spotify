package p204p;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ct4 implements cyh0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41764a;

    /* JADX INFO: renamed from: b */
    public final Object f41765b;

    /* JADX INFO: renamed from: c */
    public final Object f41766c;

    public ct4(Choreographer choreographer, ys4 ys4Var) {
        this.f41764a = 0;
        this.f41765b = choreographer;
        this.f41766c = ys4Var;
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: B */
    public final huk mo26595B(iuk iukVar) {
        switch (this.f41764a) {
            case 0:
                break;
        }
        return cct.m32323v(this, iukVar);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: D */
    public final juk mo26596D(iuk iukVar) {
        switch (this.f41764a) {
            case 0:
                break;
        }
        return cct.m32326y(this, iukVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.cyh0
    /* JADX INFO: renamed from: K */
    public final Object mo30456K(fbk fbkVar, gh00 gh00Var) {
        xcn0 xcn0Var;
        boolean z;
        Object objM48221p;
        switch (this.f41764a) {
            case 0:
                ys4 ys4Var = (ys4) this.f41766c;
                hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
                hqbVar.m48222q();
                at4 at4Var = new at4(hqbVar, this, gh00Var);
                if (wj50.m88271j(ys4Var.f275674c, (Choreographer) this.f41765b)) {
                    synchronized (ys4Var.f275676e) {
                        ys4Var.f275678g.add(at4Var);
                        if (!ys4Var.f275681t) {
                            ys4Var.f275681t = true;
                            ys4Var.f275674c.postFrameCallback(ys4Var.f275672X);
                        }
                        break;
                    }
                    hqbVar.mo42415l(new n62(19, ys4Var, at4Var));
                } else {
                    ((Choreographer) this.f41765b).postFrameCallback(at4Var);
                    hqbVar.mo42415l(new n62(20, this, at4Var));
                }
                return hqbVar.m48221p();
            default:
                if (fbkVar instanceof xcn0) {
                    xcn0Var = (xcn0) fbkVar;
                    int i = xcn0Var.f260263d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xcn0Var.f260263d = i - Integer.MIN_VALUE;
                    } else {
                        xcn0Var = new xcn0(this, fbkVar);
                    }
                } else {
                    xcn0Var = new xcn0(this, fbkVar);
                }
                Object obj = xcn0Var.f260261b;
                yuk yukVar = yuk.f276404a;
                int i2 = xcn0Var.f260263d;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    nqr nqrVar = (nqr) this.f41766c;
                    xcn0Var.f260260a = gh00Var;
                    xcn0Var.f260263d = 1;
                    synchronized (nqrVar.f157321b) {
                        z = nqrVar.f157320a;
                    }
                    if (z) {
                        objM48221p = w2a1.f247311a;
                    } else {
                        hqb hqbVar2 = new hqb(1, seg1.m77914f(xcn0Var));
                        hqbVar2.m48222q();
                        synchronized (nqrVar.f157321b) {
                            ((ArrayList) nqrVar.f157322c).add(hqbVar2);
                        }
                        hqbVar2.mo42415l(new zj70(0, nqrVar, hqbVar2));
                        objM48221p = hqbVar2.m48221p();
                        if (objM48221p != yukVar) {
                            objM48221p = w2a1.f247311a;
                        }
                    }
                    if (objM48221p != yukVar) {
                    }
                    return yukVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                gh00Var = xcn0Var.f260260a;
                bga.m29073P(obj);
                cyh0 cyh0Var = (cyh0) this.f41765b;
                xcn0Var.f260260a = null;
                xcn0Var.f260263d = 2;
                Object objMo30456K = cyh0Var.mo30456K(xcn0Var, gh00Var);
                if (objMo30456K != yukVar) {
                    return objMo30456K;
                }
                return yukVar;
        }
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: o */
    public final Object mo26605o(Object obj, th00 th00Var) {
        switch (this.f41764a) {
            case 0:
                break;
        }
        return th00Var.invoke(obj, this);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: y */
    public final juk mo26608y(juk jukVar) {
        switch (this.f41764a) {
            case 0:
                break;
        }
        return opo.m67570t(this, jukVar);
    }

    public ct4(cyh0 cyh0Var) {
        this.f41764a = 1;
        this.f41765b = cyh0Var;
        this.f41766c = new nqr();
    }
}
