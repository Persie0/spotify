package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mke0 {

    /* JADX INFO: renamed from: a */
    public final Set f144557a;

    /* JADX INFO: renamed from: b */
    public final Set f144558b;

    public mke0(Set set, Set set2) {
        this.f144557a = set;
        this.f144558b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mke0)) {
            return false;
        }
        mke0 mke0Var = (mke0) obj;
        return wj50.m88271j(this.f144557a, mke0Var.f144557a) && wj50.m88271j(this.f144558b, mke0Var.f144558b);
    }

    public final int hashCode() {
        return this.f144558b.hashCode() + (this.f144557a.hashCode() * 31);
    }
}
