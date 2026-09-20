package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l6c {

    /* JADX INFO: renamed from: a */
    public final List f130302a;

    /* JADX INFO: renamed from: b */
    public final int f130303b;

    /* JADX INFO: renamed from: c */
    public final boolean f130304c;

    public l6c(int i, List list, boolean z) {
        this.f130302a = list;
        this.f130303b = i;
        this.f130304c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6c)) {
            return false;
        }
        l6c l6cVar = (l6c) obj;
        return wj50.m88271j(this.f130302a, l6cVar.f130302a) && this.f130303b == l6cVar.f130303b && this.f130304c == l6cVar.f130304c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130304c) + mt60.m62800g(this.f130303b, this.f130302a.hashCode() * 31, 31);
    }
}
