package p204p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class mcq implements r381, rte0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f142225i = {new spi0(mcq.class, "requestJob", "getRequestJob()Lkotlinx/coroutines/Job;", 0)};

    /* JADX INFO: renamed from: a */
    public final m500 f142226a;

    /* JADX INFO: renamed from: b */
    public final qse0 f142227b;

    /* JADX INFO: renamed from: c */
    public final e481 f142228c;

    /* JADX INFO: renamed from: d */
    public hcq f142229d;

    /* JADX INFO: renamed from: e */
    public s281 f142230e;

    /* JADX INFO: renamed from: g */
    public final c9k f142232g;

    /* JADX INFO: renamed from: f */
    public final zv41 f142231f = jag1.m52819d(nau.f152117a);

    /* JADX INFO: renamed from: h */
    public final qc0 f142233h = new qc0(1);

    public mcq(m500 m500Var, qse0 qse0Var, Scheduler scheduler, e481 e481Var) {
        this.f142226a = m500Var;
        this.f142227b = qse0Var;
        this.f142228c = e481Var;
        this.f142232g = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), q3d0.m72105o(scheduler)));
        m500Var.f31643a.mo31986a(new gcq(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m61469d(mcq mcqVar, hcq hcqVar, ibk ibkVar) throws Throwable {
        icq icqVar;
        if (ibkVar instanceof icq) {
            icqVar = (icq) ibkVar;
            int i = icqVar.f100871d;
            if ((i & Integer.MIN_VALUE) != 0) {
                icqVar.f100871d = i - Integer.MIN_VALUE;
            } else {
                icqVar = new icq(mcqVar, ibkVar);
            }
        } else {
            icqVar = new icq(mcqVar, ibkVar);
        }
        Object objM61472g = icqVar.f100869b;
        int i2 = icqVar.f100871d;
        if (i2 == 0) {
            bga.m29073P(objM61472g);
            ase0 ase0VarM47138c = hcqVar.m47138c();
            icqVar.f100868a = hcqVar;
            icqVar.f100871d = 1;
            objM61472g = mcqVar.m61472g(ase0VarM47138c, icqVar);
            Object obj = yuk.f276404a;
            if (objM61472g == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hcqVar = icqVar.f100868a;
            bga.m29073P(objM61472g);
        }
        boolean zBooleanValue = ((Boolean) objM61472g).booleanValue();
        View view = (View) hcqVar.m47136a().get();
        w2a1 w2a1Var = w2a1.f247311a;
        if (!zBooleanValue) {
            Logger.m3966b("Orchestrator denied presentation, cannot attach tooltip", new Object[0]);
            gh00 gh00VarM47137b = hcqVar.m47137b();
            if (gh00VarM47137b != null) {
                gh00VarM47137b.invoke(j381.f108309b);
                return w2a1Var;
            }
        } else {
            if (view != null && view.isShown()) {
                if (view.isAttachedToWindow()) {
                    int i3 = 5;
                    hcqVar.m47139d().m95877i(new r7q(hcqVar, i3));
                    hcqVar.m47139d().m95876h(new lqk(mcqVar, view, hcqVar, 9));
                    hcqVar.m47139d().m95878j(new szp(6, mcqVar, hcqVar));
                    mcqVar.f142230e = new s281(view, new wep(hcqVar, 25));
                    view.getViewTreeObserver().addOnGlobalLayoutListener(mcqVar.f142230e);
                    nfp nfpVar = new nfp(mcqVar, i3);
                    WeakHashMap weakHashMap = mec1.f142677a;
                    cec1.m32550n(view, nfpVar);
                    hcqVar.m47139d().m95873d(view);
                } else {
                    view.addOnAttachStateChangeListener(new jcq(view, hcqVar, mcqVar, view));
                }
                if (view.isAttachedToWindow()) {
                    view.addOnAttachStateChangeListener(new rrp(1, view, hcqVar));
                    return w2a1Var;
                }
                hcqVar.m47139d().m95875f();
                return w2a1Var;
            }
            Logger.m3966b("Anchor view is null or not showing, cannot attach tooltip", new Object[0]);
            gh00 gh00VarM47137b2 = hcqVar.m47137b();
            if (gh00VarM47137b2 != null) {
                gh00VarM47137b2.invoke(j381.f108308a);
            }
        }
        return w2a1Var;
    }

    @Override // p204p.rte0
    /* JADX INFO: renamed from: c */
    public final fiz mo37621c() {
        return new r1a(this.f142231f, this, 7);
    }

    /* JADX INFO: renamed from: e */
    public final void m61470e() {
        hcq hcqVar = this.f142229d;
        if (hcqVar != null) {
            hcqVar.m47139d().m95875f();
            hcqVar.m47139d().m95876h(null);
            this.f142229d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m61471f(zbq zbqVar, View view, ase0 ase0Var, eh00 eh00Var, eh00 eh00Var2, gh00 gh00Var) {
        di41 di41VarM89578u = x0h1.m89578u(this.f142232g, null, 0, new fop(this, new hcq(zbqVar, new WeakReference(view), ase0Var, eh00Var, eh00Var2, gh00Var), (fbk) null, 9), 3);
        this.f142233h.m39516c(f142225i[0], this, di41VarM89578u);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m61472g(ase0 ase0Var, ibk ibkVar) throws Throwable {
        lcq lcqVar;
        boolean zBooleanValue;
        if (ibkVar instanceof lcq) {
            lcqVar = (lcq) ibkVar;
            int i = lcqVar.f131971c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcqVar.f131971c = i - Integer.MIN_VALUE;
            } else {
                lcqVar = new lcq(this, ibkVar);
            }
        } else {
            lcqVar = new lcq(this, ibkVar);
        }
        Object objM36852d = lcqVar.f131969a;
        int i2 = lcqVar.f131971c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM36852d);
                qse0 qse0Var = this.f142227b;
                ote0 ote0Var = ote0.f169048a;
                lcqVar.f131971c = 1;
                objM36852d = ((dte0) qse0Var).m36852d(ote0Var, ase0Var, lcqVar);
                yuk yukVar = yuk.f276404a;
                if (objM36852d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM36852d);
            }
            zBooleanValue = ((Boolean) objM36852d).booleanValue();
        } catch (CancellationException unused) {
            zBooleanValue = false;
        }
        return qyg1.m74178H(zBooleanValue);
    }
}
