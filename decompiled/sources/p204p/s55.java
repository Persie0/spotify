package p204p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes3.dex */
public class s55 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f205729d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    private final t55 f205730a;

    /* JADX INFO: renamed from: b */
    private final u75 f205731b;

    /* JADX INFO: renamed from: c */
    private final r65 f205732c;

    public s55(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        u75 u75Var = this.f205731b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return zn91.m96580u0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f205731b.m82492j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f205731b.m82493k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ahf1.m25946r(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f205732c.m74839d(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f205731b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f205731b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(zn91.m96582v0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ihf1.m50639w(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f205732c.m74840e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f205732c.m74837a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f205730a;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f205731b.m82500r(colorStateList);
        this.f205731b.m82485b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f205731b.m82501s(mode);
        this.f205731b.m82485b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u75 u75Var = this.f205731b;
        if (u75Var != null) {
            u75Var.m82496n(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s55(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jw71.m54407a(context);
        eg71.m38806a(getContext(), this);
        cx21 cx21VarM34178J = cx21.m34178J(getContext(), attributeSet, f205729d, i);
        if (((TypedArray) cx21VarM34178J.f42890c).hasValue(0)) {
            setDropDownBackgroundDrawable(cx21VarM34178J.m34202l(0));
        }
        cx21VarM34178J.m34189K();
        t55 t55Var = new t55(this);
        this.f205730a = t55Var;
        t55Var.m80085d(attributeSet, i);
        u75 u75Var = new u75(this);
        this.f205731b = u75Var;
        u75Var.m82495m(attributeSet, i);
        u75Var.m82485b();
        r65 r65Var = new r65(this);
        this.f205732c = r65Var;
        r65Var.m74838c(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM74837a = r65Var.m74837a(keyListener);
        if (keyListenerM74837a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM74837a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
