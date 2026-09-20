package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class on90 {

    /* JADX INFO: renamed from: a */
    public final String f167201a;

    /* JADX INFO: renamed from: b */
    public final String f167202b;

    public on90(String str, String str2) {
        this.f167201a = str;
        this.f167202b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m67401a() {
        return this.f167202b;
    }

    /* JADX INFO: renamed from: b */
    public final String m67402b() {
        return this.f167201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on90)) {
            return false;
        }
        on90 on90Var = (on90) obj;
        return wj50.m88271j(this.f167201a, on90Var.f167201a) && wj50.m88271j(this.f167202b, on90Var.f167202b);
    }

    public final int hashCode() {
        return this.f167202b.hashCode() + (this.f167201a.hashCode() * 31);
    }
}
