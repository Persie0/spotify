package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ch71 {

    /* JADX INFO: renamed from: a */
    public final Object f37951a;

    /* JADX INFO: renamed from: b */
    public final Object f37952b;

    /* JADX INFO: renamed from: c */
    public final Object f37953c;

    public ch71(List list, List list2, List list3) {
        this.f37951a = list;
        this.f37952b = list2;
        this.f37953c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch71)) {
            return false;
        }
        ch71 ch71Var = (ch71) obj;
        return this.f37951a.equals(ch71Var.f37951a) && this.f37952b.equals(ch71Var.f37952b) && this.f37953c.equals(ch71Var.f37953c);
    }

    public final int hashCode() {
        return this.f37953c.hashCode() + dq60.m36604d(this.f37951a.hashCode() * 31, 31, this.f37952b);
    }
}
