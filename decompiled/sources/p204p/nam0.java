package p204p;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class nam0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f152098a;

    /* JADX INFO: renamed from: b */
    public final Space f152099b;

    /* JADX INFO: renamed from: c */
    public final View f152100c;

    public nam0(ConstraintLayout constraintLayout, Space space, View view, RecyclerView recyclerView) {
        this.f152098a = constraintLayout;
        this.f152099b = space;
        this.f152100c = view;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f152098a;
    }
}
