package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xs3 extends zs3 {

    /* JADX INFO: renamed from: a */
    public final List f265465a;

    /* JADX INFO: renamed from: b */
    public final String f265466b;

    /* JADX INFO: renamed from: c */
    public final un20 f265467c;

    public xs3(List list, String str, un20 un20Var) {
        this.f265465a = list;
        this.f265466b = str;
        this.f265467c = un20Var;
    }

    @Override // p204p.zs3
    /* JADX INFO: renamed from: a */
    public final un20 mo91961a() {
        return this.f265467c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs3)) {
            return false;
        }
        xs3 xs3Var = (xs3) obj;
        return wj50.m88271j(this.f265465a, xs3Var.f265465a) && wj50.m88271j(this.f265466b, xs3Var.f265466b) && wj50.m88271j(this.f265467c, xs3Var.f265467c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f265465a.hashCode() * 31, 31, this.f265466b);
        un20 un20Var = this.f265467c;
        return iM77243b + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
