package p204p;

import android.view.View;
import android.widget.FrameLayout;
import com.spotify.encoremobile.buttons.PrimaryButtonView;

/* JADX INFO: loaded from: classes5.dex */
public final class zl50 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f283940a;

    /* JADX INFO: renamed from: b */
    public final PrimaryButtonView f283941b;

    public zl50(FrameLayout frameLayout, PrimaryButtonView primaryButtonView) {
        this.f283940a = frameLayout;
        this.f283941b = primaryButtonView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f283940a;
    }
}
