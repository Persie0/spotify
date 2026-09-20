package p204p;

import android.app.Application;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.SnackBarTemplate;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class c931 implements qte0 {

    /* JADX INFO: renamed from: a */
    public final m500 f35379a;

    /* JADX INFO: renamed from: b */
    public final fds0 f35380b;

    /* JADX INFO: renamed from: c */
    public final adl0 f35381c;

    /* JADX INFO: renamed from: d */
    public final kal0 f35382d;

    /* JADX INFO: renamed from: e */
    public final g7l0 f35383e;

    /* JADX INFO: renamed from: f */
    public final jal0 f35384f;

    /* JADX INFO: renamed from: g */
    public final m631 f35385g;

    /* JADX INFO: renamed from: h */
    public final e940 f35386h;

    /* JADX INFO: renamed from: i */
    public final kv91 f35387i;

    /* JADX INFO: renamed from: j */
    public final lt91 f35388j;

    /* JADX INFO: renamed from: k */
    public final luk f35389k;

    /* JADX INFO: renamed from: l */
    public pqm0 f35390l;

    /* JADX INFO: renamed from: m */
    public cds0 f35391m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f35392n;

    /* JADX INFO: renamed from: o */
    public final zv41 f35393o;

    /* JADX INFO: renamed from: p */
    public final zv41 f35394p;

    public c931(luk lukVar, m500 m500Var, e940 e940Var, g7l0 g7l0Var, jal0 jal0Var, kal0 kal0Var, adl0 adl0Var, fds0 fds0Var, m631 m631Var, lt91 lt91Var, kv91 kv91Var) {
        this.f35379a = m500Var;
        this.f35380b = fds0Var;
        this.f35381c = adl0Var;
        this.f35382d = kal0Var;
        this.f35383e = g7l0Var;
        this.f35384f = jal0Var;
        this.f35385g = m631Var;
        this.f35386h = e940Var;
        this.f35387i = kv91Var;
        this.f35388j = lt91Var;
        this.f35389k = lukVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f35392n = linkedHashSet;
        Boolean bool = Boolean.FALSE;
        this.f35393o = jag1.m52819d(bool);
        this.f35394p = jag1.m52819d(bool);
        linkedHashSet.add(x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new v831(this, null, 0), 3));
    }

    /* JADX INFO: renamed from: c */
    public static final void m31809c(c931 c931Var, fyf fyfVar, fxh0 fxh0Var, String str, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1458644513);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(c931Var) ? 2048 : 1024;
        }
        int i3 = 0;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(siv0.f209669e);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            c4t0 c4t0VarMo30068a = vm6.f242710a.mo30068a(c931Var.f35386h);
            wy41 wy41Var = pda0.f176396a;
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(c931Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new w831(i3, c931Var, kqi0Var);
                xq00Var.m91793t0(objM91750T2);
            }
            qqg1.m73533c(new c4t0[]{c4t0VarMo30068a, pda0.m69677c((eh00) objM91750T2, xq00Var)}, rkk.m75772x(-1798760095, new x831(fxh0Var, str, kqi0Var, fyfVar, 1), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zmu0((Object) c931Var, (Object) fyfVar, fxh0Var, (Object) str, i, 27);
        }
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: a */
    public final void mo27112a(MessageResponseToken messageResponseToken, gh00 gh00Var) {
        this.f35390l = new pqm0(messageResponseToken, gh00Var.invoke(messageResponseToken));
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: b */
    public final void mo27113b(eh00 eh00Var) {
        cds0 cds0Var;
        pqm0 pqm0Var = this.f35390l;
        if (pqm0Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SnackBarTemplate snackBarTemplate = (SnackBarTemplate) pqm0Var.f180351b;
        fbk fbkVar = null;
        bds0 bds0Var = new bds0(snackBarTemplate.text(), snackBarTemplate.buttonText(), snackBarTemplate.primaryButton() != null ? new y86(13) : null, new e811(17, this, pqm0Var));
        fds0 fds0Var = this.f35380b;
        cwf cwfVar = (cwf) fds0Var.f68559b.f45563c.f158717a.getValue();
        if (cwfVar == null) {
            cds0Var = new cds0(fds0Var, gds0.f78944g);
        } else {
            cds0Var = new cds0(fds0Var, gds0.f78938a);
            m12 m12Var = new m12(cds0Var, bds0Var, s231.m77006D((Application) fds0Var.f68560c.f284527a.f201303a.f212437t1.f246642a));
            m12Var.f138799e = new dds0(cds0Var, 0);
            q831 q831Var = fds0Var.f68558a;
            ase0 ase0Var = new ase0(new wre0(false), ure0.f233341a);
            dds0 dds0Var = new dds0(cds0Var, 1);
            int i = o631.f162197b;
            q831.m72298k(q831Var, m12Var, mte0.f147059a, ase0Var, cwfVar, null, dds0Var, kfj.m56289p(), 16);
        }
        this.f35391m = cds0Var;
        this.f35392n.add(x0h1.m89578u(kk40.m56661c(opo.m67570t(qlg1.m73202g(), this.f35389k)), null, 0, new h431(cds0Var, this, pqm0Var, fbkVar, 2), 3));
    }

    /* JADX INFO: renamed from: d */
    public final void m31810d() {
        cds0 cds0Var = this.f35391m;
        if (cds0Var != null && cds0Var.f36944b.f158717a.getValue() == gds0.f78939b) {
            cds0Var.f36945c.f68558a.m72300d();
        }
        this.f35391m = null;
        Iterator it = this.f35392n.iterator();
        while (it.hasNext()) {
            ((tf60) it.next()).mo26601e(null);
        }
    }

    @Override // p204p.qte0
    public final void dismiss() {
        m31810d();
    }
}
