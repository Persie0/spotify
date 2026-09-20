package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class awb1 {

    /* JADX INFO: renamed from: a */
    public final Context f20469a;

    /* JADX INFO: renamed from: b */
    public final fiz f20470b;

    public awb1(Context context, fiz fizVar) {
        this.f20469a = context;
        this.f20470b = mvl0.m62953p(new xjz0(new l181(fizVar, 27), 24));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r12.mo29190a(r5, r0) == r4) goto L22;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27299a(String str, ibk ibkVar, boolean z) {
        xvb1 xvb1Var;
        if (ibkVar instanceof xvb1) {
            xvb1Var = (xvb1) ibkVar;
            int i = xvb1Var.f266355e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xvb1Var.f266355e = i - Integer.MIN_VALUE;
            } else {
                xvb1Var = new xvb1(this, ibkVar);
            }
        } else {
            xvb1Var = new xvb1(this, ibkVar);
        }
        Object objM86755t = xvb1Var.f266353c;
        int i2 = xvb1Var.f266355e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            xvb1Var.f266351a = str;
            xvb1Var.f266352b = z;
            xvb1Var.f266355e = 1;
            objM86755t = vyf1.m86755t(this.f20470b, xvb1Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = xvb1Var.f266352b;
            str = xvb1Var.f266351a;
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return w2a1.f247311a;
        String str2 = str;
        boolean z2 = z;
        String str3 = (String) objM86755t;
        wko wkoVar = (wko) bwb1.f31609b.m91366a(this.f20469a, bwb1.f31608a[0]);
        oji ojiVar = new oji(str3, str2, z2, (fbk) null, 6);
        xvb1Var.f266351a = null;
        xvb1Var.f266352b = z2;
        xvb1Var.f266355e = 2;
    }
}
