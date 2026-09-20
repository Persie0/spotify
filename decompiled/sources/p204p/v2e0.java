package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v2e0 implements x2e0 {

    /* JADX INFO: renamed from: a */
    public final String f236622a;

    /* JADX INFO: renamed from: b */
    public final String f236623b;

    public v2e0(String str, String str2) {
        this.f236622a = str;
        this.f236623b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2e0)) {
            return false;
        }
        v2e0 v2e0Var = (v2e0) obj;
        return wj50.m88271j(this.f236622a, v2e0Var.f236622a) && wj50.m88271j(this.f236623b, v2e0Var.f236623b);
    }

    @Override // p204p.x2e0
    public final String getText() {
        return this.f236622a;
    }

    public final int hashCode() {
        return this.f236623b.hashCode() + (this.f236622a.hashCode() * 31);
    }
}
