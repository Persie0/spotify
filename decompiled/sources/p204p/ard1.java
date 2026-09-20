package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class ard1 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f19034a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f19035b;

    /* JADX INFO: renamed from: c */
    public final TextView f19036c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f19037d;

    public ard1(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout2) {
        this.f19034a = constraintLayout;
        this.f19035b = recyclerView;
        this.f19036c = textView;
        this.f19037d = constraintLayout2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f19034a;
    }
}
