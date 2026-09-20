package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h8l implements i8l {

    /* JADX INFO: renamed from: a */
    public final String f88726a;

    public h8l(String str) {
        this.f88726a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty URI must be provided.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m46833a() {
        return this.f88726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8l) && wj50.m88271j(this.f88726a, ((h8l) obj).f88726a);
    }

    public final int hashCode() {
        return this.f88726a.hashCode() * 31;
    }
}
