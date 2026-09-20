package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qdr0 implements sdr0 {

    /* JADX INFO: renamed from: a */
    public final hgo f187744a;

    /* JADX INFO: renamed from: b */
    public final hgo f187745b;

    public qdr0(hgo hgoVar, hgo hgoVar2) {
        this.f187744a = hgoVar;
        this.f187745b = hgoVar2;
    }

    @Override // p204p.sdr0
    /* JADX INFO: renamed from: a */
    public final List mo72597a() {
        return h6f.m46715L(this.f187744a, this.f187745b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdr0)) {
            return false;
        }
        qdr0 qdr0Var = (qdr0) obj;
        return this.f187744a.equals(qdr0Var.f187744a) && this.f187745b.equals(qdr0Var.f187745b);
    }

    public final int hashCode() {
        return this.f187745b.hashCode() + (this.f187744a.hashCode() * 31);
    }
}
