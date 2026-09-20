package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c4a1 implements e4a1 {

    /* JADX INFO: renamed from: a */
    public final String f33898a;

    /* JADX INFO: renamed from: b */
    public final String f33899b;

    /* JADX INFO: renamed from: c */
    public final List f33900c;

    public c4a1(String str, List list, String str2) {
        this.f33898a = str;
        this.f33899b = str2;
        this.f33900c = list;
    }

    @Override // p204p.e4a1
    /* JADX INFO: renamed from: a */
    public final List mo31431a() {
        return this.f33900c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a1)) {
            return false;
        }
        c4a1 c4a1Var = (c4a1) obj;
        return wj50.m88271j(this.f33898a, c4a1Var.f33898a) && wj50.m88271j(this.f33899b, c4a1Var.f33899b) && wj50.m88271j(this.f33900c, c4a1Var.f33900c);
    }

    public final int hashCode() {
        return this.f33900c.hashCode() + s571.m77243b(this.f33898a.hashCode() * 31, 31, this.f33899b);
    }
}
