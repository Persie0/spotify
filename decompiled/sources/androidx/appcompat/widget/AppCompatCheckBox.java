package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.spotify.music.R;
import p204p.eg71;
import p204p.ihf1;
import p204p.jw71;
import p204p.s65;
import p204p.t55;
import p204p.u75;
import p204p.y55;

/* JADX INFO: loaded from: classes3.dex */
public class AppCompatCheckBox extends CheckBox {

    /* JADX INFO: renamed from: a */
    private final y55 f165a;

    /* JADX INFO: renamed from: b */
    private final t55 f166b;

    /* JADX INFO: renamed from: c */
    private final u75 f167c;

    /* JADX INFO: renamed from: d */
    private s65 f168d;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private s65 getEmojiTextViewHelper() {
        if (this.f168d == null) {
            this.f168d = new s65(this);
        }
        return this.f168d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        u75 u75Var = this.f167c;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        y55 y55Var = this.f165a;
        if (y55Var != null) {
            y55Var.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        y55 y55Var = this.f165a;
        if (y55Var != null) {
            return y55Var.f269350b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        y55 y55Var = this.f165a;
        if (y55Var != null) {
            return y55Var.f269351c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f167c.m82492j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f167c.m82493k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m77317d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        y55 y55Var = this.f165a;
        if (y55Var != null) {
            if (y55Var.f269354f) {
                y55Var.f269354f = false;
            } else {
                y55Var.f269354f = true;
                y55Var.m92839a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f167c;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f167c;
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
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f166b;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        y55 y55Var = this.f165a;
        if (y55Var != null) {
            y55Var.f269350b = colorStateList;
            y55Var.f269352d = true;
            y55Var.m92839a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        y55 y55Var = this.f165a;
        if (y55Var != null) {
            y55Var.f269351c = mode;
            y55Var.f269353e = true;
            y55Var.m92839a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f167c.m82500r(colorStateList);
        this.f167c.m82485b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f167c.m82501s(mode);
        this.f167c.m82485b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jw71.m54407a(context);
        eg71.m38806a(getContext(), this);
        y55 y55Var = new y55(this);
        this.f165a = y55Var;
        y55Var.m92840b(attributeSet, i);
        t55 t55Var = new t55(this);
        this.f166b = t55Var;
        t55Var.m80085d(attributeSet, i);
        u75 u75Var = new u75(this);
        this.f167c = u75Var;
        u75Var.m82495m(attributeSet, i);
        getEmojiTextViewHelper().m77316c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ihf1.m50639w(getContext(), i));
    }
}
