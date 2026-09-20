package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zza0 {

    /* JADX INFO: renamed from: c */
    public static final long f287930c;

    /* JADX INFO: renamed from: a */
    public final fra0 f287931a;

    /* JADX INFO: renamed from: b */
    public final fiz f287932b;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f287930c = jwg1.m54449D(1, ils.SECONDS);
    }

    public zza0(fra0 fra0Var, fiz fizVar) {
        this.f287931a = fra0Var;
        this.f287932b = fizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Enum m97286a(ibk ibkVar) {
        xza0 xza0Var;
        if (ibkVar instanceof xza0) {
            xza0Var = (xza0) ibkVar;
            int i = xza0Var.f267568c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xza0Var.f267568c = i - Integer.MIN_VALUE;
            } else {
                xza0Var = new xza0(this, ibkVar);
            }
        } else {
            xza0Var = new xza0(this, ibkVar);
        }
        Object objM76981v = xza0Var.f267566a;
        int i2 = xza0Var.f267568c;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            qc11 qc11Var = (qc11) this.f287931a;
            hv31 hv31Var = (hv31) qc11Var.f187239c.getValue();
            fv31 fv31Var = qc11.f187236d;
            if (!((mv31) hv31Var).m62894o(fv31Var) || !((hv31) qc11Var.f187239c.getValue()).mo48713h(fv31Var, false)) {
                xoa0 xoa0Var = new xoa0(this, null, 4);
                xza0Var.f267568c = 1;
                objM76981v = s1h1.m76981v(f287930c, xoa0Var, xza0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
            }
            return wza0.f256546a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM76981v);
        if (((e301) objM76981v) == null) {
            Logger.m3973i("Session state timed out - Assuming logged-out", new Object[0]);
            return wza0.f256547b;
        }
        return wza0.f256546a;
    }
}
