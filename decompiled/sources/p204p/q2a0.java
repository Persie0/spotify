package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class q2a0 {

    /* JADX INFO: renamed from: a */
    public final String f184570a;

    /* JADX INFO: renamed from: b */
    public final k1n0 f184571b;

    /* JADX INFO: renamed from: c */
    public final boolean f184572c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f184573d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f184574e;

    public q2a0(String str, k1n0 k1n0Var, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.f184570a = str;
        this.f184571b = k1n0Var;
        this.f184572c = z;
        this.f184573d = arrayList;
        this.f184574e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2a0)) {
            return false;
        }
        q2a0 q2a0Var = (q2a0) obj;
        return this.f184570a.equals(q2a0Var.f184570a) && this.f184571b == q2a0Var.f184571b && this.f184572c == q2a0Var.f184572c && this.f184573d.equals(q2a0Var.f184573d) && this.f184574e.equals(q2a0Var.f184574e);
    }

    public final int hashCode() {
        return this.f184574e.hashCode() + lq51.m59700f(this.f184573d, s571.m77245d((this.f184571b.hashCode() + (this.f184570a.hashCode() * 31)) * 31, 31, this.f184572c), 31);
    }
}
