package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sp80 {

    /* JADX INFO: renamed from: a */
    public final int f212768a;

    /* JADX INFO: renamed from: b */
    public final List f212769b;

    public /* synthetic */ sp80() {
        this(-1, lau.f131415a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp80)) {
            return false;
        }
        sp80 sp80Var = (sp80) obj;
        return this.f212768a == sp80Var.f212768a && wj50.m88271j(this.f212769b, sp80Var.f212769b);
    }

    public final int hashCode() {
        return this.f212769b.hashCode() + (Integer.hashCode(this.f212768a) * 31);
    }

    public sp80(int i, List list) {
        this.f212768a = i;
        this.f212769b = list;
    }
}
