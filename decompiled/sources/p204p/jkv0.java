package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class jkv0 extends njv0 {

    /* JADX INFO: renamed from: c */
    public static final hkv0 f113416c = new hkv0();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113417a;

    /* JADX INFO: renamed from: b */
    public final Object f113418b;

    public /* synthetic */ jkv0(Object obj, int i) {
        this.f113417a = i;
        this.f113418b = obj;
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        switch (this.f113417a) {
            case 0:
                Drawable drawable = (Drawable) this.f113418b;
                int iMo47855a = (recyclerView.getAdapter() instanceof ikv0 ? (ikv0) recyclerView.getAdapter() : f113416c).mo47855a(RecyclerView.m967R(view));
                if ((iMo47855a & 2) != 0) {
                    rect.top = drawable.getIntrinsicHeight() + rect.top;
                }
                if ((iMo47855a & 1) != 0) {
                    rect.bottom = drawable.getIntrinsicHeight() + rect.bottom;
                }
                break;
            case 1:
                int i = ((i4c) this.f113418b).f98491f;
                super.mo24519f(rect, view, recyclerView, zjv0Var);
                hjv0 adapter = recyclerView.getAdapter();
                if (adapter != null && RecyclerView.m967R(view) != adapter.mo1617e() - 1) {
                    if (recyclerView.getLayoutDirection() != 1) {
                        rect.set(0, 0, -i, 0);
                    } else {
                        rect.set(-i, 0, 0, 0);
                    }
                }
                break;
            default:
                kfx kfxVar = (kfx) this.f113418b;
                Object tag = view.getTag(R.id.adds_horizontal_padding);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    int i2 = kfxVar.f122237b;
                    rect.left = i2;
                    rect.right = i2;
                    break;
                }
                break;
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: g */
    public void mo29374g(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        switch (this.f113417a) {
            case 0:
                Drawable drawable = (Drawable) this.f113418b;
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int iMo47855a = (recyclerView.getAdapter() instanceof ikv0 ? (ikv0) recyclerView.getAdapter() : f113416c).mo47855a(RecyclerView.m967R(childAt));
                    if (iMo47855a > 0) {
                        WeakHashMap weakHashMap = mec1.f142677a;
                        drawable.setAlpha((int) (childAt.getAlpha() * 255.0f));
                        ojv0 ojv0Var = (ojv0) childAt.getLayoutParams();
                        if ((iMo47855a & 2) != 0) {
                            int top = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin) - ((int) childAt.getTranslationY());
                            drawable.setBounds(paddingLeft, top - drawable.getIntrinsicHeight(), width, top);
                            drawable.draw(canvas);
                        }
                        if ((iMo47855a & 1) != 0) {
                            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin + ((int) childAt.getTranslationY());
                            drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                            drawable.draw(canvas);
                        }
                    }
                }
                break;
        }
    }

    public jkv0(Context context) {
        this.f113417a = 0;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(android.R.attr.listDivider, typedValue, true)) {
            throw new RuntimeException("Divider drawable is not defined in the theme.");
        }
        Drawable drawable = context.getDrawable(typedValue.resourceId);
        this.f113418b = drawable;
        if (drawable instanceof NinePatchDrawable) {
            ((NinePatchDrawable) drawable).getPaint();
        }
    }
}
