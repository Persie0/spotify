package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class r2u implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f195228b;

    public /* synthetic */ r2u(Consumer consumer, int i) {
        this.f195227a = i;
        this.f195228b = consumer;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f195227a) {
            case 0:
                if (z) {
                    this.f195228b.accept(u0u.f225614a);
                }
                break;
            default:
                if (z) {
                    this.f195228b.accept(g9n0.f77845a);
                }
                break;
        }
    }
}
