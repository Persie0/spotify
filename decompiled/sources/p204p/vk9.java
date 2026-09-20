package p204p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.p044v1.proto.TrackingData;
import com.spotify.concertsgalleryview.p049v1.GetGalleryPageRequest;
import com.spotify.device_context.p058v1.TargetDevice;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.CreateCommentRequest;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.CreateReplyRequest;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.DeleteCommentRequest;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.DeleteReactionRequest;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.GetReactionsCountRequest;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ListReactionsRequest;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.PutReactionRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public class vk9 implements Function, pc81, l1c, khe0, Producer, yxf, cy51, BiConsumer, n6n0, hsf, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242170a;

    /* JADX INFO: renamed from: b */
    public Object f242171b;

    public /* synthetic */ vk9(int i) {
        this.f242170a = i;
    }

    @Override // p204p.hsf
    /* JADX INFO: renamed from: a */
    public isf mo35378a(hc80 hc80Var) {
        hc80Var.getClass();
        return new hcn(1, (xkn) this.f242171b, hc80Var);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        ihi ihiVar = (ihi) obj;
        if (!((qoo) this.f242171b).m73401h()) {
            return false;
        }
        u300 u300Var = ihiVar.f102296c;
        return u300Var == u300.DAYLIST || u300Var == u300.DAYLIST_SNAPSHOT;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f242170a) {
            case 1:
                qxr0 qxr0Var = (qxr0) obj;
                return qxr0.m74146c(qxr0Var, 0, g6f.m43700N0(qxr0Var.f193732b, ((qxr0) this.f242171b).f193732b), qxr0Var.f193733c, false, qxr0Var.f193735e, 0, 0, 105);
            case 5:
                return new CompletableFromAction(new ok0(15, (hv31) obj, (fv31) this.f242171b));
            case 10:
                r7e r7eVar = (r7e) obj;
                e8e e8eVar = (e8e) this.f242171b;
                f8e f8eVar = e8eVar.f57150b;
                d710 d710VarM6050s = GetCheckoutPageRequest.m6050s();
                h7e h7eVar = e8eVar.f57151c;
                d710VarM6050s.m35163m(h7eVar.f88442b);
                it81 it81VarM6512q = TrackingData.m6512q();
                String str = h7eVar.f88443c;
                if (str != null) {
                    it81VarM6512q.m51613q(str);
                }
                it81VarM6512q.m51614r(h7eVar.f88441a.f55184a);
                it81VarM6512q.m51612m(e8eVar.f57155g);
                d710VarM6050s.m35166s((TrackingData) it81VarM6512q.build());
                String str2 = r7eVar.f196503b;
                if (str2 != null) {
                    d710VarM6050s.m35164q(str2);
                }
                d710VarM6050s.m35165r(r7eVar.f196502a ? k761.SUPPORTED : k761.UNSUPPORTED);
                return f8eVar.mo41035c((GetCheckoutPageRequest) d710VarM6050s.build()).compose(new kq11(2)).map(new e99(e8eVar, 13)).onErrorReturn(use.f233590M0);
            case 11:
                return g0b1.m43282x(dau.f47107a, new a7s0((n1v0) ((tu1) this.f242171b).f223741b, (fbk) null, 11)).m23293d(Observable.just(qty0.f192508a));
            case 12:
                lse lseVar = (lse) this.f242171b;
                return g0b1.m43282x(lseVar.f136515d, new q91((smr) obj, lseVar, (fbk) null, 17));
            case 21:
                String str3 = ((ot2) obj).f168953b;
                String string = UUID.randomUUID().toString();
                ((wy3) ((xre) this.f242171b)).getClass();
                return new eu2(System.currentTimeMillis(), string, str3);
            default:
                Boolean bool = ((u331) obj).f226265a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : ((tu40) this.f242171b).f223766f);
        }
    }

    /* JADX INFO: renamed from: b */
    public Completable m85803b(String str, String str2) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        dgt0 dgt0VarM22212q = PutReactionRequest.m22212q();
        dgt0VarM22212q.m35935m(str);
        dgt0VarM22212q.m35936q(str2);
        return tsa1Var.m81397c((PutReactionRequest) dgt0VarM22212q.build()).map(hcp0.f89865X).ignoreElement();
    }

    /* JADX INFO: renamed from: c */
    public ty6 m85804c() {
        my6 my6Var = (my6) this.f242171b;
        Activity activity = (Activity) my6Var.f148317a.get();
        jg31.m53271i(activity);
        z9j0 z9j0Var = (z9j0) my6Var.f148320d.get();
        jg31.m53271i(z9j0Var);
        k5m0 k5m0Var = (k5m0) my6Var.f148321e.get();
        jg31.m53271i(k5m0Var);
        return new ty6(activity, z9j0Var, k5m0Var);
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        y601 y601Var = (y601) obj;
        v2l v2lVar = ((t2l) this.f242171b).f216586e;
        return y601Var == null ? bga.m29102x(null) : bga.m29075R(Arrays.asList(v2l.m84513a(v2lVar), v2lVar.f236690m.m71978l(null, (q4l) v2lVar.f236682e.f197471b)));
    }

    /* JADX INFO: renamed from: e */
    public Completable m85805e(String str, List list, String str2) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        r5l r5lVarM22156r = CreateCommentRequest.m22156r();
        r5lVarM22156r.m74816r(str);
        r5lVarM22156r.m74815q(str2);
        r5lVarM22156r.m74814m(list);
        return tsa1Var.m81398d((CreateCommentRequest) r5lVarM22156r.build()).map(ket.f121950P0).ignoreElement();
    }

    @Override // p204p.l1c
    /* JADX INFO: renamed from: g */
    public Object mo28544g(int i, String str, String str2, st91 st91Var) {
        cag0 cag0Var = new cag0(Integer.valueOf(i), str, new s8g0(new zm8(st91Var, 14), (char) 0));
        this.f242171b = cag0Var;
        return cag0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new SchedulerWorkRunner(((n8f) this.f242171b).f151513b);
    }

    @Override // p204p.l1c
    /* JADX INFO: renamed from: h */
    public av91 mo28545h(g1c g1cVar, String str) {
        if (!g1cVar.equals(g1c.f75578a)) {
            throw new NoWhenBranchMatchedException();
        }
        cag0 cag0Var = (cag0) this.f242171b;
        if (cag0Var == null) {
            wj50.m88260d0("playlistItem");
            throw null;
        }
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), cag0Var.f35816b, ((zm8) ((s8g0) cag0Var.f35817c).f206644c).f284179b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public c3b m85806i() {
        w2b w2bVar = (w2b) this.f242171b;
        w2bVar.getClass();
        return new c3b(w2bVar);
    }

    /* JADX INFO: renamed from: j */
    public Single m85807j(String str, List list, String str2) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        dcl dclVarM22161r = CreateReplyRequest.m22161r();
        dclVarM22161r.m35660r(str);
        dclVarM22161r.m35659q(str2);
        dclVarM22161r.m35658m(list);
        return tsa1Var.m81395a((CreateReplyRequest) dclVarM22161r.build());
    }

    /* JADX INFO: renamed from: k */
    public Completable m85808k(String str) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        inq inqVarM22166p = DeleteCommentRequest.m22166p();
        inqVarM22166p.m51139m(str);
        return tsa1Var.m81403i((DeleteCommentRequest) inqVarM22166p.build()).map(let.f132693P0).ignoreElement();
    }

    @Override // p204p.khe0
    /* JADX INFO: renamed from: l */
    public void mo36080l(zge0 zge0Var, MenuItem menuItem) {
        ((m9c) this.f242171b).f141267f.removeCallbacksAndMessages(zge0Var);
    }

    @Override // p204p.yxf
    /* JADX INFO: renamed from: m */
    public j15 mo36390m(xq00 xq00Var) {
        xq00Var.m91771i0(-1891471103);
        fyf fyfVar = (fyf) this.f242171b;
        g15 g15Var = new g15();
        fyfVar.mo24510D0(g15Var, xq00Var, 8);
        j15 j15VarM43339o = g15Var.m43339o();
        xq00Var.m91788r(false);
        return j15VarM43339o;
    }

    /* JADX INFO: renamed from: n */
    public Object m85809n(String str, String str2, mb61 mb61Var) {
        a910 a910VarM7224p = GetGalleryPageRequest.m7224p();
        a910VarM7224p.m25063q(str);
        if (str2 != null && str2.length() != 0) {
            a910VarM7224p.m25062m(str2);
        }
        GetGalleryPageRequest getGalleryPageRequest = (GetGalleryPageRequest) a910VarM7224p.build();
        igi igiVar = (igi) this.f242171b;
        wj50.m88279p(getGalleryPageRequest);
        return igiVar.m50548a(getGalleryPageRequest, mb61Var);
    }

    /* JADX INFO: renamed from: o */
    public Single m85810o(String str) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        ua10 ua10VarM22188p = GetReactionsCountRequest.m22188p();
        ua10VarM22188p.m82663m(str);
        return tsa1Var.m81405k((GetReactionsCountRequest) ua10VarM22188p.build());
    }

    @Override // p204p.khe0
    /* JADX INFO: renamed from: p */
    public void mo36081p(zge0 zge0Var, lhe0 lhe0Var) {
        m9c m9cVar = (m9c) this.f242171b;
        Handler handler = m9cVar.f141267f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = m9cVar.f141269h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (zge0Var == ((l9c) arrayList.get(i)).f131056b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new k9c(this, i2 < arrayList.size() ? (l9c) arrayList.get(i2) : null, lhe0Var, zge0Var), zge0Var, SystemClock.uptimeMillis() + 200);
    }

    /* JADX INFO: renamed from: q */
    public Single m85811q(String str, String str2, String str3) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        r290 r290VarM22201r = ListReactionsRequest.m22201r();
        r290VarM22201r.m74508m(str);
        if (str2 != null) {
            r290VarM22201r.m74510r(str2);
        }
        if (str3 != null) {
            r290VarM22201r.m74509q(str3);
        }
        return tsa1Var.m81401g((ListReactionsRequest) r290VarM22201r.build());
    }

    @Override // p204p.n6n0
    /* JADX INFO: renamed from: r */
    public qre0 mo42552r() {
        qre0 qre0VarMo57670r = ((c5n) this.f242171b).f34220a.mo57670r();
        jg31.m53271i(qre0VarMo57670r);
        return qre0VarMo57670r;
    }

    /* JADX INFO: renamed from: s */
    public String m85812s() {
        String strEncodeToString;
        Objects.toString((TargetDevice) this.f242171b);
        TargetDevice targetDevice = (TargetDevice) this.f242171b;
        return (targetDevice == null || (strEncodeToString = Base64.encodeToString(targetDevice.toByteArray(), 2)) == null) ? "" : strEncodeToString;
    }

    /* JADX INFO: renamed from: t */
    public d670 m85813t() {
        uy6 uy6Var = (uy6) ((my6) this.f242171b).f148322f.get();
        jg31.m53271i(uy6Var);
        return new d670(uy6Var);
    }

    @Override // p204p.pc81
    /* JADX INFO: renamed from: u */
    public lkv0 mo45105u(ViewGroup viewGroup, Object obj, t9p0 t9p0Var, gxj0 gxj0Var) {
        z8n z8nVar = ((urb) this.f242171b).f233318b;
        fiz fizVar = obj instanceof fiz ? (fiz) obj : null;
        switch (z8nVar.f280501a) {
            case 0:
                hmm hmmVar = (hmm) z8nVar.f280502b;
                a9n a9nVar = (a9n) hmmVar.f93001d;
                px0 px0Var = new px0(new ci5((bji) a9nVar.f13604b.f58044f.get()), 21);
                e940 e940VarM94055d0 = ((ebn) hmmVar.f93000c).f58032b.m94055d0();
                jg31.m53271i(e940VarM94055d0);
                qp0 qp0Var = new qp0((qre0) a9nVar.f13604b.f58001M.get());
                ebn ebnVar = a9nVar.f13604b;
                return new asb(px0Var, e940VarM94055d0, qp0Var, new C2529wd((Flowable) ebnVar.f58059k.get(), (qre0) ebnVar.f58001M.get()), (hc80) a9nVar.f13605c.get(), new ci5((bji) a9nVar.f13604b.f58044f.get()), viewGroup, fizVar, gxj0Var);
            default:
                wfn wfnVar = (wfn) z8nVar.f280502b;
                son sonVar = wfnVar.f250873b;
                px0 px0VarM78688G = sonVar.m78688G();
                e940 e940Var = (e940) sonVar.f211626P7.get();
                rk0 rk0Var = (rk0) wfnVar.f250876e;
                qp0 qp0Var2 = new qp0((qre0) ((son) rk0Var.f199935c).f212305o2.get());
                son sonVar2 = (son) rk0Var.f199935c;
                return new asb(px0VarM78688G, e940Var, qp0Var2, new C2529wd((Flowable) sonVar2.f211306D4.get(), (qre0) sonVar2.f212305o2.get()), (hc80) ((h4t0) rk0Var.f199941i).get(), sonVar.m78670A(), viewGroup, fizVar, gxj0Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public Completable m85814v(String str) {
        tsa1 tsa1Var = (tsa1) this.f242171b;
        kpq kpqVarM22169p = DeleteReactionRequest.m22169p();
        kpqVarM22169p.m57060m(str);
        return tsa1Var.m81404j((DeleteReactionRequest) kpqVarM22169p.build()).map(net.f153077O0).ignoreElement();
    }

    /* JADX INFO: renamed from: w */
    public void m85815w(w2b w2bVar) {
        this.f242171b = w2bVar;
    }

    public /* synthetic */ vk9(int i, Object obj, Object obj2) {
        this.f242170a = i;
        this.f242171b = obj;
    }

    public /* synthetic */ vk9(Object obj, int i) {
        this.f242170a = i;
        this.f242171b = obj;
    }

    public vk9(String str, Bundle bundle) {
        Uri uriM63361a;
        String str2;
        this.f242170a = 23;
        bundle = bundle == null ? new Bundle() : bundle;
        int[] iArrM38551G = edb.m38551G(2);
        ArrayList arrayList = new ArrayList(iArrM38551G.length);
        for (int i : iArrM38551G) {
            if (i == 1) {
                str2 = "context_choose";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "join_tournament";
            }
            arrayList.add(str2);
        }
        if (arrayList.contains(str)) {
            p8y p8yVar = p8y.f175080a;
            uriM63361a = n0b1.m63361a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), "/dialog/".concat(str), bundle);
        } else {
            uriM63361a = n0b1.m63361a(yjg1.m93918j(), p8y.m69346d() + "/dialog/" + str, bundle);
        }
        this.f242171b = uriM63361a;
    }

    @Override // io.reactivex.rxjava3.functions.BiConsumer
    public void accept(Object obj, Object obj2) {
        m93 m93Var = (m93) obj;
        if (!(m93Var instanceof j93) && !(m93Var instanceof k93)) {
            if (!(m93Var instanceof l93) && m93Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        lcp0.m58711a((Context) ((ydi) this.f242171b).f271774b);
    }

    public vk9() {
        this.f242170a = 19;
        this.f242171b = null;
    }

    public vk9(son sonVar, xkn xknVar) {
        this.f242170a = 26;
        this.f242171b = xknVar;
    }
}
