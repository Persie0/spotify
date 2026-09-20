package p204p;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: classes8.dex */
public final class ste implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f213892a;

    /* JADX INFO: renamed from: b */
    public final WebView f213893b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f213894c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f213895d;

    public ste(LinearLayout linearLayout, ImageView imageView, EncoreButton encoreButton, WebView webView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f213892a = linearLayout;
        this.f213893b = webView;
        this.f213894c = constraintLayout;
        this.f213895d = constraintLayout2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f213892a;
    }
}
