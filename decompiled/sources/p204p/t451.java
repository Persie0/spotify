package p204p;

import com.spotify.stickers.p160v1.GetStickerResponse;
import com.spotify.stickers.p160v1.GetSurfaceResponse;
import com.spotify.stickers.p160v1.SearchSurfaceStickersResponse;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t451 implements j451 {

    /* JADX INFO: renamed from: l */
    public static final urv0 f216912l = new urv0("[\\s,;.!?_]+");

    /* JADX INFO: renamed from: a */
    public final boolean f216913a;

    /* JADX INFO: renamed from: b */
    public final g551 f216914b;

    /* JADX INFO: renamed from: c */
    public final epx f216915c;

    /* JADX INFO: renamed from: d */
    public final zv41 f216916d = jag1.m52819d("");

    /* JADX INFO: renamed from: e */
    public final zv41 f216917e;

    /* JADX INFO: renamed from: f */
    public final nuu0 f216918f;

    /* JADX INFO: renamed from: g */
    public final zv41 f216919g;

    /* JADX INFO: renamed from: h */
    public final zv41 f216920h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f216921i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f216922j;

    /* JADX INFO: renamed from: k */
    public di41 f216923k;

    public t451(boolean z, g551 g551Var, epx epxVar) {
        this.f216913a = z;
        this.f216914b = g551Var;
        this.f216915c = epxVar;
        zv41 zv41VarM52819d = jag1.m52819d(zzy0.f288156a);
        this.f216917e = zv41VarM52819d;
        this.f216918f = bzf1.m31021m(zv41VarM52819d);
        this.f216919g = jag1.m52819d(new k451());
        this.f216920h = jag1.m52819d(lau.f131415a);
        this.f216921i = new LinkedHashMap();
        this.f216922j = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m80031a(t451 t451Var, k251 k251Var, String str, ibk ibkVar) {
        m451 m451Var;
        y351 y351Var;
        k251 k251Var2;
        String strM87105b;
        ConcurrentHashMap concurrentHashMap = t451Var.f216922j;
        if (ibkVar instanceof m451) {
            m451Var = (m451) ibkVar;
            int i = m451Var.f139846f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m451Var.f139846f = i - Integer.MIN_VALUE;
            } else {
                m451Var = new m451(t451Var, ibkVar);
            }
        } else {
            m451Var = new m451(t451Var, ibkVar);
        }
        Object obj = m451Var.f139844d;
        int i2 = m451Var.f139846f;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                y351 y351VarM55151b = k251Var.m55151b();
                if (y351VarM55151b instanceof w351) {
                    w351 w351Var = (w351) y351VarM55151b;
                    if (w351Var.m87105b() == null) {
                        String str2 = (String) concurrentHashMap.get(str);
                        if (str2 != null) {
                            return k251.m55150a(k251Var, w351.m87104a(w351Var, str2));
                        }
                        try {
                            m451Var.f139841a = k251Var;
                            m451Var.f139842b = str;
                            m451Var.f139843c = (w351) y351VarM55151b;
                            m451Var.f139846f = 1;
                            Object objM80037g = t451Var.m80037g(str, m451Var);
                            Object obj2 = yuk.f276404a;
                            if (objM80037g == obj2) {
                                return obj2;
                            }
                            obj = objM80037g;
                            y351Var = y351VarM55151b;
                        } catch (Exception unused) {
                            y351Var = y351VarM55151b;
                            k251Var2 = null;
                        }
                    }
                }
                return k251Var;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y351Var = m451Var.f139843c;
            str = m451Var.f139842b;
            k251Var = m451Var.f139841a;
            try {
                bga.m29073P(obj);
            } catch (Exception unused2) {
                k251Var2 = null;
            }
            k251Var2 = (k251) obj;
            y351 y351VarM55151b2 = k251Var2 != null ? k251Var2.m55151b() : null;
            w351 w351Var2 = y351VarM55151b2 instanceof w351 ? (w351) y351VarM55151b2 : null;
            if (w351Var2 == null || (strM87105b = w351Var2.m87105b()) == null) {
                return k251Var;
            }
            concurrentHashMap.put(str, strM87105b);
            return k251.m55150a(k251Var, w351.m87104a((w351) y351Var, strM87105b));
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m80032b(t451 t451Var, String str, ibk ibkVar) {
        q451 q451Var;
        String strM69093g;
        t451Var.getClass();
        if (ibkVar instanceof q451) {
            q451Var = (q451) ibkVar;
            int i = q451Var.f185070c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q451Var.f185070c = i - Integer.MIN_VALUE;
            } else {
                q451Var = new q451(t451Var, ibkVar);
            }
        } else {
            q451Var = new q451(t451Var, ibkVar);
        }
        Object objM43591b = q451Var.f185068a;
        int i2 = q451Var.f185070c;
        if (i2 == 0) {
            bga.m29073P(objM43591b);
            g551 g551Var = t451Var.f216914b;
            q451Var.f185070c = 1;
            objM43591b = g551Var.m43591b(str, q451Var);
            yuk yukVar = yuk.f276404a;
            if (objM43591b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM43591b);
        }
        o2x0 o2x0Var = (o2x0) objM43591b;
        GetSurfaceResponse getSurfaceResponse = (GetSurfaceResponse) o2x0Var.f161172b;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0 && getSurfaceResponse != null) {
            return new e351(jkc0.m53614z(getSurfaceResponse), jkc0.m53611w(getSurfaceResponse));
        }
        int i3 = n2x0Var.f149860d;
        p3x0 p3x0Var = o2x0Var.f161173c;
        if (p3x0Var == null || (strM69093g = p3x0Var.m69093g()) == null) {
            strM69093g = "Unknown error";
        }
        throw new IllegalStateException(tfe.m80649g(i3, " ", strM69093g).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m80033c(t451 t451Var, String str, ibk ibkVar) {
        r451 r451Var;
        t451Var.getClass();
        if (ibkVar instanceof r451) {
            r451Var = (r451) ibkVar;
            int i = r451Var.f195662d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r451Var.f195662d = i - Integer.MIN_VALUE;
            } else {
                r451Var = new r451(t451Var, ibkVar);
            }
        } else {
            r451Var = new r451(t451Var, ibkVar);
        }
        Object objM96571q = r451Var.f195660b;
        int i2 = r451Var.f195662d;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable observableFilter = ((jpx) t451Var.f216915c).m53978b(new C1668ai("stickers-data-repo", new e151(str, 2))).filter(alr0.f16951Q0);
            r451Var.f195659a = str;
            r451Var.f195662d = 1;
            objM96571q = zn91.m96571q(observableFilter, 2, null, r451Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = r451Var.f195659a;
            bga.m29073P(objM96571q);
        }
        gqx gqxVar = (gqx) objM96571q;
        v140 v140Var = gqxVar != null ? (v140) gqxVar.mo45449a(v140.class, str).f72301b : null;
        erc1 erc1Var = gqxVar != null ? (erc1) gqxVar.mo45449a(erc1.class, str).f72301b : null;
        if (v140Var == null || erc1Var == null) {
            return null;
        }
        return new l451(v140Var, erc1Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: d */
    public static final Object m80034d(t451 t451Var, String str, String str2, int i, ibk ibkVar) {
        s451 s451Var;
        Object c6x0Var;
        Object value;
        t451 t451Var2 = t451Var;
        zv41 zv41Var = t451Var2.f216917e;
        zv41 zv41Var2 = t451Var2.f216919g;
        if (ibkVar instanceof s451) {
            s451Var = (s451) ibkVar;
            int i2 = s451Var.f205501c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s451Var.f205501c = i2 - Integer.MIN_VALUE;
            } else {
                s451Var = new s451(t451Var2, ibkVar);
            }
        } else {
            s451Var = new s451(t451Var2, ibkVar);
        }
        s451 s451Var2 = s451Var;
        Object objM80036f = s451Var2.f205499a;
        int i3 = s451Var2.f205501c;
        try {
            if (i3 == 0) {
                bga.m29073P(objM80036f);
                while (true) {
                    Object value2 = zv41Var2.getValue();
                    if (zv41Var2.m97089k(value2, k451.m55344a((k451) value2, null, null, str, str2, i, null, null, false, 227))) {
                        break;
                    }
                    t451Var2 = t451Var;
                }
                s451Var2.f205501c = 1;
                objM80036f = t451Var2.m80036f(str, str2, i, "", s451Var2);
                yuk yukVar = yuk.f276404a;
                if (objM80036f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM80036f);
            }
            c6x0Var = (pqm0) objM80036f;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (!(c6x0Var instanceof c6x0)) {
            pqm0 pqm0Var = (pqm0) c6x0Var;
            List list = (List) pqm0Var.f180350a;
            String str3 = (String) pqm0Var.f180351b;
            do {
                value = zv41Var2.getValue();
            } while (!zv41Var2.m97089k(value, k451.m55344a((k451) value, null, null, null, null, 0, str3, list, false, 159)));
            i0z0 i0z0Var = new i0z0(list);
            zv41Var.getClass();
            zv41Var.m97091m(null, i0z0Var);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof CancellationException)) {
            uzy0 uzy0Var = new uzy0(thM77348a);
            zv41Var.getClass();
            zv41Var.m97091m(null, uzy0Var);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    public final Object m80035e(ibk ibkVar) {
        n451 n451Var;
        Object c6x0Var;
        Object value;
        k451 k451Var;
        if (ibkVar instanceof n451) {
            n451Var = (n451) ibkVar;
            int i = n451Var.f150211c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n451Var.f150211c = i - Integer.MIN_VALUE;
            } else {
                n451Var = new n451(this, ibkVar);
            }
        } else {
            n451Var = new n451(this, ibkVar);
        }
        n451 n451Var2 = n451Var;
        Object objM80036f = n451Var2.f150209a;
        int i2 = n451Var2.f150211c;
        zv41 zv41Var = this.f216919g;
        try {
            if (i2 == 0) {
                bga.m29073P(objM80036f);
                k451 k451Var2 = (k451) zv41Var.getValue();
                if (k451Var2.m55350g() && !wl51.m88460J0(k451Var2.m55348e()) && k451Var2.m55347d().length() != 0) {
                    String strM55349f = k451Var2.m55349f();
                    String strM55348e = k451Var2.m55348e();
                    int iM55346c = k451Var2.m55346c();
                    String strM55347d = k451Var2.m55347d();
                    n451Var2.f150211c = 1;
                    objM80036f = m80036f(strM55349f, strM55348e, iM55346c, strM55347d, n451Var2);
                    yuk yukVar = yuk.f276404a;
                    if (objM80036f == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1.f247311a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM80036f);
            c6x0Var = (pqm0) objM80036f;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        boolean z = c6x0Var instanceof c6x0;
        zv41 zv41Var2 = this.f216917e;
        if (!z) {
            pqm0 pqm0Var = (pqm0) c6x0Var;
            List list = (List) pqm0Var.f180350a;
            String str = (String) pqm0Var.f180351b;
            do {
                value = zv41Var.getValue();
                k451Var = (k451) value;
            } while (!zv41Var.m97089k(value, k451.m55344a(k451Var, null, null, null, null, 0, str, qvf1.m73996A(k451Var.m55345b(), list), false, 159)));
            i0z0 i0z0Var = new i0z0(((k451) zv41Var.getValue()).m55345b());
            zv41Var2.getClass();
            zv41Var2.m97091m(null, i0z0Var);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof CancellationException)) {
            uzy0 uzy0Var = new uzy0(thM77348a);
            zv41Var2.getClass();
            zv41Var2.m97091m(null, uzy0Var);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Serializable m80036f(String str, String str2, int i, String str3, ibk ibkVar) {
        o451 o451Var;
        String strM69093g;
        if (ibkVar instanceof o451) {
            o451Var = (o451) ibkVar;
            int i2 = o451Var.f161563c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o451Var.f161563c = i2 - Integer.MIN_VALUE;
            } else {
                o451Var = new o451(this, ibkVar);
            }
        } else {
            o451Var = new o451(this, ibkVar);
        }
        o451 o451Var2 = o451Var;
        Object objM43589d = o451Var2.f161561a;
        int i3 = o451Var2.f161563c;
        if (i3 == 0) {
            bga.m29073P(objM43589d);
            o451Var2.f161563c = 1;
            objM43589d = g551.m43589d(this.f216914b, str, str2, i, str3, null, o451Var2, 16, null);
            yuk yukVar = yuk.f276404a;
            if (objM43589d == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM43589d);
        }
        o2x0 o2x0Var = (o2x0) objM43589d;
        SearchSurfaceStickersResponse searchSurfaceStickersResponse = (SearchSurfaceStickersResponse) o2x0Var.f161172b;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0 && searchSurfaceStickersResponse != null) {
            return pft0.m69840u(jkc0.m53588A(searchSurfaceStickersResponse), searchSurfaceStickersResponse.getNextPageToken());
        }
        int i4 = n2x0Var.f149860d;
        p3x0 p3x0Var = o2x0Var.f161173c;
        if (p3x0Var == null || (strM69093g = p3x0Var.m69093g()) == null) {
            strM69093g = "Unknown error";
        }
        throw new IllegalStateException(tfe.m80649g(i4, " ", strM69093g).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m80037g(String str, ibk ibkVar) {
        p451 p451Var;
        String strM69093g;
        if (ibkVar instanceof p451) {
            p451Var = (p451) ibkVar;
            int i = p451Var.f173822c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p451Var.f173822c = i - Integer.MIN_VALUE;
            } else {
                p451Var = new p451(this, ibkVar);
            }
        } else {
            p451Var = new p451(this, ibkVar);
        }
        Object objM43593e = p451Var.f173820a;
        int i2 = p451Var.f173822c;
        if (i2 == 0) {
            bga.m29073P(objM43593e);
            p451Var.f173822c = 1;
            objM43593e = this.f216914b.m43593e(str, p451Var);
            yuk yukVar = yuk.f276404a;
            if (objM43593e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM43593e);
        }
        o2x0 o2x0Var = (o2x0) objM43593e;
        GetStickerResponse getStickerResponse = (GetStickerResponse) o2x0Var.f161172b;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0 && getStickerResponse != null) {
            return jkc0.m53612x(getStickerResponse);
        }
        int i3 = n2x0Var.f149860d;
        p3x0 p3x0Var = o2x0Var.f161173c;
        if (p3x0Var == null || (strM69093g = p3x0Var.m69093g()) == null) {
            strM69093g = "Unknown error";
        }
        throw new IllegalStateException(tfe.m80649g(i3, " ", strM69093g).toString());
    }
}
