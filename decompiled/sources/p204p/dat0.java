package p204p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.puffin.setup.setupflow.manualselect.p136ui.ManualSelectView;

/* JADX INFO: loaded from: classes10.dex */
public final class dat0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ManualSelectView f47103a;

    /* JADX INFO: renamed from: b */
    public final View f47104b;

    /* JADX INFO: renamed from: c */
    public final EncoreButton f47105c;

    /* JADX INFO: renamed from: d */
    public final FindInContextView f47106d;

    public dat0(ManualSelectView manualSelectView, View view, EncoreButton encoreButton, RecyclerView recyclerView, FindInContextView findInContextView) {
        this.f47103a = manualSelectView;
        this.f47104b = view;
        this.f47105c = encoreButton;
        this.f47106d = findInContextView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f47103a;
    }
}
