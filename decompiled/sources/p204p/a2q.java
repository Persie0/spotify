package p204p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class a2q extends njv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11712a;

    /* JADX INFO: renamed from: b */
    public final int f11713b;

    /* JADX INFO: renamed from: c */
    public int f11714c;

    public a2q(int i, int i2) {
        this.f11712a = i2;
        switch (i2) {
            case 1:
                this.f11713b = i;
                this.f11714c = i / 2;
                break;
            default:
                this.f11713b = i;
                this.f11714c = -1;
                break;
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        switch (this.f11712a) {
            case 0:
                hjv0 adapter = recyclerView.getAdapter();
                int i = this.f11713b;
                if (adapter != null && adapter.mo1617e() == 1) {
                    rect.set(i, 0, i, 0);
                } else {
                    int iM967R = RecyclerView.m967R(view);
                    if (iM967R == 0) {
                        rect.set(i, 0, i, 0);
                    } else if (iM967R != this.f11714c) {
                        rect.set(0, 0, i, 0);
                    } else {
                        rect.set(0, 0, i, 0);
                    }
                }
                break;
            default:
                AbstractC0110a layoutManager = recyclerView.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                int i2 = gridLayoutManager != null ? gridLayoutManager.f1156f1 : 2;
                if (i2 != 0) {
                    int iM967R2 = RecyclerView.m967R(view) % i2;
                    int i3 = this.f11714c;
                    rect.top = i3;
                    rect.bottom = i3;
                    int i4 = this.f11713b;
                    rect.left = (iM967R2 * i4) / i2;
                    rect.right = (((i2 - 1) - iM967R2) * i4) / i2;
                    break;
                }
                break;
        }
    }
}
