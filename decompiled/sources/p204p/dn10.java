package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class dn10 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f50657b;

    public /* synthetic */ dn10(Object obj, int i) {
        this.f50656a = i;
        this.f50657b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public Object m36442b(b650 b650Var, fbk fbkVar) {
        m2b0 m2b0Var;
        n2b0 n2b0Var = (n2b0) this.f50657b;
        if (fbkVar instanceof m2b0) {
            m2b0Var = (m2b0) fbkVar;
            int i = m2b0Var.f139309c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2b0Var.f139309c = i - Integer.MIN_VALUE;
            } else {
                m2b0Var = new m2b0(this, fbkVar);
            }
        } else {
            m2b0Var = new m2b0(this, fbkVar);
        }
        m2b0 m2b0Var2 = m2b0Var;
        Object obj = m2b0Var2.f139307a;
        int i2 = m2b0Var2.f139309c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (b650Var instanceof m3r0) {
                m2b0Var2.f139309c = 1;
                if (njg1.m64619l(200L, m2b0Var2) != yukVar) {
                }
            } else {
                if (!(b650Var instanceof n3r0)) {
                    if (b650Var instanceof l3r0) {
                        m2b0Var2.f139309c = 4;
                        Object objM45909c = gw4.m45909c(n2b0Var.f149731N0, new Float(1.0f), null, null, null, m2b0Var2, 14);
                        if (objM45909c != yukVar) {
                            objM45909c = w2a1Var;
                        }
                        if (objM45909c == yukVar) {
                        }
                    }
                    return w2a1Var;
                }
                m2b0Var2.f139309c = 3;
                Object objM45909c2 = gw4.m45909c(n2b0Var.f149731N0, new Float(1.0f), null, null, null, m2b0Var2, 14);
                if (objM45909c2 != yukVar) {
                    objM45909c2 = w2a1Var;
                }
                if (objM45909c2 != yukVar) {
                    return w2a1Var;
                }
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 == 3) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        m2b0Var2.f139309c = 2;
        Object objM45909c3 = gw4.m45909c(n2b0Var.f149731N0, new Float(0.9f), null, null, null, m2b0Var2, 14);
        if (objM45909c3 != yukVar) {
            objM45909c3 = w2a1Var;
        }
        if (objM45909c3 == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public java.lang.Object m36443c(p204p.vs50 r6, p204p.fbk r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p204p.fu50
            if (r0 == 0) goto L13
            r0 = r7
            p.fu50 r0 = (p204p.fu50) r0
            int r1 = r0.f73411e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73411e = r1
            goto L18
        L13:
            p.fu50 r0 = new p.fu50
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f73409c
            int r1 = r0.f73411e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.util.Iterator r6 = r0.f73408b
            p.vs50 r1 = r0.f73407a
            p204p.bga.m29073P(r7)
            goto L5d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p204p.bga.m29073P(r7)
            java.lang.Object r7 = r5.f50657b
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L3f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r6.next()
            p.jt50 r1 = (p204p.jt50) r1
            r0.f73407a = r7
            r0.f73408b = r6
            r0.f73411e = r2
            java.lang.Enum r1 = r1.mo33214i(r7, r0)
            p.yuk r3 = p204p.yuk.f276404a
            if (r1 != r3) goto L5a
            return r3
        L5a:
            r4 = r1
            r1 = r7
            r7 = r4
        L5d:
            p.it50 r7 = (p204p.it50) r7
            int r7 = r7.ordinal()
            if (r7 == 0) goto L6e
            if (r7 != r2) goto L68
            goto L70
        L68:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6e:
            r7 = r1
            goto L3f
        L70:
            p.w2a1 r6 = p204p.w2a1.f247311a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.dn10.m36443c(p.vs50, p.fbk):java.lang.Object");
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        int i;
        Object objM30865H1;
        switch (this.f50656a) {
            case 0:
                pi10 pi10Var = (pi10) obj;
                fn10 fn10Var = (fn10) this.f50657b;
                jfr jfrVar = fn10Var.f71145a;
                xre xreVar = fn10Var.f71148d;
                zv41 zv41Var = fn10Var.f71150f;
                if (pi10Var instanceof oi10) {
                    oi10 oi10Var = (oi10) pi10Var;
                    jfrVar.getClass();
                    String str = oi10Var.f165642e;
                    int iM38547C = edb.m38547C(oi10Var.f165640c);
                    int i2 = 1;
                    if (iM38547C != 0) {
                        i = 2;
                        if (iM38547C != 1) {
                            i2 = 3;
                            if (iM38547C != 2) {
                                if (iM38547C != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = 4;
                            }
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                    String str2 = oi10Var.f165641d;
                    ((wy3) xreVar).getClass();
                    qm10 qm10Var = new qm10(i, str, str2, System.currentTimeMillis());
                    zv41Var.getClass();
                    zv41Var.m97091m(null, qm10Var);
                } else if (pi10Var instanceof mi10) {
                    jfrVar.getClass();
                    ((wy3) xreVar).getClass();
                    pm10 pm10Var = new pm10(System.currentTimeMillis());
                    zv41Var.getClass();
                    zv41Var.m97091m(null, pm10Var);
                } else {
                    if (!(pi10Var instanceof ni10)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((wy3) xreVar).getClass();
                    pm10 pm10Var2 = new pm10(System.currentTimeMillis());
                    zv41Var.getClass();
                    zv41Var.m97091m(null, pm10Var2);
                }
                return w2a1.f247311a;
            case 1:
                if (!wj50.m88271j((su10) obj, su10.f213974a)) {
                    throw new NoWhenBranchMatchedException();
                }
                et10 et10Var = (et10) this.f50657b;
                ru10 ru10Var = et10Var.f62578h;
                if (ru10Var != null) {
                    et10.m39925a(et10Var, ru10Var);
                }
                return w2a1.f247311a;
            case 2:
                an20 an20Var = (an20) obj;
                hsq hsqVar = ((urq) ((bmx) this.f50657b).f28644b).f233439p;
                if (hsqVar != null) {
                    el20 el20Var = an20Var.f17250b;
                    hsqVar.mo41795e(an20Var.f17249a + el20Var.f60571b, new Integer(el20Var.f60570a));
                }
                return w2a1.f247311a;
            case 3:
                guf gufVar = ((yk20) this.f50657b).f273558d;
                w2a1 w2a1Var = w2a1.f247311a;
                gufVar.m38797k0(w2a1Var);
                return w2a1Var;
            case 4:
                Object obj2 = ((s6x0) obj).f206218a;
                mb30 mb30Var = (mb30) this.f50657b;
                Throwable thM77348a = s6x0.m77348a(obj2);
                if (thM77348a == null) {
                    mb30Var.f141779h = (kb30) obj2;
                    mb30Var.m35106i();
                } else {
                    mb30Var.m35105h(thM77348a);
                }
                return w2a1.f247311a;
            case 5:
                ((Boolean) obj).booleanValue();
                je41 je41Var = (je41) ((ie41) ((i4t0) this.f50657b).get());
                Iterator it = bk5.m29624m1(new xyi[]{je41Var.f111452b.f279269F, je41Var.f111451a.f279269F, je41Var.f111453c.f279269F, je41Var.f111454d.f279269F}).iterator();
                while (it.hasNext()) {
                    ((xyi) it.next()).m92421a();
                }
                return w2a1.f247311a;
            case 6:
                Object objEmit = ((dj40) this.f50657b).f49559k.emit((wab) obj, fbkVar);
                return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
            case 7:
                b650 b650Var = (b650) obj;
                by4 by4Var = (by4) this.f50657b;
                boolean z = b650Var instanceof m3r0;
                yuk yukVar = yuk.f276404a;
                if (z) {
                    Object objM30866I1 = by4Var.m30866I1(fbkVar);
                    if (objM30866I1 == yukVar) {
                        return objM30866I1;
                    }
                } else if (b650Var instanceof n3r0) {
                    Object objM30865H2 = by4Var.m30865H1(fbkVar);
                    if (objM30865H2 == yukVar) {
                        return objM30865H2;
                    }
                } else if ((b650Var instanceof l3r0) && (objM30865H1 = by4Var.m30865H1(fbkVar)) == yukVar) {
                    return objM30865H1;
                }
                return w2a1.f247311a;
            case 8:
                b650 b650Var2 = (b650) obj;
                v850 v850Var = (v850) this.f50657b;
                LinkedHashSet linkedHashSet = v850Var.f238392T0;
                if (b650Var2 instanceof m3r0) {
                    linkedHashSet.add(b650Var2);
                    v850Var.m84909K1();
                } else if (b650Var2 instanceof n3r0) {
                    linkedHashSet.remove(((n3r0) b650Var2).f150116a);
                    v850Var.m84909K1();
                } else if (b650Var2 instanceof l3r0) {
                    linkedHashSet.remove(((l3r0) b650Var2).f129419a);
                    v850Var.m84909K1();
                }
                return w2a1.f247311a;
            case 9:
                ((j950) this.f50657b).f110105i.m97090l(null);
                return w2a1.f247311a;
            case 10:
                ((p950) this.f50657b).m70120c();
                return w2a1.f247311a;
            case 11:
                return m36443c((vs50) obj, fbkVar);
            case 12:
                ((y360) this.f50657b).f268760d.mo55548j();
                return w2a1.f247311a;
            case 13:
                ((x560) this.f50657b).m70120c();
                return w2a1.f247311a;
            case 14:
                ((x560) this.f50657b).m70120c();
                return w2a1.f247311a;
            case 15:
                ((Boolean) obj).booleanValue();
                ((z9j0) ((f3u) this.f50657b).f65583X).mo47345e();
                return w2a1.f247311a;
            case 16:
                ((Boolean) obj).booleanValue();
                ((z9j0) ((m6a) this.f50657b).f140445i).mo47345e();
                return w2a1.f247311a;
            case 17:
                yk91 yk91Var = (yk91) obj;
                ty80 ty80Var = (ty80) yk91Var.f273650a;
                Set set = (Set) yk91Var.f273651b;
                Iterable iterable = (Iterable) yk91Var.f273652c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((izd1) it2.next()).getData().mo28634a(ty80Var));
                }
                ((gbc0) ((mcu) ((sdo) this.f50657b).f208050d).f142252e).m44213a(s601.m77309l0(g6f.m43736n1(arrayList), set));
                return w2a1.f247311a;
            case 18:
                ((rg0) this.f50657b).invoke((jxf) obj);
                return w2a1.f247311a;
            case 19:
                ((u190) this.f50657b).f225726g = (i3p0) obj;
                return w2a1.f247311a;
            case 20:
                int iIntValue = ((Number) obj).intValue();
                View view = (View) this.f50657b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
                return w2a1.f247311a;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                zv41 zv41Var2 = ((g7a0) this.f50657b).f77228b.f232334a;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, bool);
                return w2a1.f247311a;
            case 22:
                rga0 rga0Var = (rga0) this.f50657b;
                di41 di41Var = rga0Var.f198905X;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                rga0Var.f198905X = null;
                gma0 gma0Var = rga0Var.f198910g;
                kv91 kv91Var = (kv91) gma0Var.f81350a.get();
                ipg0 ipg0Var = gma0Var.f81351b;
                ipg0Var.getClass();
                yt91 yt91VarM96903c = ipg0Var.f104499b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("save_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                wcm wcmVar = rga0Var.f198907d;
                vla0 vla0Var = ((vga0) rga0Var.f198912i.getValue()).f241188a;
                ((gh00) wcmVar.f250073d.getValue()).invoke(vla0Var != null ? new bma0(vla0Var.f242411a, vla0Var.f242412b) : new bma0(null, false));
                return w2a1.f247311a;
            case 23:
                ((jqa0) this.f50657b).f114862d = (String) obj;
                return w2a1.f247311a;
            case 24:
                return m36442b((b650) obj, fbkVar);
            case 25:
                ((Boolean) obj).getClass();
                Object objM44622b = ((gfi0) ((ugz) this.f50657b).f230291c).m44622b(new p6j0("spotify:find", "", true, false, 0, 0, false, null, null, null), null, fbkVar);
                return objM44622b == yuk.f276404a ? objM44622b : w2a1.f247311a;
            case 26:
                BehaviorSubject behaviorSubject = (BehaviorSubject) this.f50657b;
                voc1 voc1Var = ((f3j0) obj).f65520a;
                behaviorSubject.onNext(Optional.ofNullable(voc1Var != null ? voc1Var.m86091c() : null));
                return w2a1.f247311a;
            case 27:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((nwb0) this.f50657b).f159082b.m13395x8e99e752(bool2);
                return w2a1.f247311a;
            case 28:
                ((MainLayout) this.f50657b).setNowPlayingViewMode((uek0) obj);
                return w2a1.f247311a;
            default:
                List<tld0> list = (List) obj;
                wzb0 wzb0Var = (wzb0) this.f50657b;
                list.size();
                xpp xppVar = wzb0Var.f256557d;
                ArrayList arrayList2 = new ArrayList();
                boolean zM57762c = ((kzl0) wzb0Var.f256558e).m57762c();
                if (!list.isEmpty()) {
                    for (tld0 tld0Var : list) {
                        if (tld0Var == null) {
                            throw new IllegalArgumentException("route must not be null");
                        }
                        if (arrayList2.contains(tld0Var)) {
                            throw new IllegalArgumentException("route descriptor already added");
                        }
                        arrayList2.add(tld0Var);
                    }
                }
                fmd0 fmd0Var = new fmd0(arrayList2, zM57762c);
                dmd0 dmd0Var = xppVar.f264700a;
                if (dmd0Var != null) {
                    dmd0Var.m39415g(fmd0Var);
                }
                return w2a1.f247311a;
        }
    }
}
