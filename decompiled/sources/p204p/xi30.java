package p204p;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.recyclerviewutil.FrameLayoutManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xi30 {
    /* JADX INFO: renamed from: a */
    public static RecyclerView m91080a(Context context, boolean z) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setHasFixedSize(true);
        if (z) {
            recyclerView.setClipToPadding(false);
            p3h1.m69032r(recyclerView, new C2089lg(10));
        }
        return recyclerView;
    }

    /* JADX INFO: renamed from: b */
    public static RecyclerView m91081b(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new FrameLayoutManager());
        recyclerView.setHasFixedSize(true);
        return recyclerView;
    }

    /* JADX INFO: renamed from: k */
    public static void m91082k(RecyclerView recyclerView, boolean z) {
        if (!z) {
            mjv0 itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo33396g();
            }
            AbstractC0110a layoutManager = recyclerView.getLayoutManager();
            recyclerView.setLayoutManager(null);
            recyclerView.setLayoutManager(layoutManager);
        }
        recyclerView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: c */
    public abstract RecyclerView mo57293c();

    /* JADX INFO: renamed from: d */
    public abstract RecyclerView mo57294d();

    /* JADX INFO: renamed from: e */
    public abstract View mo57295e();

    /* JADX INFO: renamed from: f */
    public abstract void mo57296f(nt30 nt30Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo57297g(Parcelable parcelable);

    /* JADX INFO: renamed from: h */
    public abstract Parcelable mo57298h();

    /* JADX INFO: renamed from: i */
    public abstract void mo57299i(b9k b9kVar);

    /* JADX INFO: renamed from: j */
    public void mo57300j(int... iArr) {
        frz0.m42534s(mo57293c(), iArr);
    }
}
