package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.music.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class rhs extends ListView {

    /* JADX INFO: renamed from: L0 */
    public r690 f199326L0;

    /* JADX INFO: renamed from: M0 */
    public eph f199327M0;

    /* JADX INFO: renamed from: a */
    public final Rect f199328a;

    /* JADX INFO: renamed from: b */
    public int f199329b;

    /* JADX INFO: renamed from: c */
    public int f199330c;

    /* JADX INFO: renamed from: d */
    public int f199331d;

    /* JADX INFO: renamed from: e */
    public int f199332e;

    /* JADX INFO: renamed from: f */
    public int f199333f;

    /* JADX INFO: renamed from: g */
    public phs f199334g;

    /* JADX INFO: renamed from: h */
    public boolean f199335h;

    /* JADX INFO: renamed from: i */
    public final boolean f199336i;

    /* JADX INFO: renamed from: t */
    public boolean f199337t;

    public rhs(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f199328a = new Rect();
        this.f199329b = 0;
        this.f199330c = 0;
        this.f199331d = 0;
        this.f199332e = 0;
        this.f199336i = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m75519a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: b */
    public final boolean m75520b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM66977a;
        View childAt;
        View childAt2;
        r690 r690Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.f199337t = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f199333f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z) {
                if (this.f199326L0 == null) {
                    this.f199326L0 = new r690(this);
                }
                r690 r690Var2 = this.f199326L0;
                boolean z3 = r690Var2.f196200N0;
                r690Var2.f196200N0 = true;
                r690Var2.onTouch(this, motionEvent);
            } else {
                r690Var = this.f199326L0;
                if (r690Var != null) {
                    if (r690Var.f196200N0) {
                        r690Var.m74850d();
                    }
                    r690Var.f196200N0 = false;
                }
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f199337t = true;
                mhs.m61786a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f199333f;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f199333f = iPointToPosition;
                mhs.m61786a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f199328a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f199329b;
                rect.top -= this.f199330c;
                rect.right += this.f199331d;
                rect.bottom += this.f199332e;
                if (jqa.m54083a()) {
                    zM66977a = ohs.m66977a(this);
                } else {
                    Field field = qhs.f188845a;
                    if (field != null) {
                        try {
                            zM66977a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM66977a = false;
                        }
                    } else {
                        zM66977a = false;
                    }
                }
                if (childAt3.isEnabled() != zM66977a) {
                    boolean z5 = !zM66977a;
                    if (jqa.m54083a()) {
                        ohs.m66978b(this, z5);
                    } else {
                        Field field2 = qhs.f188845a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                phs phsVar = this.f199334g;
                if (phsVar != null) {
                    phsVar.f177717b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f199337t = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f199333f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f199337t = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f199333f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f199326L0 == null) {
                this.f199326L0 = new r690(this);
            }
            r690 r690Var3 = this.f199326L0;
            boolean z6 = r690Var3.f196200N0;
            r690Var3.f196200N0 = true;
            r690Var3.onTouch(this, motionEvent);
        } else {
            r690Var = this.f199326L0;
            if (r690Var != null) {
                if (r690Var.f196200N0) {
                    r690Var.m74850d();
                }
                r690Var.f196200N0 = false;
            }
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f199328a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f199327M0 != null) {
            return;
        }
        super.drawableStateChanged();
        phs phsVar = this.f199334g;
        if (phsVar != null) {
            phsVar.f177717b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f199337t && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f199336i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f199336i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f199336i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f199336i && this.f199335h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f199327M0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f199327M0 == null) {
            eph ephVar = new eph(this, 20);
            this.f199327M0 = ephVar;
            post(ephVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !nhs.f154070d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        nhs.f154067a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        nhs.f154068b.invoke(this, Integer.valueOf(iPointToPosition));
                        nhs.f154069c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f199337t && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f199333f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        eph ephVar = this.f199327M0;
        if (ephVar != null) {
            rhs rhsVar = (rhs) ephVar.f61650b;
            rhsVar.f199327M0 = null;
            rhsVar.removeCallbacks(ephVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f199335h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        phs phsVar;
        if (drawable != null) {
            phsVar = new phs(drawable);
            phsVar.f177717b = true;
        } else {
            phsVar = null;
        }
        this.f199334g = phsVar;
        super.setSelector(phsVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f199329b = rect.left;
        this.f199330c = rect.top;
        this.f199331d = rect.right;
        this.f199332e = rect.bottom;
    }
}
