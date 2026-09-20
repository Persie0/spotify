package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cej {

    /* JADX INFO: renamed from: a */
    public final long f37135a;

    /* JADX INFO: renamed from: b */
    public final long f37136b;

    /* JADX INFO: renamed from: c */
    public final long f37137c;

    /* JADX INFO: renamed from: d */
    public final List f37138d;

    public cej(long j, long j2, long j3, List list) {
        this.f37135a = j;
        this.f37136b = j2;
        this.f37137c = j3;
        this.f37138d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cej)) {
            return false;
        }
        cej cejVar = (cej) obj;
        return this.f37135a == cejVar.f37135a && this.f37136b == cejVar.f37136b && this.f37137c == cejVar.f37137c && wj50.m88271j(this.f37138d, cejVar.f37138d);
    }

    public final int hashCode() {
        return this.f37138d.hashCode() + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f37135a) * 31, this.f37136b, 31), this.f37137c, 31);
    }
}
