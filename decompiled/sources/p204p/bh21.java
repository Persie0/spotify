package p204p;

import androidx.datastore.core.CorruptionException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class bh21 implements wko {

    /* JADX INFO: renamed from: j */
    public static final LinkedHashSet f27056j = new LinkedHashSet();

    /* JADX INFO: renamed from: k */
    public static final Object f27057k = new Object();

    /* JADX INFO: renamed from: a */
    public final qe70 f27058a;

    /* JADX INFO: renamed from: b */
    public final guz0 f27059b;

    /* JADX INFO: renamed from: c */
    public final evk f27060c;

    /* JADX INFO: renamed from: d */
    public final nzx0 f27061d;

    /* JADX INFO: renamed from: e */
    public final String f27062e = ".tmp";

    /* JADX INFO: renamed from: f */
    public final wg61 f27063f = new wg61(new cy11(this, 8));

    /* JADX INFO: renamed from: g */
    public final zv41 f27064g = jag1.m52819d(vy91.f246028a);

    /* JADX INFO: renamed from: h */
    public List f27065h;

    /* JADX INFO: renamed from: i */
    public final bwt0 f27066i;

    /* JADX WARN: Multi-variable type inference failed */
    public bh21(eh00 eh00Var, guz0 guz0Var, List list, evk evkVar, c9k c9kVar) {
        this.f27058a = (qe70) eh00Var;
        this.f27059b = guz0Var;
        this.f27060c = evkVar;
        fbk fbkVar = null;
        this.f27061d = nxf1.m65833l(new o8t0(this, fbkVar, 5));
        this.f27065h = g6f.m43728j1(list);
        this.f27066i = new bwt0(c9kVar, new o611(this, 26), new vx01(this, fbkVar, 16));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r8 == r5) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.bh21] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [p.bh21] */
    /* JADX WARN: Type inference failed for: r8v9, types: [p.fuf] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m29189b(bh21 bh21Var, ng21 ng21Var, ibk ibkVar) {
        rg21 rg21Var;
        guf gufVar;
        ?? r8;
        Object objM29197i;
        ?? r9;
        if (ibkVar instanceof rg21) {
            rg21Var = (rg21) ibkVar;
            int i = rg21Var.f198808f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg21Var.f198808f = i - Integer.MIN_VALUE;
            } else {
                rg21Var = new rg21(bh21Var, ibkVar);
            }
        } else {
            rg21Var = new rg21(bh21Var, ibkVar);
        }
        Object c6x0Var = rg21Var.f198806d;
        int i2 = rg21Var.f198808f;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            try {
                if (i2 != 1) {
                    if (i2 == 2) {
                        guf gufVar2 = rg21Var.f198805c;
                        bh21 bh21Var2 = rg21Var.f198804b;
                        ng21 ng21Var2 = (ng21) rg21Var.f198803a;
                        bga.m29073P(c6x0Var);
                        gufVar = gufVar2;
                        r8 = bh21Var2;
                        ng21Var = ng21Var2;
                        r8 = bh21Var;
                        th00 th00Var = ng21Var.f153535a;
                        juk jukVar = ng21Var.f153538d;
                        rg21Var.f198803a = gufVar;
                        rg21Var.f198804b = null;
                        rg21Var.f198805c = null;
                        rg21Var.f198808f = 3;
                        objM29197i = r8.m29197i(th00Var, jukVar, rg21Var);
                    } else if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                fuf fufVar = (fuf) rg21Var.f198803a;
                bga.m29073P(c6x0Var);
                r9 = fufVar;
            } catch (Throwable th) {
                th = th;
                c6x0Var = new c6x0(th);
                r9 = bh21Var;
            }
        } else {
            bga.m29073P(c6x0Var);
            gufVar = ng21Var.f153536b;
            try {
                kv41 kv41Var = (kv41) bh21Var.f27064g.getValue();
                if (kv41Var instanceof zco) {
                    th00 th00Var2 = ng21Var.f153535a;
                    juk jukVar2 = ng21Var.f153538d;
                    rg21Var.f198803a = gufVar;
                    rg21Var.f198808f = 1;
                    objM29197i = bh21Var.m29197i(th00Var2, jukVar2, rg21Var);
                    if (objM29197i == yukVar) {
                    }
                    guf gufVar3 = gufVar;
                    c6x0Var = objM29197i;
                    r9 = gufVar3;
                } else {
                    if (!(kv41Var instanceof gqu0)) {
                        z = kv41Var instanceof vy91;
                    }
                    if (!z) {
                        if (kv41Var instanceof m7z) {
                            throw ((m7z) kv41Var).f140876a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (kv41Var != ng21Var.f153537c) {
                        throw ((gqu0) kv41Var).f83533a;
                    }
                    rg21Var.f198803a = ng21Var;
                    rg21Var.f198804b = bh21Var;
                    rg21Var.f198805c = gufVar;
                    rg21Var.f198808f = 2;
                    if (bh21Var.m29193e(rg21Var) == yukVar) {
                        r8 = bh21Var;
                    } else {
                        r8 = bh21Var;
                        th00 th00Var3 = ng21Var.f153535a;
                        juk jukVar3 = ng21Var.f153538d;
                        rg21Var.f198803a = gufVar;
                        rg21Var.f198804b = null;
                        rg21Var.f198805c = null;
                        rg21Var.f198808f = 3;
                        objM29197i = r8.m29197i(th00Var3, jukVar3, rg21Var);
                    }
                }
                return yukVar;
            } catch (Throwable th2) {
                th = th2;
                bh21Var = gufVar;
                c6x0Var = new c6x0(th);
                r9 = bh21Var;
            }
        }
        mlg1.m62225r(r9, c6x0Var);
        return w2a1.f247311a;
    }

    @Override // p204p.wko
    /* JADX INFO: renamed from: a */
    public final Object mo29190a(th00 th00Var, fbk fbkVar) throws Throwable {
        guf gufVarM62210c = mlg1.m62210c();
        this.f27066i.m30708C(new ng21(th00Var, gufVarM62210c, (kv41) this.f27064g.getValue(), fbkVar.getContext()));
        return gufVarM62210c.m38777P(fbkVar);
    }

    /* JADX INFO: renamed from: c */
    public final File m29191c() {
        return (File) this.f27063f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cd->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m29192d(ibk ibkVar) throws CorruptionException, FileNotFoundException {
        sg21 sg21Var;
        jsi0 jsi0VarM62770a;
        rlv0 rlv0Var;
        bh21 bh21Var;
        rlv0 rlv0Var2;
        bh21 bh21Var2;
        rlv0 rlv0Var3;
        ug21 ug21Var;
        Iterator it;
        jsi0 jsi0Var;
        nlv0 nlv0Var;
        rlv0 rlv0Var4;
        jsi0 jsi0Var2;
        bh21 bh21Var3;
        nlv0 nlv0Var2;
        th00 th00Var;
        Object obj;
        int iHashCode;
        if (ibkVar instanceof sg21) {
            sg21Var = (sg21) ibkVar;
            int i = sg21Var.f208696i;
            if ((i & Integer.MIN_VALUE) != 0) {
                sg21Var.f208696i = i - Integer.MIN_VALUE;
            } else {
                sg21Var = new sg21(this, ibkVar);
            }
        } else {
            sg21Var = new sg21(this, ibkVar);
        }
        Object objM29196h = sg21Var.f208694g;
        int i2 = sg21Var.f208696i;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM29196h);
            zv41 zv41Var = this.f27064g;
            if (!wj50.m88271j(zv41Var.getValue(), vy91.f246028a) && !(zv41Var.getValue() instanceof gqu0)) {
                throw new IllegalStateException("Check failed.");
            }
            jsi0VarM62770a = msi0.m62770a();
            rlv0Var = new rlv0();
            sg21Var.f208688a = this;
            sg21Var.f208689b = jsi0VarM62770a;
            sg21Var.f208690c = rlv0Var;
            sg21Var.f208691d = rlv0Var;
            sg21Var.f208696i = 1;
            objM29196h = m29196h(sg21Var);
            if (objM29196h != yukVar) {
                bh21Var = this;
                rlv0Var2 = rlv0Var;
            }
            return yukVar;
        }
        if (i2 == 1) {
            rlv0Var = (rlv0) sg21Var.f208691d;
            rlv0Var2 = (rlv0) sg21Var.f208690c;
            jsi0VarM62770a = (jsi0) sg21Var.f208689b;
            bh21Var = sg21Var.f208688a;
            bga.m29073P(objM29196h);
        } else {
            if (i2 == 2) {
                it = sg21Var.f208693f;
                ug21Var = sg21Var.f208692e;
                nlv0Var = (nlv0) sg21Var.f208691d;
                rlv0Var3 = (rlv0) sg21Var.f208690c;
                jsi0Var = (jsi0) sg21Var.f208689b;
                bh21Var2 = sg21Var.f208688a;
                bga.m29073P(objM29196h);
                while (it.hasNext()) {
                    th00Var = (th00) it.next();
                    sg21Var.f208688a = bh21Var2;
                    sg21Var.f208689b = jsi0Var;
                    sg21Var.f208690c = rlv0Var3;
                    sg21Var.f208691d = nlv0Var;
                    sg21Var.f208692e = ug21Var;
                    sg21Var.f208693f = it;
                    sg21Var.f208696i = 2;
                    if (th00Var.invoke(ug21Var, sg21Var) == yukVar) {
                        return yukVar;
                    }
                }
                rlv0Var4 = rlv0Var3;
                jsi0Var2 = jsi0Var;
                bh21Var3 = bh21Var2;
                bh21Var3.f27065h = null;
                sg21Var.f208688a = bh21Var3;
                sg21Var.f208689b = rlv0Var4;
                sg21Var.f208690c = nlv0Var;
                sg21Var.f208691d = jsi0Var2;
                sg21Var.f208692e = null;
                sg21Var.f208693f = null;
                sg21Var.f208696i = 3;
                if (jsi0Var2.mo54248a(sg21Var) != yukVar) {
                    nlv0Var2 = nlv0Var;
                }
                return yukVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jsi0Var2 = (jsi0) sg21Var.f208691d;
            nlv0Var2 = (nlv0) sg21Var.f208690c;
            rlv0Var4 = (rlv0) sg21Var.f208689b;
            bh21Var3 = sg21Var.f208688a;
            bga.m29073P(objM29196h);
        }
        try {
            nlv0Var2.f155174a = true;
            jsi0Var2.mo54249c(null);
            zv41 zv41Var2 = bh21Var3.f27064g;
            obj = rlv0Var4.f200373a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            zco zcoVar = new zco(obj, iHashCode);
            zv41Var2.getClass();
            zv41Var2.m97091m(null, zcoVar);
            return w2a1.f247311a;
        } catch (Throwable th) {
            jsi0Var2.mo54249c(null);
            throw th;
        }
        rlv0Var.f200373a = objM29196h;
        nlv0 nlv0Var3 = new nlv0();
        ug21 ug21Var2 = new ug21(jsi0VarM62770a, nlv0Var3, rlv0Var2, bh21Var);
        List list = bh21Var.f27065h;
        if (list == null) {
            rlv0Var4 = rlv0Var2;
            jsi0Var2 = jsi0VarM62770a;
            nlv0Var = nlv0Var3;
            bh21Var3 = bh21Var;
        } else {
            bh21Var2 = bh21Var;
            rlv0Var3 = rlv0Var2;
            ug21Var = ug21Var2;
            it = list.iterator();
            jsi0Var = jsi0VarM62770a;
            nlv0Var = nlv0Var3;
            while (it.hasNext()) {
                th00Var = (th00) it.next();
                sg21Var.f208688a = bh21Var2;
                sg21Var.f208689b = jsi0Var;
                sg21Var.f208690c = rlv0Var3;
                sg21Var.f208691d = nlv0Var;
                sg21Var.f208692e = ug21Var;
                sg21Var.f208693f = it;
                sg21Var.f208696i = 2;
                if (th00Var.invoke(ug21Var, sg21Var) == yukVar) {
                    return yukVar;
                }
            }
            rlv0Var4 = rlv0Var3;
            jsi0Var2 = jsi0Var;
            bh21Var3 = bh21Var2;
        }
        bh21Var3.f27065h = null;
        sg21Var.f208688a = bh21Var3;
        sg21Var.f208689b = rlv0Var4;
        sg21Var.f208690c = nlv0Var;
        sg21Var.f208691d = jsi0Var2;
        sg21Var.f208692e = null;
        sg21Var.f208693f = null;
        sg21Var.f208696i = 3;
        if (jsi0Var2.mo54248a(sg21Var) != yukVar) {
            nlv0Var2 = nlv0Var;
            nlv0Var2.f155174a = true;
            jsi0Var2.mo54249c(null);
            zv41 zv41Var3 = bh21Var3.f27064g;
            obj = rlv0Var4.f200373a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            zco zcoVar2 = new zco(obj, iHashCode);
            zv41Var3.getClass();
            zv41Var3.m97091m(null, zcoVar2);
            return w2a1.f247311a;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m29193e(ibk ibkVar) throws Throwable {
        vg21 vg21Var;
        bh21 bh21Var;
        if (ibkVar instanceof vg21) {
            vg21Var = (vg21) ibkVar;
            int i = vg21Var.f241102d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg21Var.f241102d = i - Integer.MIN_VALUE;
            } else {
                vg21Var = new vg21(this, ibkVar);
            }
        } else {
            vg21Var = new vg21(this, ibkVar);
        }
        Object obj = vg21Var.f241100b;
        int i2 = vg21Var.f241102d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bh21Var = vg21Var.f241099a;
            try {
                bga.m29073P(obj);
                return w2a1.f247311a;
            } catch (Throwable th) {
                th = th;
                zv41 zv41Var = bh21Var.f27064g;
                gqu0 gqu0Var = new gqu0(th);
                zv41Var.getClass();
                zv41Var.m97091m(null, gqu0Var);
                throw th;
            }
        }
        bga.m29073P(obj);
        try {
            vg21Var.f241099a = this;
            vg21Var.f241102d = 1;
            Object objM29192d = m29192d(vg21Var);
            yuk yukVar = yuk.f276404a;
            if (objM29192d == yukVar) {
                return yukVar;
            }
            return w2a1.f247311a;
        } catch (Throwable th2) {
            th = th2;
            bh21Var = this;
            zv41 zv41Var2 = bh21Var.f27064g;
            gqu0 gqu0Var2 = new gqu0(th);
            zv41Var2.getClass();
            zv41Var2.m97091m(null, gqu0Var2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m29194f(ibk ibkVar) {
        wg21 wg21Var;
        bh21 bh21Var;
        if (ibkVar instanceof wg21) {
            wg21Var = (wg21) ibkVar;
            int i = wg21Var.f250953d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg21Var.f250953d = i - Integer.MIN_VALUE;
            } else {
                wg21Var = new wg21(this, ibkVar);
            }
        } else {
            wg21Var = new wg21(this, ibkVar);
        }
        Object obj = wg21Var.f250951b;
        int i2 = wg21Var.f250953d;
        if (i2 == 0) {
            bga.m29073P(obj);
            try {
                wg21Var.f250950a = this;
                wg21Var.f250953d = 1;
                Object objM29192d = m29192d(wg21Var);
                yuk yukVar = yuk.f276404a;
                if (objM29192d == yukVar) {
                    return yukVar;
                }
            } catch (Throwable th) {
                th = th;
                bh21Var = this;
                zv41 zv41Var = bh21Var.f27064g;
                gqu0 gqu0Var = new gqu0(th);
                zv41Var.getClass();
                zv41Var.m97091m(null, gqu0Var);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bh21Var = wg21Var.f250950a;
            try {
                bga.m29073P(obj);
            } catch (Throwable th2) {
                th = th2;
                zv41 zv41Var2 = bh21Var.f27064g;
                gqu0 gqu0Var2 = new gqu0(th);
                zv41Var2.getClass();
                zv41Var2.m97091m(null, gqu0Var2);
            }
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [p.bh21] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.xg21] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.bh21] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: g */
    public final Object m29195g(ibk ibkVar) throws FileNotFoundException {
        ?? xg21Var;
        FileInputStream fileInputStream;
        if (ibkVar instanceof xg21) {
            xg21 xg21Var2 = (xg21) ibkVar;
            int i = xg21Var2.f261188e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg21Var2.f261188e = i - Integer.MIN_VALUE;
                xg21Var = xg21Var2;
            } else {
                xg21Var = new xg21(this, ibkVar);
            }
        } else {
            xg21Var = new xg21(this, ibkVar);
        }
        Object objMo30660d = xg21Var.f261186c;
        int i2 = xg21Var.f261188e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = xg21Var.f261185b;
                xg21Var = xg21Var.f261184a;
                try {
                    bga.m29073P(objMo30660d);
                    n0e1.m63430g(fileInputStream, null);
                    return objMo30660d;
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            bga.m29073P(objMo30660d);
            try {
                fileInputStream = new FileInputStream(m29191c());
                try {
                    guz0 guz0Var = this.f27059b;
                    xg21Var.f261184a = this;
                    xg21Var.f261185b = fileInputStream;
                    xg21Var.f261188e = 1;
                    objMo30660d = guz0Var.mo30660d(fileInputStream);
                    yuk yukVar = yuk.f276404a;
                    if (objMo30660d == yukVar) {
                        return yukVar;
                    }
                    n0e1.m63430g(fileInputStream, null);
                    return objMo30660d;
                } catch (Throwable th3) {
                    th = th3;
                    xg21Var = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                xg21Var = this;
                if (xg21Var.m29191c().exists()) {
                    throw e;
                }
                return xg21Var.f27059b.mo30659a();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    @Override // p204p.wko
    public final fiz getData() {
        return this.f27061d;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m29196h(ibk ibkVar) throws CorruptionException, FileNotFoundException {
        yg21 yg21Var;
        bh21 bh21Var;
        Object objMo40110c;
        CorruptionException corruptionException;
        bh21 bh21Var2;
        CorruptionException corruptionException2;
        if (ibkVar instanceof yg21) {
            yg21Var = (yg21) ibkVar;
            int i = yg21Var.f272459e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg21Var.f272459e = i - Integer.MIN_VALUE;
            } else {
                yg21Var = new yg21(this, ibkVar);
            }
        } else {
            yg21Var = new yg21(this, ibkVar);
        }
        Object obj = yg21Var.f272457c;
        int i2 = yg21Var.f272459e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            try {
                yg21Var.f272455a = this;
                yg21Var.f272459e = 1;
                Object objM29195g = m29195g(yg21Var);
                if (objM29195g == yukVar) {
                    return yukVar;
                }
                return objM29195g;
            } catch (CorruptionException e) {
                e = e;
                bh21Var = this;
                evk evkVar = bh21Var.f27060c;
                yg21Var.f272455a = bh21Var;
                yg21Var.f272456b = e;
                yg21Var.f272459e = 2;
                objMo40110c = evkVar.mo40110c(e);
                if (objMo40110c != yukVar) {
                    bh21 bh21Var3 = bh21Var;
                    corruptionException = e;
                    obj = objMo40110c;
                    bh21Var2 = bh21Var3;
                    yg21Var.f272455a = corruptionException;
                    yg21Var.f272456b = obj;
                    yg21Var.f272459e = 3;
                    if (bh21Var2.m29198j(obj, yg21Var) == yukVar) {
                        return obj;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    corruptionException = (CorruptionException) yg21Var.f272456b;
                    bh21Var2 = (bh21) yg21Var.f272455a;
                    bga.m29073P(obj);
                    try {
                        yg21Var.f272455a = corruptionException;
                        yg21Var.f272456b = obj;
                        yg21Var.f272459e = 3;
                        if (bh21Var2.m29198j(obj, yg21Var) == yukVar) {
                            return yukVar;
                        }
                        return obj;
                    } catch (IOException e2) {
                        e = e2;
                        corruptionException2 = corruptionException;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = yg21Var.f272456b;
                    corruptionException2 = (CorruptionException) yg21Var.f272455a;
                    try {
                        bga.m29073P(obj);
                        return obj2;
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                y85.m93061f(corruptionException2, e);
                throw corruptionException2;
            }
            bh21Var = (bh21) yg21Var.f272455a;
            try {
                bga.m29073P(obj);
                return obj;
            } catch (CorruptionException e4) {
                e = e4;
            }
        }
        evk evkVar2 = bh21Var.f27060c;
        yg21Var.f272455a = bh21Var;
        yg21Var.f272456b = e;
        yg21Var.f272459e = 2;
        objMo40110c = evkVar2.mo40110c(e);
        if (objMo40110c != yukVar) {
            bh21 bh21Var4 = bh21Var;
            corruptionException = e;
            obj = objMo40110c;
            bh21Var2 = bh21Var4;
            yg21Var.f272455a = corruptionException;
            yg21Var.f272456b = obj;
            yg21Var.f272459e = 3;
            if (bh21Var2.m29198j(obj, yg21Var) == yukVar) {
                return obj;
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m29197i(th00 th00Var, juk jukVar, ibk ibkVar) throws Throwable {
        zg21 zg21Var;
        zco zcoVar;
        Object obj;
        bh21 bh21Var;
        Object obj2;
        bh21 bh21Var2;
        if (ibkVar instanceof zg21) {
            zg21Var = (zg21) ibkVar;
            int i = zg21Var.f282472f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zg21Var.f282472f = i - Integer.MIN_VALUE;
            } else {
                zg21Var = new zg21(this, ibkVar);
            }
        } else {
            zg21Var = new zg21(this, ibkVar);
        }
        Object obj3 = zg21Var.f282470d;
        int i2 = zg21Var.f282472f;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = zg21Var.f282469c;
                zcoVar = (zco) zg21Var.f282468b;
                bh21Var = zg21Var.f282467a;
                bga.m29073P(obj3);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = zg21Var.f282468b;
                bh21Var2 = zg21Var.f282467a;
                bga.m29073P(obj3);
            }
            zv41 zv41Var = bh21Var2.f27064g;
            zco zcoVar2 = new zco(obj2, obj2 != null ? obj2.hashCode() : 0);
            zv41Var.getClass();
            zv41Var.m97091m(null, zcoVar2);
            return obj2;
        }
        bga.m29073P(obj3);
        zco zcoVar3 = (zco) this.f27064g.getValue();
        Object obj4 = zcoVar3.f281552a;
        if ((obj4 != null ? obj4.hashCode() : 0) != zcoVar3.f281553b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        Object obj5 = zcoVar3.f281552a;
        uc80 uc80Var = new uc80(obj5, (fbk) null, th00Var);
        zg21Var.f282467a = this;
        zg21Var.f282468b = zcoVar3;
        zg21Var.f282469c = obj5;
        zg21Var.f282472f = 1;
        Object objM89557A = x0h1.m89557A(jukVar, uc80Var, zg21Var);
        if (objM89557A != yukVar) {
            zcoVar = zcoVar3;
            obj3 = objM89557A;
            obj = obj5;
            bh21Var = this;
        }
        return yukVar;
        Object obj6 = zcoVar.f281552a;
        if ((obj6 != null ? obj6.hashCode() : 0) != zcoVar.f281553b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (wj50.m88271j(obj, obj3)) {
            return obj;
        }
        zg21Var.f282467a = bh21Var;
        zg21Var.f282468b = obj3;
        zg21Var.f282469c = null;
        zg21Var.f282472f = 2;
        if (bh21Var.m29198j(obj3, zg21Var) != yukVar) {
            obj2 = obj3;
            bh21Var2 = bh21Var;
            zv41 zv41Var2 = bh21Var2.f27064g;
            zco zcoVar4 = new zco(obj2, obj2 != null ? obj2.hashCode() : 0);
            zv41Var2.getClass();
            zv41Var2.m97091m(null, zcoVar4);
            return obj2;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: j */
    public final Object m29198j(Object obj, ibk ibkVar) throws IOException {
        ah21 ah21Var;
        ?? file;
        FileOutputStream fileOutputStream;
        bh21 bh21Var;
        FileOutputStream fileOutputStream2;
        if (ibkVar instanceof ah21) {
            ah21Var = (ah21) ibkVar;
            int i = ah21Var.f15588g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ah21Var.f15588g = i - Integer.MIN_VALUE;
            } else {
                ah21Var = new ah21(this, ibkVar);
            }
        } else {
            ah21Var = new ah21(this, ibkVar);
        }
        Object obj2 = ah21Var.f15586e;
        int i2 = ah21Var.f15588g;
        w2a1 w2a1Var = w2a1.f247311a;
        ?? r4 = 1;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                File fileM29191c = m29191c();
                File parentFile = fileM29191c.getCanonicalFile().getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    if (!parentFile.isDirectory()) {
                        throw new IOException(wj50.m88258c0(fileM29191c, "Unable to create parent directories of "));
                    }
                }
                file = new File(wj50.m88258c0(this.f27062e, m29191c().getAbsolutePath()));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        guz0 guz0Var = this.f27059b;
                        pg21 pg21Var = new pg21(fileOutputStream);
                        ah21Var.f15582a = this;
                        ah21Var.f15583b = file;
                        ah21Var.f15584c = fileOutputStream;
                        ah21Var.f15585d = fileOutputStream;
                        ah21Var.f15588g = 1;
                        guz0Var.mo30661e(obj, pg21Var);
                        yuk yukVar = yuk.f276404a;
                        if (w2a1Var == yukVar) {
                            return yukVar;
                        }
                        bh21Var = this;
                        r4 = file;
                        fileOutputStream2 = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        r4 = file;
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream2 = ah21Var.f15585d;
                fileOutputStream = ah21Var.f15584c;
                r4 = ah21Var.f15583b;
                bh21Var = ah21Var.f15582a;
                try {
                    bga.m29073P(obj2);
                    r4 = r4;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        n0e1.m63430g(fileOutputStream, th);
                        throw th3;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            n0e1.m63430g(fileOutputStream, null);
            if (r4.renameTo(bh21Var.m29191c())) {
                return w2a1Var;
            }
            throw new IOException("Unable to rename " + r4 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e2) {
            e = e2;
            file = r4;
        }
    }
}
