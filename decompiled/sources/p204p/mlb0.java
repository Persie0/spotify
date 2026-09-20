package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class mlb0 {

    /* JADX INFO: renamed from: a */
    public final String f144804a;

    /* JADX INFO: renamed from: b */
    public final List f144805b;

    public mlb0(String str, List list) {
        this.f144804a = str;
        this.f144805b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlb0)) {
            return false;
        }
        mlb0 mlb0Var = (mlb0) obj;
        return wj50.m88271j(this.f144804a, mlb0Var.f144804a) && wj50.m88271j(this.f144805b, mlb0Var.f144805b);
    }

    public final int hashCode() {
        return this.f144805b.hashCode() + (this.f144804a.hashCode() * 31);
    }
}
