package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b9c extends c9c {

    /* JADX INFO: renamed from: a */
    public final String f24824a;

    public b9c(String str) {
        this.f24824a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9c) && wj50.m88271j(this.f24824a, ((b9c) obj).f24824a);
    }

    public final int hashCode() {
        return this.f24824a.hashCode();
    }
}
