package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class geo implements heo {

    /* JADX INFO: renamed from: a */
    public final String f79159a;

    public geo(String str) {
        this.f79159a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof geo) && wj50.m88271j(this.f79159a, ((geo) obj).f79159a);
    }

    public final int hashCode() {
        return this.f79159a.hashCode();
    }
}
