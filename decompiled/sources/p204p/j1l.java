package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class j1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f107770a;

    public j1l(String str) {
        this.f107770a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1l) && wj50.m88271j(this.f107770a, ((j1l) obj).f107770a);
    }

    public final int hashCode() {
        return this.f107770a.hashCode();
    }
}
