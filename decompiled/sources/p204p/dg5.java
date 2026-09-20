package p204p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class dg5 {

    /* JADX INFO: renamed from: a */
    public final String f48717a;

    /* JADX INFO: renamed from: b */
    public final bxo f48718b;

    /* JADX INFO: renamed from: c */
    public final cxo f48719c;

    /* JADX INFO: renamed from: d */
    public final c9k f48720d;

    /* JADX INFO: renamed from: e */
    public final zv41 f48721e;

    /* JADX INFO: renamed from: f */
    public di41 f48722f;

    /* JADX INFO: renamed from: g */
    public final nuu0 f48723g;

    public dg5(String str, bxo bxoVar, cxo cxoVar, luk lukVar) {
        this.f48717a = str;
        this.f48718b = bxoVar;
        this.f48719c = cxoVar;
        this.f48720d = AbstractC0000a.m16o(lukVar);
        zv41 zv41VarM52819d = jag1.m52819d(new eg5("", false, null, false, false));
        this.f48721e = zv41VarM52819d;
        this.f48723g = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r11 == r5) goto L25;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m35916a(dg5 dg5Var, rf5 rf5Var, ibk ibkVar) {
        bg5 bg5Var;
        Object value;
        dg5Var.getClass();
        if (ibkVar instanceof bg5) {
            bg5Var = (bg5) ibkVar;
            int i = bg5Var.f26835d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bg5Var.f26835d = i - Integer.MIN_VALUE;
            } else {
                bg5Var = new bg5(dg5Var, ibkVar);
            }
        } else {
            bg5Var = new bg5(dg5Var, ibkVar);
        }
        Object objM35917b = bg5Var.f26833b;
        int i2 = bg5Var.f26835d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM35917b);
            bg5Var.f26832a = rf5Var;
            bg5Var.f26835d = 1;
            objM35917b = dg5Var.m35917b(bg5Var);
            if (objM35917b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            rf5Var = bg5Var.f26832a;
            bga.m29073P(objM35917b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rf5Var = bg5Var.f26832a;
            bga.m29073P(objM35917b);
        }
        zf5 zf5Var = (zf5) objM35917b;
        if (wj50.m88271j(zf5Var, yf5.f272128a)) {
            zv41 zv41Var = dg5Var.f48721e;
            do {
                value = zv41Var.getValue();
            } while (!zv41Var.m97089k(value, eg5.m38772a((eg5) value, null, false, null, true, 15)));
        } else {
            if (!(zf5Var instanceof xf5)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((eg5) dg5Var.f48723g.f158717a.getValue()).f59220c == rf5Var) {
                dg5Var.m35918c(((xf5) zf5Var).f260835a);
            }
        }
        return w2a1Var;
        ef5 ef5Var = (ef5) objM35917b;
        if (ef5Var == null) {
            dg5Var.m35918c(rf5.f198520f);
            return w2a1Var;
        }
        cxo cxoVar = dg5Var.f48719c;
        bg5Var.f26832a = rf5Var;
        bg5Var.f26835d = 2;
        objM35917b = cxoVar.m34323a(ef5Var, bg5Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m35917b(ibk ibkVar) {
        ag5 ag5Var;
        fiz fizVarM92074U;
        if (ibkVar instanceof ag5) {
            ag5Var = (ag5) ibkVar;
            int i = ag5Var.f15285c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag5Var.f15285c = i - Integer.MIN_VALUE;
            } else {
                ag5Var = new ag5(this, ibkVar);
            }
        } else {
            ag5Var = new ag5(this, ibkVar);
        }
        Object objM86757v = ag5Var.f15283a;
        int i2 = ag5Var.f15285c;
        Object obj = null;
        Object[] objArr = 0;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            bxo bxoVar = this.f48718b;
            if (bxoVar.f31930a.isEnabled()) {
                z4n z4nVar = bxoVar.f31931b;
                if (((gfz) z4nVar.f279302b).isEnabled()) {
                    ood0 ood0Var = (ood0) z4nVar.f279303c;
                    fizVarM92074U = xtm0.m92074U((nuu0) ((vbu0) ood0Var.f167567d).f239584b, new C2102lt((fbk) (objArr == true ? 1 : 0), (Object) ood0Var, 10));
                } else {
                    fizVarM92074U = gau.f78095a;
                }
            } else {
                fizVarM92074U = gau.f78095a;
            }
            ag5Var.f15285c = 1;
            objM86757v = vyf1.m86757v(fizVarM92074U, ag5Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        List list = (List) objM86757v;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (wj50.m88271j(((ef5) obj2).f58946a, this.f48717a)) {
                obj = obj2;
                break;
            }
        }
        return (ef5) obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m35918c(rf5 rf5Var) {
        while (true) {
            zv41 zv41Var = this.f48721e;
            Object value = zv41Var.getValue();
            rf5 rf5Var2 = rf5Var;
            if (zv41Var.m97089k(value, eg5.m38772a((eg5) value, "", false, rf5Var2, false, 8))) {
                return;
            } else {
                rf5Var = rf5Var2;
            }
        }
    }
}
