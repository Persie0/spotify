package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class fvq implements owt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73838a;

    /* JADX INFO: renamed from: b */
    public final ComposeView f73839b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yum0 f73840c;

    public /* synthetic */ fvq(ComposeView composeView, yum0 yum0Var, int i) {
        this.f73838a = i;
        this.f73840c = yum0Var;
        this.f73839b = composeView;
    }

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        switch (this.f73838a) {
            case 0:
                this.f73840c.setValue((avq) obj);
                break;
            case 1:
                this.f73840c.setValue((wey) obj);
                break;
            default:
                this.f73840c.setValue((wlq0) obj);
                break;
        }
    }

    @Override // p204p.owt
    public final View getView() {
        switch (this.f73838a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f73839b;
    }
}
