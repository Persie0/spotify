package p204p;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dzk0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fzk0 f54688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t601 f54689c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bhs f54690d;

    public /* synthetic */ dzk0(fzk0 fzk0Var, bhs bhsVar, t601 t601Var) {
        this.f54687a = 2;
        this.f54688b = fzk0Var;
        this.f54690d = bhsVar;
        this.f54689c = t601Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Pair pair;
        switch (this.f54687a) {
            case 0:
                t601 t601Var = this.f54689c;
                bhs bhsVar = this.f54690d;
                ehs ehsVar = this.f54688b.f75044e;
                try {
                    Map mapMo29264h = bhsVar.mo29264h();
                    if (mapMo29264h == null) {
                        pair = null;
                    } else {
                        long j2 = -9223372036854775807L;
                        try {
                            String str = (String) mapMo29264h.get("LicenseDurationRemaining");
                            j = str != null ? Long.parseLong(str) : -9223372036854775807L;
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        Long lValueOf = Long.valueOf(j);
                        try {
                            String str2 = (String) mapMo29264h.get("PlaybackDurationRemaining");
                            if (str2 != null) {
                                j2 = Long.parseLong(str2);
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                        }
                        pair = new Pair(lValueOf, Long.valueOf(j2));
                    }
                    pair.getClass();
                    t601Var.m28330u(pair);
                    break;
                } catch (Throwable th) {
                    try {
                        t601Var.m28331v(th);
                    } finally {
                        bhsVar.mo29258b(ehsVar);
                    }
                    break;
                }
                return;
            case 1:
                t601 t601Var2 = this.f54689c;
                bhs bhsVar2 = this.f54690d;
                ehs ehsVar2 = this.f54688b.f75044e;
                try {
                    t601Var2.m28330u(bhsVar2.mo29260d());
                    break;
                } catch (Throwable th2) {
                    try {
                        t601Var2.m28331v(th2);
                    } finally {
                        bhsVar2.mo29258b(ehsVar2);
                    }
                    break;
                }
                return;
            default:
                bhs bhsVar3 = this.f54690d;
                t601 t601Var3 = this.f54689c;
                fzk0 fzk0Var = this.f54688b;
                lep lepVar = fzk0Var.f75041b;
                ehs ehsVar3 = fzk0Var.f75044e;
                try {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionMo29261e = bhsVar3.mo29261e();
                    if (bhsVar3.getState() == 1) {
                        bhsVar3.mo29258b(ehsVar3);
                        lepVar.release();
                    }
                    t601Var3.m28330u(drmSession$DrmSessionExceptionMo29261e);
                    return;
                } catch (Throwable th3) {
                    t601Var3.m28331v(th3);
                    bhsVar3.mo29258b(ehsVar3);
                    lepVar.release();
                    return;
                }
        }
    }

    public /* synthetic */ dzk0(fzk0 fzk0Var, t601 t601Var, bhs bhsVar, int i) {
        this.f54687a = i;
        this.f54688b = fzk0Var;
        this.f54689c = t601Var;
        this.f54690d = bhsVar;
    }
}
