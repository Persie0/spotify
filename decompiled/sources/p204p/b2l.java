package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f22630a;

    public b2l(String str) {
        this.f22630a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m27960a() {
        return this.f22630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2l) && wj50.m88271j(this.f22630a, ((b2l) obj).f22630a);
    }

    public final int hashCode() {
        return this.f22630a.hashCode();
    }
}
