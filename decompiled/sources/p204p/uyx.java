package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class uyx implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f235378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ roa f235379b;

    public /* synthetic */ uyx(roa roaVar, int i) {
        this.f235378a = i;
        this.f235379b = roaVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f235378a) {
            case 0:
                Logger.m3967c((Throwable) obj, "Error loading data for browser params, " + this.f235379b, new Object[0]);
                break;
            default:
                Logger.m3967c((Throwable) obj, "Error loading data for browser params, " + this.f235379b, new Object[0]);
                break;
        }
    }
}
