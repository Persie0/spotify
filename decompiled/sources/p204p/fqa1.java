package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class fqa1 {

    /* JADX INFO: renamed from: a */
    public final Context f72112a;

    /* JADX INFO: renamed from: b */
    public final dez f72113b;

    /* JADX INFO: renamed from: c */
    public final fiz f72114c;

    /* JADX INFO: renamed from: d */
    public volatile hv31 f72115d;

    public fqa1(Context context, dez dezVar, fiz fizVar) {
        this.f72112a = context;
        this.f72113b = dezVar;
        this.f72114c = mvl0.m62953p(new xjz0(new l181(fizVar, 19), 19));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m42411a(ibk ibkVar) {
        cqa1 cqa1Var;
        fqa1 fqa1Var;
        if (ibkVar instanceof cqa1) {
            cqa1Var = (cqa1) ibkVar;
            int i = cqa1Var.f40807d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqa1Var.f40807d = i - Integer.MIN_VALUE;
            } else {
                cqa1Var = new cqa1(this, ibkVar);
            }
        } else {
            cqa1Var = new cqa1(this, ibkVar);
        }
        Object objM86755t = cqa1Var.f40805b;
        yuk yukVar = yuk.f276404a;
        int i2 = cqa1Var.f40807d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            hv31 hv31Var = this.f72115d;
            if (hv31Var != null) {
                return hv31Var;
            }
            fiz fizVar = this.f72114c;
            cqa1Var.f40804a = this;
            cqa1Var.f40807d = 1;
            objM86755t = vyf1.m86755t(fizVar, cqa1Var);
            if (objM86755t == yukVar) {
                return yukVar;
            }
            fqa1Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fqa1Var = cqa1Var.f40804a;
            bga.m29073P(objM86755t);
        }
        dez dezVar = fqa1Var.f72113b;
        Context context = fqa1Var.f72112a;
        hv31 hv31VarMo35842b = dezVar.f48203a.mo35842b(context, (String) objM86755t);
        fqa1Var.f72115d = hv31VarMo35842b;
        return hv31VarMo35842b;
    }
}
