package p204p;

import android.app.DatePickerDialog;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C1401h;

/* JADX INFO: loaded from: classes3.dex */
public final class qv31 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f192862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f192863c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f192864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv31(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f192861a = i;
        this.f192862b = obj;
        this.f192863c = obj2;
        this.f192864d = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.List] */
    @Override // p204p.eh00
    public final Object invoke() {
        Map map;
        switch (this.f192861a) {
            case 0:
                Set<String> stringSet = ((SharedPreferences) this.f192862b).getStringSet((String) this.f192863c, (Set) this.f192864d);
                wj50.m88279p(stringSet);
                return stringSet;
            case 1:
                m641 m641Var = (m641) this.f192862b;
                u641 u641Var = m641Var.f140377d;
                b141 b141Var = m641Var.f140379f;
                u641Var.f227220c = ((g1e) b141Var.f22212b).m43353a((Context) this.f192863c, (rmm0) this.f192864d, (e3p0) b141Var.f22213c, i0e.f97214b, false);
                return w2a1.f247311a;
            case 2:
                gh00 gh00Var = (gh00) this.f192864d;
                x43 x43Var = (x43) this.f192863c;
                l1p0 l1p0Var = (l1p0) this.f192862b;
                String str = (l1p0Var == null || (map = l1p0Var.f128768d) == null) ? null : (String) map.get(ContextTrack.Metadata.KEY_MEDIA_MANIFEST_ID);
                if (x43Var.m89831f()) {
                    gh00Var.invoke(new l841(str));
                } else {
                    gh00Var.invoke(new m841(str));
                }
                ((yum0) x43Var.f257964g).setValue(Boolean.valueOf(!x43Var.m89831f()));
                return w2a1.f247311a;
            case 3:
                x0h1.m89578u((xuk) this.f192862b, null, 0, new g841((wf11) this.f192863c, (kqi0) this.f192864d, null, 1), 3);
                return w2a1.f247311a;
            case 4:
                Logger.m3966b("MBS: Search cancelled for '%s'", (String) this.f192863c);
                ((ye30) this.f192862b).m93521b(3);
                ((s8d0) this.f192864d).m95580d(null);
                return w2a1.f247311a;
            case 5:
                ((ye30) this.f192862b).m93521b(3);
                ((t601) this.f192863c).m28330u(ca80.m32010d(lau.f131415a, (egd0) this.f192864d));
                return w2a1.f247311a;
            case 6:
                super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo915u0((vjv0) this.f192863c, (zjv0) this.f192864d);
                return w2a1.f247311a;
            case 7:
                return ((wb11) this.f192862b).mo35842b((Context) this.f192864d, (String) this.f192863c);
            case 8:
                xi61.m91084f((xi61) this.f192862b, (fk30) this.f192863c, (mqr) this.f192864d);
                return w2a1.f247311a;
            case 9:
                ((BluetoothLeScanner) this.f192862b).stopScan((st61) this.f192863c);
                ((w2y0) this.f192864d).getClass();
                return w2a1.f247311a;
            case 10:
                ugf ugfVar = (ugf) this.f192862b;
                String str2 = ((w971) this.f192863c).f249109d;
                lwf lwfVar = (lwf) this.f192864d;
                if (!wl51.m88460J0(str2)) {
                    ((z9j0) ugfVar.f230161d).mo47342b(str2, yfd1.m93554f(ugfVar.f230159b, lwfVar.f137561e, "text_header_body", cvf1.m34047j(str2), null, new e151(str2, 14), 8), null);
                }
                return w2a1.f247311a;
            case 11:
                kqi0 kqi0Var = (kqi0) this.f192864d;
                ds71 ds71Var = (ds71) this.f192862b;
                Boolean boolValueOf = Boolean.valueOf(ds71Var.f52513e);
                if (ds71Var.f52512d == null) {
                    boolValueOf = null;
                }
                kqi0Var.setValue(boolValueOf);
                ((eh00) this.f192863c).invoke();
                return w2a1.f247311a;
            case 12:
                kqi0 kqi0Var2 = (kqi0) this.f192864d;
                String str3 = (String) ((gh00) this.f192863c).invoke(Integer.valueOf(((vum0) ((yw70) this.f192862b).f276892e.f191124b).m86437v()));
                if (str3.length() <= 0) {
                    return (String) kqi0Var2.getValue();
                }
                kqi0Var2.setValue(str3);
                return str3;
            case 13:
                d181 d181Var = (d181) this.f192863c;
                yw70 yw70Var = ((t181) this.f192862b).f216189e;
                tw70 tw70Var = (tw70) g6f.m43745s0(yw70Var.m94779h().f214605k);
                if (!wj50.m88271j(tw70Var != null ? tw70Var.f224336l : null, "list_ux_platform_header") || d181Var.f44192d) {
                    return Float.valueOf(1.0f);
                }
                float fMo35989Z0 = ((yqq) this.f192864d).mo35989Z0(y481.f269099a);
                float f = d181Var.f44191c - (d181Var.f44190b ? 2 * fMo35989Z0 : 0.0f);
                float f2 = fMo35989Z0 / 2;
                float f3 = f - f2;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                float f4 = f + f2;
                if (f4 >= fMo35989Z0) {
                    fMo35989Z0 = f4;
                }
                return Float.valueOf(n0e1.m63436m((((vum0) yw70Var.f276892e.f191125c).m86437v() - f3) / (fMo35989Z0 - f3), 0.0f, 1.0f));
            case 14:
                ugf ugfVar2 = (ugf) this.f192862b;
                yfd1 yfd1Var = ugfVar2.f230159b;
                u150 u150Var = ((lwf) this.f192863c).f137561e;
                je81 je81Var = (je81) this.f192864d;
                d850 d850VarM93554f = yfd1.m93554f(yfd1Var, u150Var, "track_context_menu_button", je81Var.f111506a.f13085a, null, m881.f140950T0, 8);
                oj81 oj81Var = (oj81) ugfVar2.f230160c;
                String str4 = je81Var.f111506a.f13085a;
                voc1 voc1Var = (voc1) ugfVar2.f230161d;
                oj81.m67102b(oj81Var, str4, voc1Var, d850VarM93554f, voc1Var.f243453a, null, new rj81(null, null, false, null, je81Var.f111509d.length() > 0, false, true, false, false, true, null, false, false, false, true, false, null, null, false, false, false, false, false, false, false, null, null, false, false, -33873, 7), 48);
                return w2a1.f247311a;
            case 15:
                ((kqi0) this.f192862b).setValue(Boolean.FALSE);
                gh00 gh00Var2 = (gh00) this.f192863c;
                yk81 yk81Var = (yk81) this.f192864d;
                gh00Var2.invoke(yk81Var.f273643e ? new vk81(n5h1.m63735k(yk81Var.f273644f, Long.valueOf(System.currentTimeMillis()))) : uk81.f231260a);
                return w2a1.f247311a;
            case 16:
                cxb cxbVar = ((vs81) this.f192862b).f244382V0;
                f1f f1fVar = (f1f) this.f192863c;
                int i = f1fVar.f64886c;
                String str5 = f1fVar.f64885b.f108599a;
                kv91 kv91Var = (kv91) cxbVar.f42972b;
                yt91 yt91VarM96903c = ((l9g0) cxbVar.f42974d).f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("item_list", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                Integer numValueOf = Integer.valueOf(i);
                yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("item", null, numValueOf, str5, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                dv91 dv91Var = new dv91("swipe", 1);
                String string = str5.toString();
                if (string == null) {
                    string = "";
                }
                kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", string)), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
                ((e2a) this.f192864d).invoke(new v1f(f1fVar));
                return w2a1.f247311a;
            case 17:
                wt81 wt81Var = (wt81) this.f192862b;
                wt81Var.f254879e = (ArrayList) this.f192863c;
                Iterator it = ((ArrayList) this.f192864d).iterator();
                while (it.hasNext()) {
                    wt81Var.m47713i(((Number) it.next()).intValue());
                }
                return w2a1.f247311a;
            case 18:
                zx81 zx81Var = (zx81) this.f192862b;
                return x0h1.m89578u(zx81Var.f287247f, null, 0, new qt81((wx81) this.f192863c, (jmh0) this.f192864d, zx81Var, (fbk) null, 2), 3);
            case 19:
                Integer num = ((y291) this.f192862b).f268514b;
                if (num != null) {
                    x0h1.m89578u((xuk) this.f192863c, null, 0, new l8c((yw70) this.f192864d, num.intValue(), (fbk) null, 5), 3);
                }
                return w2a1.f247311a;
            case 20:
                kv91 kv91Var2 = ((uui) this.f192862b).f234205a;
                w7h0 w7h0Var = (w7h0) this.f192863c;
                w7h0Var.getClass();
                yt91 yt91VarM96903c3 = w7h0Var.f248684a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((eh00) this.f192864d).invoke();
                return w2a1.f247311a;
            case 21:
                ((kqi0) this.f192864d).setValue(Boolean.FALSE);
                ((eh00) this.f192862b).invoke();
                ((Context) this.f192863c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.spotify.com/article/ai-usage-limits/")).addFlags(268435456));
                return w2a1.f247311a;
            case 22:
                ((moa1) this.f192862b).f145634a.m92313f((String) this.f192863c, (svz) this.f192864d);
                return w2a1.f247311a;
            case 23:
                qpa1 qpa1Var = (qpa1) this.f192862b;
                kv91 kv91Var3 = qpa1Var.f191252a;
                ahg0 ahg0Var = qpa1Var.f191255d;
                ahg0Var.getClass();
                yt91 yt91VarM96903c4 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("disclaimer_dialogue", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("disclaimer_checkbox", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                zpa1 zpa1Var = (zpa1) this.f192863c;
                boolean z = !((Boolean) ((kqi0) this.f192864d).getValue()).booleanValue();
                synchronized (zpa1Var.f285051Q) {
                    if (!zpa1Var.f285050P && !zpa1Var.f285056V) {
                        zv41 zv41Var = zpa1Var.f285036B;
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        zv41Var.getClass();
                        zv41Var.m97091m(null, boolValueOf2);
                    }
                    break;
                }
                return w2a1.f247311a;
            case 24:
                ((rpz) ((ppz) this.f192862b)).m76196b(false);
                mk31 mk31Var = (mk31) this.f192863c;
                if (mk31Var != null) {
                    ((nmq) mk31Var).m65150a();
                }
                ((DatePickerDialog) this.f192864d).show();
                return w2a1.f247311a;
            case 25:
                x0h1.m89578u((xuk) this.f192862b, null, 0, new C1401h((wf11) this.f192863c, null, 24), 3).mo26599N(new si81(10, (gh00) this.f192864d));
                return w2a1.f247311a;
            case 26:
                v7i0 v7i0VarMo37268a = ((t7i0) this.f192862b).mo37268a((scd1) this.f192863c);
                VideoSurfaceView videoSurfaceView = ((tpb1) this.f192864d).f222477a;
                if (videoSurfaceView != null) {
                    v7i0VarMo37268a.f238196f = videoSurfaceView;
                    videoSurfaceView.setBufferingThrobberEnabled(false);
                    lg21 lg21Var = v7i0VarMo37268a.f238195e;
                    if (lg21Var != null) {
                        lg21Var.m58931j(videoSurfaceView);
                    }
                }
                return v7i0VarMo37268a;
            case 27:
                x0h1.m89578u((xuk) this.f192862b, null, 0, new nek((gw4) this.f192863c, (gw4) this.f192864d, null, 2), 3);
                return w2a1.f247311a;
            case 28:
                AbstractC2441u6 abstractC2441u6 = (AbstractC2441u6) this.f192862b;
                abstractC2441u6.removeOnAttachStateChangeListener((ay1) this.f192863c);
                mvl0.m62960w(abstractC2441u6).f175289a.remove((nec1) this.f192864d);
                return w2a1.f247311a;
            default:
                rlv0 rlv0Var = (rlv0) this.f192862b;
                if (rlv0Var.f200373a == null) {
                    qoc1 qoc1Var = (qoc1) this.f192863c;
                    View view = (View) this.f192864d;
                    qoc1Var.getClass();
                    while (true) {
                        if (view == null) {
                            view = null;
                        } else if (!wj50.m88271j(view.getTag(R.id.view_ubi_impression_logger_container_tag), "TAG_CONTAINER_VIEW")) {
                            Object parent = view.getParent();
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                        }
                    }
                    rlv0Var.f200373a = view;
                }
                View view2 = (View) rlv0Var.f200373a;
                if (view2 != null) {
                    return nxf1.m65842u(view2);
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv31(String str, ye30 ye30Var, s8d0 s8d0Var) {
        super(0);
        this.f192861a = 4;
        this.f192863c = str;
        this.f192862b = ye30Var;
        this.f192864d = s8d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv31(kqi0 kqi0Var, gh00 gh00Var, yk81 yk81Var, syn0 syn0Var) {
        super(0);
        this.f192861a = 15;
        this.f192862b = kqi0Var;
        this.f192863c = gh00Var;
        this.f192864d = yk81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv31(wb11 wb11Var, Context context, String str) {
        super(0);
        this.f192861a = 7;
        this.f192862b = wb11Var;
        this.f192864d = context;
        this.f192863c = str;
    }
}
