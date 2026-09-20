package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.puffin.setup.setupflow.autodetect.p135ui.AutodetectView;

/* JADX INFO: loaded from: classes10.dex */
public final class h8t0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final AutodetectView f88787a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f88788b;

    /* JADX INFO: renamed from: c */
    public final ComposeView f88789c;

    /* JADX INFO: renamed from: d */
    public final EncoreTextView f88790d;

    /* JADX INFO: renamed from: e */
    public final EncoreProgressIndicatorButton f88791e;

    /* JADX INFO: renamed from: f */
    public final EncoreButton f88792f;

    public h8t0(AutodetectView autodetectView, EncoreTextView encoreTextView, ComposeView composeView, EncoreTextView encoreTextView2, EncoreProgressIndicatorButton encoreProgressIndicatorButton, EncoreButton encoreButton) {
        this.f88787a = autodetectView;
        this.f88788b = encoreTextView;
        this.f88789c = composeView;
        this.f88790d = encoreTextView2;
        this.f88791e = encoreProgressIndicatorButton;
        this.f88792f = encoreButton;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f88787a;
    }
}
