package p204p;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes7.dex */
public final class hi10 extends dvd1 {

    /* JADX INFO: renamed from: b */
    public final Window.Callback f91642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ii10 f91643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi10(ii10 ii10Var, Window.Callback callback) {
        super(callback);
        this.f91643c = ii10Var;
        this.f91642b = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean zOnPreparePanel = this.f53429a.onPreparePanel(i, view, menu);
        if (zOnPreparePanel) {
            ii10 ii10Var = this.f91643c;
            if (!ii10Var.f102404d) {
                ii10Var.f102404d = true;
            }
        }
        return zOnPreparePanel;
    }
}
