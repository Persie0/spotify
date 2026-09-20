package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class b6l {

    /* JADX INFO: renamed from: a */
    public final String f23980a;

    /* JADX INFO: renamed from: b */
    public final String f23981b;

    /* JADX INFO: renamed from: c */
    public final int f23982c;

    /* JADX INFO: renamed from: d */
    public final Object f23983d;

    public b6l(int i, String str, String str2, List list) {
        this.f23980a = str;
        this.f23981b = str2;
        this.f23982c = i;
        this.f23983d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6l)) {
            return false;
        }
        b6l b6lVar = (b6l) obj;
        return wj50.m88271j(this.f23980a, b6lVar.f23980a) && this.f23981b.equals(b6lVar.f23981b) && this.f23982c == b6lVar.f23982c && this.f23983d.equals(b6lVar.f23983d);
    }

    public final int hashCode() {
        return this.f23983d.hashCode() + f710.m40938f(this.f23982c, s571.m77243b(this.f23980a.hashCode() * 31, 31, this.f23981b), 31);
    }
}
