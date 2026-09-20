package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public final class oaw0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ paw0 f163481b;

    public /* synthetic */ oaw0(paw0 paw0Var, int i) {
        this.f163480a = i;
        this.f163481b = paw0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f163480a) {
            case 0:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                this.f163481b.f175644g.onNext(xy91.f267262a);
                break;
            case 1:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                this.f163481b.f175644g.onNext(xy91.f267262a);
                break;
            case 2:
                this.f163481b.f175643f.set(System.currentTimeMillis());
                break;
            default:
                if (((Throwable) obj) instanceof TimeoutException) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    paw0 paw0Var = this.f163481b;
                    paw0Var.f175640c.mo24879c("BLOCKING", jCurrentTimeMillis - paw0Var.f175643f.get(), new y5x(z5x.STREAM_TIMEOUT, "upstream timeout", null, null, 252), -1);
                }
                break;
        }
    }
}
