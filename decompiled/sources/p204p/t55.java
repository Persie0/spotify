package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t55 {

    /* JADX INFO: renamed from: a */
    public final View f217210a;

    /* JADX INFO: renamed from: d */
    public mzi f217213d;

    /* JADX INFO: renamed from: e */
    public mzi f217214e;

    /* JADX INFO: renamed from: f */
    public mzi f217215f;

    /* JADX INFO: renamed from: c */
    public int f217212c = -1;

    /* JADX INFO: renamed from: b */
    public final p65 f217211b = p65.m69177a();

    public t55(View view) {
        this.f217210a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m80082a() {
        View view = this.f217210a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f217213d != null) {
                if (this.f217215f == null) {
                    this.f217215f = new mzi();
                }
                mzi mziVar = this.f217215f;
                mziVar.f148718c = null;
                mziVar.f148717b = false;
                mziVar.f148719d = null;
                mziVar.f148716a = false;
                WeakHashMap weakHashMap = mec1.f142677a;
                ColorStateList colorStateListM32539c = cec1.m32539c(view);
                if (colorStateListM32539c != null) {
                    mziVar.f148717b = true;
                    mziVar.f148718c = colorStateListM32539c;
                }
                PorterDuff.Mode modeM32540d = cec1.m32540d(view);
                if (modeM32540d != null) {
                    mziVar.f148716a = true;
                    mziVar.f148719d = modeM32540d;
                }
                if (mziVar.f148717b || mziVar.f148716a) {
                    p65.m69180e(background, mziVar, view.getDrawableState());
                    return;
                }
            }
            mzi mziVar2 = this.f217214e;
            if (mziVar2 != null) {
                p65.m69180e(background, mziVar2, view.getDrawableState());
                return;
            }
            mzi mziVar3 = this.f217213d;
            if (mziVar3 != null) {
                p65.m69180e(background, mziVar3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m80083b() {
        mzi mziVar = this.f217214e;
        if (mziVar != null) {
            return (ColorStateList) mziVar.f148718c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m80084c() {
        mzi mziVar = this.f217214e;
        if (mziVar != null) {
            return (PorterDuff.Mode) mziVar.f148719d;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m80085d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM60557g;
        View view = this.f217210a;
        Context context = view.getContext();
        int[] iArr = h3u0.f87319A;
        cx21 cx21VarM34178J = cx21.m34178J(context, attributeSet, iArr, i);
        View view2 = this.f217210a;
        mec1.m61563o(view2, view2.getContext(), iArr, attributeSet, cx21VarM34178J.m34212z(), i);
        try {
            if (cx21VarM34178J.m34184B(0)) {
                this.f217212c = cx21VarM34178J.m34207t(0, -1);
                p65 p65Var = this.f217211b;
                Context context2 = view.getContext();
                int i2 = this.f217212c;
                synchronized (p65Var) {
                    colorStateListM60557g = p65Var.f174297a.m60557g(context2, i2);
                }
                if (colorStateListM60557g != null) {
                    m80088g(colorStateListM60557g);
                }
            }
            if (cx21VarM34178J.m34184B(1)) {
                cec1.m32546j(view, cx21VarM34178J.m34198g(1));
            }
            if (cx21VarM34178J.m34184B(2)) {
                cec1.m32547k(view, cgs.m32736c(cx21VarM34178J.m34205p(2, -1), null));
            }
            cx21VarM34178J.m34189K();
        } catch (Throwable th) {
            cx21VarM34178J.m34189K();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m80086e() {
        this.f217212c = -1;
        m80088g(null);
        m80082a();
    }

    /* JADX INFO: renamed from: f */
    public final void m80087f(int i) {
        ColorStateList colorStateListM60557g;
        this.f217212c = i;
        p65 p65Var = this.f217211b;
        if (p65Var != null) {
            Context context = this.f217210a.getContext();
            synchronized (p65Var) {
                colorStateListM60557g = p65Var.f174297a.m60557g(context, i);
            }
        } else {
            colorStateListM60557g = null;
        }
        m80088g(colorStateListM60557g);
        m80082a();
    }

    /* JADX INFO: renamed from: g */
    public final void m80088g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f217213d == null) {
                this.f217213d = new mzi();
            }
            mzi mziVar = this.f217213d;
            mziVar.f148718c = colorStateList;
            mziVar.f148717b = true;
        } else {
            this.f217213d = null;
        }
        m80082a();
    }

    /* JADX INFO: renamed from: h */
    public final void m80089h(ColorStateList colorStateList) {
        if (this.f217214e == null) {
            this.f217214e = new mzi();
        }
        mzi mziVar = this.f217214e;
        mziVar.f148718c = colorStateList;
        mziVar.f148717b = true;
        m80082a();
    }

    /* JADX INFO: renamed from: i */
    public final void m80090i(PorterDuff.Mode mode) {
        if (this.f217214e == null) {
            this.f217214e = new mzi();
        }
        mzi mziVar = this.f217214e;
        mziVar.f148719d = mode;
        mziVar.f148716a = true;
        m80082a();
    }
}
