package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final int f71280a;

    /* JADX INFO: renamed from: b */
    public final List f71281b;

    public fnf0(int i, List list) {
        this.f71280a = i;
        this.f71281b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnf0)) {
            return false;
        }
        fnf0 fnf0Var = (fnf0) obj;
        return this.f71280a == fnf0Var.f71280a && wj50.m88271j(this.f71281b, fnf0Var.f71281b);
    }

    public final int hashCode() {
        return this.f71281b.hashCode() + (Integer.hashCode(this.f71280a) * 31);
    }
}
