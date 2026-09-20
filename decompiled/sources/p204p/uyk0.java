package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class uyk0 {

    /* JADX INFO: renamed from: a */
    public final k330 f235315a;

    /* JADX INFO: renamed from: b */
    public final Map f235316b;

    public uyk0(k330 k330Var, Map map) {
        this.f235315a = k330Var;
        this.f235316b = map;
    }

    /* JADX INFO: renamed from: a */
    public final k330 m84273a() {
        return this.f235315a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyk0)) {
            return false;
        }
        uyk0 uyk0Var = (uyk0) obj;
        return wj50.m88271j(this.f235315a, uyk0Var.f235315a) && wj50.m88271j(this.f235316b, uyk0Var.f235316b);
    }

    public final int hashCode() {
        return this.f235316b.hashCode() + (this.f235315a.hashCode() * 31);
    }
}
