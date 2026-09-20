package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class osj0 extends psj0 {

    /* JADX INFO: renamed from: d */
    public final fd21 f168829d;

    /* JADX INFO: renamed from: e */
    public final View f168830e;

    /* JADX INFO: renamed from: f */
    public final q381 f168831f;

    /* JADX INFO: renamed from: g */
    public final ker0 f168832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osj0(fd21 fd21Var, View view, q381 q381Var, int i) {
        super(view);
        q381Var = (i & 4) != 0 ? null : q381Var;
        ker0 ker0Var = (i & 8) != 0 ? ker0.DEFAULT : ker0.CRITICAL;
        this.f168829d = fd21Var;
        this.f168830e = view;
        this.f168831f = q381Var;
        this.f168832g = ker0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osj0)) {
            return false;
        }
        osj0 osj0Var = (osj0) obj;
        return wj50.m88271j(this.f168829d, osj0Var.f168829d) && wj50.m88271j(this.f168830e, osj0Var.f168830e) && wj50.m88271j(this.f168831f, osj0Var.f168831f) && this.f168832g == osj0Var.f168832g;
    }

    public final int hashCode() {
        int iHashCode = (this.f168830e.hashCode() + (this.f168829d.hashCode() * 31)) * 31;
        q381 q381Var = this.f168831f;
        return this.f168832g.hashCode() + ((iHashCode + (q381Var == null ? 0 : q381Var.hashCode())) * 31);
    }

    @Override // p204p.ppg1
    /* JADX INFO: renamed from: q */
    public final ker0 mo62771q() {
        return this.f168832g;
    }
}
