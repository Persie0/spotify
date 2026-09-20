package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: classes5.dex */
public final class c3q0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f33729a;

    /* JADX INFO: renamed from: b */
    public final ArtworkView f33730b;

    /* JADX INFO: renamed from: c */
    public final TextView f33731c;

    /* JADX INFO: renamed from: d */
    public final TextView f33732d;

    /* JADX INFO: renamed from: e */
    public final SwitchCompat f33733e;

    public c3q0(ConstraintLayout constraintLayout, ArtworkView artworkView, TextView textView, TextView textView2, SwitchCompat switchCompat) {
        this.f33729a = constraintLayout;
        this.f33730b = artworkView;
        this.f33731c = textView;
        this.f33732d = textView2;
        this.f33733e = switchCompat;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f33729a;
    }
}
