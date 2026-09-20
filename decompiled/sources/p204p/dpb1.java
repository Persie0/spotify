package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class dpb1 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51255a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f51256b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f51257c;

    /* JADX INFO: renamed from: d */
    public final TextView f51258d;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f51259e;

    public /* synthetic */ dpb1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, RecyclerView recyclerView, int i) {
        this.f51255a = i;
        this.f51256b = constraintLayout;
        this.f51257c = constraintLayout2;
        this.f51258d = textView;
        this.f51259e = recyclerView;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f51255a) {
            case 0:
                break;
        }
        return this.f51256b;
    }
}
