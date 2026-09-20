package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class x0z0 {

    /* JADX INFO: renamed from: a */
    public final String f257017a;

    /* JADX INFO: renamed from: b */
    public final List f257018b;

    public x0z0(String str, List list) {
        this.f257017a = str;
        this.f257018b = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m89612a() {
        return this.f257018b;
    }

    /* JADX INFO: renamed from: b */
    public final String m89613b() {
        return this.f257017a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0z0)) {
            return false;
        }
        x0z0 x0z0Var = (x0z0) obj;
        return wj50.m88271j(this.f257017a, x0z0Var.f257017a) && wj50.m88271j(this.f257018b, x0z0Var.f257018b);
    }

    public final int hashCode() {
        return this.f257018b.hashCode() + (this.f257017a.hashCode() * 31);
    }
}
