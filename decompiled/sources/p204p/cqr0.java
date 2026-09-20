package p204p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;

/* JADX INFO: loaded from: classes10.dex */
public final class cqr0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f40975a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f40976b;

    /* JADX INFO: renamed from: c */
    public final EncoreTextView f40977c;

    /* JADX INFO: renamed from: d */
    public final EncoreButton f40978d;

    /* JADX INFO: renamed from: e */
    public final FaceView f40979e;

    /* JADX INFO: renamed from: f */
    public final EncoreProgressIndicatorButton f40980f;

    /* JADX INFO: renamed from: g */
    public final EncoreTextView f40981g;

    public cqr0(ConstraintLayout constraintLayout, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, EncoreButton encoreButton, FaceView faceView, EncoreProgressIndicatorButton encoreProgressIndicatorButton, EncoreTextView encoreTextView3) {
        this.f40975a = constraintLayout;
        this.f40976b = encoreTextView;
        this.f40977c = encoreTextView2;
        this.f40978d = encoreButton;
        this.f40979e = faceView;
        this.f40980f = encoreProgressIndicatorButton;
        this.f40981g = encoreTextView3;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f40975a;
    }
}
