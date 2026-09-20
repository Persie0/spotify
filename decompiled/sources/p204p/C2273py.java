package p204p;

/* JADX INFO: renamed from: p.py */
/* JADX INFO: loaded from: classes8.dex */
public final class C2273py implements j10 {

    /* JADX INFO: renamed from: a */
    public final int f183280a;

    /* JADX INFO: renamed from: b */
    public final int f183281b;

    /* JADX INFO: renamed from: c */
    public final Integer f183282c;

    public C2273py(int i, int i2, Integer num) {
        this.f183280a = i;
        this.f183281b = i2;
        this.f183282c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273py)) {
            return false;
        }
        C2273py c2273py = (C2273py) obj;
        return this.f183280a == c2273py.f183280a && this.f183281b == c2273py.f183281b && wj50.m88271j(this.f183282c, c2273py.f183282c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f183281b, Integer.hashCode(this.f183280a) * 31, 31);
        Integer num = this.f183282c;
        return iM62800g + (num == null ? 0 : num.hashCode());
    }
}
