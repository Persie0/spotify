package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class d520 {

    /* JADX INFO: renamed from: a */
    public final String f45309a;

    /* JADX INFO: renamed from: b */
    public final String f45310b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f45311c;

    /* JADX INFO: renamed from: d */
    public final long f45312d;

    public d520(long j, String str, String str2, ArrayList arrayList) {
        this.f45309a = str;
        this.f45310b = str2;
        this.f45311c = arrayList;
        this.f45312d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d520)) {
            return false;
        }
        d520 d520Var = (d520) obj;
        return wj50.m88271j(this.f45309a, d520Var.f45309a) && wj50.m88271j(this.f45310b, d520Var.f45310b) && this.f45311c.equals(d520Var.f45311c) && this.f45312d == d520Var.f45312d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45312d) + lq51.m59700f(this.f45311c, s571.m77243b(this.f45309a.hashCode() * 31, 31, this.f45310b), 31);
    }
}
