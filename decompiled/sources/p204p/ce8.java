package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ce8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f37022a;

    /* JADX INFO: renamed from: b */
    public final UUID f37023b;

    /* JADX INFO: renamed from: c */
    public final re8 f37024c;

    /* JADX INFO: renamed from: d */
    public final hg8 f37025d;

    public ce8(String str, UUID uuid, re8 re8Var, hg8 hg8Var) {
        this.f37022a = str;
        this.f37023b = uuid;
        this.f37024c = re8Var;
        this.f37025d = hg8Var;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f37022a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce8)) {
            return false;
        }
        ce8 ce8Var = (ce8) obj;
        return wj50.m88271j(this.f37022a, ce8Var.f37022a) && wj50.m88271j(this.f37023b, ce8Var.f37023b) && wj50.m88271j(this.f37024c, ce8Var.f37024c) && this.f37025d == ce8Var.f37025d;
    }

    public final int hashCode() {
        return this.f37025d.hashCode() + ((this.f37024c.hashCode() + ((this.f37023b.hashCode() + (this.f37022a.hashCode() * 31)) * 31)) * 31);
    }
}
