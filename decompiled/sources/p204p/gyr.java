package p204p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class gyr extends njv0 {

    /* JADX INFO: renamed from: d */
    public static final int[] f85691d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a */
    public Drawable f85692a;

    /* JADX INFO: renamed from: b */
    public final int f85693b;

    /* JADX INFO: renamed from: c */
    public final Rect f85694c = new Rect();

    public gyr(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f85691d);
        this.f85692a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f85693b = 1;
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        Drawable drawable = this.f85692a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f85693b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: g */
    public final void mo29374g(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f85692a == null) {
            return;
        }
        int i = this.f85693b;
        int i2 = 0;
        Rect rect = this.f85694c;
        if (i == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView.m970V(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f85692a.setBounds(paddingLeft, iRound - this.f85692a.getIntrinsicHeight(), width, iRound);
                this.f85692a.draw(canvas);
                i2++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().getClass();
            RecyclerView.m970V(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f85692a.setBounds(iRound2 - this.f85692a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f85692a.draw(canvas);
            i2++;
        }
        canvas.restore();
    }
}
