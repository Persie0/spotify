package p204p;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cbj implements xfl0, rr91 {

    /* JADX INFO: renamed from: a */
    public final yaj f36137a;

    /* JADX INFO: renamed from: b */
    public final boolean f36138b;

    /* JADX INFO: renamed from: c */
    public final boolean f36139c;

    /* JADX INFO: renamed from: d */
    public final ugz f36140d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f36141e;

    public cbj(LayoutInflater layoutInflater, ViewGroup viewGroup, yaj yajVar, boolean z, boolean z2, ugz ugzVar) {
        this.f36137a = yajVar;
        this.f36138b = z;
        this.f36139c = z2;
        this.f36140d = ugzVar;
        View viewInflate = layoutInflater.inflate(R.layout.consumption_tracker_ui, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate, R.id.recycler_view_options);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_view_options)));
        }
        int i = wkm0.f252262Q0;
        this.f36141e = ujg1.m83280u((FrameLayout) viewInflate);
        recyclerView.setClipToPadding(false);
        p3h1.m69032r(recyclerView, bih.f27460Y);
        recyclerView.setAdapter(yajVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        SparseArray sparseArray = yajVar.f270920e;
        sparseArray.put(2, new qe1(this, 5));
        sparseArray.put(3, new qe1(this, 6));
        sparseArray.put(4, new qe1(this, 3));
        sparseArray.put(5, new qe1(this, 4));
        sparseArray.put(1, new qe1(this, 1));
        sparseArray.put(7, new qe1(this, 0));
        sparseArray.put(8, new qe1(this, 2));
    }

    @Override // p204p.rr91
    /* JADX INFO: renamed from: a */
    public final View mo25081a() {
        return this.f36141e;
    }

    @Override // p204p.xfl0
    /* JADX INFO: renamed from: b */
    public final void mo32172b(String str) {
        this.f36140d.mo32172b(str);
    }

    @Override // p204p.xfl0
    /* JADX INFO: renamed from: c */
    public final void mo32173c(String str) {
        this.f36140d.mo32173c(str);
    }

    @Override // p204p.xfl0
    /* JADX INFO: renamed from: f */
    public final void mo32174f(String str) {
        this.f36140d.mo32174f(str);
    }

    @Override // p204p.xfl0
    /* JADX INFO: renamed from: l */
    public final void mo32175l(String str) {
        this.f36140d.mo32175l(str);
    }

    @Override // p204p.xfl0
    /* JADX INFO: renamed from: m */
    public final void mo32176m(String str) {
        this.f36140d.mo32176m(str);
    }
}
