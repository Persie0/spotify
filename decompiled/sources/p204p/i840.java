package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i840 implements l840 {

    /* JADX INFO: renamed from: a */
    public final String f99691a;

    public i840(String str) {
        this.f99691a = str;
    }

    @Override // p204p.l840
    /* JADX INFO: renamed from: a */
    public final String mo43945a() {
        return this.f99691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i840) && wj50.m88271j(this.f99691a, ((i840) obj).f99691a);
    }

    public final int hashCode() {
        return this.f99691a.hashCode();
    }
}
