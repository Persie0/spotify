package p204p;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hjv0 {

    /* JADX INFO: renamed from: a */
    public final ijv0 f92278a = new ijv0();

    /* JADX INFO: renamed from: b */
    public boolean f92279b = false;

    /* JADX INFO: renamed from: c */
    public int f92280c = 1;

    /* JADX INFO: renamed from: b */
    public final void m47709b(int i, dkv0 dkv0Var) {
        hjv0 hjv0Var = dkv0Var.f50035Q0;
        View view = dkv0Var.f50039a;
        boolean z = hjv0Var == null;
        if (z) {
            dkv0Var.f50041c = i;
            if (this.f92279b) {
                dkv0Var.f50043e = mo1618f(i);
            }
            dkv0Var.f50048t = (dkv0Var.f50048t & (-520)) | 1;
            int i2 = sa81.f207158a;
            Trace.beginSection("RV OnBindView");
        }
        dkv0Var.f50035Q0 = this;
        if (RecyclerView.f1179Z1) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = mec1.f142677a;
                if (view.isAttachedToWindow() != dkv0Var.m36332v()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + dkv0Var.m36332v() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + dkv0Var);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = mec1.f142677a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + dkv0Var);
                }
            }
        }
        mo47717o(dkv0Var, i, dkv0Var.m36325o());
        if (z) {
            ArrayList arrayList = dkv0Var.f50036X;
            if (arrayList != null) {
                arrayList.clear();
            }
            dkv0Var.f50048t &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ojv0) {
                ((ojv0) layoutParams).f166149c = true;
            }
            int i3 = sa81.f207158a;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public final dkv0 m47710c(int i, ViewGroup viewGroup) {
        try {
            int i2 = sa81.f207158a;
            Trace.beginSection("RV CreateView");
            dkv0 dkv0VarMo1620p = mo1620p(i, viewGroup);
            if (dkv0VarMo1620p.f50039a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            dkv0VarMo1620p.f50044f = i;
            Trace.endSection();
            return dkv0VarMo1620p;
        } catch (Throwable th) {
            int i3 = sa81.f207158a;
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo47711d(hjv0 hjv0Var, dkv0 dkv0Var, int i) {
        if (hjv0Var == this) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo1617e();

    /* JADX INFO: renamed from: f */
    public long mo1618f(int i) {
        return -1L;
    }

    /* JADX INFO: renamed from: g */
    public int mo28437g(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m47712h() {
        this.f92278a.m50838b();
    }

    /* JADX INFO: renamed from: i */
    public final void m47713i(int i) {
        this.f92278a.m50840d(i, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m47714j(int i, int i2) {
        this.f92278a.m50839c(i, i2);
    }

    /* JADX INFO: renamed from: k */
    public final void m47715k(int i, int i2) {
        this.f92278a.m50841e(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m47716l(int i, int i2) {
        this.f92278a.m50842f(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo1619n(int i, dkv0 dkv0Var);

    /* JADX INFO: renamed from: o */
    public void mo47717o(dkv0 dkv0Var, int i, List list) {
        mo1619n(i, dkv0Var);
    }

    /* JADX INFO: renamed from: p */
    public abstract dkv0 mo1620p(int i, ViewGroup viewGroup);

    /* JADX INFO: renamed from: r */
    public boolean mo47718r(dkv0 dkv0Var) {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public void mo47719v(jjv0 jjv0Var) {
        this.f92278a.registerObserver(jjv0Var);
    }

    /* JADX INFO: renamed from: w */
    public final void m47720w(boolean z) {
        if (this.f92278a.m50837a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f92279b = z;
    }

    /* JADX INFO: renamed from: x */
    public final void m47721x(int i) {
        this.f92280c = i;
        this.f92278a.m50843g();
    }

    /* JADX INFO: renamed from: z */
    public void mo47722z(jjv0 jjv0Var) {
        this.f92278a.unregisterObserver(jjv0Var);
    }

    /* JADX INFO: renamed from: m */
    public void mo28858m(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: q */
    public void mo28696q(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: s */
    public void mo31053s(dkv0 dkv0Var) {
    }

    /* JADX INFO: renamed from: t */
    public void mo31054t(dkv0 dkv0Var) {
    }

    /* JADX INFO: renamed from: u */
    public void mo28697u(dkv0 dkv0Var) {
    }
}
