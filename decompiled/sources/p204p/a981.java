package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class a981 implements rr91 {

    /* JADX INFO: renamed from: a */
    public final r881 f13518a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f13519b;

    public a981(LayoutInflater layoutInflater, ViewGroup viewGroup, r881 r881Var) {
        this.f13518a = r881Var;
        View viewInflate = layoutInflater.inflate(R.layout.top_ups_details_ui, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate, R.id.recycler_view_top_up);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_view_top_up)));
        }
        int i = wkm0.f252262Q0;
        this.f13519b = ujg1.m83280u((CoordinatorLayout) viewInflate);
        p3h1.m69032r(recyclerView, jq71.f114838f);
        recyclerView.setAdapter(r881Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.m1011i(new y5c(3));
    }

    @Override // p204p.rr91
    /* JADX INFO: renamed from: a */
    public final View mo25081a() {
        return this.f13519b;
    }
}
