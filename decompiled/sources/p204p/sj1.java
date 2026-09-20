package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sj1 implements uj1 {

    /* JADX INFO: renamed from: a */
    public final String f209709a;

    public sj1(String str) {
        this.f209709a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj1) && wj50.m88271j(this.f209709a, ((sj1) obj).f209709a);
    }

    public final int hashCode() {
        return this.f209709a.hashCode();
    }
}
