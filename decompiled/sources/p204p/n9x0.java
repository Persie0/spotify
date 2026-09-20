package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n9x0 implements p9x0 {

    /* JADX INFO: renamed from: a */
    public final String f151882a;

    public n9x0(String str) {
        this.f151882a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m63939a() {
        return this.f151882a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9x0) && wj50.m88271j(this.f151882a, ((n9x0) obj).f151882a);
    }

    public final int hashCode() {
        return this.f151882a.hashCode();
    }
}
