package p204p;

import android.view.View;
import android.webkit.WebView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes5.dex */
public final class hq6 implements View.OnScrollChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f94038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f94039c;

    public /* synthetic */ hq6(int i, Object obj, Object obj2) {
        this.f94037a = i;
        this.f94038b = obj;
        this.f94039c = obj2;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        switch (this.f94037a) {
            case 0:
                cq6.m33594f((rxo) this.f94038b, i2 - i4, null, ((NestedScrollView) this.f94039c).getResources().getDisplayMetrics().density, 6);
                break;
            default:
                if (!((WebView) this.f94038b).canScrollVertically(1)) {
                    ((eh00) this.f94039c).invoke();
                }
                break;
        }
    }
}
