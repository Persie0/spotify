package p204p;

import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class pss0 {

    /* JADX INFO: renamed from: a */
    public final rqs0 f180920a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f180921b;

    /* JADX INFO: renamed from: c */
    public final luk f180922c;

    /* JADX INFO: renamed from: d */
    public final yts0 f180923d;

    /* JADX INFO: renamed from: e */
    public final oga0 f180924e;

    /* JADX INFO: renamed from: f */
    public final lja1 f180925f;

    /* JADX INFO: renamed from: g */
    public final yc90 f180926g;

    /* JADX INFO: renamed from: h */
    public final l54 f180927h;

    /* JADX INFO: renamed from: i */
    public final jts0 f180928i;

    public pss0(rqs0 rqs0Var, k5m0 k5m0Var, luk lukVar, yts0 yts0Var, oga0 oga0Var, lja1 lja1Var, yc90 yc90Var, l54 l54Var, jts0 jts0Var) {
        this.f180920a = rqs0Var;
        this.f180921b = k5m0Var;
        this.f180922c = lukVar;
        this.f180923d = yts0Var;
        this.f180924e = oga0Var;
        this.f180925f = lja1Var;
        this.f180926g = yc90Var;
        this.f180927h = l54Var;
        this.f180928i = jts0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r9.m66876b(true, r1, r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r10 == r7) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70887a(rss0 rss0Var, ibk ibkVar) {
        oss0 oss0Var;
        hts0 hts0VarM54306a;
        Object objM76266e;
        if (ibkVar instanceof oss0) {
            oss0Var = (oss0) ibkVar;
            int i = oss0Var.f168887d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oss0Var.f168887d = i - Integer.MIN_VALUE;
            } else {
                oss0Var = new oss0(this, ibkVar);
            }
        } else {
            oss0Var = new oss0(this, ibkVar);
        }
        Object obj = oss0Var.f168885b;
        int i2 = oss0Var.f168887d;
        vss0 vss0Var = vss0.f244489a;
        jts0 jts0Var = this.f180928i;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(obj);
                    String str = rss0Var.f202401b;
                    String str2 = rss0Var.f202400a;
                    if (str != null) {
                        this.f180923d.f276206a.put(str2, str);
                    }
                    boolean z = rss0Var.f202402c;
                    rqs0 rqs0Var = this.f180920a;
                    yuk yukVar = yuk.f276404a;
                    if (z) {
                        oga0 oga0Var = this.f180924e;
                        oss0Var.f168887d = 1;
                    } else {
                        hts0VarM54306a = jts0Var.f115963g.m54306a(str2);
                        avs0 avs0Var = avs0.f20255a;
                        oss0Var.f168884a = hts0VarM54306a;
                        oss0Var.f168887d = 2;
                        objM76266e = rqs0Var.m76266e(str2, avs0Var, oss0Var);
                    }
                    return yukVar;
                }
                if (i2 == 1) {
                    bga.m29073P(obj);
                    return vss0Var;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hts0VarM54306a = oss0Var.f168884a;
                bga.m29073P(obj);
                objM76266e = ((s6x0) obj).f206218a;
                Throwable thM77348a = s6x0.m77348a(objM76266e);
                if (thM77348a != null) {
                    jts0Var.f115963g.m54307b(hts0VarM54306a);
                    String message = thM77348a.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    return new uss0(Collections.singletonList(new srs0(message)));
                }
                nrv0 nrv0Var = (nrv0) objM76266e;
                if (nrv0Var instanceof mrv0) {
                    return vss0Var;
                }
                if (!(nrv0Var instanceof lrv0)) {
                    throw new NoWhenBranchMatchedException();
                }
                jts0Var.f115963g.m54307b(hts0VarM54306a);
                return new uss0(((lrv0) nrv0Var).f136363a);
            } catch (CancellationException e) {
                jts0Var.f115963g.m54307b(rss0Var);
                throw e;
            } catch (Exception e2) {
                jts0Var.f115963g.m54307b(rss0Var);
                String message2 = e2.getMessage();
                return new uss0(Collections.singletonList(new srs0(message2 != null ? message2 : "Unknown error")));
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            String message3 = e4.getMessage();
            if (message3 == null) {
                message3 = "Location refresh failed";
            }
            return new uss0(Collections.singletonList(new srs0(message3)));
        }
    }
}
