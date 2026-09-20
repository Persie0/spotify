package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class e6k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f56652a;

    /* JADX INFO: renamed from: b */
    public final String f56653b;

    /* JADX INFO: renamed from: c */
    public final List f56654c;

    public e6k0(String str, List list, String str2) {
        this.f56652a = str;
        this.f56653b = str2;
        this.f56654c = list;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f56654c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6k0)) {
            return false;
        }
        e6k0 e6k0Var = (e6k0) obj;
        return wj50.m88271j(this.f56652a, e6k0Var.f56652a) && wj50.m88271j(this.f56653b, e6k0Var.f56653b) && wj50.m88271j(this.f56654c, e6k0Var.f56654c);
    }

    public final int hashCode() {
        return this.f56654c.hashCode() + s571.m77243b(this.f56652a.hashCode() * 31, 31, this.f56653b);
    }
}
