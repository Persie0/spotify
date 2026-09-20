package p204p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class bs01 {

    /* JADX INFO: renamed from: a */
    public final dd41 f30206a;

    /* JADX INFO: renamed from: b */
    public final boolean f30207b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f30208c;

    /* JADX INFO: renamed from: d */
    public final Set f30209d;

    public bs01(dd41 dd41Var, boolean z, LinkedHashSet linkedHashSet, Set set) {
        this.f30206a = dd41Var;
        this.f30207b = z;
        this.f30208c = linkedHashSet;
        this.f30209d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs01)) {
            return false;
        }
        bs01 bs01Var = (bs01) obj;
        return this.f30206a.equals(bs01Var.f30206a) && this.f30207b == bs01Var.f30207b && this.f30208c.equals(bs01Var.f30208c) && this.f30209d.equals(bs01Var.f30209d);
    }

    public final int hashCode() {
        return this.f30209d.hashCode() + ((this.f30208c.hashCode() + s571.m77245d(this.f30206a.hashCode() * 31, 31, this.f30207b)) * 31);
    }
}
