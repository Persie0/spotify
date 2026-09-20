package p204p;

import androidx.compose.p002ui.unit.TextUnit;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class cra implements e15 {

    /* JADX INFO: renamed from: d */
    public static final long f41243d = epv0.m39669E(8589934592L, 1);

    /* JADX INFO: renamed from: e */
    public static final cra f41244e;

    /* JADX INFO: renamed from: a */
    public final long f41245a;

    /* JADX INFO: renamed from: b */
    public final long f41246b;

    /* JADX INFO: renamed from: c */
    public final long f41247c;

    static {
        long jM39698r = epv0.m39698r(0.25d);
        f41244e = new cra(jM39698r, jM39698r, epv0.m39698r(0.25d));
    }

    public cra(long j, long j2, long j3) {
        this.f41245a = j;
        this.f41246b = j2;
        this.f41247c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cra)) {
            return false;
        }
        Object obj2 = ude.f229233b;
        cra craVar = (cra) obj;
        if (!obj2.equals(obj2) || !TextUnit.m306a(this.f41245a, craVar.f41245a) || !TextUnit.m306a(this.f41246b, craVar.f41246b)) {
            return false;
        }
        TextUnit.m306a(this.f41247c, craVar.f41247c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = ude.f229233b.hashCode() * 31;
        tf71[] tf71VarArr = TextUnit.f546b;
        return qxy.f193763a.hashCode() + AbstractC0000a.m8g(dq60.m36605e(dq60.m36605e(dq60.m36605e(iHashCode, this.f41245a, 31), this.f41246b, 31), this.f41247c, 961), 31, Float.NaN);
    }

    public final String toString() {
        return "Bullet(shape=" + ude.f229233b + ", size=(" + ((Object) TextUnit.m311f(this.f41245a)) + ", " + ((Object) TextUnit.m311f(this.f41246b)) + "), padding=" + ((Object) TextUnit.m311f(this.f41247c)) + ", brush=null, alpha=NaN, drawStyle=" + qxy.f193763a + ')';
    }
}
