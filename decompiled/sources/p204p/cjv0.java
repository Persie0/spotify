package p204p;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cjv0 extends njv0 implements pjv0 {

    /* JADX INFO: renamed from: a */
    public final int f38692a;

    /* JADX INFO: renamed from: b */
    public boolean f38693b;

    public cjv0(int i) {
        this.f38692a = i;
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: a */
    public void mo32996a(View view) {
        view.setTag(this.f38692a, null);
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: b */
    public void mo32997b(View view) {
        view.setTag(this.f38692a, null);
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        int iM967R = RecyclerView.m967R(view);
        if (iM967R > -1) {
            int i = this.f38692a;
            Boolean bool = (Boolean) view.getTag(i);
            if (bool == null || bool.booleanValue()) {
                mo32999j(iM967R, recyclerView.m997T(view));
                view.setTag(i, Boolean.valueOf(this.f38693b));
            }
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: g */
    public final void mo29374g(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        this.f38693b = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m32998i(RecyclerView recyclerView) {
        this.f38693b = false;
        recyclerView.m1011i(this);
        recyclerView.m1013j(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo32999j(int i, dkv0 dkv0Var);
}
