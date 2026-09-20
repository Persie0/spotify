package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class yz91 implements uz91 {

    /* JADX INFO: renamed from: a */
    public final zev0 f277736a;

    /* JADX INFO: renamed from: b */
    public final bsi f277737b;

    /* JADX INFO: renamed from: c */
    public final fiz f277738c;

    /* JADX INFO: renamed from: d */
    public final luk f277739d;

    /* JADX INFO: renamed from: e */
    public final boolean f277740e;

    public yz91(zev0 zev0Var, bsi bsiVar, fiz fizVar, luk lukVar, boolean z) {
        this.f277736a = zev0Var;
        this.f277737b = bsiVar;
        this.f277738c = fizVar;
        this.f277739d = lukVar;
        this.f277740e = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m94976a(yz91 yz91Var, String str, ibk ibkVar) {
        vz91 vz91Var;
        if (ibkVar instanceof vz91) {
            vz91Var = (vz91) ibkVar;
            int i = vz91Var.f246422d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz91Var.f246422d = i - Integer.MIN_VALUE;
            } else {
                vz91Var = new vz91(yz91Var, ibkVar);
            }
        } else {
            vz91Var = new vz91(yz91Var, ibkVar);
        }
        Object objM76979t = vz91Var.f246420b;
        int i2 = vz91Var.f246422d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76979t);
                long j = a0a1.f11041b;
                wm81 wm81Var = new wm81(yz91Var, null, 12);
                vz91Var.f246419a = str;
                vz91Var.f246422d = 1;
                objM76979t = s1h1.m76979t(j, wm81Var, vz91Var);
                yuk yukVar = yuk.f276404a;
                if (objM76979t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = vz91Var.f246419a;
                bga.m29073P(objM76979t);
            }
            return (qhk0) objM76979t;
        } catch (TimeoutCancellationException e) {
            Logger.m3974j(e, "Unauthenticated properties timed out, using defaults", new Object[0]);
            yz91Var.f277737b.m30442g(str, new TimeoutException(e.getMessage()));
            return a0a1.f11042c;
        }
    }
}
