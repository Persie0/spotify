package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f90800a;

    /* JADX INFO: renamed from: b */
    public final String f90801b;

    /* JADX INFO: renamed from: c */
    public final Set f90802c;

    /* JADX INFO: renamed from: d */
    public final Set f90803d;

    public hfs0(String str, String str2, Set set, Set set2) {
        this.f90800a = str;
        this.f90801b = str2;
        this.f90802c = set;
        this.f90803d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfs0)) {
            return false;
        }
        hfs0 hfs0Var = (hfs0) obj;
        return wj50.m88271j(this.f90800a, hfs0Var.f90800a) && wj50.m88271j(this.f90801b, hfs0Var.f90801b) && wj50.m88271j(this.f90802c, hfs0Var.f90802c) && wj50.m88271j(this.f90803d, hfs0Var.f90803d);
    }

    public final int hashCode() {
        return this.f90803d.hashCode() + klh.m56830b(s571.m77243b(this.f90800a.hashCode() * 31, 31, this.f90801b), 31, this.f90802c);
    }
}
