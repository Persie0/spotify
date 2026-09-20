package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class od8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f164121a;

    /* JADX INFO: renamed from: b */
    public final UUID f164122b;

    public od8(String str, UUID uuid) {
        this.f164121a = str;
        this.f164122b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od8)) {
            return false;
        }
        od8 od8Var = (od8) obj;
        return wj50.m88271j(this.f164121a, od8Var.f164121a) && wj50.m88271j(this.f164122b, od8Var.f164122b);
    }

    public final int hashCode() {
        return this.f164122b.hashCode() + (this.f164121a.hashCode() * 31);
    }
}
