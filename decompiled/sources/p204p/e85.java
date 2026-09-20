package p204p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes3.dex */
public class e85 extends ToggleButton {

    /* JADX INFO: renamed from: a */
    private final t55 f57069a;

    /* JADX INFO: renamed from: b */
    private final u75 f57070b;

    /* JADX INFO: renamed from: c */
    private s65 f57071c;

    public e85(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private s65 getEmojiTextViewHelper() {
        if (this.f57071c == null) {
            this.f57071c = new s65(this);
        }
        return this.f57071c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        u75 u75Var = this.f57070b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f57070b.m82492j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f57070b.m82493k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m77317d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f57070b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f57070b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m77318e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m77314a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f57069a;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f57070b.m82500r(colorStateList);
        this.f57070b.m82485b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f57070b.m82501s(mode);
        this.f57070b.m82485b();
    }

    public e85(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eg71.m38806a(getContext(), this);
        t55 t55Var = new t55(this);
        this.f57069a = t55Var;
        t55Var.m80085d(attributeSet, i);
        u75 u75Var = new u75(this);
        this.f57070b = u75Var;
        u75Var.m82495m(attributeSet, i);
        getEmojiTextViewHelper().m77316c(attributeSet, i);
    }
}
