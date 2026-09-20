package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class c6k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f34566a;

    /* JADX INFO: renamed from: b */
    public final String f34567b;

    /* JADX INFO: renamed from: c */
    public final String f34568c;

    /* JADX INFO: renamed from: d */
    public final String f34569d;

    /* JADX INFO: renamed from: e */
    public final List f34570e;

    public c6k0(String str, String str2, String str3, String str4, List list) {
        this.f34566a = str;
        this.f34567b = str2;
        this.f34568c = str3;
        this.f34569d = str4;
        this.f34570e = list;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f34570e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6k0)) {
            return false;
        }
        c6k0 c6k0Var = (c6k0) obj;
        return wj50.m88271j(this.f34566a, c6k0Var.f34566a) && wj50.m88271j(this.f34567b, c6k0Var.f34567b) && wj50.m88271j(this.f34568c, c6k0Var.f34568c) && wj50.m88271j(this.f34569d, c6k0Var.f34569d) && wj50.m88271j(this.f34570e, c6k0Var.f34570e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f34566a.hashCode() * 31, 31, this.f34567b);
        String str = this.f34568c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34569d;
        return this.f34570e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
