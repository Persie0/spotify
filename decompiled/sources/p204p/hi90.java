package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hi90 {

    /* JADX INFO: renamed from: a */
    public final String f91747a;

    /* JADX INFO: renamed from: b */
    public final String f91748b;

    /* JADX INFO: renamed from: c */
    public final long f91749c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f91750d;

    public hi90(long j, String str, String str2, ArrayList arrayList) {
        this.f91747a = str;
        this.f91748b = str2;
        this.f91749c = j;
        this.f91750d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi90)) {
            return false;
        }
        hi90 hi90Var = (hi90) obj;
        return wj50.m88271j(this.f91747a, hi90Var.f91747a) && wj50.m88271j(this.f91748b, hi90Var.f91748b) && this.f91749c == hi90Var.f91749c && this.f91750d.equals(hi90Var.f91750d);
    }

    public final int hashCode() {
        return this.f91750d.hashCode() + dq60.m36605e(s571.m77243b(this.f91747a.hashCode() * 31, 31, this.f91748b), this.f91749c, 31);
    }
}
