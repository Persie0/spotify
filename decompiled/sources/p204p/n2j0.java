package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class n2j0 extends b3j0 {

    /* JADX INFO: renamed from: a */
    public final UUID f149774a;

    public n2j0(UUID uuid) {
        this.f149774a = uuid;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: a */
    public final boolean mo28034a() {
        return false;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: b */
    public final String mo28035b() {
        return "backend(" + this.f149774a + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2j0) && wj50.m88271j(this.f149774a, ((n2j0) obj).f149774a);
    }

    public final int hashCode() {
        return this.f149774a.hashCode();
    }
}
