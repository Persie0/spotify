package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class euy0 implements quy0 {

    /* JADX INFO: renamed from: a */
    public final int f63110a;

    /* JADX INFO: renamed from: b */
    public final List f63111b;

    public euy0(int i, List list) {
        this.f63110a = i;
        this.f63111b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euy0)) {
            return false;
        }
        euy0 euy0Var = (euy0) obj;
        return this.f63110a == euy0Var.f63110a && wj50.m88271j(this.f63111b, euy0Var.f63111b);
    }

    public final int hashCode() {
        return this.f63111b.hashCode() + (Integer.hashCode(this.f63110a) * 31);
    }
}
