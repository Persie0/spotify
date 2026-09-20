package p204p;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;

/* JADX INFO: loaded from: classes6.dex */
public final class yx71 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f277170a;

    /* JADX INFO: renamed from: b */
    public final EncoreTitleView f277171b;

    /* JADX INFO: renamed from: c */
    public final SwitchCompat f277172c;

    public yx71(ConstraintLayout constraintLayout, EncoreTitleView encoreTitleView, SwitchCompat switchCompat) {
        this.f277170a = constraintLayout;
        this.f277171b = encoreTitleView;
        this.f277172c = switchCompat;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f277170a;
    }
}
