package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class hbm extends mbm {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f89561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f89562c;

    public /* synthetic */ hbm(Object obj, int i) {
        this.f89561b = i;
        this.f89562c = obj;
    }

    @Override // p204p.mbm
    /* JADX INFO: renamed from: a */
    public final void mo41260a(lbm lbmVar) {
        switch (this.f89561b) {
            case 0:
                try {
                    ((nu30) lbmVar.f131687a).m65672c2();
                    break;
                } catch (RemoteException unused) {
                }
                ((Context) this.f89562c).unbindService(this);
                break;
            default:
                ((BehaviorSubject) ((suj) this.f89562c).f214137c).onNext(lbmVar);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f89561b) {
            case 0:
                break;
            default:
                ((BehaviorSubject) ((suj) this.f89562c).f214137c).onComplete();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m47054b(ComponentName componentName) {
    }
}
