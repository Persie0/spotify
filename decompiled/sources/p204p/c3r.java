package p204p;

import android.graphics.Color;

/* JADX INFO: loaded from: classes10.dex */
public final class c3r extends ipg1 {

    /* JADX INFO: renamed from: d */
    public final int f33734d;

    /* JADX INFO: renamed from: e */
    public final int f33735e;

    public c3r(int i, int i2) {
        this.f33734d = i;
        this.f33735e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3r)) {
            return false;
        }
        c3r c3rVar = (c3r) obj;
        return this.f33734d == c3rVar.f33734d && this.f33735e == c3rVar.f33735e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33735e) + (Integer.hashCode(this.f33734d) * 31);
    }

    public c3r(String str, String str2) {
        this(Color.parseColor(str), Color.parseColor(str2));
    }
}
