package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class q9o0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f186641a;

    /* JADX INFO: renamed from: b */
    public final boolean f186642b;

    /* JADX INFO: renamed from: c */
    public final boolean f186643c;

    /* JADX INFO: renamed from: d */
    public final Integer f186644d;

    public q9o0(ArrayList arrayList, boolean z, boolean z2, Integer num) {
        this.f186641a = arrayList;
        this.f186642b = z;
        this.f186643c = z2;
        this.f186644d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9o0)) {
            return false;
        }
        q9o0 q9o0Var = (q9o0) obj;
        return this.f186641a.equals(q9o0Var.f186641a) && this.f186642b == q9o0Var.f186642b && this.f186643c == q9o0Var.f186643c && wj50.m88271j(this.f186644d, q9o0Var.f186644d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(this.f186641a.hashCode() * 31, 31, this.f186642b), 31, this.f186643c);
        Integer num = this.f186644d;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
