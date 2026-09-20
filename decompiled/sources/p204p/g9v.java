package p204p;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class g9v implements ic50 {

    /* JADX INFO: renamed from: a */
    public final hvu0 f77881a;

    /* JADX INFO: renamed from: b */
    public final qp4 f77882b;

    /* JADX INFO: renamed from: c */
    public final r0e1 f77883c;

    /* JADX INFO: renamed from: d */
    public final mab0 f77884d;

    public g9v(hvu0 hvu0Var, qp4 qp4Var, r0e1 r0e1Var) {
        this.f77881a = hvu0Var;
        this.f77882b = qp4Var;
        this.f77883c = r0e1Var;
        this.f77884d = new mab0(hvu0Var, r0e1Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[LOOP:0: B:16:0x0052->B:20:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a0 -> B:27:0x00a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m44135b(p204p.g9v r5, p204p.fu31 r6, p204p.cxf r7, p204p.vb40 r8, java.lang.Object r9, p204p.ivl0 r10, p204p.v5x r11, p204p.ibk r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.g9v.m44135b(p.g9v, p.fu31, p.cxf, p.vb40, java.lang.Object, p.ivl0, p.v5x, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        if (r1 == r13) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m44136c(g9v g9vVar, vb40 vb40Var, Object obj, ivl0 ivl0Var, v5x v5xVar, ibk ibkVar) throws Throwable {
        d9v d9vVar;
        fu31 fu31Var;
        vc40 vc40Var;
        rlv0 rlv0Var;
        vb40 vb40Var2;
        Object obj2;
        rlv0 rlv0Var2;
        rlv0 rlv0Var3;
        rlv0 rlv0Var4;
        v5x v5xVar2;
        rlv0 rlv0Var5;
        b9v b9vVar;
        rlv0 rlv0Var6;
        v5x v5xVar3;
        Object obj3;
        fu31 fu31Var2;
        vc40 vc40Var2;
        if (ibkVar instanceof d9v) {
            d9vVar = (d9v) ibkVar;
            int i = d9vVar.f46917t;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9vVar.f46917t = i - Integer.MIN_VALUE;
            } else {
                d9vVar = new d9v(g9vVar, ibkVar);
            }
        } else {
            d9vVar = new d9v(g9vVar, ibkVar);
        }
        d9v d9vVar2 = d9vVar;
        Object objM44138d = d9vVar2.f46915h;
        rlv0 rlv0Var7 = d9vVar2.f46917t;
        Object obj4 = yuk.f276404a;
        try {
            if (rlv0Var7 == 0) {
                rlv0 rlv0VarM36622v = dq60.m36622v(objM44138d);
                rlv0VarM36622v.f200373a = ivl0Var;
                rlv0Var = new rlv0();
                rlv0Var.f200373a = g9vVar.f77881a.f95798d;
                rlv0 rlv0Var8 = new rlv0();
                try {
                    rlv0VarM36622v.f200373a = g9vVar.f77883c.m74388s((ivl0) rlv0VarM36622v.f200373a);
                    vb40Var.getClass();
                    cxf cxfVar = (cxf) rlv0Var.f200373a;
                    ivl0 ivl0Var2 = (ivl0) rlv0VarM36622v.f200373a;
                    d9vVar2.f46908a = vb40Var;
                    d9vVar2.f46909b = obj;
                    d9vVar2.f46910c = v5xVar;
                    d9vVar2.f46911d = rlv0VarM36622v;
                    d9vVar2.f46912e = rlv0Var;
                    d9vVar2.f46913f = rlv0Var8;
                    d9vVar2.f46914g = rlv0Var8;
                    d9vVar2.f46917t = 1;
                    objM44138d = g9vVar.m44138d(cxfVar, vb40Var, obj, ivl0Var2, v5xVar, d9vVar2);
                    if (objM44138d != obj4) {
                        vb40Var2 = vb40Var;
                        obj2 = obj;
                        rlv0Var2 = rlv0VarM36622v;
                        rlv0Var3 = rlv0Var8;
                        rlv0Var4 = rlv0Var3;
                        v5xVar2 = v5xVar;
                    }
                    return obj4;
                } catch (Throwable th) {
                    th = th;
                    rlv0Var7 = rlv0Var8;
                    Object obj5 = rlv0Var7.f200373a;
                    if (obj5 instanceof fu31) {
                    }
                    if (fu31Var != null && (vc40Var = fu31Var.f73394a) != null) {
                        s571.m77255n(vc40Var);
                    }
                    throw th;
                }
            }
            if (rlv0Var7 == 1) {
                rlv0Var3 = d9vVar2.f46914g;
                rlv0Var4 = d9vVar2.f46913f;
                rlv0 rlv0Var9 = d9vVar2.f46912e;
                rlv0 rlv0Var10 = d9vVar2.f46911d;
                v5xVar2 = d9vVar2.f46910c;
                Object obj6 = d9vVar2.f46909b;
                vb40 vb40Var3 = d9vVar2.f46908a;
                try {
                    bga.m29073P(objM44138d);
                    rlv0Var2 = rlv0Var10;
                    obj2 = obj6;
                    rlv0Var = rlv0Var9;
                    vb40Var2 = vb40Var3;
                } catch (Throwable th2) {
                    th = th2;
                    rlv0Var7 = rlv0Var4;
                    Object obj7 = rlv0Var7.f200373a;
                    fu31Var = obj7 instanceof fu31 ? (fu31) obj7 : null;
                    if (fu31Var != null) {
                        try {
                            s571.m77255n(vc40Var);
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } else if (rlv0Var7 == 2) {
                rlv0Var5 = d9vVar2.f46913f;
                rlv0Var6 = d9vVar2.f46911d;
                v5xVar3 = d9vVar2.f46910c;
                vb40Var2 = d9vVar2.f46908a;
                bga.m29073P(objM44138d);
                d9vVar2 = d9vVar2;
                b9vVar = (b9v) objM44138d;
                rlv0Var2 = rlv0Var6;
                v5xVar2 = v5xVar3;
                obj3 = rlv0Var5.f200373a;
                if (obj3 instanceof fu31) {
                    fu31Var2 = (fu31) obj3;
                } else {
                    fu31Var2 = null;
                }
                if (fu31Var2 != null && (vc40Var2 = fu31Var2.f73394a) != null) {
                    try {
                        s571.m77255n(vc40Var2);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                ivl0 ivl0Var3 = (ivl0) rlv0Var2.f200373a;
                d9vVar2.f46908a = null;
                d9vVar2.f46909b = null;
                d9vVar2.f46910c = null;
                d9vVar2.f46911d = null;
                d9vVar2.f46912e = null;
                d9vVar2.f46913f = null;
                d9vVar2.f46914g = null;
                d9vVar2.f46917t = 3;
                objM44138d = q0f1.m71827T(b9vVar, vb40Var2, ivl0Var3, v5xVar2, d9vVar2);
            } else {
                if (rlv0Var7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM44138d);
            }
            b9v b9vVar2 = (b9v) objM44138d;
            p340 p340Var = b9vVar2.f25004a;
            Bitmap.Config[] configArr = h1b1.f86551a;
            if (p340Var instanceof rh9) {
                ((rh9) p340Var).f199177a.prepareToDraw();
            }
            return b9vVar2;
            rlv0Var3.f200373a = objM44138d;
            Object obj8 = rlv0Var4.f200373a;
            rsy rsyVar = (rsy) obj8;
            if (rsyVar instanceof fu31) {
                juk jukVar = vb40Var2.f239407i;
                rlv0Var5 = rlv0Var4;
                nm0 nm0Var = new nm0(g9vVar, rlv0Var5, rlv0Var, vb40Var2, obj2, rlv0Var2, v5xVar2, null, 11);
                d9vVar2.f46908a = vb40Var2;
                d9vVar2.f46909b = null;
                d9vVar2.f46910c = v5xVar2;
                d9vVar2.f46911d = rlv0Var2;
                d9vVar2.f46912e = null;
                d9vVar2.f46913f = rlv0Var5;
                d9vVar2.f46914g = null;
                d9vVar2.f46917t = 2;
                objM44138d = x0h1.m89557A(jukVar, nm0Var, d9vVar2);
                if (objM44138d != obj4) {
                    rlv0Var6 = rlv0Var2;
                    v5xVar3 = v5xVar2;
                    b9vVar = (b9v) objM44138d;
                    rlv0Var2 = rlv0Var6;
                    v5xVar2 = v5xVar3;
                    obj3 = rlv0Var5.f200373a;
                    if (obj3 instanceof fu31) {
                        fu31Var2 = (fu31) obj3;
                    } else {
                        fu31Var2 = null;
                    }
                    if (fu31Var2 != null) {
                        s571.m77255n(vc40Var2);
                    }
                    ivl0 ivl0Var4 = (ivl0) rlv0Var2.f200373a;
                    d9vVar2.f46908a = null;
                    d9vVar2.f46909b = null;
                    d9vVar2.f46910c = null;
                    d9vVar2.f46911d = null;
                    d9vVar2.f46912e = null;
                    d9vVar2.f46913f = null;
                    d9vVar2.f46914g = null;
                    d9vVar2.f46917t = 3;
                    objM44138d = q0f1.m71827T(b9vVar, vb40Var2, ivl0Var4, v5xVar2, d9vVar2);
                }
            } else {
                rlv0Var5 = rlv0Var4;
                if (!(rsyVar instanceof r540)) {
                    throw new NoWhenBranchMatchedException();
                }
                b9vVar = new b9v(((r540) obj8).m74798b(), ((r540) rlv0Var5.f200373a).m74799c(), ((r540) rlv0Var5.f200373a).m74797a(), null);
                obj3 = rlv0Var5.f200373a;
                if (obj3 instanceof fu31) {
                    fu31Var2 = (fu31) obj3;
                } else {
                    fu31Var2 = null;
                }
                if (fu31Var2 != null) {
                    s571.m77255n(vc40Var2);
                }
                ivl0 ivl0Var5 = (ivl0) rlv0Var2.f200373a;
                d9vVar2.f46908a = null;
                d9vVar2.f46909b = null;
                d9vVar2.f46910c = null;
                d9vVar2.f46911d = null;
                d9vVar2.f46912e = null;
                d9vVar2.f46913f = null;
                d9vVar2.f46914g = null;
                d9vVar2.f46917t = 3;
                objM44138d = q0f1.m71827T(b9vVar, vb40Var2, ivl0Var5, v5xVar2, d9vVar2);
            }
            return obj4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p204p.ic50
    /* JADX INFO: renamed from: a */
    public final Object mo44137a(lvu0 lvu0Var, fbk fbkVar) throws Throwable {
        f9v f9vVar;
        mja1 mja1VarMo51605a;
        lvu0 lvu0Var2 = lvu0Var;
        mab0 mab0Var = this.f77884d;
        if (fbkVar instanceof f9v) {
            f9vVar = (f9v) fbkVar;
            int i = f9vVar.f67346d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9vVar.f67346d = i - Integer.MIN_VALUE;
            } else {
                f9vVar = new f9v(this, (ibk) fbkVar);
            }
        } else {
            f9vVar = new f9v(this, (ibk) fbkVar);
        }
        f9v f9vVar2 = f9vVar;
        Object obj = f9vVar2.f67344b;
        int i2 = f9vVar2.f67346d;
        if (i2 == 0) {
            bga.m29073P(obj);
            try {
                vb40 vb40Var = lvu0Var2.f137396d;
                Object obj2 = vb40Var.f239400b;
                ci21 ci21Var = lvu0Var2.f137397e;
                v5x v5xVar = lvu0Var2.f137398f;
                ivl0 ivl0VarM74381l = this.f77883c.m74381l(vb40Var, ci21Var);
                ray0 ray0Var = ivl0VarM74381l.f106234c;
                List list = this.f77881a.f95798d.f43019b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    pqm0 pqm0Var = (pqm0) list.get(i3);
                    rjc0 rjc0Var = (rjc0) pqm0Var.f180350a;
                    if (((up60) pqm0Var.f180351b).mo29118z(obj2) && (mja1VarMo51605a = rjc0Var.mo51605a(obj2, ivl0VarM74381l)) != null) {
                        obj2 = mja1VarMo51605a;
                    }
                }
                pge0 pge0VarM61285q = mab0Var.m61285q(vb40Var, obj2, ivl0VarM74381l, v5xVar);
                qge0 qge0VarM61283o = pge0VarM61285q != null ? mab0Var.m61283o(vb40Var, pge0VarM61285q, ci21Var, ray0Var) : null;
                if (qge0VarM61283o != null) {
                    Map map = qge0VarM61283o.f188455b;
                    p340 p340Var = qge0VarM61283o.f188454a;
                    Object obj3 = map.get("coil#disk_cache_key");
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    Object obj4 = map.get("coil#is_sampled");
                    Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                    return new ny51(p340Var, vb40Var, 1, pge0VarM61285q, str, bool != null ? bool.booleanValue() : false, lvu0Var2.f137399g);
                }
                juk jukVar = vb40Var.f239406h;
                qaf qafVar = new qaf(this, vb40Var, obj2, ivl0VarM74381l, v5xVar, pge0VarM61285q, lvu0Var2, (fbk) null);
                f9vVar2.f67343a = lvu0Var2;
                f9vVar2.f67346d = 1;
                Object objM89557A = x0h1.m89557A(jukVar, qafVar, f9vVar2);
                yuk yukVar = yuk.f276404a;
                return objM89557A == yukVar ? yukVar : objM89557A;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lvu0 lvu0Var3 = f9vVar2.f67343a;
            try {
                bga.m29073P(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lvu0Var2 = lvu0Var3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return xtm0.m92082c(lvu0Var2.f137396d, th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0084 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b1 -> B:29:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m44138d(p204p.cxf r8, p204p.vb40 r9, java.lang.Object r10, p204p.ivl0 r11, p204p.v5x r12, p204p.ibk r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.g9v.m44138d(p.cxf, p.vb40, java.lang.Object, p.ivl0, p.v5x, p.ibk):java.lang.Object");
    }
}
