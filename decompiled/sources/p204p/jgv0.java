package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class jgv0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kgv0 f112286b;

    public /* synthetic */ jgv0(kgv0 kgv0Var, int i) {
        this.f112285a = i;
        this.f112286b = kgv0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f112285a) {
            case 0:
                this.f112286b.f122473f.getClass();
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, ei6.m39073j("Error while requesting Recommended Queries Section: ", th), new Object[0]);
                this.f112286b.f122473f.getClass();
                break;
        }
    }
}
