package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j950 implements w850 {

    /* JADX INFO: renamed from: X */
    public final c9k f110096X;

    /* JADX INFO: renamed from: a */
    public final er70 f110097a;

    /* JADX INFO: renamed from: b */
    public final ry31 f110098b;

    /* JADX INFO: renamed from: c */
    public final fiz f110099c;

    /* JADX INFO: renamed from: d */
    public final q1n f110100d;

    /* JADX INFO: renamed from: e */
    public final r1n f110101e;

    /* JADX INFO: renamed from: f */
    public final whp f110102f;

    /* JADX INFO: renamed from: g */
    public final r921 f110103g;

    /* JADX INFO: renamed from: h */
    public final Flowable f110104h;

    /* JADX INFO: renamed from: i */
    public final zv41 f110105i;

    /* JADX INFO: renamed from: t */
    public final zv41 f110106t;

    public j950(er70 er70Var, ry31 ry31Var, fiz fizVar, q1n q1nVar, r1n r1nVar, whp whpVar, r921 r921Var, Flowable flowable, c9k c9kVar) {
        this.f110097a = er70Var;
        this.f110098b = ry31Var;
        this.f110099c = fizVar;
        this.f110100d = q1nVar;
        this.f110101e = r1nVar;
        this.f110102f = whpVar;
        this.f110103g = r921Var;
        this.f110104h = flowable;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f110105i = zv41VarM52819d;
        this.f110106t = zv41VarM52819d;
        juk jukVar = c9kVar.f35578a;
        this.f110096X = kk40.m56661c(jukVar.mo26608y(njg1.m64612e(qlg1.m73186B(jukVar))).mo26608y(new i950(this)));
        x0h1.m89578u(c9kVar, null, 0, new joz(this, (fbk) null, 29), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r6 == r4) goto L30;
     */
    @Override // p204p.w850
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo52726a(fbk fbkVar) {
        h950 h950Var;
        ContextTrack contextTrackM93279p;
        if (fbkVar instanceof h950) {
            h950Var = (h950) fbkVar;
            int i = h950Var.f88880c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h950Var.f88880c = i - Integer.MIN_VALUE;
            } else {
                h950Var = new h950(this, (ibk) fbkVar);
            }
        } else {
            h950Var = new h950(this, (ibk) fbkVar);
        }
        Object objM56346i = h950Var.f88878a;
        int i2 = h950Var.f88880c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bga.m29073P(objM56346i);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM56346i);
                }
                return (List) objM56346i;
            }
            bga.m29073P(objM56346i);
            Flowable flowable = this.f110104h;
            h950Var.f88880c = 1;
            objM56346i = kgg1.m56346i(flowable, 2, h950Var);
            if (objM56346i == yukVar) {
            }
            return yukVar;
            PlayerState playerState = (PlayerState) objM56346i;
            String strUri = (playerState == null || (contextTrackM93279p = ybg1.m93279p(playerState)) == null) ? null : contextTrackM93279p.uri();
            r921 r921Var = this.f110103g;
            h950Var.f88880c = 2;
            objM56346i = r921Var.m75008c(strUri, h950Var);
        } catch (Exception unused) {
            qlg1.m73220y(h950Var.getContext());
            return lau.f131415a;
        }
    }

    @Override // p204p.w850
    /* JADX INFO: renamed from: b */
    public final k950 mo52727b() {
        ezm ezmVar = this.f110101e.f194886a;
        Flowable flowableM63293p = kkx0.m56749b(ezm.m40375b(ezmVar)).m63293p();
        jg31.m53271i(flowableM63293p);
        voi voiVarM63286i = kkx0.m56749b(ezm.m40375b(ezmVar)).m63286i();
        jg31.m53271i(voiVarM63286i);
        return new f950(this, new la71(flowableM63293p, voiVarM63286i, ezm.m40375b(ezmVar).m56776P(), ezm.m40375b(ezmVar).m56767G(), this.f110096X));
    }

    @Override // p204p.w850
    /* JADX INFO: renamed from: c */
    public final xv41 mo52728c() {
        return this.f110106t;
    }

    @Override // p204p.w850
    /* JADX INFO: renamed from: d */
    public final l950 mo52729d(w47 w47Var) {
        if (w47Var == null) {
            w47Var = (w47) this.f110097a.get();
        }
        xc30 xc30VarMo43021a = this.f110098b.mo43021a(w47Var);
        q1n q1nVar = this.f110100d;
        q1nVar.getClass();
        ezm ezmVar = q1nVar.f184379a;
        x610 x610VarM56771K = ezm.m40375b(ezmVar).m56771K();
        x0s x0sVarM56766F = ezm.m40375b(ezmVar).m56766F();
        oyp0 oyp0VarM56776P = ezm.m40375b(ezmVar).m56776P();
        Flowable flowableM63293p = kkx0.m56749b(ezm.m40375b(ezmVar)).m63293p();
        jg31.m53271i(flowableM63293p);
        voi voiVarM63286i = kkx0.m56749b(ezm.m40375b(ezmVar)).m63286i();
        jg31.m53271i(voiVarM63286i);
        l3v l3vVarM63294q = kkx0.m56749b(ezm.m40375b(ezmVar)).m63294q();
        jg31.m53271i(l3vVarM63294q);
        whp whpVarM56767G = ezm.m40375b(ezmVar).m56767G();
        lqi0 lqi0VarM63291n = kkx0.m56749b(ezm.m40375b(ezmVar)).m63291n();
        jg31.m53271i(lqi0VarM63291n);
        return new g950(this, new yuc1(x610VarM56771K, x0sVarM56766F, oyp0VarM56776P, flowableM63293p, voiVarM63286i, l3vVarM63294q, whpVarM56767G, lqi0VarM63291n, xc30VarMo43021a, this.f110096X));
    }

    @Override // p204p.w850
    /* JADX INFO: renamed from: e */
    public final void mo52730e(z650 z650Var) {
        this.f110102f.m88165r(z650Var);
    }
}
