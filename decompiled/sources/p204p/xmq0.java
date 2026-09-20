package p204p;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class xmq0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263427a = 1;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f263428b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f263429c;

    /* JADX INFO: renamed from: d */
    public final TextView f263430d;

    public xmq0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.f263428b = constraintLayout;
        this.f263429c = constraintLayout2;
        this.f263430d = textView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f263427a) {
            case 0:
                break;
        }
        return this.f263428b;
    }

    public xmq0(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.f263428b = constraintLayout;
        this.f263429c = constraintLayout2;
        this.f263430d = textView;
    }
}
