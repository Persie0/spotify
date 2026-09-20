package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w55 extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    private final x55 f247995a;

    /* JADX INFO: renamed from: b */
    private final t55 f247996b;

    /* JADX INFO: renamed from: c */
    private final u75 f247997c;

    /* JADX INFO: renamed from: d */
    private s65 f247998d;

    public w55(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    private s65 getEmojiTextViewHelper() {
        if (this.f247998d == null) {
            this.f247998d = new s65(this);
        }
        return this.f247998d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u75 u75Var = this.f247997c;
        if (u75Var != null) {
            u75Var.m82485b();
        }
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        x55 x55Var = this.f247995a;
        if (x55Var != null) {
            x55Var.m89963a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return zn91.m96580u0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        x55 x55Var = this.f247995a;
        if (x55Var != null) {
            return x55Var.f258296b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        x55 x55Var = this.f247995a;
        if (x55Var != null) {
            return x55Var.f258297c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f247997c.m82492j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f247997c.m82493k();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ahf1.m25946r(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m77317d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        x55 x55Var = this.f247995a;
        if (x55Var != null) {
            if (x55Var.f258300f) {
                x55Var.f258300f = false;
            } else {
                x55Var.f258300f = true;
                x55Var.m89963a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f247997c;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f247997c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f247996b;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        x55 x55Var = this.f247995a;
        if (x55Var != null) {
            x55Var.f258296b = colorStateList;
            x55Var.f258298d = true;
            x55Var.m89963a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        x55 x55Var = this.f247995a;
        if (x55Var != null) {
            x55Var.f258297c = mode;
            x55Var.f258299e = true;
            x55Var.m89963a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f247997c.m82500r(colorStateList);
        this.f247997c.m82485b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f247997c.m82501s(mode);
        this.f247997c.m82485b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u75 u75Var = this.f247997c;
        if (u75Var != null) {
            u75Var.m82496n(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w55(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i);
        jw71.m54407a(context);
        eg71.m38806a(getContext(), this);
        u75 u75Var = new u75(this);
        this.f247997c = u75Var;
        u75Var.m82495m(attributeSet, i);
        u75Var.m82485b();
        t55 t55Var = new t55(this);
        this.f247996b = t55Var;
        t55Var.m80085d(attributeSet, i);
        this.f247995a = new x55(this);
        Context context2 = getContext();
        int[] iArr = h3u0.f87332l;
        cx21 cx21VarM34178J = cx21.m34178J(context2, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) cx21VarM34178J.f42890c;
        mec1.m61563o(this, getContext(), iArr, attributeSet, (TypedArray) cx21VarM34178J.f42890c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(ihf1.m50639w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(ihf1.m50639w(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(ihf1.m50639w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(cx21VarM34178J.m34198g(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(cgs.m32736c(typedArray.getInt(3, -1), null));
            }
            cx21VarM34178J.m34189K();
            getEmojiTextViewHelper().m77316c(attributeSet, i);
        } catch (Throwable th) {
            cx21VarM34178J.m34189K();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ihf1.m50639w(getContext(), i));
    }
}
