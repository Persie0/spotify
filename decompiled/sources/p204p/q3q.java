package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes9.dex */
public final class q3q {

    /* JADX INFO: renamed from: e */
    public static final fv31 f184919e = fv31.f73628b.m78183U("account_linking_not_linked");

    /* JADX INFO: renamed from: a */
    public final Context f184920a;

    /* JADX INFO: renamed from: b */
    public final fiz f184921b;

    /* JADX INFO: renamed from: c */
    public final wb11 f184922c;

    /* JADX INFO: renamed from: d */
    public final frv0 f184923d;

    public q3q(Context context, fiz fizVar, wb11 wb11Var, frv0 frv0Var) {
        this.f184920a = context;
        this.f184921b = fizVar;
        this.f184922c = wb11Var;
        this.f184923d = frv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m72124a(ibk ibkVar) {
        o3q o3qVar;
        hv31 hv31Var;
        if (ibkVar instanceof o3q) {
            o3qVar = (o3q) ibkVar;
            int i = o3qVar.f161429d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3qVar.f161429d = i - Integer.MIN_VALUE;
            } else {
                o3qVar = new o3q(this, ibkVar);
            }
        } else {
            o3qVar = new o3q(this, ibkVar);
        }
        Object objM72125b = o3qVar.f161427b;
        int i2 = o3qVar.f161429d;
        fv31 fv31Var = f184919e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM72125b);
            o3qVar.f161429d = 1;
            objM72125b = m72125b(o3qVar);
            if (objM72125b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM72125b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hv31Var = o3qVar.f161426a;
            bga.m29073P(objM72125b);
        }
        if (((Boolean) objM72125b).booleanValue()) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(fv31Var, false);
            lv31VarEdit.m60054g();
        }
        return objM72125b;
        hv31 hv31Var2 = (hv31) objM72125b;
        if (!hv31Var2.mo48713h(fv31Var, true)) {
            return Boolean.TRUE;
        }
        SingleSource singleSourceFlatMap = ((x3y) this.f184923d.f72669b).m89819a().flatMap(koq0.f124899t);
        o3qVar.f161426a = hv31Var2;
        o3qVar.f161429d = 2;
        Object objM96567o = zn91.m96567o(singleSourceFlatMap, o3qVar);
        if (objM96567o != obj) {
            hv31Var = hv31Var2;
            objM72125b = objM96567o;
            if (((Boolean) objM72125b).booleanValue()) {
                lv31 lv31VarEdit2 = hv31Var.edit();
                lv31VarEdit2.m60048a(fv31Var, false);
                lv31VarEdit2.m60054g();
            }
            return objM72125b;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m72125b(ibk ibkVar) {
        p3q p3qVar;
        if (ibkVar instanceof p3q) {
            p3qVar = (p3q) ibkVar;
            int i = p3qVar.f173688c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p3qVar.f173688c = i - Integer.MIN_VALUE;
            } else {
                p3qVar = new p3q(this, ibkVar);
            }
        } else {
            p3qVar = new p3q(this, ibkVar);
        }
        Object objM86756u = p3qVar.f173686a;
        int i2 = p3qVar.f173688c;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            bpp bppVar = new bpp(2, 1, null);
            p3qVar.f173688c = 1;
            objM86756u = vyf1.m86756u(this.f184921b, bppVar, p3qVar);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        return this.f184922c.mo35842b(this.f184920a, ((e301) objM86756u).f55571a);
    }
}
