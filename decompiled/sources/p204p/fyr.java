package p204p;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fyr extends njv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f74827a;

    /* JADX INFO: renamed from: b */
    public final int f74828b;

    /* JADX INFO: renamed from: c */
    public final int f74829c;

    /* JADX INFO: renamed from: d */
    public final int f74830d;

    public fyr(Resources resources, boolean z, kfx kfxVar) {
        this.f74827a = z;
        this.f74828b = resources.getDimensionPixelSize(R.dimen.spacer_8);
        this.f74829c = resources.getDimensionPixelSize(R.dimen.spacer_20);
        this.f74830d = (int) TypedValue.applyDimension(1, 4, resources.getDisplayMetrics());
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        int iM967R = RecyclerView.m967R(view);
        View viewM990I = recyclerView.m990I(view);
        if ((viewM990I == null ? null : recyclerView.m997T(viewM990I)) instanceof kq3) {
            return;
        }
        boolean z = iM967R == this.f74827a;
        Object tag = view.getTag(R.id.custom_top_spacing);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null && !z) {
            rect.top = num.intValue();
            return;
        }
        int i = this.f74829c;
        rect.top = z ? this.f74828b : this.f74830d + i;
        if (iM967R == zjv0Var.m96246b() - 1) {
            rect.bottom = i;
        }
    }
}
