package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u4f implements y4f {

    /* JADX INFO: renamed from: a */
    public final String f226679a;

    public u4f(String str) {
        this.f226679a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4f) && wj50.m88271j(this.f226679a, ((u4f) obj).f226679a);
    }

    public final int hashCode() {
        return this.f226679a.hashCode();
    }
}
