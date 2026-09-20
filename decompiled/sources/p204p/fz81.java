package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class fz81 {

    /* JADX INFO: renamed from: a */
    public final b741 f74942a;

    public fz81(x74 x74Var, b741 b741Var) {
        this.f74942a = b741Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final Object m43176a(fz81 fz81Var, hz81 hz81Var, ibk ibkVar) {
        ez81 ez81Var;
        Object c6x0Var;
        if (ibkVar instanceof ez81) {
            ez81Var = (ez81) ibkVar;
            int i = ez81Var.f64305c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ez81Var.f64305c = i - Integer.MIN_VALUE;
            } else {
                ez81Var = new ez81(fz81Var, ibkVar);
            }
        } else {
            ez81Var = new ez81(fz81Var, ibkVar);
        }
        ez81 ez81Var2 = ez81Var;
        Object objM28353i = ez81Var2.f64303a;
        int i2 = ez81Var2.f64305c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM28353i);
                b741 b741Var = fz81Var.f74942a;
                String str = hz81Var.f96835a;
                long j = hz81Var.f96836b;
                Long l = hz81Var.f96837c;
                ez81Var2.f64305c = 1;
                objM28353i = b741Var.m28353i(str, j, l, ez81Var2);
                yuk yukVar = yuk.f276404a;
                if (objM28353i == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM28353i);
            }
            c6x0Var = (sbu0) objM28353i;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        kz81 kz81Var = kz81.f128045a;
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to fetch TimeSynced transcript", new Object[0]);
            return kz81Var;
        }
        sbu0 sbu0Var = (sbu0) c6x0Var;
        if (!sbu0Var.f207585a.isEmpty()) {
            return new mz81(sbu0Var);
        }
        Logger.m3966b("Received empty response from DataSource", new Object[0]);
        return kz81Var;
    }
}
