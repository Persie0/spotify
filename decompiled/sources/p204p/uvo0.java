package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f234484a;

    /* JADX INFO: renamed from: b */
    public final awo0 f234485b;

    /* JADX INFO: renamed from: c */
    public final boolean f234486c;

    public uvo0(String str, awo0 awo0Var, boolean z) {
        this.f234484a = str;
        this.f234485b = awo0Var;
        this.f234486c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvo0)) {
            return false;
        }
        uvo0 uvo0Var = (uvo0) obj;
        return wj50.m88271j(this.f234484a, uvo0Var.f234484a) && this.f234485b == uvo0Var.f234485b && this.f234486c == uvo0Var.f234486c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234486c) + ((this.f234485b.hashCode() + (this.f234484a.hashCode() * 31)) * 31);
    }
}
