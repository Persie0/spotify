package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes11.dex */
public final class w2e1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q9e1 f247332b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jhc1 f247333c;

    public /* synthetic */ w2e1(q9e1 q9e1Var, jhc1 jhc1Var, int i) {
        this.f247331a = i;
        this.f247332b = q9e1Var;
        this.f247333c = jhc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m87074b(xve xveVar, fbk fbkVar) {
        v2e1 v2e1Var;
        if (fbkVar instanceof v2e1) {
            v2e1Var = (v2e1) fbkVar;
            int i = v2e1Var.f236627d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v2e1Var.f236627d = i - Integer.MIN_VALUE;
            } else {
                v2e1Var = new v2e1(this, fbkVar);
            }
        } else {
            v2e1Var = new v2e1(this, fbkVar);
        }
        Object obj = v2e1Var.f236625b;
        int i2 = v2e1Var.f236627d;
        fbk fbkVar2 = null;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    xveVar = v2e1Var.f236624a;
                    bga.m29073P(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
            }
            bga.m29073P(obj);
            q9e1 q9e1Var = this.f247332b;
            boolean z = xveVar.f266374c;
            String str = xveVar.f266373b;
            v2e1Var.f236624a = xveVar;
            v2e1Var.f236627d = 1;
            Object objM89557A = x0h1.m89557A(q9e1Var.f186580b, new p9e1(q9e1Var, str, z, fbkVar2, 0), v2e1Var);
            if (objM89557A != yukVar) {
                objM89557A = w2a1Var;
            }
            if (objM89557A == yukVar) {
            }
            jhc1 jhc1Var = this.f247333c;
            Uri uri = xveVar.f266372a;
            v2e1Var.f236624a = null;
            v2e1Var.f236627d = 2;
            asf1 asf1Var = (asf1) jhc1Var.f112391b;
            nrc1 nrc1Var = asf1Var.f19444l;
            r3f1 r3f1Var = asf1Var.f220803i;
            nrc1Var.getClass();
            if (uri == null) {
                throw new IllegalArgumentException("uri must not be null");
            }
            rof1 rof1Var = new rof1(r3f1Var, uri, 0);
            r3f1Var.f195505a.m80961d(0, rof1Var);
            Object objM88273k = wj50.m88273k(stf1.m79256p(rof1Var, ujr0.f231099Z0), v2e1Var);
            if (objM88273k != yukVar) {
                objM88273k = w2a1Var;
            }
            return objM88273k == yukVar ? yukVar : w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m3967c(th, "Failed to apply watch coaching toggle", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m87075c(o3e1 o3e1Var, fbk fbkVar) {
        y2e1 y2e1Var;
        if (fbkVar instanceof y2e1) {
            y2e1Var = (y2e1) fbkVar;
            int i = y2e1Var.f268599d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2e1Var.f268599d = i - Integer.MIN_VALUE;
            } else {
                y2e1Var = new y2e1(this, fbkVar);
            }
        } else {
            y2e1Var = new y2e1(this, fbkVar);
        }
        Object obj = y2e1Var.f268597b;
        int i2 = y2e1Var.f268599d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    o3e1Var = y2e1Var.f268596a;
                    bga.m29073P(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
            }
            bga.m29073P(obj);
            q9e1 q9e1Var = this.f247332b;
            boolean z = o3e1Var.f161357c;
            String str = o3e1Var.f161356b;
            y2e1Var.f268596a = o3e1Var;
            y2e1Var.f268599d = 1;
            if (q9e1Var.m72365e(str, y2e1Var, z) == yukVar) {
            }
            jhc1 jhc1Var = this.f247333c;
            Uri uri = o3e1Var.f161355a;
            y2e1Var.f268596a = null;
            y2e1Var.f268599d = 2;
            asf1 asf1Var = (asf1) jhc1Var.f112391b;
            nrc1 nrc1Var = asf1Var.f19444l;
            r3f1 r3f1Var = asf1Var.f220803i;
            nrc1Var.getClass();
            if (uri == null) {
                throw new IllegalArgumentException("uri must not be null");
            }
            rof1 rof1Var = new rof1(r3f1Var, uri, 0);
            r3f1Var.f195505a.m80961d(0, rof1Var);
            Object objM88273k = wj50.m88273k(stf1.m79256p(rof1Var, ujr0.f231099Z0), y2e1Var);
            if (objM88273k != yukVar) {
                objM88273k = w2a1Var;
            }
            return objM88273k == yukVar ? yukVar : w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m3967c(th, "Failed to apply watch workout-mode toggle", new Object[0]);
        }
    }

    @Override // p204p.niz
    public final /* bridge */ /* synthetic */ Object emit(Object obj, fbk fbkVar) {
        switch (this.f247331a) {
            case 0:
                return m87074b((xve) obj, fbkVar);
            default:
                return m87075c((o3e1) obj, fbkVar);
        }
    }
}
