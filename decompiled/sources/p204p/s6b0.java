package p204p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes8.dex */
public final class s6b0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206068a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f206069b;

    /* JADX INFO: renamed from: c */
    public final Object f206070c;

    /* JADX INFO: renamed from: d */
    public final Object f206071d;

    /* JADX INFO: renamed from: e */
    public final Object f206072e;

    /* JADX INFO: renamed from: f */
    public final Object f206073f;

    /* JADX INFO: renamed from: g */
    public final Object f206074g;

    /* JADX INFO: renamed from: h */
    public final Object f206075h;

    public s6b0(wul wulVar, h6b0 h6b0Var, luk lukVar, l2m l2mVar, da80 da80Var, vw90 vw90Var, zcp zcpVar) {
        this.f206069b = wulVar;
        this.f206070c = h6b0Var;
        this.f206071d = lukVar;
        this.f206072e = l2mVar;
        this.f206073f = da80Var;
        this.f206074g = vw90Var;
        this.f206075h = zcpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m77323a(fbk fbkVar) {
        r6b0 r6b0Var;
        if (fbkVar instanceof r6b0) {
            r6b0Var = (r6b0) fbkVar;
            int i = r6b0Var.f196235c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6b0Var.f196235c = i - Integer.MIN_VALUE;
            } else {
                r6b0Var = new r6b0(this, fbkVar);
            }
        } else {
            r6b0Var = new r6b0(this, fbkVar);
        }
        Object obj = r6b0Var.f196233a;
        int i2 = r6b0Var.f196235c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        if (((h6b0) this.f206070c).m46709b()) {
            fbk fbkVar2 = null;
            nnc nncVarM92074U = xtm0.m92074U(k0e1.m54985d((ObservableSource) ((wul) this.f206069b).invoke()), new q6b0(fbkVar2, this, 0));
            no90 no90Var = new no90(this, fbkVar2, 13);
            r6b0Var.f196235c = 1;
            Object objM89250g = wxf1.m89250g(nncVarM92074U, no90Var, r6b0Var);
            yuk yukVar = yuk.f276404a;
            if (objM89250g == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f206068a) {
            case 0:
                return m77323a((fbk) obj);
            default:
                return new nzx0(new h431(this, (stc0) obj, (fbk) null, 19));
        }
    }

    public s6b0(el2 el2Var, rl2 rl2Var, flx flxVar, Flowable flowable, Resources resources, yf4 yf4Var, wf4 wf4Var) {
        tlp tlpVar = tlp.f221498c;
        this.f206069b = el2Var;
        this.f206070c = rl2Var;
        this.f206071d = flxVar;
        this.f206072e = flowable;
        this.f206073f = resources;
        this.f206074g = yf4Var;
        this.f206075h = wf4Var;
    }
}
