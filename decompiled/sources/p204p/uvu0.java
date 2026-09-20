package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class uvu0 implements ri21 {

    /* JADX INFO: renamed from: a */
    public final View f234508a;

    public uvu0(ImageView imageView) {
        this.f234508a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public static tjr m84069a(int i, int i2, int i3) {
        if (i == -2) {
            return pjr.f178301a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            wj50.m88254a(i4);
            return new njr(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        wj50.m88254a(i5);
        return new njr(i5);
    }

    @Override // p204p.ri21
    /* JADX INFO: renamed from: b */
    public final Object mo40114b(fbk fbkVar) {
        ci21 ci21VarM84070c = m84070c();
        if (ci21VarM84070c != null) {
            return ci21VarM84070c;
        }
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        ViewTreeObserver viewTreeObserver = this.f234508a.getViewTreeObserver();
        hlc1 hlc1Var = new hlc1(this, viewTreeObserver, hqbVar);
        viewTreeObserver.addOnPreDrawListener(hlc1Var);
        hqbVar.mo42415l(new glc1(this, viewTreeObserver, hlc1Var));
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: c */
    public final ci21 m84070c() {
        View view = this.f234508a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        tjr tjrVarM84069a = m84069a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (tjrVarM84069a == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        tjr tjrVarM84069a2 = m84069a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (tjrVarM84069a2 == null) {
            return null;
        }
        return new ci21(tjrVarM84069a, tjrVarM84069a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvu0) && wj50.m88271j(this.f234508a, ((uvu0) obj).f234508a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f234508a.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f234508a + ", subtractPadding=true)";
    }
}
