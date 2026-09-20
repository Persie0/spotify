package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class m1c0 {

    /* JADX INFO: renamed from: a */
    public final sx71 f138931a;

    /* JADX INFO: renamed from: b */
    public final va91 f138932b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f138933c;

    /* JADX INFO: renamed from: d */
    public final nh61 f138934d;

    /* JADX INFO: renamed from: e */
    public final i26 f138935e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f138936f = new ConcurrentHashMap();

    public m1c0(sx71 sx71Var, va91 va91Var, qgm qgmVar, sgm sgmVar, bqg0 bqg0Var, hqg0 hqg0Var, z9j0 z9j0Var, ri5 ri5Var) {
        this.f138931a = sx71Var;
        this.f138932b = va91Var;
        this.f138933c = z9j0Var;
        this.f138934d = qgmVar.m72754a(hqg0Var);
        this.f138935e = sgmVar.m78104a(bqg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m60535a(String str, String str2, ss8 ss8Var, ibk ibkVar) {
        i1c0 i1c0Var;
        Object c6x0Var;
        if (ibkVar instanceof i1c0) {
            i1c0Var = (i1c0) ibkVar;
            int i = i1c0Var.f97476d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1c0Var.f97476d = i - Integer.MIN_VALUE;
            } else {
                i1c0Var = new i1c0(this, ibkVar);
            }
        } else {
            i1c0Var = new i1c0(this, ibkVar);
        }
        Object obj = i1c0Var.f97474b;
        int i2 = i1c0Var.f97476d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                va91 va91Var = this.f138932b;
                i1c0Var.f97473a = str2;
                i1c0Var.f97476d = 1;
                Object objM71343h = ((px00) va91Var.f239166b).m71343h(str2, str, ss8Var, i1c0Var);
                Object obj2 = yuk.f276404a;
                if (objM71343h != obj2) {
                    objM71343h = w2a1.f247311a;
                }
                if (objM71343h == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = i1c0Var.f97473a;
                bga.m29073P(obj);
            }
            c6x0Var = new k2c0(str2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null) {
            return c6x0Var;
        }
        Logger.m3967c(thM77348a, edb.m38564m("Error restoring entity to list: ", str2), new Object[0]);
        return new j2c0(str2);
    }
}
