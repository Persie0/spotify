package p204p;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class rb01 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f197418a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f197419b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f197420c;

    public rb01(ConstraintLayout constraintLayout, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f197418a = constraintLayout;
        this.f197419b = frameLayout;
        this.f197420c = recyclerView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f197418a;
    }
}
