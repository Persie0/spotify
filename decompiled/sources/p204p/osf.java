package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class osf {

    /* JADX INFO: renamed from: a */
    public final nsf f168807a;

    /* JADX INFO: renamed from: b */
    public final List f168808b;

    /* JADX INFO: renamed from: c */
    public final int f168809c;

    public osf(nsf nsfVar, List list, int i) {
        this.f168807a = nsfVar;
        this.f168808b = list;
        this.f168809c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osf)) {
            return false;
        }
        osf osfVar = (osf) obj;
        return wj50.m88271j(this.f168807a, osfVar.f168807a) && wj50.m88271j(this.f168808b, osfVar.f168808b) && this.f168809c == osfVar.f168809c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168809c) + s571.m77244c(this.f168807a.hashCode() * 31, 31, this.f168808b);
    }
}
