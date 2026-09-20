package p204p;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.music.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class mzp0 implements zql0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148751a = 1;

    /* JADX INFO: renamed from: b */
    public final Context f148752b;

    /* JADX INFO: renamed from: c */
    public final bco f148753c;

    /* JADX INFO: renamed from: d */
    public final fs9 f148754d;

    /* JADX INFO: renamed from: e */
    public final Object f148755e;

    /* JADX INFO: renamed from: f */
    public final Object f148756f;

    /* JADX INFO: renamed from: g */
    public final Object f148757g;

    /* JADX INFO: renamed from: h */
    public final Object f148758h;

    public mzp0(Context context, bco bcoVar, fs9 fs9Var, og6 og6Var, luk lukVar, xuk xukVar, ifw0 ifw0Var, xv41 xv41Var) {
        this.f148752b = context;
        this.f148753c = bcoVar;
        this.f148754d = fs9Var;
        this.f148755e = lukVar;
        this.f148756f = xukVar;
        this.f148757g = ifw0Var;
        this.f148758h = ifw0Var != null ? m63261e(ifw0Var.mo50456a()) : xv41Var != null ? m63261e(xv41Var) : jag1.m52819d(new yql0(nau.f152117a));
    }

    /* JADX INFO: renamed from: b */
    public static final void m63256b(mzp0 mzp0Var, eh00 eh00Var) {
        if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            eh00Var.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new z04(3, eh00Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m63257c(mzp0 mzp0Var, eh00 eh00Var) {
        if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            eh00Var.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new z04(5, eh00Var));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final eh00 m63258d(mzp0 mzp0Var, String str, String str2, String str3, String str4, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3) {
        bco bcoVar = mzp0Var.f148753c;
        if (mzp0Var.f148754d.m42548n()) {
            if (!bcoVar.m28770b()) {
                eh00Var3.invoke();
                return pwv0.f182142g;
            }
            u40 u40Var = u40.f226523c;
            return new fwv0(6, mzp0Var, sli0.m78489p((Activity) bcoVar.f25926b, new lku(str, str2, new fku(str3, new peu(u40Var, eh00Var)), new fku(str4, new peu(u40Var, eh00Var2)), eh00Var3, null, 80)));
        }
        ih10 ih10VarM31832a0 = c95.m31832a0(mzp0Var.f148752b, str, str2);
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.f102118f = new fic(eh00Var3);
        koi koiVar = new koi(3, eh00Var);
        ih10VarM31832a0.f102113a = str3;
        ih10VarM31832a0.f102115c = koiVar;
        koi koiVar2 = new koi(4, eh00Var2);
        ih10VarM31832a0.f102114b = str4;
        ih10VarM31832a0.f102116d = koiVar2;
        lh10 lh10VarM50574b = ih10VarM31832a0.m50574b();
        lh10VarM50574b.m58942b();
        return new fwv0(7, mzp0Var, lh10VarM50574b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: f */
    public static xql0 m63259f(String str, hzp0 hzp0Var, ebf0 ebf0Var) {
        boolean zBooleanValue;
        if (hzp0Var.f96994a) {
            dbf0 dbf0VarM38368c = ebf0Var.m38368c(xaw.class, str);
            if (dbf0VarM38368c == null) {
                zBooleanValue = false;
            } else {
                cbf0 cbf0VarM35556a = dbf0VarM38368c.m35556a();
                Boolean boolValueOf = cbf0VarM35556a != null ? Boolean.valueOf(!((xaw) cbf0VarM35556a.f36107a).f259780g.isEmpty()) : null;
                if (boolValueOf != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            }
            if (zBooleanValue) {
                return new uql0(Collections.singleton(tql0.f222829a));
            }
        }
        return vql0.f243960a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.xv41] */
    /* JADX INFO: renamed from: g */
    private final xv41 m63260g() {
        return this.f148758h;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r2 == r10) goto L39;
     */
    @Override // p204p.zql0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo36073a(String str, tql0 tql0Var, st91 st91Var, fbk fbkVar) throws Throwable {
        uvp0 uvp0Var;
        eh00 eh00Var;
        dgw0 dgw0Var;
        st91 st91Var2;
        String str2;
        ncj ncjVar;
        st91 st91Var3;
        Object objM89557A;
        kcj kcjVar;
        Object objM89557A2;
        String str3 = str;
        switch (this.f148751a) {
            case 0:
                int iOrdinal = tql0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return Boolean.TRUE;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
                hqbVar.m48222q();
                Context context = this.f148752b;
                String string = context.getString(R.string.download_audio_only_title);
                String string2 = context.getString(R.string.download_audio_only_message);
                String string3 = context.getString(R.string.download_audio_only_action_go_to_settings);
                String string4 = context.getString(R.string.download_audio_only_action_download_video);
                lzp0 lzp0Var = new lzp0(this, hqbVar, 2);
                lzp0 lzp0Var2 = new lzp0(this, hqbVar, 1);
                lzp0 lzp0Var3 = new lzp0(this, hqbVar, 0);
                if (this.f148754d.m42548n()) {
                    bco bcoVar = this.f148753c;
                    if (bcoVar.m28770b()) {
                        u40 u40Var = u40.f226523c;
                        uvp0Var = new uvp0(5, this, sli0.m78489p((Activity) bcoVar.f25926b, new lku(string, string2, new fku(string3, new peu(u40Var, lzp0Var)), new fku(string4, new peu(u40Var, lzp0Var2)), lzp0Var3, null, 80)));
                    } else {
                        lzp0Var3.invoke();
                        eh00Var = lin0.f133838W0;
                    }
                    hqbVar.mo42415l(new x10(21, eh00Var));
                    return hqbVar.m48221p();
                }
                ih10 ih10VarM31832a0 = c95.m31832a0(context, string, string2);
                ih10VarM31832a0.f102117e = true;
                ih10VarM31832a0.f102118f = new fic(lzp0Var3, 5);
                nmb nmbVar = new nmb(lzp0Var, 24);
                ih10VarM31832a0.f102113a = string3;
                ih10VarM31832a0.f102115c = nmbVar;
                nmb nmbVar2 = new nmb(lzp0Var2, 25);
                ih10VarM31832a0.f102114b = string4;
                ih10VarM31832a0.f102116d = nmbVar2;
                lh10 lh10VarM50574b = ih10VarM31832a0.m50574b();
                lh10VarM50574b.m58942b();
                uvp0Var = new uvp0(6, this, lh10VarM50574b);
                eh00Var = uvp0Var;
                hqbVar.mo42415l(new x10(21, eh00Var));
                return hqbVar.m48221p();
            default:
                luk lukVar = (luk) this.f148755e;
                if (fbkVar instanceof dgw0) {
                    dgw0Var = (dgw0) fbkVar;
                    int i = dgw0Var.f48908e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dgw0Var.f48908e = i - Integer.MIN_VALUE;
                    } else {
                        dgw0Var = new dgw0(this, (ibk) fbkVar);
                    }
                } else {
                    dgw0Var = new dgw0(this, (ibk) fbkVar);
                }
                dgw0 dgw0Var2 = dgw0Var;
                Object objMo50458d = dgw0Var2.f48906c;
                int i2 = dgw0Var2.f48908e;
                fbk fbkVar2 = null;
                yuk yukVar = yuk.f276404a;
                if (i2 == 0) {
                    bga.m29073P(objMo50458d);
                    int iOrdinal2 = tql0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        return Boolean.TRUE;
                    }
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ifw0 ifw0Var = (ifw0) this.f148757g;
                    if (ifw0Var != null) {
                        dgw0Var2.f48904a = str3;
                        st91Var3 = st91Var;
                        dgw0Var2.f48905b = st91Var3;
                        dgw0Var2.f48908e = 1;
                        objMo50458d = ifw0Var.mo50458d(str3, dgw0Var2);
                        break;
                    } else {
                        st91Var2 = st91Var;
                        str2 = str3;
                        ncjVar = null;
                        if (ncjVar instanceof kcj) {
                            kcjVar = (kcj) ncjVar;
                            if (kcjVar.f121496a.isEmpty()) {
                                dgw0Var2.f48904a = null;
                                dgw0Var2.f48905b = null;
                                dgw0Var2.f48908e = 3;
                                objM89557A = x0h1.m89557A(lukVar, new hrt0(this, st91Var2, str2, fbkVar2, 17), dgw0Var2);
                                if (objM89557A != yukVar) {
                                    return objM89557A;
                                }
                            } else {
                                List list = kcjVar.f121496a;
                                dgw0Var2.f48904a = null;
                                dgw0Var2.f48905b = null;
                                dgw0Var2.f48908e = 2;
                                objM89557A2 = x0h1.m89557A(lukVar, new uyf0(25, list, this, st91Var2, str2, (fbk) null), dgw0Var2);
                                if (objM89557A2 != yukVar) {
                                    return objM89557A2;
                                }
                            }
                        } else {
                            dgw0Var2.f48904a = null;
                            dgw0Var2.f48905b = null;
                            dgw0Var2.f48908e = 3;
                            objM89557A = x0h1.m89557A(lukVar, new hrt0(this, st91Var2, str2, fbkVar2, 17), dgw0Var2);
                            if (objM89557A != yukVar) {
                                return objM89557A;
                            }
                        }
                    }
                    return yukVar;
                }
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objMo50458d);
                    return objMo50458d;
                }
                st91 st91Var4 = dgw0Var2.f48905b;
                String str4 = dgw0Var2.f48904a;
                bga.m29073P(objMo50458d);
                st91Var3 = st91Var4;
                str3 = str4;
                st91 st91Var5 = st91Var3;
                str2 = str3;
                ncjVar = (ncj) objMo50458d;
                st91Var2 = st91Var5;
                if (ncjVar instanceof kcj) {
                    kcjVar = (kcj) ncjVar;
                    if (kcjVar.f121496a.isEmpty()) {
                        List list2 = kcjVar.f121496a;
                        dgw0Var2.f48904a = null;
                        dgw0Var2.f48905b = null;
                        dgw0Var2.f48908e = 2;
                        objM89557A2 = x0h1.m89557A(lukVar, new uyf0(25, list2, this, st91Var2, str2, (fbk) null), dgw0Var2);
                        if (objM89557A2 != yukVar) {
                            return objM89557A2;
                        }
                    } else {
                        dgw0Var2.f48904a = null;
                        dgw0Var2.f48905b = null;
                        dgw0Var2.f48908e = 3;
                        objM89557A = x0h1.m89557A(lukVar, new hrt0(this, st91Var2, str2, fbkVar2, 17), dgw0Var2);
                        if (objM89557A != yukVar) {
                            return objM89557A;
                        }
                    }
                } else {
                    dgw0Var2.f48904a = null;
                    dgw0Var2.f48905b = null;
                    dgw0Var2.f48908e = 3;
                    objM89557A = x0h1.m89557A(lukVar, new hrt0(this, st91Var2, str2, fbkVar2, 17), dgw0Var2);
                    if (objM89557A != yukVar) {
                        return objM89557A;
                    }
                }
                return yukVar;
        }
    }

    /* JADX INFO: renamed from: e */
    public nuu0 m63261e(xv41 xv41Var) {
        Set setKeySet = ((tfw0) xv41Var.getValue()).f220062a.keySet();
        int iM31820L = c95.m31820L(i6f.m49804T(setKeySet, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj, new uql0(Collections.singleton(tql0.f222830b)));
        }
        return bzf1.m31029u(new lcw0(xv41Var, 2), (xuk) this.f148756f, hf11.f90581a, new yql0(linkedHashMap));
    }

    @Override // p204p.zql0
    public final xv41 getStatus() {
        switch (this.f148751a) {
            case 0:
                return (nuu0) this.f148758h;
            default:
                return m63260g();
        }
    }

    public mzp0(Context context, bco bcoVar, fs9 fs9Var, z9j0 z9j0Var, at91 at91Var, xuk xukVar, czp0 czp0Var, ck90 ck90Var) {
        Map linkedHashMap;
        this.f148752b = context;
        this.f148753c = bcoVar;
        this.f148754d = fs9Var;
        this.f148755e = z9j0Var;
        this.f148756f = at91Var;
        this.f148757g = czp0Var;
        zux zuxVar = new zux(czp0Var.mo34458a(), z8g1.m95590j(ck90Var), new d6g0(this, null, 4), 1);
        ebf0 ebf0Var = (ebf0) ck90Var.mo33098e();
        if (ebf0Var != null) {
            Set setMo36658b = ((AbstractC2328r7) ebf0Var.f57921a).mo36658b();
            int iM31820L = c95.m31820L(i6f.m49804T(setMo36658b, 10));
            linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
            for (Object obj : setMo36658b) {
                linkedHashMap.put(obj, m63259f((String) obj, (hzp0) ((czp0) this.f148757g).mo34458a().getValue(), ebf0Var));
            }
        } else {
            linkedHashMap = nau.f152117a;
        }
        this.f148758h = bzf1.m31029u(zuxVar, xukVar, hf11.f90581a, new yql0(linkedHashMap));
    }
}
