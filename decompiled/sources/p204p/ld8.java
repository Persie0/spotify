package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class ld8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f132091a;

    /* JADX INFO: renamed from: b */
    public final UUID f132092b;

    /* JADX INFO: renamed from: c */
    public final int f132093c;

    public ld8(int i, String str, UUID uuid) {
        this.f132091a = str;
        this.f132092b = uuid;
        this.f132093c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld8)) {
            return false;
        }
        ld8 ld8Var = (ld8) obj;
        return wj50.m88271j(this.f132091a, ld8Var.f132091a) && wj50.m88271j(this.f132092b, ld8Var.f132092b) && this.f132093c == ld8Var.f132093c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f132093c) + ((this.f132092b.hashCode() + (this.f132091a.hashCode() * 31)) * 31);
    }
}
