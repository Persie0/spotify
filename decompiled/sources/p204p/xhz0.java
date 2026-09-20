package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xhz0 implements zhz0 {

    /* JADX INFO: renamed from: a */
    public final String f261732a;

    /* JADX INFO: renamed from: b */
    public final List f261733b;

    public xhz0(String str, List list) {
        this.f261732a = str;
        this.f261733b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhz0)) {
            return false;
        }
        xhz0 xhz0Var = (xhz0) obj;
        return wj50.m88271j(this.f261732a, xhz0Var.f261732a) && wj50.m88271j(this.f261733b, xhz0Var.f261733b);
    }

    public final int hashCode() {
        return this.f261733b.hashCode() + (this.f261732a.hashCode() * 31);
    }
}
