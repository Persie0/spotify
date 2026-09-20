package com.spotify.watchfeed.uiusecases.associatedtextsrow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/watchfeed/uiusecases/associatedtextsrow/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getChildScrollDirection", "()I", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "parentViewPager", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "src_main_java_com_spotify_watchfeed_uiusecases_associatedtextsrow-associatedtextsrow"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NestedScrollableHost extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f6923a;

    /* JADX INFO: renamed from: b */
    public float f6924b;

    /* JADX INFO: renamed from: c */
    public float f6925c;

    public NestedScrollableHost(Context context) {
        super(context);
        this.f6923a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final int getChildScrollDirection() {
        View child;
        View child2 = getChild();
        if (child2 != null && child2.canScrollHorizontally(1)) {
            return 0;
        }
        View child3 = getChild();
        if (child3 != null && child3.canScrollHorizontally(-1)) {
            return 0;
        }
        View child4 = getChild();
        return ((child4 == null || !child4.canScrollVertically(1)) && ((child = getChild()) == null || !child.canScrollVertically(-1))) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 getParentViewPager() {
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            while (true) {
                if ((view == null || (view instanceof ViewPager2)) && (view == null || ((ViewPager2) view).getOrientation() == getChildScrollDirection())) {
                    break;
                }
                Object parent2 = view.getParent();
                view = parent2 instanceof View ? (View) parent2 : null;
            }
            return (ViewPager2) view;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22935a(float f, int i) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i2);
            }
            return false;
        }
        if (i != 1) {
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (m22935a(-1.0f, orientation) || m22935a(1.0f, orientation)) {
                if (motionEvent.getAction() == 0) {
                    this.f6924b = motionEvent.getX();
                    this.f6925c = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.f6924b;
                    float y = motionEvent.getY() - this.f6925c;
                    boolean z = orientation == 0;
                    float fAbs = Math.abs(x) * (z ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
                    float f = this.f6923a;
                    if (fAbs > f || fAbs2 > f) {
                        if (z == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z) {
                                x = y;
                            }
                            if (m22935a(x, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6923a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
