package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class st7 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f213827a;

    /* JADX INFO: renamed from: b */
    public final TextView f213828b;

    /* JADX INFO: renamed from: c */
    public final ComposeView f213829c;

    public st7(ConstraintLayout constraintLayout, TextView textView, ComposeView composeView) {
        this.f213827a = constraintLayout;
        this.f213828b = textView;
        this.f213829c = composeView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f213827a;
    }
}
