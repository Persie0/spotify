package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.ComposeView;

/* JADX INFO: loaded from: classes10.dex */
public final class hku implements zb80, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final ComposeView f92523a;

    /* JADX INFO: renamed from: b */
    public final dir f92524b;

    /* JADX INFO: renamed from: c */
    public final lku f92525c;

    /* JADX INFO: renamed from: d */
    public gb80 f92526d;

    /* JADX INFO: renamed from: e */
    public boolean f92527e = true;

    public hku(ComposeView composeView, dir dirVar, lku lkuVar) {
        this.f92523a = composeView;
        this.f92524b = dirVar;
        this.f92525c = lkuVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m47853a() {
        sli0.m78479f();
        if (this.f92527e) {
            this.f92527e = false;
            gb80 gb80Var = this.f92526d;
            if (gb80Var != null) {
                gb80Var.mo31988d(this);
            }
            ComposeView composeView = this.f92523a;
            composeView.removeOnAttachStateChangeListener(this);
            ViewParent parent = composeView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(composeView);
            }
            dir dirVar = this.f92524b;
            dirVar.f49464b.m66678i(fb80.f67750a);
            dirVar.f49466d.m47681a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m47854b() {
        if (this.f92527e) {
            this.f92527e = false;
            gb80 gb80Var = this.f92526d;
            if (gb80Var != null) {
                gb80Var.mo31988d(this);
            }
            this.f92523a.removeOnAttachStateChangeListener(this);
            dir dirVar = this.f92524b;
            dirVar.f49464b.m66678i(fb80.f67750a);
            dirVar.f49466d.m47681a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m47854b();
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        if (ta80Var == ta80.ON_DESTROY) {
            m47854b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
