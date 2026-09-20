package p204p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j081 implements hie0 {

    /* JADX INFO: renamed from: a */
    public zge0 f107382a;

    /* JADX INFO: renamed from: b */
    public lhe0 f107383b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f107384c;

    public j081(Toolbar toolbar) {
        this.f107384c = toolbar;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: c */
    public final void mo28113c(Context context, zge0 zge0Var) {
        lhe0 lhe0Var;
        zge0 zge0Var2 = this.f107382a;
        if (zge0Var2 != null && (lhe0Var = this.f107383b) != null) {
            zge0Var2.mo45457e(lhe0Var);
        }
        this.f107382a = zge0Var;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: e */
    public final void mo28115e() {
        if (this.f107383b != null) {
            zge0 zge0Var = this.f107382a;
            if (zge0Var != null) {
                int size = zge0Var.f282605f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f107382a.getItem(i) == this.f107383b) {
                        return;
                    }
                }
            }
            mo28117g(this.f107383b);
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: f */
    public final boolean mo28116f(lhe0 lhe0Var) {
        Toolbar toolbar = this.f107384c;
        toolbar.m159c();
        ViewParent parent = toolbar.f336h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f336h);
            }
            toolbar.addView(toolbar.f336h);
        }
        View actionView = lhe0Var.getActionView();
        toolbar.f338i = actionView;
        this.f107383b = lhe0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f338i);
            }
            k081 k081Var = new k081();
            k081Var.f117932a = (toolbar.f310O0 & ContentType.LONG_FORM_ON_DEMAND) | 8388611;
            k081Var.f117933b = 2;
            toolbar.f338i.setLayoutParams(k081Var);
            toolbar.addView(toolbar.f338i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k081) childAt.getLayoutParams()).f117933b != 2 && childAt != toolbar.f322a) {
                toolbar.removeViewAt(childCount);
                toolbar.f333f1.add(childAt);
            }
        }
        toolbar.requestLayout();
        lhe0Var.f133527C = true;
        lhe0Var.f133541n.m96069q(false);
        KeyEvent.Callback callback = toolbar.f338i;
        if (callback instanceof pze) {
            ((pze) callback).onActionViewExpanded();
        }
        toolbar.m174u();
        return true;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: g */
    public final boolean mo28117g(lhe0 lhe0Var) {
        Toolbar toolbar = this.f107384c;
        KeyEvent.Callback callback = toolbar.f338i;
        if (callback instanceof pze) {
            ((pze) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f338i);
        toolbar.removeView(toolbar.f336h);
        toolbar.f338i = null;
        ArrayList arrayList = toolbar.f333f1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f107383b = null;
        toolbar.requestLayout();
        lhe0Var.f133527C = false;
        lhe0Var.f133541n.m96069q(false);
        toolbar.m174u();
        return true;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: h */
    public final boolean mo28118h() {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: i */
    public final boolean mo28119i(gr51 gr51Var) {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: b */
    public final void mo28112b(zge0 zge0Var, boolean z) {
    }
}
