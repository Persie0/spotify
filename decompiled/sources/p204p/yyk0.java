package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yyk0 {

    /* JADX INFO: renamed from: a */
    public final String f277530a;

    /* JADX INFO: renamed from: b */
    public final String f277531b;

    /* JADX INFO: renamed from: c */
    public final int f277532c;

    public yyk0(String str, String str2, int i) {
        this.f277530a = str;
        this.f277531b = str2;
        this.f277532c = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m94941a() {
        return this.f277531b;
    }

    /* JADX INFO: renamed from: b */
    public final String m94942b() {
        return this.f277530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyk0)) {
            return false;
        }
        yyk0 yyk0Var = (yyk0) obj;
        return wj50.m88271j(this.f277530a, yyk0Var.f277530a) && wj50.m88271j(this.f277531b, yyk0Var.f277531b) && this.f277532c == yyk0Var.f277532c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f277532c) + s571.m77243b(this.f277530a.hashCode() * 31, 31, this.f277531b);
    }
}
