package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin$PluginCommand;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class gr7 implements Function, tut {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83674a;

    /* JADX INFO: renamed from: b */
    public boolean f83675b;

    /* JADX INFO: renamed from: c */
    public Object f83676c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f83677d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f83678e;

    public /* synthetic */ gr7(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f83674a = i;
        this.f83676c = obj;
        this.f83677d = obj2;
        this.f83678e = obj3;
        this.f83675b = z;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0421  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e7  */
    /* JADX WARN: Type inference failed for: r1v68, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Collection] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        String str;
        Object obj2;
        String str2;
        v140 v140Var;
        erc1 erc1Var;
        m340 m340Var;
        z240 z240VarM60640a;
        String str3;
        Integer num;
        String str4;
        Object next;
        String str5;
        ArrayList arrayListM74078a;
        switch (this.f83674a) {
            case 0:
                b040 b040Var = (b040) obj;
                r0e1 r0e1Var = (r0e1) this.f83676c;
                Context context = (Context) this.f83677d;
                vq7 vq7Var = (vq7) this.f83678e;
                boolean z2 = this.f83675b;
                if (b040Var instanceof a040) {
                    return Single.create(new c06((d97) r0e1Var.f194478b, jpg1.m53940v(vq7Var, ((a040) b040Var).f10988a, Boolean.TRUE).toString(), vq7Var.f243888e)).flatMap(new bsa(z2, r0e1Var, context, vq7Var, b040Var));
                }
                if (b040Var instanceof zz30) {
                    return Single.just(new cr7(zew.f282132Y, "Error when authorizing", null));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                tbp0 tbp0Var = (tbp0) obj;
                boolean z3 = this.f83675b;
                cbk cbkVar = (cbk) this.f83677d;
                gf41 gf41VarM85154y = vbg1.m85154y(tbp0Var.f218925a);
                if (gf41VarM85154y != null && gf41VarM85154y.m44579i((gf41) this.f83676c) && tbp0Var.f218927c == z3) {
                    ((qq4) cbkVar.f36149f.f118755a.get()).m73475c();
                }
                cbkVar.f36147d.m93212a((String) this.f83678e, z3);
                return new CompletableFromAction(new s12(cbkVar, 10));
            case 2:
                Map map = (Map) obj;
                String str6 = (String) this.f83676c;
                PlayerState playerState = (PlayerState) this.f83677d;
                boolean z4 = this.f83675b;
                List<zjp0> list = (List) this.f83678e;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (zjp0 zjp0Var : list) {
                    ctx ctxVar = (ctx) map.get(zjp0Var.m96237a());
                    String str7 = zjp0Var.f283516b;
                    String strM96237a = zjp0Var.m96237a();
                    String str8 = zjp0Var.f283517c.f115090c;
                    boolean z5 = ctxVar != null ? ctxVar.f41997b : false;
                    List list2 = zjp0Var.f283519e;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String str9 = ((jr50) it.next()).f115089b;
                        if (str9 == null) {
                            str9 = "";
                        }
                        arrayList2.add(str9);
                    }
                    boolean z6 = ctxVar != null ? ctxVar.f41998c : zjp0Var.f283520f;
                    boolean z7 = ctxVar != null ? ctxVar.f41996a : zjp0Var.f283521g;
                    if (!z4) {
                        z = false;
                    } else if (ctxVar != null ? ctxVar.f41999d : zjp0Var.f283522h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zM88271j = wj50.m88271j(playerState.contextUri(), str6);
                    sro0 sro0Var = aro0.f19114a;
                    if (zM88271j) {
                        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                        if (wj50.m88271j(contextTrack != null ? contextTrack.uri() : null, zjp0Var.m96237a())) {
                            if (playerState.isPaused()) {
                                sro0Var = hro0.f94505a;
                            } else if (playerState.isPlaying()) {
                                sro0Var = mro0.f146586a;
                            }
                        }
                    }
                    arrayList.add(new cfv0(str7, strM96237a, false, arrayList2, str8, z5, false, z, z6, sro0Var, z7, false));
                }
                return arrayList;
            case 3:
                o2x0 o2x0Var = (o2x0) obj;
                m600 m600Var = (m600) this.f83677d;
                a22 a22Var = (a22) this.f83676c;
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (!n2x0Var.f149852O0) {
                    ((mzl) m600Var.f140330c).m63255a(new kzl(Long.valueOf(n2x0Var.f149860d), a22Var.f11553a, n2x0Var.f149859c, a22Var.f11554b.f140695a.toUpperCase(Locale.ROOT), (((gn80) this.f83678e) == gn80.TRACK || this.f83675b) ? "music" : "podcast"));
                    throw new IllegalStateException("Response unavailable");
                }
                k280 k280Var = (k280) o2x0Var.f161172b;
                lau lauVar = lau.f131415a;
                if (k280Var == null) {
                    obj2 = lauVar;
                } else {
                    List<p180> list3 = k280Var.f118549a;
                    String str10 = k280Var.f118550b;
                    p180 p180Var = (p180) g6f.m43745s0(list3);
                    if (p180Var == null || (str = p180Var.f172984l) == null) {
                        str = "leavebehind";
                    }
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(list3, 10));
                    for (p180 p180Var2 : list3) {
                        ArrayList arrayList4 = arrayList3;
                        String str11 = p180Var2.f172982j;
                        String str12 = p180Var2.f172977e;
                        String str13 = p180Var2.f172973a;
                        String str14 = p180Var2.f172974b;
                        mec0 mec0Var = new mec0();
                        mec0Var.put("buttonMessage", p180Var2.f172975c);
                        mec0Var.put("tagline", p180Var2.f172976d);
                        mec0Var.put("displayImage", str12);
                        mec0Var.put("logoImage", p180Var2.f172978f);
                        mec0Var.put("product_name", str);
                        mec0 mec0VarM61540b = mec0Var.m61540b();
                        b7d0 b7d0Var = new b7d0(6, Collections.singletonList(new h340(0, 0, new pa6(str12))), (List) null);
                        String str15 = p180Var2.f172979g;
                        String str16 = p180Var2.f172980h;
                        Format format = Format.BANNER;
                        mec0 mec0Var2 = new mec0();
                        lt81 lt81Var = p180Var2.f172981i;
                        if (lt81Var != null) {
                            mec0Var2.put("viewed", lt81Var.f136726a);
                            mec0Var2.put("clicked", lt81Var.f136727b);
                        }
                        arrayList4.add(new fh0(str11, "", str13, "", str14, 1, (Map) mec0VarM61540b, b7d0Var, str15, str16, str10, false, false, format, false, (List) lauVar, "", (Map) mec0Var2.m61540b(), 2));
                        arrayList3 = arrayList4;
                        str = str;
                    }
                    obj2 = arrayList3;
                }
                return new s6x0(obj2);
            case 4:
                gqx gqxVar = (gqx) obj;
                String str17 = (String) this.f83678e;
                String str18 = (String) this.f83677d;
                eua1 eua1Var = (eua1) gqxVar.mo45449a(eua1.class, (String) this.f83676c).f72301b;
                if (eua1Var != null) {
                    Iterator it2 = eua1Var.f62933e.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            o340 o340Var = (o340) next;
                            int i = o340Var.f161280b * o340Var.f161281c;
                            do {
                                Object next2 = it2.next();
                                o340 o340Var2 = (o340) next2;
                                int i2 = o340Var2.f161280b * o340Var2.f161281c;
                                if (i < i2) {
                                    next = next2;
                                    i = i2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    o340 o340Var3 = (o340) next;
                    if (o340Var3 == null || (str5 = o340Var3.f161279a) == null) {
                        str2 = "";
                    } else {
                        str2 = str5;
                    }
                } else {
                    str2 = "";
                }
                String str19 = (eua1Var == null || (str4 = eua1Var.f62930b) == null) ? "" : str4;
                int iIntValue = (eua1Var == null || (num = eua1Var.f62934f) == null) ? 0 : num.intValue();
                String str20 = (str18.length() <= 0 || (erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str18).f72301b) == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null || (str3 = z240VarM60640a.f278475a.f198763a) == null) ? "" : str3;
                if (this.f83675b && str17.length() == 0 && (str18.length() <= 0 || (v140Var = (v140) gqxVar.mo45449a(v140.class, str18).f72301b) == null || (str17 = v140Var.f236243a) == null)) {
                    str17 = "";
                }
                String str21 = str17;
                ok11 ok11Var = str18.length() > 0 ? (ok11) gqxVar.mo45449a(ok11.class, str18).f72301b : null;
                return new wfe0(str2, str19, iIntValue, str20, str21, ok11Var != null ? ok11Var.f166222j : null, ok11Var != null ? ok11Var.f166223k : null);
            case 5:
                gqx gqxVar2 = (gqx) obj;
                List<String> list4 = (List) this.f83677d;
                List<String> list5 = (List) this.f83676c;
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(list5, 10));
                for (String str22 : list5) {
                    xaw xawVar = (xaw) gqxVar2.mo45449a(xaw.class, str22).f72301b;
                    arrayList5.add((xawVar == null || xawVar.f259780g.isEmpty()) ? new jwk0(qwk0.m74079b(str22)) : new jwk0(xawVar));
                }
                if (this.f83675b) {
                    arrayListM74078a = new ArrayList(i6f.m49804T(list4, 10));
                    for (String str23 : list4) {
                        o5p0 o5p0Var = (o5p0) gqxVar2.mo45449a(o5p0.class, str23).f72301b;
                        String str24 = null;
                        if (o5p0Var != null) {
                            Iterator it3 = o5p0Var.f162047b.iterator();
                            if (it3.hasNext()) {
                                str24 = ((yzb1) it3.next()).f277755b.f186565a;
                            }
                        }
                        arrayListM74078a.add(new kwk0(str23, str24));
                    }
                } else {
                    arrayListM74078a = qwk0.m74078a(list4);
                }
                return new t1l0((OfflinePlugin$PluginCommand) this.f83678e, g6f.m43700N0(arrayListM74078a, arrayList5));
            case 6:
                mc1 mc1Var = (mc1) this.f83676c;
                wqy0 wqy0Var = (wqy0) this.f83677d;
                String str25 = wqy0Var.f254202d;
                String str26 = wqy0Var.f254203e;
                wfz wfzVar = wqy0Var.f254204f;
                boolean z8 = this.f83675b;
                String str27 = ((z3z) this.f83678e).f279060a;
                mc1Var.getClass();
                return new zty0(str25, str26, new xzy0(wfzVar, str27, eyy0.f64228a, z8));
            case 7:
                mc1 mc1Var2 = (mc1) this.f83676c;
                f681 f681Var = (f681) this.f83677d;
                String str28 = f681Var.f66310a;
                String str29 = f681Var.f66312c;
                boolean z9 = this.f83675b;
                String str30 = (String) this.f83678e;
                mc1Var2.getClass();
                return new zty0(str28, str29, new xzy0(null, str30, fyy0.f74870a, z9));
            case 8:
                return (((Boolean) obj).booleanValue() && this.f83675b) ? new u1j0(ois0.class, (qis0) ((qe70) this.f83676c).invoke((Intent) this.f83677d, (e301) this.f83678e), uzq0.f235620a) : p1j0.f173119a;
            default:
                xut0 xut0Var = (xut0) ((xvx0) this.f83676c).f266533c;
                hv31 hv31VarMo35842b = xut0Var.f266173b.mo35842b(xut0Var.f266172a, (String) obj);
                wut0 wut0Var = new wut0(hv31VarMo35842b);
                String str31 = (String) this.f83677d;
                boolean z10 = this.f83675b;
                String str32 = (String) this.f83678e;
                lv31 lv31VarEdit = hv31VarMo35842b.edit();
                lv31VarEdit.m60051d(wut0.f255272d, str31);
                lv31VarEdit.m60054g();
                lv31 lv31VarEdit2 = hv31VarMo35842b.edit();
                lv31VarEdit2.m60048a(wut0.f255270b, true);
                lv31VarEdit2.m60054g();
                if (z10) {
                    lv31 lv31VarEdit3 = hv31VarMo35842b.edit();
                    lv31VarEdit3.m60048a(wut0.f255271c, true);
                    lv31VarEdit3.m60054g();
                    lv31 lv31VarEdit4 = hv31VarMo35842b.edit();
                    lv31VarEdit4.m60051d(wut0.f255273e, str32);
                    lv31VarEdit4.m60054g();
                }
                return wut0Var;
        }
    }

    @Override // p204p.tut
    /* JADX INFO: renamed from: b */
    public void mo27645b(Object obj) {
        ((lvx0) this.f83677d).mo31971e(obj);
    }

    @Override // p204p.tut
    public void dispose() {
        this.f83675b = true;
        c9k c9kVar = (c9k) this.f83676c;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
    }

    @Override // p204p.tut
    /* JADX INFO: renamed from: o */
    public void mo27656o(Object obj, cvt cvtVar) {
        vb61 vb61Var = (vb61) this.f83678e;
        if (this.f83675b) {
            return;
        }
        c9k c9kVarM56661c = (c9k) this.f83676c;
        if (c9kVarM56661c == null) {
            c9kVarM56661c = kk40.m56661c(vb61Var.f239426a.mo26608y(qlg1.m73202g()));
            this.f83676c = c9kVarM56661c;
        }
        x0h1.m89578u(c9kVarM56661c, null, 0, new ld01(22, vb61Var, (lvx0) this.f83677d, obj, cvtVar, (fbk) null), 3);
    }

    public /* synthetic */ gr7(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.f83674a = i;
        this.f83676c = obj;
        this.f83677d = obj2;
        this.f83675b = z;
        this.f83678e = obj3;
    }

    public /* synthetic */ gr7(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f83674a = i;
        this.f83676c = obj;
        this.f83675b = z;
        this.f83677d = obj2;
        this.f83678e = obj3;
    }

    public gr7(ksy ksyVar, String str, PlayerState playerState, boolean z, List list) {
        this.f83674a = 2;
        this.f83676c = str;
        this.f83677d = playerState;
        this.f83675b = z;
        this.f83678e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gr7(boolean z, o12 o12Var, th00 th00Var, Intent intent, e301 e301Var) {
        this.f83674a = 8;
        this.f83675b = z;
        this.f83676c = (qe70) th00Var;
        this.f83677d = intent;
        this.f83678e = e301Var;
    }

    public gr7(lvx0 lvx0Var, Object obj, vb61 vb61Var) {
        this.f83674a = 10;
        this.f83677d = lvx0Var;
        this.f83678e = vb61Var;
        lvx0Var.mo31971e(obj);
    }
}
