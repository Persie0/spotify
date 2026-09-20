package p204p;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class i63 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99091a = 0;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f99092b;

    /* JADX INFO: renamed from: c */
    public final TextView f99093c;

    public i63(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.f99092b = constraintLayout;
        this.f99093c = textView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f99091a) {
            case 0:
                break;
        }
        return this.f99092b;
    }

    public i63(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout) {
        this.f99092b = constraintLayout;
        this.f99093c = textView;
    }
}
