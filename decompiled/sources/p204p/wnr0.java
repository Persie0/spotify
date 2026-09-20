package p204p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;

/* JADX INFO: loaded from: classes10.dex */
public final class wnr0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f253266a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f253267b;

    /* JADX INFO: renamed from: c */
    public final EncoreTextView f253268c;

    /* JADX INFO: renamed from: d */
    public final FaceView f253269d;

    /* JADX INFO: renamed from: e */
    public final EncoreButton f253270e;

    /* JADX INFO: renamed from: f */
    public final EncoreButton f253271f;

    /* JADX INFO: renamed from: g */
    public final EncoreTextView f253272g;

    public wnr0(ConstraintLayout constraintLayout, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, FaceView faceView, EncoreButton encoreButton, EncoreButton encoreButton2, EncoreTextView encoreTextView3) {
        this.f253266a = constraintLayout;
        this.f253267b = encoreTextView;
        this.f253268c = encoreTextView2;
        this.f253269d = faceView;
        this.f253270e = encoreButton;
        this.f253271f = encoreButton2;
        this.f253272g = encoreTextView3;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f253266a;
    }
}
