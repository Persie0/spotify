package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class w5k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f248103a;

    /* JADX INFO: renamed from: b */
    public final String f248104b;

    /* JADX INFO: renamed from: c */
    public final List f248105c;

    public w5k0(String str, List list, String str2) {
        this.f248103a = str;
        this.f248104b = str2;
        this.f248105c = list;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f248105c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5k0)) {
            return false;
        }
        w5k0 w5k0Var = (w5k0) obj;
        return wj50.m88271j(this.f248103a, w5k0Var.f248103a) && wj50.m88271j(this.f248104b, w5k0Var.f248104b) && wj50.m88271j(this.f248105c, w5k0Var.f248105c);
    }

    public final int hashCode() {
        return this.f248105c.hashCode() + s571.m77243b(this.f248103a.hashCode() * 31, 31, this.f248104b);
    }
}
