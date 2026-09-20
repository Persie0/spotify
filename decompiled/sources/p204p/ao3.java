package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ao3 implements bo3 {

    /* JADX INFO: renamed from: a */
    public final String f17550a;

    public ao3(String str) {
        this.f17550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao3) && wj50.m88271j(this.f17550a, ((ao3) obj).f17550a);
    }

    public final int hashCode() {
        return this.f17550a.hashCode();
    }
}
