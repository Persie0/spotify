package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v9r0 {

    /* JADX INFO: renamed from: a */
    public final String f239024a;

    /* JADX INFO: renamed from: b */
    public final List f239025b;

    public v9r0(String str, List list) {
        this.f239024a = str;
        this.f239025b = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m84990a() {
        return this.f239025b;
    }

    /* JADX INFO: renamed from: b */
    public final String m84991b() {
        return this.f239024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9r0)) {
            return false;
        }
        v9r0 v9r0Var = (v9r0) obj;
        return wj50.m88271j(this.f239024a, v9r0Var.f239024a) && wj50.m88271j(this.f239025b, v9r0Var.f239025b);
    }

    public final int hashCode() {
        return this.f239025b.hashCode() + (this.f239024a.hashCode() * 31);
    }
}
