package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xjy implements yjy {

    /* JADX INFO: renamed from: a */
    public final String f262241a;

    public xjy(String str) {
        this.f262241a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjy) && wj50.m88271j(this.f262241a, ((xjy) obj).f262241a);
    }

    public final int hashCode() {
        return this.f262241a.hashCode();
    }
}
