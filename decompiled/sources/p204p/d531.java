package p204p;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes4.dex */
public final class d531 extends il80 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f45321p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d531(Context context, int i) {
        super(context);
        this.f45321p = i;
    }

    @Override // p204p.il80
    /* JADX INFO: renamed from: b */
    public final float mo34955b(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f45321p) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }
}
