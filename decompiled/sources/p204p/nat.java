package p204p;

import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nat {
    /* JADX INFO: renamed from: a */
    public static final void m64039a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    /* JADX INFO: renamed from: b */
    public static void m64040b(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m64041c(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
