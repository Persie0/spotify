package p204p;

import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class kvd1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lvd1 f126837a;

    public kvd1(lvd1 lvd1Var) {
        this.f126837a = lvd1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Iterator it = this.f126837a.f137288b.iterator();
        while (it.hasNext()) {
            windowInsets = ((ivd1) it.next()).onApplyWindowInsets(view, windowInsets);
        }
        return windowInsets;
    }
}
