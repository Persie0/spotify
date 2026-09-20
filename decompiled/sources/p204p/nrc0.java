package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.ComposeView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class nrc0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157494a;

    public /* synthetic */ nrc0(int i) {
        this.f157494a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f157494a) {
            case 0:
                ViewParent parent = view.getParent();
                while (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.setClipChildren(false);
                    parent = viewGroup.getParent();
                }
                break;
            case 1:
                for (Object parent2 = view.getParent(); parent2 instanceof View; parent2 = ((View) parent2).getParent()) {
                    if (parent2 instanceof ComposeView) {
                        ((ComposeView) parent2).setOnHoverListener(ist0.f105313b);
                    }
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = mec1.f142677a;
                aec1.m25717c(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f157494a;
    }

    /* JADX INFO: renamed from: a */
    private final void m65472a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m65473b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m65474c(View view) {
    }
}
