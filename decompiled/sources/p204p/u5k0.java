package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class u5k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f227062a;

    /* JADX INFO: renamed from: b */
    public final String f227063b;

    /* JADX INFO: renamed from: c */
    public final List f227064c;

    public u5k0(String str, List list, String str2) {
        this.f227062a = str;
        this.f227063b = str2;
        this.f227064c = list;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f227064c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5k0)) {
            return false;
        }
        u5k0 u5k0Var = (u5k0) obj;
        return wj50.m88271j(this.f227062a, u5k0Var.f227062a) && wj50.m88271j(this.f227063b, u5k0Var.f227063b) && wj50.m88271j(this.f227064c, u5k0Var.f227064c);
    }

    public final int hashCode() {
        return this.f227064c.hashCode() + s571.m77243b(this.f227062a.hashCode() * 31, 31, this.f227063b);
    }
}
