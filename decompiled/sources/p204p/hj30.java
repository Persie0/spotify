package p204p;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class hj30 extends RecyclerView {

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ int f91949j2 = 0;

    /* JADX INFO: renamed from: k2 */
    public final Object f91950k2;

    public hj30(Context context) {
        super(context, null, 0);
        this.f91950k2 = new gj30(getResources());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        switch (this.f91949j2) {
            case 1:
                ((ViewPager2) this.f91950k2).f1390U0.getClass();
                break;
        }
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.f91949j2) {
            case 1:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                ViewPager2 viewPager2 = (ViewPager2) this.f91950k2;
                accessibilityEvent.setFromIndex(viewPager2.f1394d);
                accessibilityEvent.setToIndex(viewPager2.f1394d);
                accessibilityEvent.setSource(viewPager2.f1390U0.f134324d);
                accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
                break;
            default:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f91949j2) {
            case 1:
                return ((ViewPager2) this.f91950k2).f1388S0 && super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        switch (this.f91949j2) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                hjv0 adapter = getAdapter();
                if (size > 0 && adapter != null && adapter.mo1617e() > 0) {
                    gj30 gj30Var = (gj30) this.f91950k2;
                    int i4 = 0;
                    int iMo28437g = adapter.mo28437g(0);
                    gj30Var.getClass();
                    if (iMo28437g == R.id.hub_glue_card_title || iMo28437g == R.id.hub_glue_card_title_metadata || iMo28437g == R.id.hub_glue_card_title_subtitle || iMo28437g == R.id.hub_glue2_regular_card_title || iMo28437g == R.id.hub_glue2_regular_card_title_metadata || iMo28437g == R.id.hub_glue2_regular_card_title_subtitle || iMo28437g == R.id.hub_glue2_regular_card_subtitle_only) {
                        i4 = gj30Var.f80340a;
                        i3 = gj30Var.f80341b;
                    } else if (iMo28437g == R.id.hub_glue_card_category || iMo28437g == R.id.hub_glue2_card_category) {
                        i3 = gj30Var.f80344e;
                        f = gj30Var.f80345f;
                        int i5 = size / ((int) (i3 * f));
                        int i6 = gj30Var.f80343d;
                        float f5 = size;
                        f2 = f5 / (((int) (((i3 + i4) - i4) * f)) + i6);
                        f3 = (int) f2;
                        f4 = f2 - f3;
                        if (f4 < 0.2f) {
                            f2 = f3 + 0.2f;
                        } else if (f4 > 0.8f) {
                            f2 = ((int) (f2 + 1.0f)) + 0.2f;
                        }
                        i2 = View.MeasureSpec.makeMeasureSpec(((int) ((1.0f / f) * (((int) (f5 / Math.max(f2, i5 + 0.2f))) - i6))) + i4, 1073741824);
                    } else if (iMo28437g == R.id.hub_glue_card_no_text) {
                        i3 = gj30Var.f80342c;
                    } else {
                        i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    }
                    f = 1.0f;
                    int i7 = size / ((int) (i3 * f));
                    int i8 = gj30Var.f80343d;
                    float f6 = size;
                    f2 = f6 / (((int) (((i3 + i4) - i4) * f)) + i8);
                    f3 = (int) f2;
                    f4 = f2 - f3;
                    if (f4 < 0.2f) {
                        f2 = f3 + 0.2f;
                    } else if (f4 > 0.8f) {
                        f2 = ((int) (f2 + 1.0f)) + 0.2f;
                    }
                    i2 = View.MeasureSpec.makeMeasureSpec(((int) ((1.0f / f) * (((int) (f6 / Math.max(f2, i7 + 0.2f))) - i8))) + i4, 1073741824);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f91949j2) {
            case 1:
                return ((ViewPager2) this.f91950k2).f1388S0 && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj30(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f91950k2 = viewPager2;
    }
}
