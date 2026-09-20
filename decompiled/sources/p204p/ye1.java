package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ye1 implements cf1 {

    /* JADX INFO: renamed from: a */
    public final String f271887a;

    public ye1(String str) {
        this.f271887a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye1) && wj50.m88271j(this.f271887a, ((ye1) obj).f271887a);
    }

    public final int hashCode() {
        return this.f271887a.hashCode();
    }
}
