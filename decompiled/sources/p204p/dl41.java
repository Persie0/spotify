package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dl41 implements fl41 {

    /* JADX INFO: renamed from: a */
    public final String f50119a;

    public dl41(String str) {
        this.f50119a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl41) && wj50.m88271j(this.f50119a, ((dl41) obj).f50119a);
    }

    @Override // p204p.fl41
    public final String getUri() {
        return this.f50119a;
    }

    public final int hashCode() {
        return this.f50119a.hashCode();
    }
}
