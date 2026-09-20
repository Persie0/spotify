package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p204p.AbstractC1806e9;
import p204p.ahf1;
import p204p.cpc1;
import p204p.eg71;
import p204p.ihf1;
import p204p.ikc0;
import p204p.jfq0;
import p204p.jw71;
import p204p.kfq0;
import p204p.mwg1;
import p204p.n75;
import p204p.o75;
import p204p.oat;
import p204p.s65;
import p204p.t55;
import p204p.u75;
import p204p.ux7;
import p204p.v75;
import p204p.w75;
import p204p.wo91;
import p204p.yic1;
import p204p.zn91;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements ux7 {

    /* JADX INFO: renamed from: a */
    private final t55 f182a;

    /* JADX INFO: renamed from: b */
    private final u75 f183b;

    /* JADX INFO: renamed from: c */
    private final o75 f184c;

    /* JADX INFO: renamed from: d */
    private s65 f185d;

    /* JADX INFO: renamed from: e */
    public boolean f186e;

    /* JADX INFO: renamed from: f */
    public yic1 f187f;

    /* JADX INFO: renamed from: g */
    public Future f188g;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private s65 getEmojiTextViewHelper() {
        if (this.f185d == null) {
            this.f185d = new s65(this);
        }
        return this.f185d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cpc1.f40542b) {
            return ((yic1) getSuperCaller()).m93707e();
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            return u75Var.m82487e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cpc1.f40542b) {
            return ((yic1) getSuperCaller()).m93708f();
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            return u75Var.m82488f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cpc1.f40542b) {
            return ((yic1) getSuperCaller()).m93709g();
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            return u75Var.m82489g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cpc1.f40542b) {
            return ((yic1) getSuperCaller()).m93710h();
        }
        u75 u75Var = this.f183b;
        return u75Var != null ? u75Var.m82490h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (cpc1.f40542b) {
            return ((yic1) getSuperCaller()).m93711i() == 1 ? 1 : 0;
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            return u75Var.m82491i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return zn91.m96580u0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public v75 getSuperCaller() {
        if (this.f187f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.f187f = new w75(this);
            } else if (i >= 26) {
                this.f187f = new yic1(this, 18);
            }
        }
        return this.f187f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f183b.m82492j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f183b.m82493k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f188g;
        if (future != null) {
            try {
                this.f188g = null;
                ikc0.m50942n(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                zn91.m96528P(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o75 o75Var;
        if (Build.VERSION.SDK_INT >= 28 || (o75Var = this.f184c) == null) {
            return ((yic1) getSuperCaller()).m93712j();
        }
        TextClassifier textClassifier = o75Var.f162468b;
        return textClassifier == null ? n75.m63798a(o75Var.f162467a) : textClassifier;
    }

    public jfq0 getTextMetricsParamsCompat() {
        return zn91.m96528P(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f183b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            oat.m66580d(editorInfo, getText());
        }
        ahf1.m25946r(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u75 u75Var = this.f183b;
        if (u75Var == null || cpc1.f40542b) {
            return;
        }
        u75Var.m82486c();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f188g;
        if (future != null) {
            try {
                this.f188g = null;
                ikc0.m50942n(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                zn91.m96528P(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u75 u75Var = this.f183b;
        if (u75Var == null || cpc1.f40542b || !u75Var.m82494l()) {
            return;
        }
        this.f183b.m82486c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m77317d(z);
    }

    @Override // android.widget.TextView, p204p.ux7
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (cpc1.f40542b) {
            ((yic1) getSuperCaller()).m93715n(i, i2, i3, i4);
            return;
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82497o(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (cpc1.f40542b) {
            ((yic1) getSuperCaller()).m93716o(iArr, i);
            return;
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82498p(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (cpc1.f40542b) {
            ((yic1) getSuperCaller()).m93717p(i);
            return;
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82499q(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(zn91.m96582v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m77318e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m77314a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo84840b(i);
        } else {
            zn91.m96566n0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo84839a(i);
        } else {
            zn91.m96568o0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        zn91.m96570p0(this, i);
    }

    public void setPrecomputedText(kfq0 kfq0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        zn91.m96528P(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f182a;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f183b.m82500r(colorStateList);
        this.f183b.m82485b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f183b.m82501s(mode);
        this.f183b.m82485b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82496n(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o75 o75Var;
        if (Build.VERSION.SDK_INT >= 28 || (o75Var = this.f184c) == null) {
            ((yic1) getSuperCaller()).m93718q(textClassifier);
        } else {
            o75Var.f162468b = textClassifier;
        }
    }

    public void setTextFuture(Future<kfq0> future) {
        this.f188g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(jfq0 jfq0Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicM53206c = jfq0Var.m53206c();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicM53206c != textDirectionHeuristic2 && textDirectionHeuristicM53206c != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicM53206c == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicM53206c == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicM53206c == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicM53206c == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicM53206c == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicM53206c == textDirectionHeuristic2) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(jfq0Var.m53207d());
        mwg1.m63038r(this, jfq0Var.m53204a());
        mwg1.m63041u(this, jfq0Var.m53205b());
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (cpc1.f40542b) {
            super.setTextSize(i, f);
            return;
        }
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82502t(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f186e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1806e9 abstractC1806e9 = wo91.f253411a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f186e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f186e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jw71.m54407a(context);
        this.f186e = false;
        this.f187f = null;
        eg71.m38806a(getContext(), this);
        t55 t55Var = new t55(this);
        this.f182a = t55Var;
        t55Var.m80085d(attributeSet, i);
        u75 u75Var = new u75(this);
        this.f183b = u75Var;
        u75Var.m82495m(attributeSet, i);
        u75Var.m82485b();
        o75 o75Var = new o75();
        o75Var.f162467a = this;
        this.f184c = o75Var;
        getEmojiTextViewHelper().m77316c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ihf1.m50639w(context, i) : null, i2 != 0 ? ihf1.m50639w(context, i2) : null, i3 != 0 ? ihf1.m50639w(context, i3) : null, i4 != 0 ? ihf1.m50639w(context, i4) : null);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ihf1.m50639w(context, i) : null, i2 != 0 ? ihf1.m50639w(context, i2) : null, i3 != 0 ? ihf1.m50639w(context, i3) : null, i4 != 0 ? ihf1.m50639w(context, i4) : null);
        u75 u75Var = this.f183b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }
}
