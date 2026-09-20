package p204p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q9e1 {

    /* JADX INFO: renamed from: a */
    public final xuk f186579a;

    /* JADX INFO: renamed from: b */
    public final luk f186580b;

    /* JADX INFO: renamed from: c */
    public final fqa1 f186581c;

    /* JADX INFO: renamed from: d */
    public final lsi0 f186582d = msi0.m62770a();

    /* JADX INFO: renamed from: e */
    public volatile hv31 f186583e;

    public q9e1(Context context, dez dezVar, fiz fizVar, xuk xukVar, luk lukVar) {
        this.f186579a = xukVar;
        this.f186580b = lukVar;
        this.f186581c = new fqa1(context, dezVar, fizVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m72361a(q9e1 q9e1Var, String str, boolean z, ibk ibkVar) {
        n9e1 n9e1Var;
        q9e1Var.getClass();
        if (ibkVar instanceof n9e1) {
            n9e1Var = (n9e1) ibkVar;
            int i = n9e1Var.f151788e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9e1Var.f151788e = i - Integer.MIN_VALUE;
            } else {
                n9e1Var = new n9e1(q9e1Var, ibkVar);
            }
        } else {
            n9e1Var = new n9e1(q9e1Var, ibkVar);
        }
        Object objM72363c = n9e1Var.f151786c;
        int i2 = n9e1Var.f151788e;
        if (i2 == 0) {
            bga.m29073P(objM72363c);
            n9e1Var.f151784a = str;
            n9e1Var.f151785b = z;
            n9e1Var.f151788e = 1;
            objM72363c = q9e1Var.m72363c(n9e1Var);
            Object obj = yuk.f276404a;
            if (objM72363c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = n9e1Var.f151785b;
            str = n9e1Var.f151784a;
            bga.m29073P(objM72363c);
        }
        hv31 hv31Var = (hv31) objM72363c;
        fv31 fv31Var = w3e1.f247578c;
        Set setM43734m1 = g6f.m43734m1(hv31Var.mo48706a(fv31Var));
        if (z) {
            setM43734m1.add(str);
        } else {
            setM43734m1.remove(str);
        }
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60052e(fv31Var, setM43734m1);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m72362b(q9e1 q9e1Var, fv31 fv31Var, String str, boolean z, ibk ibkVar) {
        o9e1 o9e1Var;
        q9e1Var.getClass();
        if (ibkVar instanceof o9e1) {
            o9e1Var = (o9e1) ibkVar;
            int i = o9e1Var.f163014f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o9e1Var.f163014f = i - Integer.MIN_VALUE;
            } else {
                o9e1Var = new o9e1(q9e1Var, ibkVar);
            }
        } else {
            o9e1Var = new o9e1(q9e1Var, ibkVar);
        }
        Object objM72363c = o9e1Var.f163012d;
        int i2 = o9e1Var.f163014f;
        if (i2 == 0) {
            bga.m29073P(objM72363c);
            o9e1Var.f163009a = fv31Var;
            o9e1Var.f163010b = str;
            o9e1Var.f163011c = z;
            o9e1Var.f163014f = 1;
            objM72363c = q9e1Var.m72363c(o9e1Var);
            Object obj = yuk.f276404a;
            if (objM72363c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = o9e1Var.f163011c;
            str = o9e1Var.f163010b;
            fv31Var = o9e1Var.f163009a;
            bga.m29073P(objM72363c);
        }
        hv31 hv31Var = (hv31) objM72363c;
        Set setM43734m1 = g6f.m43734m1(hv31Var.mo48706a(fv31Var));
        if (z) {
            setM43734m1.remove(str);
        } else {
            setM43734m1.add(str);
        }
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60052e(fv31Var, setM43734m1);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m72363c(ibk ibkVar) {
        i9e1 i9e1Var;
        if (ibkVar instanceof i9e1) {
            i9e1Var = (i9e1) ibkVar;
            int i = i9e1Var.f99998c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i9e1Var.f99998c = i - Integer.MIN_VALUE;
            } else {
                i9e1Var = new i9e1(this, ibkVar);
            }
        } else {
            i9e1Var = new i9e1(this, ibkVar);
        }
        Object objM42411a = i9e1Var.f99996a;
        yuk yukVar = yuk.f276404a;
        int i2 = i9e1Var.f99998c;
        if (i2 == 0) {
            bga.m29073P(objM42411a);
            hv31 hv31Var = this.f186583e;
            if (hv31Var != null) {
                return hv31Var;
            }
            fqa1 fqa1Var = this.f186581c;
            i9e1Var.f99998c = 1;
            objM42411a = fqa1Var.m42411a(i9e1Var);
            if (objM42411a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM42411a);
        }
        hv31 hv31Var2 = (hv31) objM42411a;
        this.f186583e = hv31Var2;
        return hv31Var2;
    }

    /* JADX INFO: renamed from: d */
    public final nlz m72364d(String str) {
        fbk fbkVar = null;
        return g0g1.m43302g(nxf1.m65833l(new l9e1(this, w3e1.f247576a, str, fbkVar, 0)), nxf1.m65833l(new l9e1(this, w3e1.f247577b, str, fbkVar, 0)), nxf1.m65833l(new l9e1(this, w3e1.f247578c, str, fbkVar, 1)), new d8s());
    }

    /* JADX INFO: renamed from: e */
    public final Object m72365e(String str, ibk ibkVar, boolean z) throws Throwable {
        Object objM89557A = x0h1.m89557A(this.f186580b, new p9e1(this, str, z, null, 2), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }
}
