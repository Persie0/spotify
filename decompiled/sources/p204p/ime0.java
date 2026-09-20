package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ime0 {

    /* JADX INFO: renamed from: a */
    public final String f103695a;

    /* JADX INFO: renamed from: b */
    public final String f103696b;

    /* JADX INFO: renamed from: c */
    public final boolean f103697c;

    public ime0(String str, String str2, boolean z) {
        this.f103695a = str;
        this.f103696b = str2;
        this.f103697c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ime0)) {
            return false;
        }
        ime0 ime0Var = (ime0) obj;
        return wj50.m88271j(this.f103695a, ime0Var.f103695a) && wj50.m88271j(this.f103696b, ime0Var.f103696b) && this.f103697c == ime0Var.f103697c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103697c) + s571.m77243b(this.f103695a.hashCode() * 31, 31, this.f103696b);
    }
}
