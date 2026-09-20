package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import p204p.ar40;
import p204p.gzj;
import p204p.lau;
import p204p.wco0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lp/ar40;", "Lp/wco0;", "<init>", "()V", "okhttp"}, m24213k = 1, m24214mv = {2, 2, 0}, m24216xi = 48)
public final class PlatformInitializer implements ar40 {
    @Override // p204p.ar40
    /* JADX INFO: renamed from: a */
    public final List mo594a() {
        return lau.f131415a;
    }

    @Override // p204p.ar40
    /* JADX INFO: renamed from: b */
    public final Object mo595b(Context context) {
        wco0 wco0Var = wco0.f250081a;
        Object obj = wco0.f250081a;
        gzj gzjVar = obj != null ? (gzj) obj : null;
        if (gzjVar != null) {
            gzjVar.mo46203b(context);
        }
        return wco0.f250081a;
    }
}
