package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v4f implements y4f {

    /* JADX INFO: renamed from: a */
    public final String f237140a;

    public v4f(String str) {
        this.f237140a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4f) && wj50.m88271j(this.f237140a, ((v4f) obj).f237140a);
    }

    public final int hashCode() {
        return this.f237140a.hashCode();
    }
}
