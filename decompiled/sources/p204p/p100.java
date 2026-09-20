package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class p100 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172907a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f172908b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f172909c;

    public /* synthetic */ p100(ConstraintLayout constraintLayout, RecyclerView recyclerView, int i) {
        this.f172907a = i;
        this.f172908b = constraintLayout;
        this.f172909c = recyclerView;
    }

    /* JADX INFO: renamed from: b */
    public static p100 m68757b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.fop_popup, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate, R.id.popup_fops_rv);
        if (recyclerView != null) {
            return new p100(constraintLayout, recyclerView, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.popup_fops_rv)));
    }

    /* JADX INFO: renamed from: a */
    public ConstraintLayout m68758a() {
        return this.f172908b;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f172907a) {
            case 0:
                break;
        }
        return this.f172908b;
    }
}
