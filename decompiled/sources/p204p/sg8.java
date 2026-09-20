package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class sg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final String f208764a;

    /* JADX INFO: renamed from: b */
    public final UUID f208765b;

    /* JADX INFO: renamed from: c */
    public final String f208766c;

    /* JADX INFO: renamed from: d */
    public final hg8 f208767d;

    public sg8(String str, UUID uuid, String str2, hg8 hg8Var) {
        this.f208764a = str;
        this.f208765b = uuid;
        this.f208766c = str2;
        this.f208767d = hg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg8)) {
            return false;
        }
        sg8 sg8Var = (sg8) obj;
        return wj50.m88271j(this.f208764a, sg8Var.f208764a) && wj50.m88271j(this.f208765b, sg8Var.f208765b) && wj50.m88271j(this.f208766c, sg8Var.f208766c) && this.f208767d == sg8Var.f208767d;
    }

    public final int hashCode() {
        return this.f208767d.hashCode() + s571.m77243b((this.f208765b.hashCode() + (this.f208764a.hashCode() * 31)) * 31, 31, this.f208766c);
    }
}
