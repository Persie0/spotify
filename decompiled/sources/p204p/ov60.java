package p204p;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ov60 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f170425e = fv31.f73628b.m78183U("minichat_keyboard_accessory_disclaimer_last_viewed_timestamp");

    /* JADX INFO: renamed from: f */
    public static final long f170426f = TimeUnit.DAYS.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final Context f170427a;

    /* JADX INFO: renamed from: b */
    public final wb11 f170428b;

    /* JADX INFO: renamed from: c */
    public final xre f170429c;

    /* JADX INFO: renamed from: d */
    public final e560 f170430d;

    public ov60(Context context, wb11 wb11Var, xre xreVar, fiz fizVar) {
        this.f170427a = context;
        this.f170428b = wb11Var;
        this.f170429c = xreVar;
        this.f170430d = new e560(5, new qp20(fizVar, 23), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m68124a(ibk ibkVar) {
        nv60 nv60Var;
        if (ibkVar instanceof nv60) {
            nv60Var = (nv60) ibkVar;
            int i = nv60Var.f158811c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nv60Var.f158811c = i - Integer.MIN_VALUE;
            } else {
                nv60Var = new nv60(this, ibkVar);
            }
        } else {
            nv60Var = new nv60(this, ibkVar);
        }
        Object objM86755t = nv60Var.f158809a;
        int i2 = nv60Var.f158811c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            nv60Var.f158811c = 1;
            objM86755t = vyf1.m86755t(this.f170430d, nv60Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        ((wy3) this.f170429c).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        lv31 lv31VarEdit = ((hv31) objM86755t).edit();
        lv31VarEdit.m60050c(f170425e, jCurrentTimeMillis);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }
}
