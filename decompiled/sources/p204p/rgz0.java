package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rgz0 {

    /* JADX INFO: renamed from: a */
    public final bq71 f199068a;

    /* JADX INFO: renamed from: b */
    public final String f199069b;

    /* JADX INFO: renamed from: c */
    public final xuk f199070c;

    /* JADX INFO: renamed from: d */
    public final nuu0 f199071d;

    public rgz0(bq71 bq71Var, String str, pgo pgoVar, xuk xukVar) {
        this.f199068a = bq71Var;
        this.f199069b = str;
        this.f199070c = xukVar;
        xzk xzkVar = xzk.f267695Z0;
        nez0 nez0Var = nez0.f153176Z0;
        nau nauVar = nau.f152117a;
        this.f199071d = bzf1.m31029u(new ner(nauVar, fag1.m41151B(pgoVar, pag1.m69487w(new rko(xzkVar, 2, nez0.f153179b1, new pko(nez0Var), nez0.f153181c1), nez0.f153177a1), str), new d6g0(this, null, 11), 6), xukVar, hf11.f90581a, nauVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m75492a(String str, fbk fbkVar) {
        pgz0 pgz0Var;
        ogz0 ogz0Var;
        if (fbkVar instanceof pgz0) {
            pgz0Var = (pgz0) fbkVar;
            int i = pgz0Var.f177435e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgz0Var.f177435e = i - Integer.MIN_VALUE;
            } else {
                pgz0Var = new pgz0(this, fbkVar);
            }
        } else {
            pgz0Var = new pgz0(this, fbkVar);
        }
        Object objM86756u = pgz0Var.f177433c;
        int i2 = pgz0Var.f177435e;
        fbk fbkVar2 = null;
        int i3 = 2;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            f6n0 f6n0Var = new f6n0(i3, 25, fbkVar2);
            pgz0Var.f177431a = str;
            pgz0Var.f177435e = 1;
            objM86756u = vyf1.m86756u(this.f199071d, f6n0Var, pgz0Var);
            if (objM86756u != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = pgz0Var.f177431a;
            bga.m29073P(objM86756u);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ogz0Var = pgz0Var.f177432b;
            bga.m29073P(objM86756u);
        }
        List list = (List) objM86756u;
        return list != null ? new b410(((nu71) list.get(0)).f158526a, false) : new b410(ogz0Var.f165304a, true);
        ogz0Var = (ogz0) ((Map) objM86756u).get(str);
        if (ogz0Var == null) {
            return c410.f33808a;
        }
        luu0 luu0Var = ogz0Var.f165306c;
        pgz0Var.f177431a = null;
        pgz0Var.f177432b = ogz0Var;
        pgz0Var.f177435e = 2;
        objM86756u = vyf1.m86755t(luu0Var, pgz0Var);
    }

    /* JADX INFO: renamed from: b */
    public final nnc m75493b(String str) {
        return xtm0.m92074U(this.f199071d, new nrj0(null, str, 2));
    }
}
