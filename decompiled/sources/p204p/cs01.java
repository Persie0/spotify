package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class cs01 {

    /* JADX INFO: renamed from: a */
    public final String f41431a;

    /* JADX INFO: renamed from: b */
    public final boolean f41432b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f41433c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f41434d;

    public cs01(String str, boolean z, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.f41431a = str;
        this.f41432b = z;
        this.f41433c = linkedHashSet;
        this.f41434d = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs01)) {
            return false;
        }
        cs01 cs01Var = (cs01) obj;
        return wj50.m88271j(this.f41431a, cs01Var.f41431a) && this.f41432b == cs01Var.f41432b && this.f41433c.equals(cs01Var.f41433c) && this.f41434d.equals(cs01Var.f41434d);
    }

    public final int hashCode() {
        return this.f41434d.hashCode() + ((this.f41433c.hashCode() + s571.m77245d(this.f41431a.hashCode() * 31, 31, this.f41432b)) * 31);
    }
}
