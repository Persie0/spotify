package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f192359a;

    public qtc0(String str) {
        this.f192359a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtc0) && wj50.m88271j(this.f192359a, ((qtc0) obj).f192359a);
    }

    public final int hashCode() {
        return this.f192359a.hashCode();
    }
}
