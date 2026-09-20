package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: classes7.dex */
public final class cd1 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36704a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f36705b;

    /* JADX INFO: renamed from: c */
    public final ArtworkView f36706c;

    /* JADX INFO: renamed from: d */
    public final TextView f36707d;

    public /* synthetic */ cd1(ConstraintLayout constraintLayout, ArtworkView artworkView, TextView textView, int i) {
        this.f36704a = i;
        this.f36705b = constraintLayout;
        this.f36706c = artworkView;
        this.f36707d = textView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f36704a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f36705b;
    }
}
