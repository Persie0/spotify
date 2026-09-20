package p204p;

import android.app.Activity;
import android.hardware.camera2.CameraDevice;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteError;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.music.R;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ln9 implements InterfaceC2207oa, Function, j47, Function4, dso0, grc, t6l0, ant, yh00, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135119a;

    /* JADX INFO: renamed from: b */
    public final Object f135120b;

    public /* synthetic */ ln9(Object obj, int i) {
        this.f135119a = i;
        this.f135120b = obj;
    }

    @Override // p204p.j47
    /* JADX INFO: renamed from: a */
    public int mo52324a() {
        return pxb.AUDIO_CONTENT_SAMPLING_RATE;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.BLEND && ((rc4) this.f135120b).m75204c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objJust;
        ArrayList arrayList;
        List list;
        ?? arrayList2;
        Iterator it;
        String str;
        Iterator it2;
        String str2;
        String str3;
        String str4;
        switch (this.f135119a) {
            case 1:
                p2x0 p2x0Var = (p2x0) obj;
                qse1 qse1Var = new qse1((lka) this.f135120b, 21);
                if (p2x0Var instanceof k2x0) {
                    objJust = qse1Var.invoke(((k2x0) p2x0Var).f118699a);
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objJust = Single.just(u4m.f226774a);
                }
                return (SingleSource) objJust;
            case 11:
                ann0 ann0Var = (ann0) obj;
                boolean z = ann0Var.f17470a;
                Integer num = ann0Var.f17471b;
                o0f o0fVar = (o0f) this.f135120b;
                return new u1f(z, num, o0fVar.f160375a, o0fVar.f160376b, o0fVar.f160377c);
            case 12:
                return j4f.m52338c((j4f) this.f135120b, (Throwable) obj);
            case 13:
                lcf lcfVar = (lcf) obj;
                if (lcfVar instanceof hcf) {
                    t0h1 t0h1Var = (t0h1) this.f135120b;
                    i05 i05Var = (i05) t0h1Var.f215890c;
                    int i = t0h1Var.f215889b;
                    String str5 = (String) t0h1Var.f215891d;
                    String str6 = ((hcf) lcfVar).f89783a;
                    String str7 = (String) t0h1Var.f215892e;
                    String lowerCase = j4x.m52419q(i).toLowerCase(Locale.ROOT);
                    String strConcat = "Reasons:".concat(str6);
                    i05Var.getClass();
                    if (str5.length() != 0 || (str7 != null && str7.length() != 0)) {
                        qre0 qre0Var = i05Var.f97137a;
                        ewx ewxVarM10566r = ExternalAccessoryRemoteError.m10566r();
                        ewxVarM10566r.m40147m(lowerCase);
                        ewxVarM10566r.m40149r(str5);
                        ewxVarM10566r.m40148q(strConcat);
                        if (str7 != null) {
                            ewxVarM10566r.m40150s(str7);
                        }
                        qre0Var.m73616a((ExternalAccessoryRemoteError) ewxVarM10566r.build());
                    }
                }
                return lcfVar;
            case 18:
                q5l q5lVar = (q5l) this.f135120b;
                q5lVar.getClass();
                return vjf1.m85770t(dau.f47107a, new qri(q5lVar, (vjf) obj, null, 22));
            case 20:
                gqx gqxVar = (gqx) obj;
                zsl zslVar = (zsl) this.f135120b;
                String str8 = zslVar.f285973t;
                ktl ktlVar = (ktl) gqxVar.mo45449a(ktl.class, str8).f72301b;
                ArrayList<htl> arrayList3 = ktlVar != null ? ktlVar.f126355a : null;
                v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str8).f72301b;
                List list2 = v140Var != null ? v140Var.f236246d : null;
                lau lauVar = lau.f131415a;
                List list3 = list2 == null ? lauVar : list2;
                if (arrayList3 != null) {
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                    for (htl htlVarM48585a : arrayList3) {
                        ArrayList arrayList5 = new ArrayList(i6f.m49804T(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((t140) it3.next()).f216154b);
                        }
                        if (!g6f.m43725i0(arrayList5, htlVarM48585a.f95082c)) {
                            htlVarM48585a = htl.m48585a(htlVarM48585a);
                        }
                        arrayList4.add(htlVarM48585a);
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                v140 v140Var2 = (v140) gqxVar.mo45449a(v140.class, str8).f72301b;
                String str9 = v140Var2 != null ? v140Var2.f236243a : null;
                if (str9 == null) {
                    str9 = "";
                }
                String strM43753y0 = g6f.m43753y0(list3, " • ", null, null, ssl.f213670i, 30);
                if (arrayList != null) {
                    boolean z2 = zslVar.f285970g.f51156a;
                    ArrayList arrayList6 = new ArrayList(i6f.m49804T(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        itl itlVar = ((htl) it4.next()).f95084e;
                        if (itlVar == null || (str4 = itlVar.f105624a) == null) {
                            str4 = "";
                        }
                        arrayList6.add(str4);
                    }
                    List listM43727j0 = g6f.m43727j0(arrayList6);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : arrayList) {
                        itl itlVar2 = ((htl) obj2).f95084e;
                        if (itlVar2 == null || (str3 = itlVar2.f105624a) == null) {
                            str3 = "";
                        }
                        Object objM75735i = linkedHashMap.get(str3);
                        if (objM75735i == null) {
                            objM75735i = rkh0.m75735i(str3, linkedHashMap);
                        }
                        ((List) objM75735i).add(obj2);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = listM43727j0.iterator();
                    int i2 = 0;
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        String str10 = (String) next;
                        String str11 = str10.length() == 0 ? null : str10;
                        List list4 = (List) kkc0.m56692e0(str10, linkedHashMap);
                        boolean z3 = i2 == 0;
                        ArrayList arrayList8 = new ArrayList();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj3 : list4) {
                            boolean z4 = z2;
                            lau lauVar2 = lauVar;
                            String str12 = ((htl) obj3).f95080a;
                            Object objM75735i2 = linkedHashMap2.get(str12);
                            if (objM75735i2 == null) {
                                objM75735i2 = rkh0.m75735i(str12, linkedHashMap2);
                            }
                            ((List) objM75735i2).add(obj3);
                            z2 = z4;
                            lauVar = lauVar2;
                        }
                        boolean z5 = z2;
                        lau lauVar3 = lauVar;
                        Iterator it6 = linkedHashMap2.entrySet().iterator();
                        while (it6.hasNext()) {
                            Map.Entry entry = (Map.Entry) it6.next();
                            String str13 = (String) entry.getKey();
                            List list5 = (List) entry.getValue();
                            if (z3) {
                                Iterator it7 = list5.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        it = it6;
                                        str = ((htl) it7.next()).f95082c;
                                        if (str == null) {
                                            it6 = it;
                                        }
                                    } else {
                                        it = it6;
                                        str = null;
                                    }
                                }
                            } else {
                                it = it6;
                                str = null;
                            }
                            if (str == null || str.length() == 0) {
                                Iterator it8 = list5.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        it2 = it5;
                                        str2 = ((htl) it8.next()).f95083d;
                                        if (str2 == null) {
                                            it5 = it2;
                                        }
                                    } else {
                                        it2 = it5;
                                        str2 = null;
                                    }
                                }
                            } else {
                                it2 = it5;
                                str2 = null;
                            }
                            LinkedHashMap linkedHashMap3 = linkedHashMap;
                            boolean z6 = z3;
                            ArrayList arrayList9 = new ArrayList(i6f.m49804T(list5, 10));
                            Iterator it9 = list5.iterator();
                            while (it9.hasNext()) {
                                htl htlVar = (htl) it9.next();
                                Iterator it10 = it9;
                                arrayList9.add(new uix0(htlVar.f95081b, z5 && htlVar.f95085f != null));
                                it9 = it10;
                            }
                            arrayList8.add(new zjk(str13, str, str2, arrayList9));
                            linkedHashMap = linkedHashMap3;
                            it6 = it;
                            it5 = it2;
                            z3 = z6;
                        }
                        arrayList7.add(new fkk(str11, arrayList8));
                        i2 = i3;
                        z2 = z5;
                        lauVar = lauVar3;
                    }
                    list = arrayList7;
                } else {
                    list = null;
                }
                lau lauVar4 = lauVar;
                if (list == null) {
                    list = lauVar4;
                }
                ktl ktlVar2 = (ktl) gqxVar.mo45449a(ktl.class, str8).f72301b;
                if (ktlVar2 != null) {
                    ArrayList arrayList10 = ktlVar2.f126356b;
                    arrayList2 = new ArrayList(i6f.m49804T(arrayList10, 10));
                    Iterator it11 = arrayList10.iterator();
                    while (it11.hasNext()) {
                        arrayList2.add(((jtl) it11.next()).f115920a);
                    }
                } else {
                    arrayList2 = lauVar4;
                }
                return new ctl(str9, strM43753y0, list, arrayList2);
            case 21:
                ArrayList arrayListM68132b = ((ovh0) this.f135120b).m68132b();
                ArrayList arrayList11 = new ArrayList();
                for (Object obj4 : arrayListM68132b) {
                    if (obj4 instanceof vze) {
                        arrayList11.add(obj4);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it12 = arrayList11.iterator();
                while (it12.hasNext()) {
                    j6f.m52564V(((vze) it12.next()).mo24932a(), arrayList12);
                }
                return g6f.m43736n1(arrayList12);
            default:
                wg61 wg61Var = ((uho) this.f135120b).f230491b;
                return Boolean.valueOf(((ConnectivityManager) wg61Var.getValue()).isActiveNetworkMetered() && ((ConnectivityManager) wg61Var.getValue()).getRestrictBackgroundStatus() == 3);
        }
    }

    @Override // p204p.dso0
    /* JADX INFO: renamed from: b */
    public cso0 mo36780b(d0w d0wVar, vvg1 vvg1Var, a5x0 a5x0Var) {
        bxb bxbVar = (bxb) this.f135120b;
        bxbVar.f31815d = vvg1Var;
        int iM80437o = ((tc5) bxbVar.f31814c).m80437o(d0wVar, ehf1.m38949o(d0wVar.f44079k, d0wVar.f44080l), a5x0Var);
        vvg1 vvg1Var2 = (vvg1) bxbVar.f31815d;
        String str = d0wVar.f44069a;
        boolean z = vvg1Var2 instanceof f1w;
        f1w f1wVar = z ? (f1w) vvg1Var2 : null;
        boolean z2 = false;
        if (f1wVar != null) {
            String str2 = f1wVar.f64982b;
            if (str2.length() > 0 && str2.equals(str)) {
                f1w f1wVar2 = z ? (f1w) vvg1Var2 : null;
                if (f1wVar2 != null ? f1wVar2.f64986f : false) {
                    z2 = true;
                }
            }
        }
        return new cso0(iM80437o, ((long) bxb.m30769w((vvg1) bxbVar.f31815d)) * 1000, bxb.m30768N((vvg1) bxbVar.f31815d, str, (voc1) bxbVar.f31813b), z2);
    }

    @Override // p204p.grc
    /* JADX INFO: renamed from: c */
    public fiz mo45481c(String str) {
        kkx0 kkx0Var = (kkx0) this.f135120b;
        return new hd1(fag1.m41173v((pgo) kkx0Var.f123726b, (tjo) kkx0Var.f123732h, str), 12);
    }

    /* JADX INFO: renamed from: d */
    public void m59475d() {
        nsf1.m65528n(((nub) this.f135120b).f158551a, false, true, new qse1(1, 26));
    }

    @Override // p204p.j47
    /* JADX INFO: renamed from: e */
    public i47 mo52325e(int i, int i2) {
        return (r6b) this.f135120b;
    }

    /* JADX INFO: renamed from: f */
    public void m59476f(String str) {
        nsf1.m65528n(((nub) this.f135120b).f158551a, false, true, new bm9(str, 16));
    }

    /* JADX INFO: renamed from: g */
    public MaybeMap m59477g() {
        nub nubVar = (nub) this.f135120b;
        return q0f1.m71845y(nubVar.f158551a, new wga(nubVar, 14)).m23369g(kwa.f127034a);
    }

    /* JADX INFO: renamed from: h */
    public pyu m59478h() {
        rx51 rx51Var = (rx51) this.f135120b;
        mw51 mw51Var = (mw51) rx51Var.f203508j.get();
        jg31.m53271i(mw51Var);
        kw51 kw51Var = (kw51) rx51Var.f203507i.get();
        jg31.m53271i(kw51Var);
        return new pyu(mw51Var, kw51Var);
    }

    /* JADX INFO: renamed from: i */
    public void m59479i(vbc vbcVar, int i) {
        w3p w3pVar = (w3p) this.f135120b;
        if (w3pVar.f247621c.isEnabled()) {
            w3p.m87113c(w3pVar, vbcVar);
        }
        w3pVar.f247622d.mo46962a(new o001(vbcVar, i, w3pVar.f247619a.mo66546b(i)));
    }

    /* JADX INFO: renamed from: k */
    public void m59480k(vbc vbcVar) {
        ((w3p) this.f135120b).f247622d.mo46962a(new p001(vbcVar));
    }

    /* JADX INFO: renamed from: l */
    public void m59481l(vbc vbcVar, int i) {
        Logger.m3966b("CastBasic->%s", "Session resume failed: " + vbcVar + ", error: " + i);
        w3p w3pVar = (w3p) this.f135120b;
        w3pVar.f247622d.mo46962a(new q001(vbcVar, i, w3pVar.f247619a.mo66546b(i)));
    }

    /* JADX INFO: renamed from: m */
    public void m59482m(vbc vbcVar, boolean z) {
        ((w3p) this.f135120b).f247622d.mo46962a(new r001(vbcVar, z));
    }

    /* JADX INFO: renamed from: n */
    public void m59483n(vbc vbcVar, String str) {
        ((w3p) this.f135120b).f247622d.mo46962a(new s001(vbcVar, str));
    }

    /* JADX INFO: renamed from: o */
    public void m59484o(vbc vbcVar, int i) {
        Logger.m3966b("CastBasic->%s", "Session start failed: " + vbcVar + ", error: " + i);
        w3p w3pVar = (w3p) this.f135120b;
        if (w3pVar.f247621c.isEnabled()) {
            w3p.m87113c(w3pVar, vbcVar);
        }
        w3pVar.f247622d.mo46962a(new t001(vbcVar, i, w3pVar.f247619a.mo66546b(i)));
    }

    /* JADX INFO: renamed from: p */
    public void m59485p(vbc vbcVar, String str) {
        w3p w3pVar = (w3p) this.f135120b;
        if (w3pVar.f247621c.isEnabled()) {
            w3pVar.m87114d(vbcVar, str);
        } else {
            w3pVar.f247622d.mo46962a(new u001(vbcVar, str));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m59486q(vbc vbcVar) {
        w3p w3pVar = (w3p) this.f135120b;
        if (w3pVar.f247621c.isEnabled()) {
            w3p.m87113c(w3pVar, vbcVar);
        }
        w3pVar.f247622d.mo46962a(new v001(vbcVar));
    }

    /* JADX INFO: renamed from: r */
    public void m59487r(vbc vbcVar, int i) {
        Logger.m3966b("CastBasic->%s", "Session suspended: " + vbcVar + ", error: " + i);
        ((w3p) this.f135120b).f247622d.mo46962a(new w001(vbcVar, i));
    }

    /* JADX INFO: renamed from: s */
    public void m59488s(Surface surface) {
        zte zteVar = (zte) this.f135120b;
        zteVar.f286145c.post(new uqf1(9, zteVar, surface));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        pqm0 pqm0Var = (pqm0) obj;
        CharSequence charSequence = (CharSequence) pqm0Var.f180350a;
        boolean zBooleanValue = ((Boolean) pqm0Var.f180351b).booleanValue();
        cgl cglVar = (cgl) this.f135120b;
        TextView textView = (TextView) cglVar.f37719U0.findViewById(R.id.cwp_header_preTitle);
        if (zBooleanValue) {
            wj50.m88279p(textView);
            textView.setVisibility(0);
            textView.setText(cglVar.f37728a.getString(R.string.cwp_header_pretitle_age_restricted));
            textView.setTextColor(vtg1.m86387n(textView, R.attr.baseTextWarning));
            return;
        }
        if (charSequence == null) {
            wj50.m88279p(textView);
            textView.setVisibility(8);
        } else {
            wj50.m88279p(textView);
            textView.setVisibility(0);
            textView.setText(charSequence);
            textView.setTextColor(vtg1.m86387n(textView, R.attr.baseTextBrightAccent));
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        ((iyo) this.f135120b).getClass();
        return Boolean.parseBoolean((String) ((PlayerState) obj).contextMetadata().get(Context.Metadata.KEY_IS_AUDIOBOOK));
    }

    /* JADX INFO: renamed from: u */
    public void m59489u(String str, CappingState cappingState) {
        nub nubVar = (nub) this.f135120b;
        nsf1.m65528n(nubVar.f158551a, false, true, new cn8(29, nubVar, new kpe0(str, cappingState)));
    }

    /* JADX INFO: renamed from: v */
    public void m59490v(String str, String str2, d850 d850Var, vaz0 vaz0Var) {
        oj81.m67102b((oj81) this.f135120b, str, new voc1(str2), d850Var, str2, null, new rj81(null, null, false, null, true, false, true, false, false, true, null, false, false, false, true, false, null, vaz0Var, false, false, false, false, false, false, false, null, null, false, false, -296017, 7), 48);
    }

    /* JADX INFO: renamed from: w */
    public zx51 m59491w() {
        rx51 rx51Var = (rx51) this.f135120b;
        Activity activity = (Activity) rx51Var.f203499a.get();
        jg31.m53271i(activity);
        z9j0 z9j0Var = (z9j0) rx51Var.f203504f.get();
        jg31.m53271i(z9j0Var);
        k5m0 k5m0Var = (k5m0) rx51Var.f203505g.get();
        jg31.m53271i(k5m0Var);
        return new zx51(activity, z9j0Var, k5m0Var);
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(655);
        ((FrameLayout) ((bxk) this.f135120b).f31877a.f230290b).setPadding(dx40VarMo51806g.f53848a, dx40VarMo51806g.f53849b, dx40VarMo51806g.f53850c, dx40VarMo51806g.f53851d);
        return swd1.f214649b;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        pqm0 pqm0Var = (pqm0) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) pqm0Var.f180350a).booleanValue();
        String str2 = (String) pqm0Var.f180351b;
        wj50.m88279p(str2);
        return new ovb(zBooleanValue, str2, str, (fv51) ((Optional) obj3).orElse(null), ((rvb) this.f135120b).f203036d.f147718c, ((Boolean) obj4).booleanValue());
    }

    public ln9(x0q0 x0q0Var, ti5 ti5Var) {
        this.f135119a = 16;
        this.f135120b = x0q0Var;
    }

    public ln9(fiz fizVar) {
        this.f135119a = 9;
        this.f135120b = mvl0.m62953p(new yxb(fizVar, 12));
    }

    public ln9(CameraDevice cameraDevice, Handler handler) {
        this.f135119a = 4;
        if (Build.VERSION.SDK_INT >= 28) {
            cameraDevice.getClass();
            this.f135120b = new zeb(cameraDevice, null);
        } else {
            this.f135120b = new yeb(cameraDevice, new afb(handler));
        }
    }
}
