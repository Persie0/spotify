package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b47 {

    /* JADX INFO: renamed from: a */
    public final String f23237a;

    /* JADX INFO: renamed from: b */
    public final List f23238b;

    public b47(String str, List list) {
        this.f23237a = str;
        this.f23238b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b47)) {
            return false;
        }
        b47 b47Var = (b47) obj;
        return wj50.m88271j(this.f23237a, b47Var.f23237a) && wj50.m88271j(this.f23238b, b47Var.f23238b);
    }

    public final int hashCode() {
        return this.f23238b.hashCode() + (this.f23237a.hashCode() * 31);
    }
}
