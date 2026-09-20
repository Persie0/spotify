package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ean0 implements fan0 {

    /* JADX INFO: renamed from: a */
    public final String f57702a;

    public ean0(String str) {
        this.f57702a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ean0) && wj50.m88271j(this.f57702a, ((ean0) obj).f57702a);
    }

    @Override // p204p.fan0
    public final String getUri() {
        return this.f57702a;
    }

    public final int hashCode() {
        return this.f57702a.hashCode();
    }
}
