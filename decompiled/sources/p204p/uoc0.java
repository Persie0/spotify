package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class uoc0 {

    /* JADX INFO: renamed from: a */
    public final vnc0 f232379a;

    /* JADX INFO: renamed from: b */
    public final jiz f232380b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f232381c;

    /* JADX INFO: renamed from: d */
    public final z9j0 f232382d;

    /* JADX INFO: renamed from: e */
    public final om0 f232383e;

    /* JADX INFO: renamed from: f */
    public final coc0 f232384f;

    /* JADX INFO: renamed from: g */
    public final rrc0 f232385g;

    /* JADX INFO: renamed from: h */
    public final q831 f232386h;

    /* JADX INFO: renamed from: i */
    public final luk f232387i;

    /* JADX INFO: renamed from: j */
    public final m500 f232388j;

    /* JADX INFO: renamed from: k */
    public final v1k0 f232389k;

    /* JADX INFO: renamed from: l */
    public final lb4 f232390l;

    /* JADX INFO: renamed from: m */
    public final zk1 f232391m;

    /* JADX INFO: renamed from: n */
    public aqc0 f232392n;

    /* JADX INFO: renamed from: o */
    public boolean f232393o;

    /* JADX INFO: renamed from: p */
    public pi1 f232394p = new pi1(qi1.f188892a, false, null, null, null, 30);

    /* JADX INFO: renamed from: q */
    public final lwr f232395q = new lwr();

    /* JADX INFO: renamed from: r */
    public final Handler f232396r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: s */
    public final g631 f232397s;

    public uoc0(vnc0 vnc0Var, jiz jizVar, Scheduler scheduler, z9j0 z9j0Var, om0 om0Var, cl8 cl8Var, coc0 coc0Var, rrc0 rrc0Var, q831 q831Var, luk lukVar, m500 m500Var, v1k0 v1k0Var, lb4 lb4Var) {
        this.f232379a = vnc0Var;
        this.f232380b = jizVar;
        this.f232381c = scheduler;
        this.f232382d = z9j0Var;
        this.f232383e = om0Var;
        this.f232384f = coc0Var;
        this.f232385g = rrc0Var;
        this.f232386h = q831Var;
        this.f232387i = lukVar;
        this.f232388j = m500Var;
        this.f232389k = v1k0Var;
        this.f232390l = lb4Var;
        this.f232391m = new zk1((Serializable) vnc0Var.f243052d, cl8Var.f39206b, cl8Var.f39207c, 1);
        Integer numValueOf = Integer.valueOf(R.string.presave_snackbar_text);
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        na6.m63963k(true, "Invalid resource ID provided: %s", null);
        this.f232397s = new g631(null, "", numValueOf, null, null, null, null, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (p204p.njg1.m64619l(1000, r1) == r5) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m83609a(uoc0 uoc0Var, ibk ibkVar) {
        roc0 roc0Var;
        m500 m500Var = uoc0Var.f232388j;
        if (ibkVar instanceof roc0) {
            roc0Var = (roc0) ibkVar;
            int i = roc0Var.f201226c;
            if ((i & Integer.MIN_VALUE) != 0) {
                roc0Var.f201226c = i - Integer.MIN_VALUE;
            } else {
                roc0Var = new roc0(uoc0Var, ibkVar);
            }
        } else {
            roc0Var = new roc0(uoc0Var, ibkVar);
        }
        Object objM83612d = roc0Var.f201224a;
        int i2 = roc0Var.f201226c;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM83612d);
            roc0Var.f201226c = 1;
            objM83612d = uoc0Var.m83612d(roc0Var);
            if (objM83612d != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM83612d);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM83612d);
        }
        uoc0Var.f232389k.m84481b(m500Var, new y0k0(7, m500Var.getResources().getString(R.string.prerelease_permission_dialog_title), m500Var.getResources().getString(R.string.prerelease_permission_dialog_message), m500Var.getResources().getString(R.string.prerelease_permission_dialog_positive_button), m500Var.getResources().getString(R.string.prerelease_permission_dialog_negative_button)), null);
        return w2a1.f247311a;
        if (((Boolean) objM83612d).booleanValue()) {
            roc0Var.f201226c = 2;
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final void m83610b(d850 d850Var) {
        om0.m67311c(this.f232383e, qm0.CLICKED, this.f232379a.f243049a, null, null, null, null, null, 124);
        this.f232396r.post(new lk00(27, this, d850Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m83611c(boolean z) {
        vnc0 vnc0Var = this.f232379a;
        this.f232385g.m76284b(vnc0Var.f243049a, z);
        om0.m67311c(this.f232383e, qm0.DISMISSED, vnc0Var.f243049a, null, null, null, null, null, 124);
        aqc0 aqc0Var = this.f232392n;
        if (aqc0Var == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        aqc0Var.m26772j1(new qoc0(this, 2));
        this.f232395q.m60129c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m83612d(ibk ibkVar) {
        toc0 toc0Var;
        if (ibkVar instanceof toc0) {
            toc0Var = (toc0) ibkVar;
            int i = toc0Var.f222227c;
            if ((i & Integer.MIN_VALUE) != 0) {
                toc0Var.f222227c = i - Integer.MIN_VALUE;
            } else {
                toc0Var = new toc0(this, ibkVar);
            }
        } else {
            toc0Var = new toc0(this, ibkVar);
        }
        Object objM76980u = toc0Var.f222225a;
        int i2 = toc0Var.f222227c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            soc0 soc0Var = new soc0(this, null, 2);
            toc0Var.f222227c = 1;
            objM76980u = s1h1.m76980u(2000L, soc0Var, toc0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        Boolean bool = (Boolean) objM76980u;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
