package p204p;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class y5c extends njv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f269404a;

    public /* synthetic */ y5c(int i) {
        this.f269404a = i;
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        switch (this.f269404a) {
            case 0:
                Resources resources = recyclerView.getContext().getResources();
                int iM967R = RecyclerView.m967R(view);
                if (iM967R == 0) {
                    rect.left = resources.getDimensionPixelSize(R.dimen.spacer_16);
                    rect.right = resources.getDimensionPixelSize(R.dimen.spacer_8);
                } else if (iM967R != zjv0Var.m96246b() - 1) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.spacer_8);
                    rect.left = dimensionPixelSize;
                    rect.right = dimensionPixelSize;
                } else {
                    rect.right = resources.getDimensionPixelSize(R.dimen.spacer_16);
                    rect.left = resources.getDimensionPixelSize(R.dimen.spacer_8);
                }
                break;
            case 1:
                int iM967R2 = RecyclerView.m967R(view);
                if (iM967R2 == 0) {
                    rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
                    if (zjv0Var.m96246b() == 2) {
                        rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_12);
                    }
                } else if (iM967R2 != zjv0Var.m96246b() - 1) {
                    int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_12);
                    rect.left = dimensionPixelSize2;
                    rect.right = dimensionPixelSize2;
                } else {
                    rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
                }
                break;
            case 2:
                if (RecyclerView.m967R(view) != zjv0Var.m96246b() - 1) {
                    rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
                } else {
                    rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
                    rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
                }
                break;
            case 3:
            case 5:
            default:
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                break;
            case 4:
                rect.bottom = view.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16);
                break;
            case 6:
                Resources resources2 = recyclerView.getContext().getResources();
                int iM967R3 = RecyclerView.m967R(view);
                if (iM967R3 == 0) {
                    rect.left = resources2.getDimensionPixelSize(R.dimen.spacer_16);
                    rect.right = resources2.getDimensionPixelSize(R.dimen.spacer_8);
                } else if (iM967R3 != zjv0Var.m96246b() - 1) {
                    int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.spacer_8);
                    rect.left = dimensionPixelSize3;
                    rect.right = dimensionPixelSize3;
                } else {
                    rect.right = resources2.getDimensionPixelSize(R.dimen.spacer_16);
                    rect.left = resources2.getDimensionPixelSize(R.dimen.spacer_8);
                }
                break;
            case 7:
                Resources resources3 = recyclerView.getContext().getResources();
                rect.bottom = resources3.getDimensionPixelSize(R.dimen.spacer_16);
                if (RecyclerView.m967R(view) % 2 != 0) {
                    rect.right = resources3.getDimensionPixelSize(R.dimen.spacer_16);
                    rect.left = resources3.getDimensionPixelSize(R.dimen.spacer_8);
                } else {
                    rect.left = resources3.getDimensionPixelSize(R.dimen.spacer_16);
                    rect.right = resources3.getDimensionPixelSize(R.dimen.spacer_8);
                }
                break;
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: g */
    public void mo29374g(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        switch (this.f269404a) {
            case 5:
                if ((recyclerView.getAdapter() instanceof xie1) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: h */
    public void mo28974h(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        switch (this.f269404a) {
            case 3:
                Drawable drawable = recyclerView.getContext().getDrawable(R.drawable.list_separator);
                if (drawable == null) {
                    return;
                }
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int i = 0;
                while (true) {
                    if (!(i < recyclerView.getChildCount())) {
                        return;
                    }
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int iM967R = RecyclerView.m967R(childAt);
                    if (iM967R == -1) {
                        return;
                    }
                    if (1 <= iM967R && iM967R <= zjv0Var.m96246b() - 3) {
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((ojv0) childAt.getLayoutParams())).bottomMargin;
                        drawable.setBounds(new Rect(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom));
                        drawable.draw(canvas);
                    }
                    i = i2;
                }
                break;
            default:
                return;
        }
    }

    public y5c(f3d0 f3d0Var) {
        this.f269404a = 5;
        kza1.m57748c(null);
        kza1.m57748c(null);
    }
}
