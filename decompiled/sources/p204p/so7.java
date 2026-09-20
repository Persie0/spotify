package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class so7 {

    /* JADX INFO: renamed from: a */
    public final g96 f211116a;

    /* JADX INFO: renamed from: b */
    public final mcu f211117b;

    /* JADX INFO: renamed from: c */
    public final dt01 f211118c;

    /* JADX INFO: renamed from: d */
    public final yby0 f211119d;

    /* JADX INFO: renamed from: e */
    public final dsw0 f211120e;

    /* JADX INFO: renamed from: f */
    public final vzn f211121f;

    /* JADX INFO: renamed from: g */
    public final u7q f211122g;

    /* JADX INFO: renamed from: h */
    public final u010 f211123h;

    /* JADX INFO: renamed from: i */
    public final boolean f211124i;

    public so7(g96 g96Var, mcu mcuVar, dt01 dt01Var, yby0 yby0Var, dsw0 dsw0Var, vzn vznVar, u7q u7qVar, u010 u010Var, boolean z) {
        this.f211116a = g96Var;
        this.f211117b = mcuVar;
        this.f211118c = dt01Var;
        this.f211119d = yby0Var;
        this.f211120e = dsw0Var;
        this.f211121f = vznVar;
        this.f211122g = u7qVar;
        this.f211123h = u010Var;
        this.f211124i = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m78628a(so7 so7Var, String str, ibk ibkVar) {
        ro7 ro7Var;
        if (ibkVar instanceof ro7) {
            ro7Var = (ro7) ibkVar;
            int i = ro7Var.f201158c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro7Var.f201158c = i - Integer.MIN_VALUE;
            } else {
                ro7Var = new ro7(so7Var, ibkVar);
            }
        } else {
            ro7Var = new ro7(so7Var, ibkVar);
        }
        Object objM44009b = ro7Var.f201156a;
        int i2 = ro7Var.f201158c;
        if (i2 == 0) {
            bga.m29073P(objM44009b);
            g96 g96Var = so7Var.f211116a;
            ro7Var.f201158c = 1;
            objM44009b = g96Var.m44009b(str, ro7Var);
            yuk yukVar = yuk.f276404a;
            if (objM44009b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM44009b);
        }
        to7 to7Var = (to7) objM44009b;
        String strM81192a = to7Var.m81192a();
        Uri uri = (strM81192a == null || wl51.m88460J0(strM81192a)) ? Uri.EMPTY : Uri.parse(to7Var.m81192a());
        String strM81193b = to7Var.m81193b();
        wj50.m88279p(uri);
        return new f4k(strM81193b, new t3k(uri, x3k.f257826b), null, 4);
    }
}
