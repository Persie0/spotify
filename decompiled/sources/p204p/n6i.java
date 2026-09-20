package p204p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.spotify.creativeworkplatform.encore.elements.ArtworkView;
import com.spotify.creativeworkplatform.encore.elements.DefaultCreator;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class n6i implements t1k0, scz0, Function, rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150890a;

    /* JADX INFO: renamed from: b */
    public final Object f150891b;

    /* JADX INFO: renamed from: c */
    public final Object f150892c;

    public /* synthetic */ n6i(int i, Object obj, Object obj2) {
        this.f150890a = i;
        this.f150891b = obj;
        this.f150892c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public t0h1 m63772a() {
        qre0 qre0Var = (qre0) ((lx1) this.f150892c).f137694f.get();
        jg31.m53271i(qre0Var);
        kx1 kx1Var = (kx1) this.f150891b;
        qw1 qw1Var = (qw1) kx1Var.f127296H1.getValue();
        jg31.m53272j(qw1Var);
        int iMo68151e1 = qw1Var.mo68151e1();
        if (iMo68151e1 == 0) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        qw1 qw1Var2 = (qw1) kx1Var.f127296H1.getValue();
        jg31.m53272j(qw1Var2);
        String strMo68150J = qw1Var2.mo68150J();
        if (strMo68150J == null) {
            strMo68150J = null;
        }
        return new t0h1(qre0Var, iMo68151e1, strMo68150J, (UUID) kx1Var.f127304P1.getValue(), 1);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f150890a) {
            case 3:
                return ((wb11) this.f150891b).mo35842b((Context) this.f150892c, (String) obj);
            default:
                String str = (String) obj;
                ((PublishSubject) ((qal) this.f150891b).f186898d).onNext(str);
                return Single.just(new pgs0(str, ((otp0) this.f150892c).f170063j)).toObservable();
        }
    }

    @Override // p204p.scz0
    /* JADX INFO: renamed from: b */
    public Object mo42946b(List list, q2y0 q2y0Var) {
        if (!list.isEmpty()) {
            fbk fbkVar = null;
            Object objM89249f = wxf1.m89249f(new vjz(xtm0.m92094o(5, new ysk(list, 25), new dze(this, fbkVar, 19)), new ww0(3, 4, fbkVar), 2), q2y0Var);
            if (objM89249f == yuk.f276404a) {
                return objM89249f;
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.t1k0
    /* JADX INFO: renamed from: c */
    public void mo63773c(int i) {
        if (i == 3 || i == 2) {
            ((hqb) this.f150891b).m48229z(new cai(((a4i) this.f150892c).f12261c), v2i.f236655X0);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m63774d(Object obj, String str) {
        HashMap map = (HashMap) this.f150891b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f150892c).remove(str);
    }

    @Override // p204p.t1k0
    /* JADX INFO: renamed from: e */
    public void mo63775e() {
        ((hqb) this.f150891b).m48229z(new cai(((a4i) this.f150892c).f12261c), v2i.f236653W0);
    }

    /* JADX INFO: renamed from: f */
    public ruk m63776f() {
        puk pukVar = (puk) this.f150891b;
        luk lukVarMo50663d = pukVar.mo50663d();
        jg31.m53271i(lukVarMo50663d);
        luk lukVarMo37532f = pukVar.mo37532f();
        jg31.m53271i(lukVarMo37532f);
        z9j0 z9j0VarMo37530c = pukVar.mo37530c();
        jg31.m53271i(z9j0VarMo37530c);
        Activity activityMo39898o = pukVar.mo39898o();
        jg31.m53271i(activityMo39898o);
        kv91 kv91VarMo39897g = pukVar.mo39897g();
        jg31.m53271i(kv91VarMo39897g);
        xst xstVar = new xst(z9j0VarMo37530c, new u7q(25, activityMo39898o, new q6u(kv91VarMo39897g, (st91) this.f150892c)));
        vmz vmzVarMo50665l = pukVar.mo50665l();
        jg31.m53271i(vmzVarMo50665l);
        bji bjiVarMo50664i = pukVar.mo50664i();
        jg31.m53271i(bjiVarMo50664i);
        return new ruk(lukVarMo50663d, lukVarMo37532f, xstVar, new bmx(vmzVarMo50665l, new gb4(false, bjiVarMo50664i)));
    }

    /* JADX INFO: renamed from: g */
    public void m63777g(String str, d850 d850Var) {
        Context context = (Context) this.f150891b;
        if (bm51.m29803n0(str, "spotify:", false)) {
            ((z9j0) this.f150892c).mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, d850Var != null ? new n6j0(d850Var) : null));
        } else if (wl51.m88496t0(str, "play.google.com", false)) {
            jfg1.m53193p(context, str);
        } else {
            jfg1.m53194q(context, str);
        }
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f150890a) {
            case 13:
                return (DefaultCreator) this.f150891b;
            default:
                return (RoundedConstraintLayout) this.f150891b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[LOOP:0: B:26:0x007f->B:28:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0102  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:38:0x0124  */
    /* JADX WARN: Code duplicated, block: B:40:0x012e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x0171 A[LOOP:2: B:47:0x016b->B:49:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3 A[EDGE_INSN: B:52:0x00a3->B:29:0x00a3 BREAK  A[LOOP:0: B:26:0x007f->B:28:0x008a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0054 -> B:18:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x00d4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public java.lang.Object m63778h(p204p.ibk r14) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.n6i.m63778h(p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    public q7k m63779i(String str) {
        Set set = dd41.f47702f;
        gn80 gn80Var = r46.m74726U(str).f47709c;
        return (gn80Var == gn80.SHOW_EPISODE || gn80Var == gn80.SHOW_EPISODE_TIMESTAMP || gn80Var == gn80.EPISODE_AUTOPLAY) ? (q0q0) this.f150892c : (y8p) this.f150891b;
    }

    public n6i(xrm xrmVar, yyk yykVar) {
        this.f150890a = 10;
        this.f150891b = xrmVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f150892c = new xlg0(xgg1.m90650L3().f36166c, xoc1.f263883F4.m83614b(yykVar.f277528a).f243453a, 0);
    }

    public n6i(rmm0 rmm0Var) {
        this.f150890a = 2;
        this.f150891b = xtm0.m92080a(1, 2, 4);
        this.f150892c = rmm0Var.mo29877i().mo27151a(xl21.f263009b, new wh1(this, 11));
    }

    public n6i(hv31 hv31Var) {
        this.f150890a = 4;
        this.f150891b = hv31Var;
        this.f150892c = new wg61(new r7i(this, 11));
    }

    public n6i(DefaultCreator defaultCreator, ArtworkView artworkView, TextView textView) {
        this.f150890a = 13;
        this.f150891b = defaultCreator;
        this.f150892c = artworkView;
    }

    public n6i(bco bcoVar) {
        this.f150890a = 25;
        this.f150891b = bcoVar;
        this.f150892c = new tqm(this, 11);
    }

    public n6i(c9a c9aVar) {
        this.f150890a = 23;
        this.f150891b = c9aVar;
        this.f150892c = be21.m28868a(new akm(this, 26));
    }

    public n6i(xeu xeuVar) {
        this.f150890a = 26;
        this.f150891b = xeuVar;
        this.f150892c = be21.m28868a(new tqm(this, 21));
    }

    public n6i(bfn bfnVar, esq esqVar) {
        this.f150890a = 19;
        this.f150891b = bfnVar;
        this.f150892c = be21.m28868a(new lgm(this, 23));
    }

    public n6i(vn7 vn7Var) {
        this.f150890a = 20;
        this.f150891b = vn7Var;
        this.f150892c = be21.m28868a(new akm(this, 4));
    }

    public n6i(xc00 xc00Var) {
        this.f150890a = 27;
        this.f150891b = xc00Var;
        this.f150892c = b2s.m27972b(new e0n(this, 2));
    }

    public n6i(lx1 lx1Var, kx1 kx1Var) {
        this.f150890a = 18;
        this.f150891b = kx1Var;
        this.f150892c = lx1Var;
    }

    public n6i(rt10 rt10Var, st10 st10Var, dcm0 dcm0Var) {
        this.f150890a = 28;
        this.f150891b = dcm0Var;
        this.f150892c = new e0n(this, 9);
    }

    public n6i(a91 a91Var, eoh eohVar) {
        this.f150890a = 17;
        this.f150891b = a91Var;
        this.f150892c = b2s.m27972b(new lgm(this, 5));
    }

    public n6i(qyy0 qyy0Var, hg40 hg40Var) {
        this.f150890a = 29;
        this.f150891b = qyy0Var;
        this.f150892c = b2s.m27972b(new e0n(this, 18));
    }

    public n6i(cn9 cn9Var, eoh eohVar, en9 en9Var) {
        this.f150890a = 21;
        this.f150891b = cn9Var;
        this.f150892c = be21.m28868a(new akm(this, 11));
    }

    public n6i(vgd vgdVar, ikh ikhVar, wgd wgdVar, dcm0 dcm0Var) {
        this.f150890a = 22;
        this.f150891b = vgdVar;
        this.f150892c = new akm(this, 18);
    }

    public n6i() {
        this.f150890a = 6;
        this.f150891b = new HashMap();
        this.f150892c = new ArrayList();
    }
}
