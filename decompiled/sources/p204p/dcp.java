package p204p;

import com.spotify.decipher.agent.p057v1.Action;
import com.spotify.decipher.agent.p057v1.ActionRequest;
import com.spotify.decipher.agent.p057v1.NavigateAction;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class dcp {

    /* JADX INFO: renamed from: a */
    public final qgy0 f47593a;

    /* JADX INFO: renamed from: b */
    public final l5j0 f47594b;

    /* JADX INFO: renamed from: c */
    public final wvp f47595c;

    /* JADX INFO: renamed from: d */
    public final l14 f47596d;

    /* JADX INFO: renamed from: e */
    public final c9k f47597e;

    /* JADX INFO: renamed from: f */
    public boolean f47598f;

    /* JADX INFO: renamed from: g */
    public byz0 f47599g;

    /* JADX INFO: renamed from: h */
    public di41 f47600h;

    /* JADX INFO: renamed from: i */
    public di41 f47601i;

    /* JADX INFO: renamed from: j */
    public Integer f47602j;

    /* JADX INFO: renamed from: k */
    public Boolean f47603k;

    /* JADX INFO: renamed from: l */
    public String f47604l;

    /* JADX INFO: renamed from: m */
    public final ccp f47605m;

    /* JADX INFO: renamed from: n */
    public final h7m f47606n;

    /* JADX INFO: renamed from: o */
    public final bcp f47607o;

    public dcp(qgy0 qgy0Var, l5j0 l5j0Var, wvp wvpVar, l14 l14Var) {
        x461 x461VarM64613f = njg1.m64613f();
        n5q n5qVar = xsr.f265651a;
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(x461VarM64613f, pvb0.f181680a.f197428f));
        this.f47593a = qgy0Var;
        this.f47594b = l5j0Var;
        this.f47595c = wvpVar;
        this.f47596d = l14Var;
        this.f47597e = c9kVarM56661c;
        this.f47605m = new ccp(this);
        this.f47606n = new h7m(this, 1);
        this.f47607o = new bcp(this, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m35668a(dcp dcpVar) {
        dyy0 dyy0VarMo30908A;
        qro qroVarM37395a;
        if (dcpVar.f47598f) {
            dcpVar.f47598f = false;
            di41 di41Var = dcpVar.f47601i;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            dcpVar.f47601i = null;
            di41 di41Var2 = dcpVar.f47600h;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            dcpVar.f47600h = null;
            byz0 byz0Var = dcpVar.f47599g;
            if (byz0Var != null && (dyy0VarMo30908A = byz0Var.mo30908A()) != null && (qroVarM37395a = dyy0VarMo30908A.m37395a()) != null) {
                qroVarM37395a.m73659d(dcpVar.f47605m);
            }
            dcpVar.f47599g = null;
            dcpVar.f47594b.mo58242e(dcpVar.f47606n);
            dcpVar.f47595c.f255544b.remove(dcpVar.f47607o);
            dcpVar.f47602j = null;
            dcpVar.f47603k = null;
            dcpVar.f47604l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m35669b(String str, String str2) {
        byz0 byz0Var = this.f47599g;
        if (byz0Var == null) {
            return;
        }
        r50 r50VarM9127r = ActionRequest.m9127r();
        r50VarM9127r.m74780q(UUID.randomUUID().toString());
        r50VarM9127r.m74781r(str2);
        C2318qy c2318qyM9122o = Action.m9122o();
        o1j0 o1j0VarM9143o = NavigateAction.m9143o();
        o1j0VarM9143o.m66073m(str);
        c2318qyM9122o.m74149m(o1j0VarM9143o);
        r50VarM9127r.m74779m(c2318qyM9122o);
        x0h1.m89578u(this.f47597e, null, 0, new r2m(byz0Var, (ActionRequest) r50VarM9127r.build(), null, 20), 3);
    }
}
