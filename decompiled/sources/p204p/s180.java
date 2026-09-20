package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class s180 {

    /* JADX INFO: renamed from: a */
    public final String f204627a;

    /* JADX INFO: renamed from: b */
    public final List f204628b;

    public s180(String str, List list) {
        this.f204627a = str;
        this.f204628b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s180)) {
            return false;
        }
        s180 s180Var = (s180) obj;
        return wj50.m88271j(this.f204627a, s180Var.f204627a) && wj50.m88271j(this.f204628b, s180Var.f204628b);
    }

    public final int hashCode() {
        return this.f204628b.hashCode() + (this.f204627a.hashCode() * 31);
    }
}
