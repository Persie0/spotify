package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ovr implements qvr {

    /* JADX INFO: renamed from: a */
    public final String f170550a;

    public ovr(String str) {
        this.f170550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovr) && wj50.m88271j(this.f170550a, ((ovr) obj).f170550a);
    }

    public final int hashCode() {
        return this.f170550a.hashCode();
    }
}
