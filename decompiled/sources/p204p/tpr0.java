package p204p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;

/* JADX INFO: loaded from: classes10.dex */
public final class tpr0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f222582a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f222583b;

    /* JADX INFO: renamed from: c */
    public final EncoreTextView f222584c;

    /* JADX INFO: renamed from: d */
    public final FaceView f222585d;

    /* JADX INFO: renamed from: e */
    public final EncoreButton f222586e;

    /* JADX INFO: renamed from: f */
    public final EncoreButton f222587f;

    /* JADX INFO: renamed from: g */
    public final EncoreTextView f222588g;

    public tpr0(ConstraintLayout constraintLayout, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, FaceView faceView, EncoreButton encoreButton, EncoreButton encoreButton2, EncoreTextView encoreTextView3) {
        this.f222582a = constraintLayout;
        this.f222583b = encoreTextView;
        this.f222584c = encoreTextView2;
        this.f222585d = faceView;
        this.f222586e = encoreButton;
        this.f222587f = encoreButton2;
        this.f222588g = encoreTextView3;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f222582a;
    }
}
