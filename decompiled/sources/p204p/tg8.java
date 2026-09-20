package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class tg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final String f220137a;

    /* JADX INFO: renamed from: b */
    public final UUID f220138b;

    public tg8(String str, UUID uuid) {
        this.f220137a = str;
        this.f220138b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg8)) {
            return false;
        }
        tg8 tg8Var = (tg8) obj;
        return wj50.m88271j(this.f220137a, tg8Var.f220137a) && wj50.m88271j(this.f220138b, tg8Var.f220138b);
    }

    public final int hashCode() {
        return this.f220138b.hashCode() + (this.f220137a.hashCode() * 31);
    }
}
