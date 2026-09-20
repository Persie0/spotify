package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes11.dex */
public final class e5b {

    /* JADX INFO: renamed from: a */
    public final int f56330a;

    /* JADX INFO: renamed from: b */
    public final int f56331b;

    /* JADX INFO: renamed from: c */
    public final Rect f56332c;

    public e5b(int i, int i2, Rect rect) {
        this.f56330a = i;
        this.f56331b = i2;
        this.f56332c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5b)) {
            return false;
        }
        e5b e5bVar = (e5b) obj;
        return this.f56330a == e5bVar.f56330a && this.f56331b == e5bVar.f56331b && wj50.m88271j(this.f56332c, e5bVar.f56332c);
    }

    public final int hashCode() {
        return this.f56332c.hashCode() + mt60.m62800g(this.f56331b, Integer.hashCode(this.f56330a) * 31, 31);
    }
}
