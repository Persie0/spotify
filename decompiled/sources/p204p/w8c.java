package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class w8c extends njv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248900a;

    /* JADX INFO: renamed from: b */
    public int f248901b;

    public /* synthetic */ w8c() {
        this.f248900a = 4;
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        hjv0 adapter;
        switch (this.f248900a) {
            case 0:
                int i = this.f248901b;
                boolean z = recyclerView.getLayoutDirection() == 1;
                int iM967R = RecyclerView.m967R(view);
                hjv0 adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && iM967R == adapter2.mo1617e() - 1) {
                    rect.set(0, 0, 0, 0);
                } else if (!z) {
                    rect.set(0, 0, i, 0);
                } else {
                    rect.set(i, 0, 0, 0);
                }
                break;
            case 1:
                int i2 = this.f248901b;
                boolean z2 = recyclerView.getLayoutDirection() == 1;
                int iM967R2 = RecyclerView.m967R(view);
                hjv0 adapter3 = recyclerView.getAdapter();
                if (adapter3 != null && iM967R2 == adapter3.mo1617e() - 1) {
                    rect.set(z2 ? i2 / 4 : 0, 0, 0, 0);
                } else if (!z2) {
                    rect.set(0, 0, i2, 0);
                } else {
                    rect.set(i2, 0, 0, 0);
                }
                break;
            case 2:
                int i3 = this.f248901b;
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                int iM967R3 = RecyclerView.m967R(view);
                if (iM967R3 != -1) {
                    if (iM967R3 == 0) {
                        rect.left = i3;
                    }
                    rect.right = i3;
                    break;
                }
                break;
            case 3:
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                rect.bottom = this.f248901b;
                break;
            case 4:
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                if (RecyclerView.m967R(view) == zjv0Var.m96246b() - 1) {
                    rect.bottom = this.f248901b;
                }
                break;
            case 5:
                if (recyclerView.m997T(view).m36323m() > 0) {
                    rect.left = this.f248901b;
                }
                break;
            case 6:
                int i4 = this.f248901b;
                boolean z3 = recyclerView.getLayoutDirection() == 1;
                if (RecyclerView.m967R(view) != 0) {
                    if (!z3) {
                        rect.left = i4;
                    } else {
                        rect.right = i4;
                    }
                }
                break;
            case 7:
                rect.left = this.f248901b;
                break;
            case 8:
                if (RecyclerView.m967R(view) != 0) {
                    rect.set(-this.f248901b, 0, 0, 0);
                    break;
                }
                break;
            case 9:
                int iM967R4 = RecyclerView.m967R(view);
                if (iM967R4 != -1 && (adapter = recyclerView.getAdapter()) != null && iM967R4 != adapter.mo1617e() - 1) {
                    rect.bottom = this.f248901b;
                }
                break;
            case 10:
                int i5 = this.f248901b;
                if (recyclerView.m997T(view).m36323m() == 0) {
                    rect.left = i5 * 2;
                } else if (recyclerView.m997T(view).m36323m() > 0) {
                    rect.left = i5;
                }
                break;
            case 11:
                int i6 = this.f248901b;
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                int iM967R5 = RecyclerView.m967R(view);
                if (iM967R5 != -1) {
                    if (iM967R5 == 0) {
                        rect.left = i6;
                    }
                    rect.right = i6;
                    break;
                }
                break;
            case 12:
                rect.top = RecyclerView.m967R(view) <= 0 ? 0 : this.f248901b;
                break;
            case 13:
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                int i7 = this.f248901b;
                rect.left = i7;
                rect.right = i7;
                rect.bottom = i7;
                rect.top = i7;
                break;
            default:
                int i8 = this.f248901b;
                rect.left = i8;
                rect.right = i8;
                rect.top = i8;
                rect.bottom = i8;
                break;
        }
    }

    public /* synthetic */ w8c(int i, int i2) {
        this.f248900a = i2;
        this.f248901b = i;
    }

    public w8c(Context context, int i) {
        this.f248900a = i;
        switch (i) {
            case 8:
                this.f248901b = (int) Math.rint((context.getResources().getDisplayMetrics().xdpi / 160) * 13);
                break;
            case 9:
            default:
                this.f248901b = (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
                break;
            case 10:
                this.f248901b = (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
                break;
        }
    }

    public w8c(RecyclerView recyclerView, int i) {
        this.f248900a = i;
        switch (i) {
            case 11:
                this.f248901b = recyclerView.getResources().getDimensionPixelOffset(R.dimen.recommendation_card_horizontal_margin);
                break;
            default:
                this.f248901b = recyclerView.getResources().getDimensionPixelOffset(R.dimen.crossword_card_horizontal_margin);
                break;
        }
    }
}
