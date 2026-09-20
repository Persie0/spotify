package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class uc8 extends vc8 {

    /* JADX INFO: renamed from: c */
    public final String f228965c;

    /* JADX INFO: renamed from: d */
    public final UUID f228966d;

    public uc8(String str, UUID uuid) {
        this.f228965c = str;
        this.f228966d = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc8)) {
            return false;
        }
        uc8 uc8Var = (uc8) obj;
        return wj50.m88271j(this.f228965c, uc8Var.f228965c) && wj50.m88271j(this.f228966d, uc8Var.f228966d);
    }

    public final int hashCode() {
        return this.f228966d.hashCode() + (this.f228965c.hashCode() * 31);
    }
}
