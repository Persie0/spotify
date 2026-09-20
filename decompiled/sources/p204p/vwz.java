package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vwz implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f245577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f245578c;

    public /* synthetic */ vwz(boolean z, Object obj, int i) {
        this.f245576a = i;
        this.f245577b = z;
        this.f245578c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f245576a) {
            case 0:
                Logger.m3969e("%s %s succeeded", this.f245577b ? Request.POST : Request.DELETE, (String) this.f245578c);
                break;
            case 1:
                xwz.m92308e(((Throwable) obj).getMessage(), (uwz) this.f245578c, this.f245577b);
                break;
            default:
                xwz.m92308e(((Throwable) obj).getMessage(), (uwz) this.f245578c, this.f245577b);
                break;
        }
    }
}
