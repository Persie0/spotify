package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes8.dex */
public final class w0f0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ avp f246727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hww0 f246728c;

    public /* synthetic */ w0f0(avp avpVar, hww0 hww0Var, int i) {
        this.f246726a = i;
        this.f246727b = avpVar;
        this.f246728c = hww0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f246726a) {
            case 0:
                yq11 yq11Var = (yq11) obj;
                SingleSubject singleSubject = (SingleSubject) this.f246727b.f20240a.remove(this.f246728c.f96066a);
                if (singleSubject != null) {
                    singleSubject.onSuccess(yq11Var);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.m3966b(edb.m38564m("Error showing notification: ", th.getMessage()), new Object[0]);
                SingleSubject singleSubject2 = (SingleSubject) this.f246727b.f20240a.remove(this.f246728c.f96066a);
                if (singleSubject2 != null) {
                    singleSubject2.onError(th);
                }
                break;
        }
    }
}
