package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class kh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final String f122543a;

    /* JADX INFO: renamed from: b */
    public final UUID f122544b;

    /* JADX INFO: renamed from: c */
    public final String f122545c;

    /* JADX INFO: renamed from: d */
    public final hg8 f122546d;

    public kh8(String str, UUID uuid, String str2, hg8 hg8Var) {
        this.f122543a = str;
        this.f122544b = uuid;
        this.f122545c = str2;
        this.f122546d = hg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh8)) {
            return false;
        }
        kh8 kh8Var = (kh8) obj;
        return wj50.m88271j(this.f122543a, kh8Var.f122543a) && wj50.m88271j(this.f122544b, kh8Var.f122544b) && wj50.m88271j(this.f122545c, kh8Var.f122545c) && this.f122546d == kh8Var.f122546d;
    }

    public final int hashCode() {
        return this.f122546d.hashCode() + s571.m77243b((this.f122544b.hashCode() + (this.f122543a.hashCode() * 31)) * 31, 31, this.f122545c);
    }
}
