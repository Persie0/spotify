package p204p;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import androidx.media3.session.legacy.MediaSessionManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cqd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40842a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f40843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f40844c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f40845d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f40846e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f40847f;

    public /* synthetic */ cqd0(pqd0 pqd0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, mxz0 mxz0Var, int i, oqd0 oqd0Var) {
        this.f40844c = pqd0Var;
        this.f40845d = remoteUserInfo;
        this.f40846e = mxz0Var;
        this.f40843b = i;
        this.f40847f = oqd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40842a) {
            case 0:
                final pqd0 pqd0Var = (pqd0) this.f40844c;
                MediaSessionManager.RemoteUserInfo remoteUserInfo = (MediaSessionManager.RemoteUserInfo) this.f40845d;
                final mxz0 mxz0Var = (mxz0) this.f40846e;
                final oqd0 oqd0Var = (oqd0) this.f40847f;
                final int i = this.f40843b;
                pqd0Var.m70638f(remoteUserInfo, new oqd0() { // from class: p.eqd0
                    @Override // p204p.oqd0
                    /* JADX INFO: renamed from: a */
                    public final void mo36637a(tnd0 tnd0Var) {
                        oqd0 oqd0Var2 = oqd0Var;
                        bxb bxbVar = pqd0Var.f180266a;
                        mxz0 mxz0Var2 = mxz0Var;
                        if (mxz0Var2 != null) {
                            if (!bxbVar.m30773D(tnd0Var, mxz0Var2)) {
                                return;
                            }
                        } else if (!bxbVar.m30772C(tnd0Var, i)) {
                            return;
                        }
                        try {
                            oqd0Var2.mo36637a(tnd0Var);
                        } catch (RemoteException e) {
                            yif1.m93821x0("Exception in " + tnd0Var, e);
                        }
                    }
                });
                break;
            case 1:
                jtd0 jtd0Var = (jtd0) this.f40844c;
                Pair pair = (Pair) this.f40845d;
                jtd0Var.f115819b.f147053i.mo33835B(((Integer) pair.first).intValue(), (vsd0) pair.second, (o0a0) this.f40846e, (lhd0) this.f40847f, this.f40843b);
                break;
            default:
                fzk0 fzk0Var = (fzk0) this.f40844c;
                int i2 = this.f40843b;
                byte[] bArr = (byte[]) this.f40845d;
                t601 t601Var = (t601) this.f40846e;
                r300 r300Var = (r300) this.f40847f;
                lep lepVar = fzk0Var.f75041b;
                try {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    lepVar.mo44757d(looperMyLooper, w9p0.f249227c);
                    lepVar.mo50671b();
                    try {
                        lepVar.m58808l(bArr, i2);
                        bhs bhsVarMo44758e = lepVar.mo44758e(fzk0Var.f75044e, r300Var);
                        bhsVarMo44758e.getClass();
                        t601Var.m28330u(bhsVarMo44758e);
                    } catch (Throwable th) {
                        lepVar.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    t601Var.m28331v(th2);
                }
                break;
        }
    }

    public /* synthetic */ cqd0(jtd0 jtd0Var, Pair pair, o0a0 o0a0Var, lhd0 lhd0Var, int i) {
        this.f40844c = jtd0Var;
        this.f40845d = pair;
        this.f40846e = o0a0Var;
        this.f40847f = lhd0Var;
        this.f40843b = i;
    }

    public /* synthetic */ cqd0(fzk0 fzk0Var, int i, byte[] bArr, t601 t601Var, r300 r300Var) {
        this.f40844c = fzk0Var;
        this.f40843b = i;
        this.f40845d = bArr;
        this.f40846e = t601Var;
        this.f40847f = r300Var;
    }
}
