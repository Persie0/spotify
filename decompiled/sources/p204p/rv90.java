package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f203026a;

    public rv90(String str) {
        this.f203026a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv90) && wj50.m88271j(this.f203026a, ((rv90) obj).f203026a);
    }

    public final int hashCode() {
        return this.f203026a.hashCode();
    }
}
