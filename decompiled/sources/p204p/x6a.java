package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x6a {

    /* JADX INFO: renamed from: a */
    public final String f258620a;

    public x6a(String str) {
        this.f258620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6a) && wj50.m88271j(this.f258620a, ((x6a) obj).f258620a);
    }

    public final int hashCode() {
        return this.f258620a.hashCode();
    }
}
