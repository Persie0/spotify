package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class kef extends njv0 {

    /* JADX INFO: renamed from: a */
    public final float f121877a;

    /* JADX INFO: renamed from: b */
    public final float f121878b;

    /* JADX INFO: renamed from: c */
    public final float f121879c;

    /* JADX INFO: renamed from: d */
    public final Paint f121880d;

    /* JADX INFO: renamed from: e */
    public final int f121881e;

    /* JADX INFO: renamed from: f */
    public final float f121882f;

    /* JADX INFO: renamed from: g */
    public final boolean f121883g;

    public kef(Context context) {
        this.f121877a = context.getResources().getDimensionPixelSize(R.dimen.comment_horizontal_margin);
        this.f121878b = context.getResources().getDimensionPixelSize(R.dimen.comment_vertical_margin);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.comment_divider_height);
        this.f121879c = dimensionPixelSize;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(lzj.m60386v(context, R.color.dark_base_background_tinted_highlight));
        paint.setStrokeWidth(dimensionPixelSize);
        this.f121880d = paint;
        this.f121881e = context.getResources().getDimensionPixelSize(R.dimen.encore_spacer_tighter) + (context.getResources().getDimensionPixelSize(R.dimen.encore_spacer_base) * 2);
        this.f121882f = context.getResources().getDimensionPixelSize(R.dimen.reply_top_margin);
        this.f121883g = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        Object tag = view.getTag(R.id.comments_list_entity_type);
        khf khfVar = tag instanceof khf ? (khf) tag : null;
        int i = khfVar == null ? -1 : jef.f111546a[khfVar.ordinal()];
        boolean z = this.f121883g;
        int i2 = this.f121881e;
        float f = this.f121878b;
        switch (i) {
            case -1:
            case 8:
            case 9:
            case 10:
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int iM967R = RecyclerView.m967R(view);
                rect.top = iM967R == 0 ? ((int) f) / 2 : (int) f;
                if (iM967R == zjv0Var.m96246b() - 1) {
                    rect.bottom = (int) f;
                    return;
                }
                return;
            case 2:
                rect.top = (int) this.f121882f;
                return;
            case 3:
                if (RecyclerView.m967R(view) == zjv0Var.m96246b() - 1) {
                    rect.bottom = ((int) f) / 2;
                }
                if (z) {
                    rect.right = i2;
                    return;
                } else {
                    rect.left = i2;
                    return;
                }
            case 4:
            case 5:
            case 6:
            case 7:
                if (z) {
                    rect.right = i2;
                    return;
                } else {
                    rect.left = i2;
                    return;
                }
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: h */
    public final void mo28974h(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        Canvas canvas2;
        int iM967R;
        Iterator it = new ek5(recyclerView, 8).iterator();
        uhf uhfVar = null;
        while (true) {
            C2042k7 c2042k7 = (C2042k7) it;
            if (!c2042k7.hasNext()) {
                return;
            }
            View view = (View) c2042k7.next();
            hjv0 adapter = recyclerView.getAdapter();
            sgf sgfVar = adapter instanceof sgf ? (sgf) adapter : null;
            pqm0 pqm0Var = (sgfVar == null || (iM967R = RecyclerView.m967R(view)) == -1) ? null : new pqm0((uhf) sgfVar.m45324A(iM967R), Integer.valueOf(iM967R));
            uhf uhfVar2 = pqm0Var != null ? (uhf) pqm0Var.f180350a : null;
            if (!(uhfVar2 instanceof jhf)) {
                canvas2 = canvas;
                if (!(uhfVar2 instanceof mhf) && !(uhfVar2 instanceof nhf) && !(uhfVar2 instanceof phf) && !(uhfVar2 instanceof rhf) && !(uhfVar2 instanceof shf) && !(uhfVar2 instanceof thf) && !wj50.m88271j(uhfVar2, lhf.f133555b) && !wj50.m88271j(uhfVar2, ohf.f165421b) && !wj50.m88271j(uhfVar2, qhf.f188769b) && uhfVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (((Number) pqm0Var.f180351b).intValue() <= 0 || (uhfVar instanceof qhf)) {
                canvas2 = canvas;
            } else {
                float top = view.getTop() - ((this.f121878b + this.f121879c) / 2);
                canvas2 = canvas;
                canvas2.drawLine(this.f121877a, top, view.getRight() - this.f121877a, top, this.f121880d);
            }
            uhfVar = uhfVar2;
            canvas = canvas2;
        }
    }
}
