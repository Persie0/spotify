package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ia91 {

    /* JADX INFO: renamed from: a */
    public final List f100204a;

    /* JADX INFO: renamed from: b */
    public final boolean f100205b;

    public ia91(List list, boolean z) {
        this.f100204a = list;
        this.f100205b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia91)) {
            return false;
        }
        ia91 ia91Var = (ia91) obj;
        return wj50.m88271j(this.f100204a, ia91Var.f100204a) && this.f100205b == ia91Var.f100205b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100205b) + (this.f100204a.hashCode() * 31);
    }
}
