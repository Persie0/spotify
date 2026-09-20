package p204p;

import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ej1 implements kxf {

    /* JADX INFO: renamed from: a */
    public final z5f f60099a;

    /* JADX INFO: renamed from: b */
    public final ryq0 f60100b;

    /* JADX INFO: renamed from: c */
    public final yfd1 f60101c;

    /* JADX INFO: renamed from: d */
    public final voc1 f60102d;

    /* JADX INFO: renamed from: e */
    public final u7n f60103e;

    /* JADX INFO: renamed from: f */
    public final pu4 f60104f;

    /* JADX INFO: renamed from: g */
    public final egd1 f60105g;

    /* JADX INFO: renamed from: h */
    public final siy f60106h;

    /* JADX INFO: renamed from: i */
    public di41 f60107i;

    public ej1(z5f z5fVar, ryq0 ryq0Var, yfd1 yfd1Var, voc1 voc1Var, u7n u7nVar, pu4 pu4Var, egd1 egd1Var, siy siyVar) {
        this.f60099a = z5fVar;
        this.f60100b = ryq0Var;
        this.f60101c = yfd1Var;
        this.f60102d = voc1Var;
        this.f60103e = u7nVar;
        this.f60104f = pu4Var;
        this.f60105g = egd1Var;
        this.f60106h = siyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [p.eh00] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [p.eh00] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX INFO: renamed from: d */
    public static final Object m39158d(ej1 ej1Var, lwf lwfVar, String str, boolean z, String str2, eh00 eh00Var, fbk fbkVar) {
        dj1 dj1Var;
        Object c6x0Var;
        ?? r14;
        siy siyVar = ej1Var.f60106h;
        if (fbkVar instanceof dj1) {
            dj1Var = (dj1) fbkVar;
            int i = dj1Var.f49525f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dj1Var.f49525f = i - Integer.MIN_VALUE;
            } else {
                dj1Var = new dj1(ej1Var, fbkVar);
            }
        } else {
            dj1Var = new dj1(ej1Var, fbkVar);
        }
        Object objM96567o = dj1Var.f49523d;
        int i2 = dj1Var.f49525f;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM82518k = ej1Var.f60103e.m82518k(ej1Var.f60102d.f243453a, str2, Collections.singletonList(str), z);
                dj1Var.f49520a = lwfVar;
                dj1Var.f49521b = str;
                dj1Var.f49522c = (qe70) eh00Var;
                dj1Var.f49525f = 1;
                objM96567o = zn91.m96567o(singleM82518k, dj1Var);
                yuk yukVar = yuk.f276404a;
                eh00Var = eh00Var;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eh00 eh00Var2 = (eh00) dj1Var.f49522c;
                str = dj1Var.f49521b;
                lwfVar = dj1Var.f49520a;
                bga.m29073P(objM96567o);
                eh00Var = eh00Var2;
            }
            c6x0Var = (m93) objM96567o;
            r14 = eh00Var;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
            r14 = eh00Var;
        }
        String str3 = str;
        boolean z2 = c6x0Var instanceof c6x0;
        if (!z2) {
            if (z2) {
                c6x0Var = null;
            }
            m93 m93Var = (m93) c6x0Var;
            if (m93Var instanceof j93) {
                r14.invoke();
                siyVar.m78245a(2, Collections.singletonMap("itemUri", str3));
            } else if (m93Var instanceof k93) {
                yfd1.m93554f(ej1Var.f60101c, lwfVar.f137561e, "add_to_collection_button", str3, null, new cj1(false, str3, 0), 8);
                siyVar.m78245a(3, Collections.singletonMap("itemUri", str3));
            } else if (m93Var instanceof l93) {
                yfd1.m93554f(ej1Var.f60101c, lwfVar.f137561e, "add_to_collection_button", str3, null, fg1.f69141M0, 8);
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kxf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void mo24313a(xi1 xi1Var, lwf lwfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        Observable map;
        Object c2406ta;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1269525862);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(xi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(lwfVar) : xq00Var.m91770i(lwfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            String str = xi1Var.f261741a;
            Set set = dd41.f47702f;
            if (r46.m74708A(str, gn80.PRERELEASE)) {
                map = this.f60100b.m76738b(str);
            } else {
                map = z5f.m95457d(this.f60099a, "", new String[]{str}).map(new r0e1(8, this, str));
                wj50.m88279p(map);
            }
            kqi0 kqi0VarM77670i = sam.m77670i(k0e1.m54985d(map.onErrorComplete().distinctUntilChanged()), Boolean.FALSE, null, xq00Var, 48, 2);
            boolean zM91768h = xq00Var.m91768h(((Boolean) kqi0VarM77670i.getValue()).booleanValue());
            Object objM91750T = xq00Var.m91750T();
            if (zM91768h || objM91750T == obj) {
                objM91750T = new pi1(((Boolean) kqi0VarM77670i.getValue()).booleanValue() ? qi1.f188893b : qi1.f188892a, true, null, null, ti1.f220528b, 12);
                xq00Var.m91793t0(objM91750T);
            }
            pi1 pi1Var = (pi1) objM91750T;
            boolean zM91770i = xq00Var.m91770i(this);
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            int i4 = i2 & 14;
            boolean zM91766g = zM91770i | (i3 == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(lwfVar))) | xq00Var.m91766g(kqi0VarM77670i) | (i4 == 4);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                c2406ta = new C2406ta(this, lwfVar, xi1Var, kqi0VarM77670i, 5);
                xq00Var.m91793t0(c2406ta);
            } else {
                c2406ta = objM91750T2;
            }
            gbm.m44243e(xi1Var, lwfVar, (gh00) c2406ta, xq00Var, i4 | 64 | i3);
            boolean zM91770i2 = xq00Var.m91770i(this) | (i3 == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(lwfVar))) | (i4 == 4) | xq00Var.m91766g(kqi0VarM77670i);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                Object x60Var = new x60(this, lwfVar, xi1Var, kqi0VarM77670i, 1);
                xq00Var.m91793t0(x60Var);
                objM91750T3 = x60Var;
            }
            bxg1.m30824a(pi1Var, new peu(u40.f226523c, (eh00) objM91750T3), mi21.m61834r(56, fxh0Var), null, null, xq00Var, 0, 24);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1816ej(this, xi1Var, lwfVar, fxh0Var, i, 7);
        }
    }
}
