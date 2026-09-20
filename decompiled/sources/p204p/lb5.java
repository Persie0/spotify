package p204p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.datastore.core.CorruptionException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.recommendedsearches.p142v1.RecommendedSearches;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class lb5 implements yua, tfs, vd50, Function, evk, Init, ddl, fz61, il91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131564a;

    public /* synthetic */ lb5(int i) {
        this.f131564a = i;
    }

    /* JADX INFO: renamed from: d */
    public static final String m58606d(String str) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        he41 he41Var = dd41VarM74726U.f47710d;
        if (!wj50.m88271j(he41Var != null ? he41Var.getType() : null, ivp0.f106258f)) {
            return str;
        }
        String strM35694A = r46.m74728W(dd41VarM74726U.m35710h()).m35694A();
        wj50.m88279p(strM35694A);
        return strM35694A;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m58607f(wq50 wq50Var, String str, String str2) {
        Bundle bundle = new Bundle();
        if (wq50Var == null && str == null) {
            throw new IllegalArgumentException("Group categories fragment cannot be instantiated without a category or a valid category key");
        }
        if (wq50Var != null) {
            bundle.putParcelable("SELECTED_GROUP_ITEM", wq50Var);
        }
        if (str != null) {
            bundle.putString("SELECTED_GROUP_ITEM_KEY", str);
        }
        if (str2 != null) {
            bundle.putString("SELECTED_GROUP_ITEM_URI", str2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static ebf0 m58608g(lb5 lb5Var, LinkedHashMap linkedHashMap) {
        pjo pjoVar;
        Set<k35> setKeySet = linkedHashMap.keySet();
        lb5Var.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (k35 k35Var : setKeySet) {
            if (!k35Var.m55230a()) {
                tn61 tn61Var = k35Var.f118762a;
                jqx jqxVar = tn61Var instanceof jqx ? (jqx) tn61Var : null;
                if (jqxVar != null && (pjoVar = (pjo) linkedHashMap.get(k35Var)) != null) {
                    Class clsMo28587A = ((ife) jqxVar.f115017a).mo28587A();
                    String str = (String) k35Var.f118763b;
                    if (pjoVar instanceof ojo) {
                        Object linkedHashMap3 = linkedHashMap2.get(str);
                        if (linkedHashMap3 == null) {
                            linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap2.put(str, linkedHashMap3);
                        }
                        ((Map) linkedHashMap3).put(clsMo28587A, new cbf0(((ojo) pjoVar).f166104a));
                    } else if (pjoVar instanceof njo) {
                        Object linkedHashMap4 = linkedHashMap2.get(str);
                        if (linkedHashMap4 == null) {
                            linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap2.put(str, linkedHashMap4);
                        }
                        ((Map) linkedHashMap4).remove(clsMo28587A);
                    } else {
                        if (!(pjoVar instanceof mjo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (((mjo) pjoVar).f144297a instanceof ijo) {
                            Object linkedHashMap5 = linkedHashMap2.get(str);
                            if (linkedHashMap5 == null) {
                                linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap2.put(str, linkedHashMap5);
                            }
                            ((Map) linkedHashMap5).put(clsMo28587A, new bbf0(2));
                        } else {
                            Object linkedHashMap6 = linkedHashMap2.get(str);
                            if (linkedHashMap6 == null) {
                                linkedHashMap6 = new LinkedHashMap();
                                linkedHashMap2.put(str, linkedHashMap6);
                            }
                            ((Map) linkedHashMap6).put(clsMo28587A, new bbf0(1));
                        }
                    }
                }
            }
        }
        return new ebf0((ern0) pwb.m71227l(linkedHashMap2));
    }

    /* JADX INFO: renamed from: h */
    public static oa31 m58609h() {
        return ua31.m82674j();
    }

    /* JADX INFO: renamed from: i */
    public static oa31 m58610i() {
        return (oa31) ua31.f228350b.m27471g();
    }

    /* JADX INFO: renamed from: j */
    public static oa31 m58611j(oa31 oa31Var) {
        if (oa31Var instanceof bd91) {
            bd91 bd91Var = (bd91) oa31Var;
            if (bd91Var.f26060t == exg1.m40252u()) {
                bd91Var.f26058r = null;
                return oa31Var;
            }
        }
        if (oa31Var instanceof cd91) {
            cd91 cd91Var = (cd91) oa31Var;
            if (cd91Var.f36840i == exg1.m40252u()) {
                cd91Var.f36839h = null;
                return oa31Var;
            }
        }
        oa31 oa31VarM82671g = ua31.m82671g(oa31Var, null, false);
        oa31VarM82671g.m66515j();
        return oa31VarM82671g;
    }

    /* JADX INFO: renamed from: k */
    public static void m58612k() {
        ua31.m82674j().mo28823m();
    }

    /* JADX INFO: renamed from: l */
    public static Object m58613l(ptq ptqVar, eh00 eh00Var) {
        oa31 bd91Var;
        oa31 oa31Var = (oa31) ua31.f228350b.m27471g();
        if (oa31Var instanceof bd91) {
            bd91 bd91Var2 = (bd91) oa31Var;
            if (bd91Var2.f26060t == exg1.m40252u()) {
                gh00 gh00Var = bd91Var2.f26058r;
                gh00 gh00Var2 = bd91Var2.f26059s;
                try {
                    ((bd91) oa31Var).f26058r = ua31.m82675k(ptqVar, gh00Var, true);
                    ((bd91) oa31Var).f26059s = gh00Var2;
                    return eh00Var.invoke();
                } finally {
                    bd91Var2.f26058r = gh00Var;
                    bd91Var2.f26059s = gh00Var2;
                }
            }
        }
        if (oa31Var == null || (oa31Var instanceof iqi0)) {
            bd91Var = new bd91(oa31Var instanceof iqi0 ? (iqi0) oa31Var : null, ptqVar, null, true, false);
        } else {
            bd91Var = oa31Var.mo28828u(ptqVar);
        }
        try {
            oa31 oa31VarM66515j = bd91Var.m66515j();
            try {
                Object objInvoke = eh00Var.invoke();
                oa31.m66513q(oa31VarM66515j);
                bd91Var.mo28814c();
                return objInvoke;
            } catch (Throwable th) {
                oa31.m66513q(oa31VarM66515j);
                throw th;
            }
        } catch (Throwable th2) {
            bd91Var.mo28814c();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: m */
    public static na31 m58614m(th00 th00Var) {
        ua31.m82669e(ua31.f228349a);
        synchronized (ua31.f228351c) {
            ua31.f228356h = g6f.m43701O0(th00Var, ua31.f228356h);
        }
        return new na31(th00Var, 1);
    }

    /* JADX INFO: renamed from: n */
    public static void m58615n(oa31 oa31Var, oa31 oa31Var2, gh00 gh00Var) {
        if (oa31Var != oa31Var2) {
            oa31Var2.getClass();
            oa31.m66513q(oa31Var);
            oa31Var2.mo28814c();
        } else if (oa31Var instanceof bd91) {
            ((bd91) oa31Var).f26058r = gh00Var;
        } else if (oa31Var instanceof cd91) {
            ((cd91) oa31Var).f36839h = gh00Var;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + oa31Var).toString());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m58616o() {
        boolean z;
        synchronized (ua31.f228351c) {
            dqi0 dqi0Var = ua31.f228358j.f104790h;
            z = false;
            if (dqi0Var != null && dqi0Var.m36649h()) {
                z = true;
            }
        }
        if (z) {
            ua31.m82665a();
        }
    }

    /* JADX INFO: renamed from: p */
    public static iqi0 m58617p(rv70 rv70Var, ksh0 ksh0Var) {
        iqi0 iqi0VarMo28812C;
        oa31 oa31VarM82674j = ua31.m82674j();
        iqi0 iqi0Var = oa31VarM82674j instanceof iqi0 ? (iqi0) oa31VarM82674j : null;
        if (iqi0Var == null || (iqi0VarMo28812C = iqi0Var.mo28812C(rv70Var, ksh0Var)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return iqi0VarMo28812C;
    }

    @Override // p204p.yua
    /* JADX INFO: renamed from: a */
    public byte[] mo48891a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f131564a) {
            case 11:
                List list = (List) obj;
                wj50.m88279p(list);
                return rmx.m75981e(list);
            case 23:
                ae50<mgv0> ae50VarM20352n = ((RecommendedSearches) obj).m20352n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM20352n, 10));
                for (mgv0 mgv0Var : ae50VarM20352n) {
                    arrayList.add(new fgv0(mgv0Var.mo20353d(), mgv0Var.getUri()));
                }
                return arrayList;
            default:
                return sh51.f209112h.get(obj);
        }
    }

    @Override // p204p.il91
    /* JADX INFO: renamed from: b */
    public Bundle mo51005b() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
        return bundle;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        lq6 lq6Var;
        switch (this.f131564a) {
            case 4:
                lsj lsjVarM59838a = lsj.m59838a(i);
                return lsjVarM59838a == null ? lsj.UNRECOGNIZED : lsjVarM59838a;
            default:
                switch (i) {
                    case 0:
                        lq6Var = lq6.UNKNOWN_ATTRIBUTE;
                        break;
                    case 1:
                        lq6Var = lq6.DERIVATIVE;
                        break;
                    case 2:
                        lq6Var = lq6.OWNED_BY_USER;
                        break;
                    case 3:
                        lq6Var = lq6.MADE_FOR_USER;
                        break;
                    case 4:
                        lq6Var = lq6.EXPLICIT_CONTENT;
                        break;
                    case 5:
                        lq6Var = lq6.PAY_WALLED;
                        break;
                    case 6:
                        lq6Var = lq6.GENERATIVE;
                        break;
                    case 7:
                        lq6Var = lq6.GEN_SESSION_HINT_FREE;
                        break;
                    default:
                        lq6Var = null;
                        break;
                }
                return lq6Var == null ? lq6.UNRECOGNIZED : lq6Var;
        }
    }

    @Override // p204p.tfs
    /* JADX INFO: renamed from: e */
    public Drawable mo54267e(Bitmap bitmap) {
        wj50.m88279p(bitmap);
        return new qde(bitmap);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f131564a) {
            case 21:
                ikq0 ikq0Var = (ikq0) obj;
                rkq0 rkq0Var = ikq0Var.f103188a;
                if (rkq0Var instanceof qkq0) {
                    return First.m15575c(ikq0Var, Collections.singleton(rjq0.f199885a));
                }
                if ((rkq0Var instanceof okq0) || (rkq0Var instanceof pkq0)) {
                    return First.m15574b(ikq0Var);
                }
                throw new NoWhenBranchMatchedException();
            default:
                return First.m15574b((vat0) obj);
        }
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        dce dceVar = dce.EPOCH_DAY;
        if (bz61Var.mo26516d(dceVar)) {
            return jba0.m52878A6(bz61Var.mo26517g(dceVar));
        }
        return null;
    }

    public /* synthetic */ lb5(Object obj, int i) {
        this.f131564a = i;
    }

    public /* synthetic */ lb5(boolean z) {
        this.f131564a = 17;
    }

    public lb5(son sonVar, otn otnVar) {
        this.f131564a = 6;
    }

    @Override // p204p.evk
    /* JADX INFO: renamed from: c */
    public Object mo40110c(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }
}
