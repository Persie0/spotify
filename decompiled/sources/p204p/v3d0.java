package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v3d0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f236831a;

    /* JADX INFO: renamed from: b */
    public final long f236832b;

    /* JADX INFO: renamed from: c */
    public final long f236833c;

    public v3d0(long j, long j2, long j3) {
        this.f236831a = j;
        this.f236832b = j2;
        this.f236833c = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f236831a, ((v3d0) obj).f236831a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3d0)) {
            return false;
        }
        v3d0 v3d0Var = (v3d0) obj;
        return this.f236831a == v3d0Var.f236831a && this.f236832b == v3d0Var.f236832b && this.f236833c == v3d0Var.f236833c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f236831a), Long.valueOf(this.f236832b), Long.valueOf(this.f236833c));
    }
}
