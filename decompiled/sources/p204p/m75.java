package p204p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class m75 extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f140660i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    private final t55 f140661a;

    /* JADX INFO: renamed from: b */
    public final Context f140662b;

    /* JADX INFO: renamed from: c */
    public final b75 f140663c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f140664d;

    /* JADX INFO: renamed from: e */
    public final boolean f140665e;

    /* JADX INFO: renamed from: f */
    public final l75 f140666f;

    /* JADX INFO: renamed from: g */
    public int f140667g;

    /* JADX INFO: renamed from: h */
    public final Rect f140668h;

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    public m75(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.spotify.music.R.attr.spinnerStyle);
        this.f140668h = new Rect();
        eg71.m38806a(getContext(), this);
        int[] iArr = h3u0.f87342v;
        cx21 cx21VarM34178J = cx21.m34178J(context, attributeSet, iArr, com.spotify.music.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) cx21VarM34178J.f42890c;
        this.f140661a = new t55(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f140662b = new g9k(context, resourceId);
        } else {
            this.f140662b = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f140660i, com.spotify.music.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    f75 f75Var = new f75(this);
                    this.f140666f = f75Var;
                    f75Var.f66561d = typedArray.getString(2);
                } else if (i == 1) {
                    j75 j75Var = new j75(this, this.f140662b, attributeSet);
                    cx21 cx21VarM34178J2 = cx21.m34178J(this.f140662b, attributeSet, iArr, com.spotify.music.R.attr.spinnerStyle);
                    this.f140667g = ((TypedArray) cx21VarM34178J2.f42890c).getLayoutDimension(3, -2);
                    j75Var.m55158o(cx21VarM34178J2.m34202l(1));
                    j75Var.f109487Z0 = typedArray.getString(2);
                    cx21VarM34178J2.m34189K();
                    this.f140666f = j75Var;
                    this.f140663c = new b75(this, this, j75Var);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.spotify.music.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                cx21VarM34178J.m34189K();
                this.f140665e = true;
                spinnerAdapter = this.f140664d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f140664d = null;
                }
                this.f140661a.m80085d(attributeSet, com.spotify.music.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            f75 f75Var2 = new f75(this);
            this.f140666f = f75Var2;
            f75Var2.f66561d = typedArray.getString(2);
        } else if (i == 1) {
            j75 j75Var2 = new j75(this, this.f140662b, attributeSet);
            cx21 cx21VarM34178J3 = cx21.m34178J(this.f140662b, attributeSet, iArr, com.spotify.music.R.attr.spinnerStyle);
            this.f140667g = ((TypedArray) cx21VarM34178J3.f42890c).getLayoutDimension(3, -2);
            j75Var2.m55158o(cx21VarM34178J3.m34202l(1));
            j75Var2.f109487Z0 = typedArray.getString(2);
            cx21VarM34178J3.m34189K();
            this.f140666f = j75Var2;
            this.f140663c = new b75(this, this, j75Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.spotify.music.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        cx21VarM34178J.m34189K();
        this.f140665e = true;
        spinnerAdapter = this.f140664d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f140664d = null;
        }
        this.f140661a.m80085d(attributeSet, com.spotify.music.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m61045a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f140668h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            t55Var.m80082a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        l75 l75Var = this.f140666f;
        return l75Var != null ? l75Var.mo40951c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        l75 l75Var = this.f140666f;
        return l75Var != null ? l75Var.mo40958j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f140666f != null ? this.f140667g : super.getDropDownWidth();
    }

    public final l75 getInternalPopup() {
        return this.f140666f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        l75 l75Var = this.f140666f;
        return l75Var != null ? l75Var.mo40950b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f140662b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        l75 l75Var = this.f140666f;
        return l75Var != null ? l75Var.mo40953e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l75 l75Var = this.f140666f;
        if (l75Var == null || !l75Var.mo40949a()) {
            return;
        }
        l75Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f140666f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m61045a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        k75 k75Var = (k75) parcelable;
        super.onRestoreInstanceState(k75Var.getSuperState());
        if (!k75Var.f119979a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new zx1(this, 1));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        k75 k75Var = new k75(super.onSaveInstanceState());
        l75 l75Var = this.f140666f;
        k75Var.f119979a = l75Var != null && l75Var.mo40949a();
        return k75Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b75 b75Var = this.f140663c;
        if (b75Var == null || !b75Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        l75 l75Var = this.f140666f;
        if (l75Var == null) {
            return super.performClick();
        }
        if (l75Var.mo40949a()) {
            return true;
        }
        l75Var.mo40957i(d75.m35181b(this), d75.m35180a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        l75 l75Var = this.f140666f;
        if (l75Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            l75Var.mo40956h(i);
            l75Var.mo40952d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        l75 l75Var = this.f140666f;
        if (l75Var != null) {
            l75Var.mo40955g(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f140666f != null) {
            this.f140667g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        l75 l75Var = this.f140666f;
        if (l75Var != null) {
            l75Var.mo40960o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ihf1.m50639w(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        l75 l75Var = this.f140666f;
        if (l75Var != null) {
            l75Var.mo40954f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f140661a;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f140665e) {
            this.f140664d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        l75 l75Var = this.f140666f;
        if (l75Var != null) {
            Context context = this.f140662b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            g75 g75Var = new g75();
            g75Var.f77179a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                g75Var.f77180b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                e75.m38060a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            l75Var.mo40959k(g75Var);
        }
    }
}
