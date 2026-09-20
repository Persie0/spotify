package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z8c extends c9c {

    /* JADX INFO: renamed from: a */
    public final String f280434a;

    public z8c(String str) {
        this.f280434a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8c) && wj50.m88271j(this.f280434a, ((z8c) obj).f280434a);
    }

    public final int hashCode() {
        return this.f280434a.hashCode();
    }
}
