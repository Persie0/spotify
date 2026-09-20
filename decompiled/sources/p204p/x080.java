package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x080 {

    /* JADX INFO: renamed from: a */
    public final String f256827a;

    /* JADX INFO: renamed from: b */
    public final List f256828b;

    public x080(String str, List list) {
        this.f256827a = str;
        this.f256828b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x080)) {
            return false;
        }
        x080 x080Var = (x080) obj;
        return wj50.m88271j(this.f256827a, x080Var.f256827a) && wj50.m88271j(this.f256828b, x080Var.f256828b);
    }

    public final int hashCode() {
        return this.f256828b.hashCode() + (this.f256827a.hashCode() * 31);
    }
}
