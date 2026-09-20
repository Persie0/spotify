package io.doist.recyclerviewext.sticky_headers;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p204p.a651;
import p204p.f3q0;
import p204p.hjv0;
import p204p.vjv0;
import p204p.zjv0;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"all"})
public class StickyHeadersLinearLayoutManager<T extends hjv0 & f3q0> extends LinearLayoutManager {

    /* JADX INFO: renamed from: e1 */
    public f3q0 f7171e1;

    /* JADX INFO: renamed from: f1 */
    public int f7172f1;

    /* JADX INFO: renamed from: g1 */
    public int f7173g1;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: H0 */
    public final int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        int iMo892H0 = super.mo892H0(i, vjv0Var, zjv0Var);
        if (iMo892H0 == 0) {
            return iMo892H0;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: I0 */
    public final void mo924I0(int i) {
        mo962x1(i, Integer.MIN_VALUE);
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: J0 */
    public final int mo895J0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        int iMo895J0 = super.mo895J0(i, vjv0Var, zjv0Var);
        if (iMo895J0 == 0) {
            return iMo895J0;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: g0 */
    public final void mo1057g0(hjv0 hjv0Var, hjv0 hjv0Var2) {
        f3q0 f3q0Var = this.f7171e1;
        if (f3q0Var != null) {
            f3q0Var.mo47722z(null);
        }
        if (!(hjv0Var2 instanceof f3q0)) {
            this.f7171e1 = null;
            throw null;
        }
        this.f7171e1 = (f3q0) hjv0Var2;
        hjv0Var2.mo47719v(null);
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: h0 */
    public final void mo1113h0(RecyclerView recyclerView) {
        hjv0 adapter = recyclerView.getAdapter();
        f3q0 f3q0Var = this.f7171e1;
        if (f3q0Var != null) {
            f3q0Var.mo47722z(null);
        }
        if (!(adapter instanceof f3q0)) {
            this.f7171e1 = null;
            throw null;
        }
        this.f7171e1 = (f3q0) adapter;
        adapter.mo47719v(null);
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public final void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        super.mo915u0(vjv0Var, zjv0Var);
        if (!zjv0Var.f283550g) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x0 */
    public final void mo961x0(Parcelable parcelable) {
        if (parcelable instanceof a651) {
            a651 a651Var = (a651) parcelable;
            this.f7172f1 = a651Var.f12700b;
            this.f7173g1 = a651Var.f12701c;
            parcelable = a651Var.f12699a;
        }
        super.mo961x0(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: x1 */
    public final void mo962x1(int i, int i2) {
        this.f7172f1 = -1;
        this.f7173g1 = Integer.MIN_VALUE;
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y0 */
    public final Parcelable mo963y0() {
        a651 a651Var = new a651();
        a651Var.f12699a = super.mo963y0();
        a651Var.f12700b = this.f7172f1;
        a651Var.f12701c = this.f7173g1;
        return a651Var;
    }
}
