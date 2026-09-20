package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.q4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2280q4 {

    /* JADX INFO: renamed from: a */
    public final String f185010a;

    /* JADX INFO: renamed from: b */
    public final String f185011b;

    /* JADX INFO: renamed from: c */
    public final List f185012c;

    public C2280q4(String str, List list, String str2) {
        this.f185010a = str;
        this.f185011b = str2;
        this.f185012c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2280q4)) {
            return false;
        }
        C2280q4 c2280q4 = (C2280q4) obj;
        return wj50.m88271j(this.f185010a, c2280q4.f185010a) && wj50.m88271j(this.f185011b, c2280q4.f185011b) && wj50.m88271j(this.f185012c, c2280q4.f185012c);
    }

    public final int hashCode() {
        return this.f185012c.hashCode() + s571.m77243b(this.f185010a.hashCode() * 31, 31, this.f185011b);
    }
}
