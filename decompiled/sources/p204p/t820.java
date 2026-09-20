package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t820 {

    /* JADX INFO: renamed from: a */
    public final String f217947a;

    /* JADX INFO: renamed from: b */
    public final String f217948b;

    public t820(String str, String str2) {
        this.f217947a = str;
        this.f217948b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t820)) {
            return false;
        }
        t820 t820Var = (t820) obj;
        return wj50.m88271j(this.f217947a, t820Var.f217947a) && wj50.m88271j(this.f217948b, t820Var.f217948b);
    }

    public final int hashCode() {
        return this.f217948b.hashCode() + (this.f217947a.hashCode() * 31);
    }
}
