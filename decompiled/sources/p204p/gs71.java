package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gs71 implements is71 {

    /* JADX INFO: renamed from: a */
    public final String f83900a;

    public gs71(String str) {
        this.f83900a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs71) && wj50.m88271j(this.f83900a, ((gs71) obj).f83900a);
    }

    public final int hashCode() {
        return this.f83900a.hashCode();
    }
}
