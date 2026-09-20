package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.gander.p072v2.proto.Notification;
import com.spotify.gander.p072v2.proto.UserImage;
import com.spotify.music.R;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class fei implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68774a;

    /* JADX INFO: renamed from: b */
    public final Object f68775b;

    public /* synthetic */ fei(Object obj, int i) {
        this.f68774a = i;
        this.f68775b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m41449a(buc0 buc0Var, fbk fbkVar) {
        xpz0 xpz0Var;
        List listSingletonList;
        buc0 buc0Var2;
        List listM44506m;
        r37 r37Var;
        if (fbkVar instanceof xpz0) {
            xpz0Var = (xpz0) fbkVar;
            int i = xpz0Var.f264787e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xpz0Var.f264787e = i - Integer.MIN_VALUE;
            } else {
                xpz0Var = new xpz0(this, fbkVar);
            }
        } else {
            xpz0Var = new xpz0(this, fbkVar);
        }
        Object obj = xpz0Var.f264785c;
        int i2 = xpz0Var.f264787e;
        if (i2 == 0) {
            bga.m29073P(obj);
            r37 r37Var2 = buc0Var.f31081b;
            if (r37Var2 instanceof o37) {
                o37 o37Var = (o37) r37Var2;
                String str = o37Var.f161296a;
                xpz0Var.f264783a = buc0Var;
                xpz0Var.f264784b = o37Var;
                xpz0Var.f264787e = 1;
                Object objM41451f = m41451f(str, xpz0Var);
                Object obj2 = yuk.f276404a;
                if (objM41451f == obj2) {
                    return obj2;
                }
                buc0Var2 = buc0Var;
                r37Var = r37Var2;
                obj = objM41451f;
            } else {
                if (r37Var2 instanceof p37) {
                    listSingletonList = Collections.singletonList(new mfj("I couldn't find anything. Try again?"));
                } else if (r37Var2.equals(m37.f139548a)) {
                    listSingletonList = Collections.singletonList(new mfj("Something went wrong. Try again?"));
                } else if (r37Var2.equals(n37.f149947a)) {
                    listSingletonList = Collections.singletonList(new mfj("Recognition was interrupted. Try again?"));
                } else {
                    if (!r37Var2.equals(q37.f184805a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listSingletonList = Collections.singletonList(new mfj("To recognize music, enable microphone access in Android settings and try again."));
                }
                buc0Var2 = buc0Var;
                listM44506m = listSingletonList;
            }
            zo2 zo2Var = new zo2(buc0Var2.f31082c, opo.m67574x(listM44506m), false, true, null, 0L);
            long j = buc0Var2.f31080a;
            String str2 = buc0Var2.f31082c;
            return new zvc0(j, new t0d0(zo2Var, new gpo(str2, lv21.f137205b), str2));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r37Var = xpz0Var.f264784b;
        buc0Var2 = xpz0Var.f264783a;
        bga.m29073P(obj);
        b47 b47Var = (b47) obj;
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(new mfj(b47Var != null ? dq60.m36615o("You’re listening to ", b47Var.f23237a, " by ", g6f.m43753y0(b47Var.f23238b, ", ", null, null, null, 62), ".") : "Found it, but I couldn't load the track details."));
        if (b47Var != null) {
            ro80VarM44508o.add(new ofj(6, null, opo.m67566p(((o37) r37Var).f161296a)));
        }
        listM44506m = geg1.m44506m(ro80VarM44508o);
        zo2 zo2Var2 = new zo2(buc0Var2.f31082c, opo.m67574x(listM44506m), false, true, null, 0L);
        long j2 = buc0Var2.f31080a;
        String str3 = buc0Var2.f31082c;
        return new zvc0(j2, new t0d0(zo2Var2, new gpo(str3, lv21.f137205b), str3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m41450e(fbk fbkVar) {
        c0s c0sVar;
        if (fbkVar instanceof c0s) {
            c0sVar = (c0s) fbkVar;
            int i = c0sVar.f32854c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0sVar.f32854c = i - Integer.MIN_VALUE;
            } else {
                c0sVar = new c0s(this, fbkVar);
            }
        } else {
            c0sVar = new c0s(this, fbkVar);
        }
        Object obj = c0sVar.f32852a;
        int i2 = c0sVar.f32854c;
        if (i2 == 0) {
            bga.m29073P(obj);
            CompletableOnErrorComplete completableOnErrorCompleteM23299p = tgz0.m80797a(((fle1) this.f68775b).f70763a).m23299p(Functions.f7232h);
            c0sVar.f32854c = 1;
            Object objM96565n = zn91.m96565n(completableOnErrorCompleteM23299p, c0sVar);
            yuk yukVar = yuk.f276404a;
            if (objM96565n == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m41451f(String str, ibk ibkVar) {
        ypz0 ypz0Var;
        v140 v140Var;
        List listM43727j0;
        List list;
        String str2;
        if (ibkVar instanceof ypz0) {
            ypz0Var = (ypz0) ibkVar;
            int i = ypz0Var.f275100d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ypz0Var.f275100d = i - Integer.MIN_VALUE;
            } else {
                ypz0Var = new ypz0(this, ibkVar);
            }
        } else {
            ypz0Var = new ypz0(this, ibkVar);
        }
        Object objM76980u = ypz0Var.f275098b;
        int i2 = ypz0Var.f275100d;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                xay0 xay0Var = new xay0(this, str, fbkVar, 11);
                ypz0Var.f275097a = str;
                ypz0Var.f275100d = 1;
                objM76980u = s1h1.m76980u(3000L, xay0Var, ypz0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = ypz0Var.f275097a;
                bga.m29073P(objM76980u);
            }
            v140Var = (v140) objM76980u;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to resolve audio recognition metadata for URI: %s", str);
            v140Var = null;
        }
        String string = (v140Var == null || (str2 = v140Var.f236243a) == null) ? null : wl51.m88491o1(str2).toString();
        if (string == null) {
            string = "";
        }
        if (v140Var == null || (list = v140Var.f236246d) == null) {
            listM43727j0 = null;
        } else {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wl51.m88491o1(((t140) it.next()).f216153a).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            listM43727j0 = g6f.m43727j0(arrayList2);
        }
        if (listM43727j0 == null) {
            listM43727j0 = lau.f131415a;
        }
        if (string.length() <= 0 || listM43727j0.isEmpty()) {
            return null;
        }
        return new b47(string, listM43727j0);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        tvj0 ovj0Var;
        switch (this.f68774a) {
            case 0:
                return new tz10(((tz10) yhh.f272893b1.invoke((vs70) obj, ((List) this.f68775b).get(((Number) obj2).intValue()))).f225083a);
            case 1:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                nh61 nh61Var = (nh61) this.f68775b;
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM64153s = ncg1.m64153s(R.string.m3c_dialog, xq00Var);
                    fxh0 fxh0VarM61837u = mi21.m61837u((fxh0) nh61Var.f153885c, e83.f57050a, 0.0f, e83.f57051b, 0.0f, 10);
                    boolean zM91766g = xq00Var.m91766g(strM64153s);
                    Object objM91750T = xq00Var.m91750T();
                    if (zM91766g || objM91750T == t6x0.f217647t) {
                        objM91750T = new p39(strM64153s, 2);
                        xq00Var.m91793t0(objM91750T);
                    }
                    fxh0 fxh0VarMo34315F = fxh0VarM61837u.mo34315F(zoz0.m96644b(cxh0.f43038a, false, (gh00) objM91750T));
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, true);
                    int iM70356o = pmg1.m70356o(xq00Var);
                    wpn0 wpn0VarM91778m = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                    yhh yhhVar = roh.f201265j;
                    if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iM70356o))) {
                        pi9.m70087l(iM70356o, xq00Var, iM70356o, yhhVar);
                    }
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                    ms2.m62690o(0, (fyf) nh61Var.f153887e, xq00Var, xq00Var, true);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wej0 wej0Var = bj5.f27611b;
                    vb9 vb9Var = d7f0.f46142M0;
                    vh00 vh00Var = ((ch21) this.f68775b).f37879g;
                    irx0 irx0VarM36744a = drx0.m36744a(wej0Var, vb9Var, xq00Var2, 54);
                    int iM70356o2 = pmg1.m70356o(xq00Var2);
                    wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0.f43038a);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (xq00Var2.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var2.m91779m0();
                    if (xq00Var2.f264808S) {
                        xq00Var2.m91776l(c2087le2);
                    } else {
                        xq00Var2.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var2);
                    yhh yhhVar2 = roh.f201265j;
                    if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o2))) {
                        pi9.m70087l(iM70356o2, xq00Var2, iM70356o2, yhhVar2);
                    }
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var2);
                    vh00Var.mo24510D0(prx0.f180692a, xq00Var2, 6);
                    xq00Var2.m91788r(true);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    wej0 wej0Var2 = bj5.f27611b;
                    vb9 vb9Var2 = d7f0.f46142M0;
                    fyf fyfVar = ((sm91) this.f68775b).f210599j;
                    irx0 irx0VarM36744a2 = drx0.m36744a(wej0Var2, vb9Var2, xq00Var3, 54);
                    int iM70356o3 = pmg1.m70356o(xq00Var3);
                    wpn0 wpn0VarM91778m3 = xq00Var3.m91778m();
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var3, cxh0.f43038a);
                    soh.f211194A.getClass();
                    C2087le c2087le3 = roh.f201257b;
                    if (xq00Var3.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var3.m91779m0();
                    if (xq00Var3.f264808S) {
                        xq00Var3.m91776l(c2087le3);
                    } else {
                        xq00Var3.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a2, roh.f201262g, xq00Var3);
                    zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, xq00Var3);
                    yhh yhhVar3 = roh.f201265j;
                    if (xq00Var3.f264808S || !wj50.m88271j(xq00Var3.m91750T(), Integer.valueOf(iM70356o3))) {
                        pi9.m70087l(iM70356o3, xq00Var3, iM70356o3, yhhVar3);
                    }
                    zsf1.m96835F(fxh0VarM48286s3, roh.f201259d, xq00Var3);
                    fyfVar.mo24510D0(prx0.f180692a, xq00Var3, 6);
                    xq00Var3.m91788r(true);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                mfb mfbVar = (mfb) this.f68775b;
                List list = ((ntc0) obj).f158045a;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Uri) it.next()).toString());
                }
                mfbVar.m61624e(arrayList);
                return w2a1.f247311a;
            case 5:
                return m41450e((fbk) obj2);
            case 6:
                int iIntValue4 = ((Number) obj2).intValue();
                return new tz10(((tz10) acu.f14438O0.mo24510D0((vs70) obj, Integer.valueOf(iIntValue4), ((ArrayList) this.f68775b).get(iIntValue4))).f225083a);
            case 7:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objM91750T2 = xq00Var4.m91750T();
                    if (objM91750T2 == t6x0.f217647t) {
                        objM91750T2 = new f150(22);
                        xq00Var4.m91793t0(objM91750T2);
                    }
                    fxh0 fxh0VarM96644b = zoz0.m96644b(cxh0.f43038a, false, (gh00) objM91750T2);
                    kqi0 kqi0Var = (kqi0) this.f68775b;
                    m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
                    int iM70356o4 = pmg1.m70356o(xq00Var4);
                    wpn0 wpn0VarM91778m4 = xq00Var4.m91778m();
                    fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var4, fxh0VarM96644b);
                    soh.f211194A.getClass();
                    C2087le c2087le4 = roh.f201257b;
                    if (xq00Var4.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var4.m91779m0();
                    if (xq00Var4.f264808S) {
                        xq00Var4.m91776l(c2087le4);
                    } else {
                        xq00Var4.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d2, roh.f201262g, xq00Var4);
                    zsf1.m96835F(wpn0VarM91778m4, roh.f201261f, xq00Var4);
                    yhh yhhVar4 = roh.f201265j;
                    if (xq00Var4.f264808S || !wj50.m88271j(xq00Var4.m91750T(), Integer.valueOf(iM70356o4))) {
                        pi9.m70087l(iM70356o4, xq00Var4, iM70356o4, yhhVar4);
                    }
                    zsf1.m96835F(fxh0VarM48286s4, roh.f201259d, xq00Var4);
                    ((th00) kqi0Var.getValue()).invoke(xq00Var4, 0);
                    xq00Var4.m91788r(true);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                Notification notification = (Notification) obj;
                String str = (String) obj2;
                String id = notification.getId();
                gw71 gw71Var = (gw71) ((C2483v5) this.f68775b).invoke(notification.m11104y());
                String title = notification.getTitle();
                vsj0 vsj0Var = new vsj0(notification.m11103x().getUri(), m70.valueOf(notification.m11103x().m11110q().name()));
                int iM11096A = notification.m11096A();
                int i = iM11096A == 0 ? -1 : qwj0.f193360a[edb.m38547C(iM11096A)];
                if (i != 1) {
                    ovj0Var = (i == 2 || i != 3) ? new lvj0(notification.m11105z().getImageUrl(), notification.m11105z().m11075q()) : new svj0(new ira1(notification.m11100E().m11143r().getImageUrl(), notification.m11100E().m11143r().m11148q()), new lvj0(notification.m11100E().m11142q().getImageUrl(), notification.m11100E().m11142q().m11075q()));
                } else {
                    ae50<UserImage> ae50VarM11084p = notification.m11098C().m11084p();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM11084p, 10));
                    for (UserImage userImage : ae50VarM11084p) {
                        arrayList2.add(new ira1(userImage.getImageUrl(), userImage.m11148q()));
                    }
                    ovj0Var = new ovj0(arrayList2);
                }
                return new qsj0(id, gw71Var, title, vsj0Var, ovj0Var, notification.getIsNew(), notification.m11099D(), new g0f0(notification.m11097B().m11080q(), notification.m11097B().getMessageId()), str);
            case 9:
                return m41449a((buc0) obj, (fbk) obj2);
            case 10:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    va71.m85018c((String) this.f68775b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, xq00Var5, 0, 0, 262142);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            default:
                aj2 aj2Var = (aj2) this.f68775b;
                String str2 = ((ytc0) obj).f276091a;
                ck2 ck2Var = (ck2) aj2Var;
                ck2Var.getClass();
                ck2Var.m33048E(str2, false, new ak2(ck2Var, (fbk) null));
                return w2a1.f247311a;
        }
    }
}
