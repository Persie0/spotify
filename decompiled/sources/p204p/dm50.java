package p204p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.buttons.SecondaryButtonView;

/* JADX INFO: loaded from: classes5.dex */
public final class dm50 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f50425a;

    /* JADX INFO: renamed from: b */
    public final SecondaryButtonView f50426b;

    public dm50(ConstraintLayout constraintLayout, SecondaryButtonView secondaryButtonView) {
        this.f50425a = constraintLayout;
        this.f50426b = secondaryButtonView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f50425a;
    }
}
