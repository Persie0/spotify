package p204p;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class xpk implements Callable {

    /* JADX INFO: renamed from: a */
    public static final xpk f264677a = new xpk();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CookieManager.getInstance();
    }
}
