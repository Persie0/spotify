package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class nd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f152699a;

    /* JADX INFO: renamed from: b */
    public final UUID f152700b;

    /* JADX INFO: renamed from: c */
    public final int f152701c;

    public nd8(int i, String str, UUID uuid) {
        this.f152699a = str;
        this.f152700b = uuid;
        this.f152701c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd8)) {
            return false;
        }
        nd8 nd8Var = (nd8) obj;
        return wj50.m88271j(this.f152699a, nd8Var.f152699a) && wj50.m88271j(this.f152700b, nd8Var.f152700b) && this.f152701c == nd8Var.f152701c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152701c) + ((this.f152700b.hashCode() + (this.f152699a.hashCode() * 31)) * 31);
    }
}
