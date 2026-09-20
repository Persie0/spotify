package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n8j {

    /* JADX INFO: renamed from: a */
    public final String f151545a;

    /* JADX INFO: renamed from: b */
    public final long f151546b;

    /* JADX INFO: renamed from: c */
    public final long f151547c;

    /* JADX INFO: renamed from: d */
    public final String f151548d;

    /* JADX INFO: renamed from: e */
    public final List f151549e;

    public n8j(long j, long j2, String str, String str2, List list) {
        this.f151545a = str;
        this.f151546b = j;
        this.f151547c = j2;
        this.f151548d = str2;
        this.f151549e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8j)) {
            return false;
        }
        n8j n8jVar = (n8j) obj;
        return wj50.m88271j(this.f151545a, n8jVar.f151545a) && this.f151546b == n8jVar.f151546b && this.f151547c == n8jVar.f151547c && wj50.m88271j(this.f151548d, n8jVar.f151548d) && wj50.m88271j(this.f151549e, n8jVar.f151549e);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(this.f151545a.hashCode() * 31, this.f151546b, 31), this.f151547c, 31);
        String str = this.f151548d;
        return this.f151549e.hashCode() + ((iM36605e + (str == null ? 0 : str.hashCode())) * 31);
    }
}
