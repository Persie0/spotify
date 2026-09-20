package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes5.dex */
public final class mk6 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: b */
    public static final mk6 f144503b = new mk6(0);

    /* JADX INFO: renamed from: c */
    public static final mk6 f144504c = new mk6(1);

    /* JADX INFO: renamed from: d */
    public static final mk6 f144505d = new mk6(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144506a;

    public /* synthetic */ mk6(int i) {
        this.f144506a = i;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f144506a) {
            case 0:
                view.setPadding(0, 0, 0, windowInsets.getInsets(WindowInsets.Type.ime()).bottom);
                break;
            case 1:
                view.setPadding(0, 0, 0, windowInsets.getInsets(WindowInsets.Type.ime()).bottom);
                break;
            default:
                view.setPadding(0, 0, 0, windowInsets.getInsets(WindowInsets.Type.ime()).bottom);
                break;
        }
        return windowInsets;
    }
}
