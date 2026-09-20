package p204p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.car.app.model.Alert;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.music.R;
import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class etz implements rdc1, u6m0, nja1, sht0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62822a;

    /* JADX INFO: renamed from: b */
    public final Object f62823b;

    /* JADX INFO: renamed from: c */
    public final Object f62824c;

    /* JADX INFO: renamed from: d */
    public final Object f62825d;

    /* JADX INFO: renamed from: e */
    public Object f62826e;

    /* JADX INFO: renamed from: f */
    public final Object f62827f;

    public /* synthetic */ etz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f62822a = i;
        this.f62823b = obj;
        this.f62824c = obj2;
        this.f62825d = obj3;
        this.f62826e = obj4;
        this.f62827f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m39982e(etz etzVar, String str, boolean z, ibk ibkVar) {
        atz atzVar;
        if (ibkVar instanceof atz) {
            atzVar = (atz) ibkVar;
            int i = atzVar.f19769e;
            if ((i & Integer.MIN_VALUE) != 0) {
                atzVar.f19769e = i - Integer.MIN_VALUE;
            } else {
                atzVar = new atz(etzVar, ibkVar);
            }
        } else {
            atzVar = new atz(etzVar, ibkVar);
        }
        Object obj = atzVar.f19767c;
        int i2 = atzVar.f19769e;
        if (i2 == 0) {
            bga.m29073P(obj);
            ud80 ud80Var = (ud80) etzVar.f62823b;
            atzVar.f19765a = str;
            atzVar.f19766b = z;
            atzVar.f19769e = 1;
            Object objM82840b = ud80.m82840b(ud80Var, str, false, atzVar, 6);
            yuk yukVar = yuk.f276404a;
            if (objM82840b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = atzVar.f19766b;
            str = atzVar.f19765a;
            bga.m29073P(obj);
        }
        etzVar.m40005z(R.string.toast_liked_artist, new btz(etzVar, z, str));
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m39983h(etz etzVar, String str, ibk ibkVar) {
        ctz ctzVar;
        if (ibkVar instanceof ctz) {
            ctzVar = (ctz) ibkVar;
            int i = ctzVar.f42004d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ctzVar.f42004d = i - Integer.MIN_VALUE;
            } else {
                ctzVar = new ctz(etzVar, ibkVar);
            }
        } else {
            ctzVar = new ctz(etzVar, ibkVar);
        }
        Object obj = ctzVar.f42002b;
        int i2 = ctzVar.f42004d;
        if (i2 == 0) {
            bga.m29073P(obj);
            ud80 ud80Var = (ud80) etzVar.f62823b;
            ctzVar.f42001a = str;
            ctzVar.f42004d = 1;
            Object objM82842g = ud80.m82842g(ud80Var, str, false, ctzVar, 6);
            yuk yukVar = yuk.f276404a;
            if (objM82842g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = ctzVar.f42001a;
            bga.m29073P(obj);
        }
        etzVar.m40005z(R.string.toast_ok_got_it, new dtz(0, etzVar, str));
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: s */
    public static FlowableObserveOn m39984s(etz etzVar) {
        return ((Flowable) etzVar.f62824c).m23331J(new gt2("", 9)).m23356t(Functions.f7225a).m23332L((Scheduler) etzVar.f62823b);
    }

    @Override // p204p.nja1
    /* JADX INFO: renamed from: a */
    public void mo30787a(Uri uri) {
        Logger.m3969e("Showing logout dialog due to URI " + uri, new Object[0]);
        Context context = (Context) this.f62823b;
        dzd dzdVar = new dzd(context.getString(R.string.gpb_logout_dialog_title), context.getString(R.string.gpb_logout_dialog_body), context.getString(R.string.gpb_logout_dialog_positive_btn), context.getString(android.R.string.cancel));
        kzd kzdVar = new kzd();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_KEY", dzdVar);
        kzdVar.m49706b1(bundle);
        kzdVar.mo63162p1((c700) this.f62824c, "LOGOUT_DIALOG_TAG");
    }

    /* JADX INFO: renamed from: b */
    public void m39985b(t841 t841Var, xv41 xv41Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        gh00 gh00Var2;
        xq00Var.m91775k0(-1811445864);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(t841Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(xv41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gh00Var2 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var2) ? 256 : 128;
        } else {
            gh00Var2 = gh00Var;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            x43 x43Var = (x43) this.f62823b;
            ra9 ra9VarMo48178a = ((pb80) this.f62825d).mo48178a((hc80) xq00Var.m91774k(sda0.f207965a));
            l89 l89Var = (l89) this.f62824c;
            lt0 lt0Var = (lt0) this.f62826e;
            boolean z = t841Var.f217970g;
            boolean zM91770i = xq00Var.m91770i(this);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new vr10(this, 15);
                xq00Var.m91793t0(objM91750T);
            }
            x43Var.m89829a(t841Var, (gh00) objM91750T, lt0Var, ra9VarMo48178a, l89Var, gh00Var2, xv41Var, null, z, xq00Var, ((i2 << 15) & 3670016) | (i2 & 14) | ((i2 << 9) & 458752));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00(this, t841Var, xv41Var, gh00Var, i, 9);
        }
    }

    @Override // p204p.sht0
    /* JADX INFO: renamed from: c */
    public gn41 mo39986c(q4n0 q4n0Var) {
        return m39991j(q4n0Var, ((a77) this.f62825d).m24913b());
    }

    @Override // p204p.sht0
    /* JADX INFO: renamed from: d */
    public gn41 mo39987d(q4n0 q4n0Var) {
        return m39991j(q4n0Var, ((a77) this.f62825d).m24914c());
    }

    @Override // p204p.sht0
    /* JADX INFO: renamed from: f */
    public gn41 mo39988f(q4n0 q4n0Var) {
        return m39991j(q4n0Var, ((a77) this.f62825d).m24915d());
    }

    @Override // p204p.sht0
    /* JADX INFO: renamed from: g */
    public gn41 mo39989g(q4n0 q4n0Var) {
        return m39991j(q4n0Var, ((a77) this.f62825d).f12976c.m25377e(fht0.f69702c, fht0.f69703d, false, false));
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f62822a) {
            case 1:
                return (ConstraintLayout) this.f62823b;
            case 6:
                return (ConstraintLayout) this.f62823b;
            case 8:
                return (CoordinatorLayout) this.f62823b;
            case 13:
                return (ConstraintLayout) this.f62823b;
            case 14:
                return (RelativeLayout) this.f62823b;
            case 17:
                return (LinearLayout) this.f62823b;
            default:
                return (ConstraintLayout) this.f62823b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00df -> B:34:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x007a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public java.lang.Object m39990i(java.util.Map r13, p204p.ibk r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.etz.m39990i(java.util.Map, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public gn41 m39991j(fiz fizVar, zrr0 zrr0Var) {
        Integer numValueOf = Integer.valueOf(R.string.settings_item_metered_audio_stream_quality_title);
        Integer numValueOf2 = Integer.valueOf(R.string.settings_item_metered_audio_stream_quality_description);
        g3e.f76187x.getClass();
        lew0 lew0Var = lew0.f132733N0;
        v78 v78VarM73226e = qlk.m73226e(((i0d) this.f62823b).m49364i(), (fiz) ((wg61) ((vzn) this.f62824c).f246488c).getValue());
        List list = (List) zrr0Var.f285729b;
        Map map = (Map) zrr0Var.f285730c;
        nbi0 nbi0Var = new nbi0(3);
        zxx0.f287421a.getClass();
        return new gn41("meteredAudioStreamQuality", numValueOf, numValueOf2, null, null, null, fizVar, lew0Var, v78VarM73226e, new wbi0(list, map, nbi0Var, new sbi0(xxx0.f267128g, new yhb0(this, 25)), null, 16), Collections.singletonMap("losslessCellularWarning", new kbf0(this, 0)), 1002);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [p.gh00, p.qe70] */
    @Override // p204p.u6m0
    /* JADX INFO: renamed from: k */
    public t6m0 mo34969k(dcm0 dcm0Var, Bundle bundle) {
        return new z9p((x5a0) this.f62823b, (w4a0) this.f62824c, dcm0Var, bundle, (hcm0) this.f62825d, (gh00) this.f62826e, (u5a0) this.f62827f);
    }

    @Override // p204p.sht0
    /* JADX INFO: renamed from: l */
    public gn41 mo39992l(q4n0 q4n0Var) {
        abs0 abs0Var = ((a77) this.f62825d).f12976c;
        fht0 fht0Var = fht0.f69702c;
        return m39991j(q4n0Var, abs0Var.m25377e(fht0Var, fht0Var, true, false));
    }

    @Override // p204p.sht0
    /* JADX INFO: renamed from: m */
    public gn41 mo39993m(q4n0 q4n0Var) {
        return m39991j(q4n0Var, ((a77) this.f62825d).m24916e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.eh00] */
    /* JADX INFO: renamed from: n */
    public eh00 m39994n() {
        return this.f62823b;
    }

    /* JADX INFO: renamed from: o */
    public wba m39995o() {
        return (wba) ((wg61) this.f62827f).getValue();
    }

    /* JADX INFO: renamed from: p */
    public xre m39996p() {
        return (xre) ((i4t0) this.f62825d).get();
    }

    /* JADX INFO: renamed from: q */
    public bji m39997q() {
        return (bji) ((i4t0) this.f62827f).get();
    }

    /* JADX INFO: renamed from: r */
    public c7l0 m39998r() {
        return (c7l0) this.f62824c;
    }

    /* JADX INFO: renamed from: t */
    public Flowable m39999t() {
        return (Flowable) ((i4t0) this.f62824c).get();
    }

    /* JADX INFO: renamed from: u */
    public oge0 m40000u() {
        return (oge0) this.f62826e;
    }

    /* JADX INFO: renamed from: v */
    public Single m40001v() {
        return (Single) ((i4t0) this.f62826e).get();
    }

    /* JADX INFO: renamed from: w */
    public ie41 m40002w() {
        return (ie41) ((i4t0) this.f62823b).get();
    }

    /* JADX INFO: renamed from: x */
    public x4j0 m40003x() {
        return (x4j0) this.f62827f;
    }

    /* JADX INFO: renamed from: y */
    public Completable m40004y(String str) {
        return ((uqw) this.f62825d).m83821a(PlayCommand.create(com.spotify.player.model.Context.fromUri(str), (PlayOrigin) this.f62826e)).ignoreElement();
    }

    /* JADX INFO: renamed from: z */
    public void m40005z(int i, View.OnClickListener onClickListener) {
        m500 m500Var = (m500) this.f62826e;
        g631 g631Var = new g631(null, m500Var.getString(i), null, m500Var.getString(R.string.player_toastie_undo), null, onClickListener, null, null, false);
        q831 q831Var = (q831) this.f62825d;
        if (q831Var.m72301f()) {
            q831Var.m72305j(g631Var);
        } else {
            q831Var.m72307m(g631Var);
        }
    }

    public etz(rmm0 rmm0Var, ll70 ll70Var, luk lukVar) {
        this.f62822a = 7;
        this.f62827f = lukVar;
        bqa bqaVarM92080a = xtm0.m92080a(1, 2, 4);
        this.f62823b = bqaVarM92080a;
        this.f62824c = rxf1.m76634s(bqaVarM92080a);
        Uri.Builder builderPath = new Uri.Builder().scheme("spotify").authority("internal").path("bridge-tracks-curation");
        kl70 kl70Var = ll70Var.f134560b;
        String string = builderPath.appendQueryParameter("playlist", kl70Var.f123811a).appendQueryParameter("trackARowId", kl70Var.f123812b).build().toString();
        this.f62825d = new tk6(string);
        uh1 uh1Var = uh1.f230315e;
        Uri.encode(string);
        this.f62826e = rmm0Var.mo29877i().mo27151a(uh1Var, new wh1(this, 18));
    }

    public etz(uqw uqwVar, Activity activity, gkn gknVar, kv91 kv91Var) {
        this.f62822a = 5;
        this.f62823b = uqwVar;
        this.f62824c = activity;
        this.f62825d = gknVar;
        this.f62826e = kv91Var;
        this.f62827f = new wg61(new mc50(this, 0));
    }

    public etz(Context context, hc80 hc80Var, c700 c700Var, k1e k1eVar, kv91 kv91Var, k101 k101Var) {
        this.f62822a = 16;
        this.f62823b = context;
        this.f62824c = c700Var;
        this.f62825d = k1eVar;
        this.f62826e = kv91Var;
        this.f62827f = k101Var;
        c700Var.m31635i0("checkout_dialog", hc80Var, new mj70(this, 12));
    }

    public etz(yqp yqpVar, Scheduler scheduler, Scheduler scheduler2) {
        this.f62822a = 2;
        this.f62823b = yqpVar;
        this.f62824c = scheduler;
        this.f62825d = scheduler2;
        this.f62827f = new iwr();
    }

    public etz(i0d i0dVar, vzn vznVar, luk lukVar, a77 a77Var, d67 d67Var, zxx0 zxx0Var) {
        this.f62822a = 20;
        this.f62823b = i0dVar;
        this.f62824c = vznVar;
        this.f62827f = lukVar;
        this.f62825d = a77Var;
        this.f62826e = zxx0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public etz(C2336rf c2336rf, pgo pgoVar, String str, mcu0 mcu0Var, hv31 hv31Var) {
        this.f62822a = 11;
        this.f62823b = pgoVar;
        this.f62824c = mcu0Var;
        this.f62825d = hv31Var;
        ?? r2 = c2336rf.f198459a;
        this.f62826e = r2;
        this.f62827f = new fw80(str);
        g6f.m43728j1(r2.values());
        new k790(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public etz(x5a0 x5a0Var, w4a0 w4a0Var, hcm0 hcm0Var, gh00 gh00Var, u5a0 u5a0Var) {
        this.f62822a = 15;
        this.f62823b = x5a0Var;
        this.f62824c = w4a0Var;
        this.f62825d = hcm0Var;
        this.f62826e = (qe70) gh00Var;
        this.f62827f = u5a0Var;
    }

    public etz(x43 x43Var, l89 l89Var, pb80 pb80Var, lt0 lt0Var) {
        this.f62822a = 3;
        this.f62823b = x43Var;
        this.f62824c = l89Var;
        this.f62825d = pb80Var;
        this.f62826e = lt0Var;
        this.f62827f = jag1.m52819d(new el20(Alert.DURATION_SHOW_INDEFINITELY, 0, 2));
    }

    public etz(CoordinatorLayout coordinatorLayout, EditModeBarContainerView editModeBarContainerView, View view, QueueControlsLayout queueControlsLayout, FrameLayout frameLayout, SessionModifierContainerView sessionModifierContainerView) {
        this.f62822a = 8;
        this.f62823b = coordinatorLayout;
        this.f62824c = editModeBarContainerView;
        this.f62825d = view;
        this.f62826e = queueControlsLayout;
        this.f62827f = sessionModifierContainerView;
    }

    public etz(bx3 bx3Var, luk lukVar, z9j0 z9j0Var, zar0 zar0Var, va91 va91Var) {
        this.f62822a = 4;
        this.f62827f = lukVar;
        this.f62823b = z9j0Var;
        this.f62824c = va91Var;
        this.f62825d = zar0Var;
        this.f62826e = bx3Var;
    }

    public etz(eh00 eh00Var, cwf cwfVar, kgm0 kgm0Var, jgm0 jgm0Var, oge0 oge0Var, x4j0 x4j0Var) {
        this.f62822a = 25;
        this.f62823b = eh00Var;
        this.f62824c = cwfVar;
        this.f62825d = kgm0Var;
        this.f62826e = oge0Var;
        this.f62827f = x4j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public etz(eh00 eh00Var, v5m v5mVar, eh00 eh00Var2, xfx xfxVar, th00 th00Var) {
        this.f62822a = 19;
        this.f62823b = eh00Var;
        this.f62824c = v5mVar;
        this.f62825d = (qe70) eh00Var2;
        this.f62826e = xfxVar;
        this.f62827f = th00Var;
    }

    public etz(bji bjiVar, qwx0 qwx0Var, nkr0 nkr0Var, RxRouter rxRouter, hv31 hv31Var, Scheduler scheduler) {
        this.f62822a = 23;
        this.f62823b = qwx0Var;
        this.f62824c = nkr0Var;
        this.f62825d = rxRouter;
        this.f62826e = hv31Var;
        this.f62827f = scheduler;
    }
}
