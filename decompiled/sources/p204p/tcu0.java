package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class tcu0 {

    /* JADX INFO: renamed from: a */
    public final List f219145a;

    /* JADX INFO: renamed from: b */
    public final int f219146b;

    /* JADX INFO: renamed from: c */
    public final String f219147c;

    /* JADX INFO: renamed from: d */
    public final String f219148d;

    public tcu0(int i, String str, String str2, List list) {
        this.f219145a = list;
        this.f219146b = i;
        this.f219147c = str;
        this.f219148d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcu0)) {
            return false;
        }
        tcu0 tcu0Var = (tcu0) obj;
        return this.f219145a.equals(tcu0Var.f219145a) && this.f219146b == tcu0Var.f219146b && this.f219147c.equals(tcu0Var.f219147c) && wj50.m88271j(this.f219148d, tcu0Var.f219148d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77243b(s571.m77243b(mt60.m62800g(this.f219146b, this.f219145a.hashCode() * 31, 31), 31, this.f219147c), 31, this.f219148d);
    }
}
