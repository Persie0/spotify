package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public final class lja {

    /* JADX INFO: renamed from: a */
    public String f134020a;

    /* JADX INFO: renamed from: b */
    public String f134021b;

    /* JADX INFO: renamed from: c */
    public Date f134022c;

    /* JADX INFO: renamed from: d */
    public boolean f134023d;

    /* JADX INFO: renamed from: e */
    public long f134024e;

    public /* synthetic */ lja(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lja)) {
            return false;
        }
        lja ljaVar = (lja) obj;
        return wj50.m88271j(this.f134020a, ljaVar.f134020a) && wj50.m88271j(this.f134021b, ljaVar.f134021b) && wj50.m88271j(this.f134022c, ljaVar.f134022c) && this.f134023d == ljaVar.f134023d && this.f134024e == ljaVar.f134024e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        String str = this.f134020a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f134021b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.f134022c;
        int iHashCode3 = (iHashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        boolean z = this.f134023d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return Long.hashCode(this.f134024e) + ((iHashCode3 + r1) * 31);
    }

    public final String toString() {
        return "BranchUrlQueryParameter(name=" + this.f134020a + ", value=" + this.f134021b + ", timestamp=" + this.f134022c + ", isDeepLink=" + this.f134023d + ", validityWindow=" + this.f134024e + ')';
    }

    public lja(String str, String str2, Date date, long j) {
        this.f134020a = str;
        this.f134021b = str2;
        this.f134022c = date;
        this.f134023d = false;
        this.f134024e = j;
    }
}
