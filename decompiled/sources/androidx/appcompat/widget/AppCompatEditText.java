package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.spotify.music.R;
import p204p.ahf1;
import p204p.ddl0;
import p204p.eg71;
import p204p.ehf1;
import p204p.jw71;
import p204p.lij;
import p204p.mec1;
import p204p.n75;
import p204p.o75;
import p204p.oat;
import p204p.q65;
import p204p.r65;
import p204p.t55;
import p204p.u75;
import p204p.wf71;
import p204p.zn91;
import p204p.zsf1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements ddl0 {

    /* JADX INFO: renamed from: a */
    private final t55 f169a;

    /* JADX INFO: renamed from: b */
    private final u75 f170b;

    /* JADX INFO: renamed from: c */
    private final o75 f171c;

    /* JADX INFO: renamed from: d */
    public final wf71 f172d;

    /* JADX INFO: renamed from: e */
    private final r65 f173e;

    /* JADX INFO: renamed from: f */
    public q65 f174f;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private q65 getSuperCaller() {
        if (this.f174f == null) {
            this.f174f = new q65(this);
        }
        return this.f174f;
    }

    @Override // p204p.ddl0
    /* JADX INFO: renamed from: a */
    public final lij mo117a(lij lijVar) {
        return this.f172d.mo24851a(this, lijVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        u75 u75Var = this.f170b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return zn91.m96580u0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f170b.m82492j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f170b.m82493k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o75 o75Var;
        if (Build.VERSION.SDK_INT >= 28 || (o75Var = this.f171c) == null) {
            return getSuperCaller().m72215a();
        }
        TextClassifier textClassifier = o75Var.f162468b;
        return textClassifier == null ? n75.m63798a(o75Var.f162467a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM61555g;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f170b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            oat.m66580d(editorInfo, getText());
        }
        ahf1.m25946r(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM61555g = mec1.m61555g(this)) != null) {
            oat.m66579c(editorInfo, strArrM61555g);
            inputConnectionOnCreateInputConnection = zsf1.m96860t(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.f173e.m74839d(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (ehf1.m38951q(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (ehf1.m38952r(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f170b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u75 u75Var = this.f170b;
        if (u75Var != null) {
            u75Var.m82485b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(zn91.m96582v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f173e.m74840e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f173e.m74837a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f169a;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f170b.m82500r(colorStateList);
        this.f170b.m82485b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f170b.m82501s(mode);
        this.f170b.m82485b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u75 u75Var = this.f170b;
        if (u75Var != null) {
            u75Var.m82496n(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o75 o75Var;
        if (Build.VERSION.SDK_INT >= 28 || (o75Var = this.f171c) == null) {
            getSuperCaller().m72216b(textClassifier);
        } else {
            o75Var.f162468b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jw71.m54407a(context);
        eg71.m38806a(getContext(), this);
        t55 t55Var = new t55(this);
        this.f169a = t55Var;
        t55Var.m80085d(attributeSet, i);
        u75 u75Var = new u75(this);
        this.f170b = u75Var;
        u75Var.m82495m(attributeSet, i);
        u75Var.m82485b();
        o75 o75Var = new o75();
        o75Var.f162467a = this;
        this.f171c = o75Var;
        this.f172d = new wf71();
        r65 r65Var = new r65(this);
        this.f173e = r65Var;
        r65Var.m74838c(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (r65.m74836b(keyListener)) {
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
}
