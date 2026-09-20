package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class h7p implements rte0 {

    /* JADX INFO: renamed from: a */
    public final er70 f88495a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f88496b;

    /* JADX INFO: renamed from: c */
    public final y7q f88497c;

    /* JADX INFO: renamed from: d */
    public final z7q f88498d;

    /* JADX INFO: renamed from: e */
    public final luk f88499e;

    /* JADX INFO: renamed from: f */
    public final c9k f88500f;

    /* JADX INFO: renamed from: g */
    public final zv41 f88501g;

    /* JADX INFO: renamed from: h */
    public final nuu0 f88502h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f88503i;

    /* JADX INFO: renamed from: j */
    public final lsi0 f88504j;

    /* JADX INFO: renamed from: k */
    public final nuu0 f88505k;

    public h7p(er70 er70Var, ihm ihmVar, y7q y7qVar, z7q z7qVar, luk lukVar) {
        this.f88495a = er70Var;
        this.f88496b = ihmVar;
        this.f88497c = y7qVar;
        this.f88498d = z7qVar;
        this.f88499e = lukVar;
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), lukVar));
        this.f88500f = c9kVarM56661c;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f88501g = zv41VarM52819d;
        nuu0 nuu0VarM31021m = bzf1.m31021m(zv41VarM52819d);
        this.f88502h = nuu0VarM31021m;
        this.f88503i = new LinkedHashMap();
        this.f88504j = msi0.m62770a();
        x0h1.m89578u(c9kVarM56661c, null, 0, new xuo(this, null, 7), 3);
        this.f88505k = bzf1.m31029u(new gq0(nuu0VarM31021m, 1), c9kVarM56661c, hf11.m47320a(2, 0L), null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: a */
    public static final Object m46776a(h7p h7pVar, x7q x7qVar, tvi tviVar, mvi mviVar, Long l, ase0 ase0Var, ibk ibkVar) throws Throwable {
        b7p b7pVar;
        d0r0 d0r0Var;
        tvi tviVar2;
        Long l2;
        mvi mviVar2;
        Object next;
        fw21 fw21Var;
        Long l3;
        mvi mviVar3;
        tvi tviVar3;
        x7q x7qVar2;
        d0r0 d0r0Var2;
        boolean zBooleanValue;
        boolean z;
        d0r0 d0r0Var3;
        Long l4;
        fw21 fw21Var2;
        tvi tviVar4;
        x7q x7qVar3;
        fw21 fw21Var3;
        tvi tviVar5;
        mvi mviVar4;
        x7q x7qVar4;
        hw21 hw21VarM43398c;
        x7q x7qVar5 = x7qVar;
        zv41 zv41Var = h7pVar.f88501g;
        z7q z7qVar = h7pVar.f88498d;
        if (ibkVar instanceof b7p) {
            b7pVar = (b7p) ibkVar;
            int i = b7pVar.f24365t;
            if ((i & Integer.MIN_VALUE) != 0) {
                b7pVar.f24365t = i - Integer.MIN_VALUE;
            } else {
                b7pVar = new b7p(h7pVar, ibkVar);
            }
        } else {
            b7pVar = new b7p(h7pVar, ibkVar);
        }
        Object obj = b7pVar.f24363h;
        int i2 = b7pVar.f24365t;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            d0r0Var = new d0r0(ote0.f169048a, ase0Var, new aqh(x7qVar5, fbkVar, 4));
            b7pVar.f24356a = x7qVar5;
            b7pVar.f24357b = tviVar;
            b7pVar.f24358c = mviVar;
            b7pVar.f24359d = l;
            b7pVar.f24360e = d0r0Var;
            b7pVar.f24365t = 1;
            if (x7qVar5.m90166g(b7pVar) != yukVar) {
                tviVar2 = tviVar;
                l2 = l;
                mviVar2 = mviVar;
            }
            return yukVar;
        }
        if (i2 == 1) {
            d0r0 d0r0Var4 = b7pVar.f24360e;
            l2 = b7pVar.f24359d;
            mviVar2 = b7pVar.f24358c;
            tviVar2 = b7pVar.f24357b;
            x7q x7qVar6 = b7pVar.f24356a;
            bga.m29073P(obj);
            d0r0Var = d0r0Var4;
            x7qVar5 = x7qVar6;
        } else {
            if (i2 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 == 3) {
                fw21 fw21Var4 = b7pVar.f24361f;
                d0r0Var2 = b7pVar.f24360e;
                Long l5 = b7pVar.f24359d;
                mvi mviVar5 = b7pVar.f24358c;
                tviVar3 = b7pVar.f24357b;
                x7qVar2 = b7pVar.f24356a;
                bga.m29073P(obj);
                l3 = l5;
                mviVar3 = mviVar5;
                fw21Var = fw21Var4;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue || ((Boolean) z7qVar.m95558a().f158717a.getValue()).booleanValue()) {
                    h7pVar.m46777b(x7qVar2);
                    return w2a1Var;
                }
                ru41 ru41Var = (ru41) zv41Var.getValue();
                x7q x7qVarM76424a = ru41Var != null ? ru41Var.m76424a() : null;
                if (!(x7qVarM76424a instanceof x7q)) {
                    x7qVarM76424a = null;
                }
                if (x7qVarM76424a != null) {
                    b7pVar.f24356a = x7qVar2;
                    b7pVar.f24357b = tviVar3;
                    b7pVar.f24358c = mviVar3;
                    b7pVar.f24359d = l3;
                    b7pVar.f24360e = d0r0Var2;
                    b7pVar.f24361f = fw21Var;
                    b7pVar.f24362g = zBooleanValue;
                    b7pVar.f24365t = 4;
                    if (x7qVarM76424a.m90164e(b7pVar) != yukVar) {
                        fw21Var3 = fw21Var;
                        tviVar5 = tviVar3;
                        x7qVar3 = x7qVar2;
                        z = zBooleanValue;
                        fw21Var2 = fw21Var3;
                        d0r0Var3 = d0r0Var2;
                        l4 = l3;
                        tviVar4 = tviVar5;
                        mviVar4 = mviVar3;
                        b7pVar.f24356a = x7qVar3;
                        b7pVar.f24357b = tviVar4;
                        b7pVar.f24358c = mviVar4;
                        b7pVar.f24359d = l4;
                        b7pVar.f24360e = d0r0Var3;
                        b7pVar.f24361f = fw21Var2;
                        b7pVar.f24362g = z;
                        b7pVar.f24365t = 5;
                        if (x7qVar3.m90165f(b7pVar) != yukVar) {
                            x7qVar4 = x7qVar3;
                        }
                    }
                } else {
                    z = zBooleanValue;
                    d0r0Var3 = d0r0Var2;
                    l4 = l3;
                    fw21Var2 = fw21Var;
                    tviVar4 = tviVar3;
                    x7qVar3 = x7qVar2;
                    mviVar4 = mviVar3;
                    b7pVar.f24356a = x7qVar3;
                    b7pVar.f24357b = tviVar4;
                    b7pVar.f24358c = mviVar4;
                    b7pVar.f24359d = l4;
                    b7pVar.f24360e = d0r0Var3;
                    b7pVar.f24361f = fw21Var2;
                    b7pVar.f24362g = z;
                    b7pVar.f24365t = 5;
                    if (x7qVar3.m90165f(b7pVar) != yukVar) {
                        x7qVar4 = x7qVar3;
                    }
                }
                return yukVar;
            }
            if (i2 == 4) {
                zBooleanValue = b7pVar.f24362g;
                fw21Var3 = b7pVar.f24361f;
                d0r0Var2 = b7pVar.f24360e;
                l3 = b7pVar.f24359d;
                mviVar3 = b7pVar.f24358c;
                tviVar5 = b7pVar.f24357b;
                x7qVar3 = b7pVar.f24356a;
                bga.m29073P(obj);
                z = zBooleanValue;
                fw21Var2 = fw21Var3;
                d0r0Var3 = d0r0Var2;
                l4 = l3;
                tviVar4 = tviVar5;
                mviVar4 = mviVar3;
                b7pVar.f24356a = x7qVar3;
                b7pVar.f24357b = tviVar4;
                b7pVar.f24358c = mviVar4;
                b7pVar.f24359d = l4;
                b7pVar.f24360e = d0r0Var3;
                b7pVar.f24361f = fw21Var2;
                b7pVar.f24362g = z;
                b7pVar.f24365t = 5;
                if (x7qVar3.m90165f(b7pVar) != yukVar) {
                    x7qVar4 = x7qVar3;
                }
                return yukVar;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fw21Var2 = b7pVar.f24361f;
            d0r0Var3 = b7pVar.f24360e;
            l4 = b7pVar.f24359d;
            mviVar4 = b7pVar.f24358c;
            tviVar4 = b7pVar.f24357b;
            x7qVar4 = b7pVar.f24356a;
            bga.m29073P(obj);
        }
        fw21 fw21Var5 = fw21Var2;
        d0r0 d0r0Var5 = d0r0Var3;
        Long l6 = l4;
        mvi mviVar6 = mviVar4;
        if (tviVar4 instanceof svi) {
            hw21VarM43398c = new hw21((dut) h7pVar.f88496b.get(), new mc21((svi) tviVar4, x7qVar4));
        } else {
            if (!(tviVar4 instanceof nvi)) {
                throw new NoWhenBranchMatchedException();
            }
            hw21VarM43398c = ((nvi) tviVar4).m65745a().m43398c(x7qVar4);
        }
        x7q x7qVar7 = x7qVar4;
        ru41 ru41Var2 = new ru41(d0r0Var5, tviVar4, mviVar6, hw21VarM43398c, x7qVar7, x7qVar4.m90161b(), fw21Var5, l6);
        x7qVar7.m90168i(ru41Var2);
        zv41Var.getClass();
        zv41Var.m97091m(null, ru41Var2);
        return w2a1Var;
        if (((Boolean) z7qVar.m95558a().f158717a.getValue()).booleanValue()) {
            b7pVar.f24356a = null;
            b7pVar.f24357b = null;
            b7pVar.f24358c = null;
            b7pVar.f24359d = null;
            b7pVar.f24360e = null;
            b7pVar.f24365t = 2;
            if (x7qVar5.m90164e(b7pVar) != yukVar) {
                return w2a1Var;
            }
        } else {
            Iterator it = h6f.m46715L(fw21.f73923a, fw21.f73924b, fw21.f73925c).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!h7pVar.f88503i.containsKey((fw21) next));
            fw21Var = (fw21) next;
            if (fw21Var == null) {
                Logger.m3966b("No containers attached, smart control cannot be shown", new Object[0]);
                h7pVar.m46777b(x7qVar5);
                return w2a1Var;
            }
            qse0 qse0Var = (qse0) h7pVar.f88495a.get();
            pte0 pte0VarM34553h = d0r0Var.m34553h();
            ase0 ase0VarM34551c = d0r0Var.m34551c();
            b7pVar.f24356a = x7qVar5;
            b7pVar.f24357b = tviVar2;
            b7pVar.f24358c = mviVar2;
            b7pVar.f24359d = l2;
            b7pVar.f24360e = d0r0Var;
            b7pVar.f24361f = fw21Var;
            b7pVar.f24365t = 3;
            Object objM36852d = ((dte0) qse0Var).m36852d(pte0VarM34553h, ase0VarM34551c, b7pVar);
            if (objM36852d != yukVar) {
                l3 = l2;
                mviVar3 = mviVar2;
                tviVar3 = tviVar2;
                x7qVar2 = x7qVar5;
                d0r0Var2 = d0r0Var;
                obj = objM36852d;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                }
                h7pVar.m46777b(x7qVar2);
                return w2a1Var;
            }
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m46777b(x7q x7qVar) {
        x0h1.m89578u(this.f88500f, null, 0, new hj1(this, x7qVar, (fbk) null), 3);
    }

    @Override // p204p.rte0
    /* JADX INFO: renamed from: c */
    public final fiz mo37621c() {
        return new evi(this.f88502h, 29);
    }

    /* JADX INFO: renamed from: d */
    public final x7q m46778d(tvi tviVar, mvi mviVar, Long l) {
        UUID uuidRandomUUID = UUID.randomUUID();
        wj50.m88279p(uuidRandomUUID);
        x7q x7qVar = new x7q(kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), this.f88499e)), new k6i(this), new C2148n1(this), new pek(this, uuidRandomUUID, tviVar, mviVar, 7));
        this.f88497c.m93005a(uuidRandomUUID, 1, tviVar, mviVar);
        x0h1.m89578u(x7qVar.m90162c(), null, 0, new wj0(29, this, x7qVar, tviVar, mviVar, l, (fbk) null), 3);
        return x7qVar;
    }
}
