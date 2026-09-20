package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r080 implements s080 {

    /* JADX INFO: renamed from: a */
    public final List f194399a;

    /* JADX INFO: renamed from: b */
    public final String f194400b;

    public r080(List list, String str) {
        this.f194399a = list;
        this.f194400b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r080)) {
            return false;
        }
        r080 r080Var = (r080) obj;
        return wj50.m88271j(this.f194399a, r080Var.f194399a) && wj50.m88271j(this.f194400b, r080Var.f194400b);
    }

    public final int hashCode() {
        return this.f194400b.hashCode() + (this.f194399a.hashCode() * 31);
    }
}
