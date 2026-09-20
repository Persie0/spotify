package p204p;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class aqk implements Callable {

    /* JADX INFO: renamed from: b */
    public static final aqk f18264b = new aqk(0);

    /* JADX INFO: renamed from: c */
    public static final aqk f18265c = new aqk(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ aqk f18266d = new aqk(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18267a;

    public /* synthetic */ aqk(int i) {
        this.f18267a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18267a) {
            case 0:
                return CookieManager.getInstance();
            case 1:
                return lqh0.f136059i;
            default:
                vi10 vi10Var = vih0.f241716e;
                return null;
        }
    }
}
