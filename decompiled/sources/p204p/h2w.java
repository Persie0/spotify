package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h2w {

    /* JADX INFO: renamed from: a */
    public final String f87078a;

    /* JADX INFO: renamed from: b */
    public final int f87079b;

    /* JADX INFO: renamed from: c */
    public final boolean f87080c;

    /* JADX INFO: renamed from: d */
    public final long f87081d;

    /* JADX INFO: renamed from: e */
    public final boolean f87082e;

    /* JADX INFO: renamed from: f */
    public final Object f87083f;

    /* JADX INFO: renamed from: g */
    public final boolean f87084g;

    /* JADX INFO: renamed from: h */
    public final yzv f87085h;

    /* JADX INFO: renamed from: i */
    public final int f87086i;

    public h2w(String str, int i, boolean z, long j, boolean z2, List list, boolean z3, yzv yzvVar, int i2) {
        this.f87078a = str;
        this.f87079b = i;
        this.f87080c = z;
        this.f87081d = j;
        this.f87082e = z2;
        this.f87083f = list;
        this.f87084g = z3;
        this.f87085h = yzvVar;
        this.f87086i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2w)) {
            return false;
        }
        h2w h2wVar = (h2w) obj;
        return wj50.m88271j(this.f87078a, h2wVar.f87078a) && this.f87079b == h2wVar.f87079b && this.f87080c == h2wVar.f87080c && this.f87081d == h2wVar.f87081d && this.f87082e == h2wVar.f87082e && this.f87083f.equals(h2wVar.f87083f) && this.f87084g == h2wVar.f87084g && this.f87085h == h2wVar.f87085h && this.f87086i == h2wVar.f87086i;
    }

    public final int hashCode() {
        return edb.m38547C(this.f87086i) + ((this.f87085h.hashCode() + s571.m77245d(dq60.m36604d(s571.m77245d(dq60.m36605e(s571.m77245d(f710.m40938f(this.f87079b, this.f87078a.hashCode() * 31, 31), 31, this.f87080c), this.f87081d, 31), 31, this.f87082e), 31, this.f87083f), 31, this.f87084g)) * 31);
    }
}
