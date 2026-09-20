package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class el41 implements fl41 {

    /* JADX INFO: renamed from: a */
    public final String f60585a;

    public el41(String str) {
        this.f60585a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el41) && wj50.m88271j(this.f60585a, ((el41) obj).f60585a);
    }

    @Override // p204p.fl41
    public final String getUri() {
        return this.f60585a;
    }

    public final int hashCode() {
        return this.f60585a.hashCode();
    }
}
