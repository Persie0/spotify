package p204p;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class wv60 {

    /* JADX INFO: renamed from: d */
    public static final d67 f255420d = new d67(14);

    /* JADX INFO: renamed from: e */
    public static final LinkedHashMap f255421e = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final Context f255422a;

    /* JADX INFO: renamed from: b */
    public final wb11 f255423b;

    /* JADX INFO: renamed from: c */
    public final e560 f255424c;

    public wv60(Context context, wb11 wb11Var, fiz fizVar) {
        this.f255422a = context;
        this.f255423b = wb11Var;
        this.f255424c = new e560(7, new qp20(fizVar, 24), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m89078a(String str, String str2, ibk ibkVar) {
        tv60 tv60Var;
        if (ibkVar instanceof tv60) {
            tv60Var = (tv60) ibkVar;
            int i = tv60Var.f224075e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tv60Var.f224075e = i - Integer.MIN_VALUE;
            } else {
                tv60Var = new tv60(this, ibkVar);
            }
        } else {
            tv60Var = new tv60(this, ibkVar);
        }
        Object objM86755t = tv60Var.f224073c;
        int i2 = tv60Var.f224075e;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            tv60Var.f224071a = str;
            tv60Var.f224072b = str2;
            tv60Var.f224075e = 1;
            objM86755t = vyf1.m86755t(this.f255424c, tv60Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = tv60Var.f224072b;
            str = tv60Var.f224071a;
            bga.m29073P(objM86755t);
        }
        lv31 lv31VarEdit = ((hv31) objM86755t).edit();
        lv31VarEdit.m60051d(d67.m35058c(str), str2);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }
}
