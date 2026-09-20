package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hoq0 implements joq0 {

    /* JADX INFO: renamed from: a */
    public final String f93589a;

    public hoq0(String str) {
        this.f93589a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoq0) && wj50.m88271j(this.f93589a, ((hoq0) obj).f93589a);
    }

    public final int hashCode() {
        return this.f93589a.hashCode();
    }
}
