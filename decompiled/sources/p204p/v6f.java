package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class v6f {

    /* JADX INFO: renamed from: a */
    public final List f237831a;

    /* JADX INFO: renamed from: b */
    public final int f237832b;

    /* JADX INFO: renamed from: c */
    public final int f237833c;

    public v6f(int i, int i2, List list) {
        this.f237831a = list;
        this.f237832b = i;
        this.f237833c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6f)) {
            return false;
        }
        v6f v6fVar = (v6f) obj;
        return this.f237831a.equals(v6fVar.f237831a) && this.f237832b == v6fVar.f237832b && this.f237833c == v6fVar.f237833c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f237833c) + mt60.m62800g(this.f237832b, this.f237831a.hashCode() * 31, 31);
    }
}
