package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class ih8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final String f102202a;

    /* JADX INFO: renamed from: b */
    public final UUID f102203b;

    /* JADX INFO: renamed from: c */
    public final String f102204c;

    /* JADX INFO: renamed from: d */
    public final hg8 f102205d;

    public ih8(String str, UUID uuid, String str2, hg8 hg8Var) {
        this.f102202a = str;
        this.f102203b = uuid;
        this.f102204c = str2;
        this.f102205d = hg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih8)) {
            return false;
        }
        ih8 ih8Var = (ih8) obj;
        return wj50.m88271j(this.f102202a, ih8Var.f102202a) && wj50.m88271j(this.f102203b, ih8Var.f102203b) && wj50.m88271j(this.f102204c, ih8Var.f102204c) && this.f102205d == ih8Var.f102205d;
    }

    public final int hashCode() {
        return this.f102205d.hashCode() + s571.m77243b((this.f102203b.hashCode() + (this.f102202a.hashCode() * 31)) * 31, 31, this.f102204c);
    }
}
