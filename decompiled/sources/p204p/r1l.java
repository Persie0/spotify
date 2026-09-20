package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f194883a;

    public r1l(String str) {
        this.f194883a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m74484a() {
        return this.f194883a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1l) && wj50.m88271j(this.f194883a, ((r1l) obj).f194883a);
    }

    public final int hashCode() {
        return this.f194883a.hashCode();
    }
}
