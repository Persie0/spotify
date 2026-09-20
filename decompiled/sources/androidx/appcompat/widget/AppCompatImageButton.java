package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.spotify.music.R;
import p204p.cgs;
import p204p.eg71;
import p204p.ihf1;
import p204p.jw71;
import p204p.mw71;
import p204p.mzi;
import p204p.t55;
import p204p.t65;

/* JADX INFO: loaded from: classes3.dex */
public class AppCompatImageButton extends ImageButton implements mw71 {

    /* JADX INFO: renamed from: a */
    private final t55 f175a;

    /* JADX INFO: renamed from: b */
    private final t65 f176b;

    /* JADX INFO: renamed from: c */
    public boolean f177c;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            t55Var.m80082a();
        }
        t65 t65Var = this.f176b;
        if (t65Var != null) {
            t65Var.m80151a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            return t55Var.m80083b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            return t55Var.m80084c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        mzi mziVar;
        t65 t65Var = this.f176b;
        if (t65Var == null || (mziVar = t65Var.f217448b) == null) {
            return null;
        }
        return (ColorStateList) mziVar.f148718c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        mzi mziVar;
        t65 t65Var = this.f176b;
        if (t65Var == null || (mziVar = t65Var.f217448b) == null) {
            return null;
        }
        return (PorterDuff.Mode) mziVar.f148719d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f176b.f217447a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            t55Var.m80086e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            t55Var.m80087f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        t65 t65Var = this.f176b;
        if (t65Var != null) {
            t65Var.m80151a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        t65 t65Var = this.f176b;
        if (t65Var != null && drawable != null && !this.f177c) {
            t65Var.f217449c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        t65 t65Var2 = this.f176b;
        if (t65Var2 != null) {
            t65Var2.m80151a();
            if (this.f177c) {
                return;
            }
            t65 t65Var3 = this.f176b;
            ImageView imageView = t65Var3.f217447a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(t65Var3.f217449c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f177c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        t65 t65Var = this.f176b;
        ImageView imageView = t65Var.f217447a;
        if (i != 0) {
            Drawable drawableM50639w = ihf1.m50639w(imageView.getContext(), i);
            if (drawableM50639w != null) {
                cgs.m32734a(drawableM50639w);
            }
            imageView.setImageDrawable(drawableM50639w);
        } else {
            imageView.setImageDrawable(null);
        }
        t65Var.m80151a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        t65 t65Var = this.f176b;
        if (t65Var != null) {
            t65Var.m80151a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            t55Var.m80089h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t55 t55Var = this.f175a;
        if (t55Var != null) {
            t55Var.m80090i(mode);
        }
    }

    @Override // p204p.mw71
    public void setSupportImageTintList(ColorStateList colorStateList) {
        t65 t65Var = this.f176b;
        if (t65Var != null) {
            if (t65Var.f217448b == null) {
                t65Var.f217448b = new mzi();
            }
            mzi mziVar = t65Var.f217448b;
            mziVar.f148718c = colorStateList;
            mziVar.f148717b = true;
            t65Var.m80151a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        t65 t65Var = this.f176b;
        if (t65Var != null) {
            if (t65Var.f217448b == null) {
                t65Var.f217448b = new mzi();
            }
            mzi mziVar = t65Var.f217448b;
            mziVar.f148719d = mode;
            mziVar.f148716a = true;
            t65Var.m80151a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jw71.m54407a(context);
        this.f177c = false;
        eg71.m38806a(getContext(), this);
        t55 t55Var = new t55(this);
        this.f175a = t55Var;
        t55Var.m80085d(attributeSet, i);
        t65 t65Var = new t65(this);
        this.f176b = t65Var;
        t65Var.m80152b(attributeSet, i);
    }
}
