package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class daq0 {

    /* JADX INFO: renamed from: a */
    public final String f47093a;

    /* JADX INFO: renamed from: b */
    public final String f47094b;

    /* JADX INFO: renamed from: c */
    public final int f47095c;

    public daq0(String str, String str2, int i) {
        this.f47093a = str;
        this.f47094b = str2;
        this.f47095c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daq0)) {
            return false;
        }
        daq0 daq0Var = (daq0) obj;
        return wj50.m88271j(this.f47093a, daq0Var.f47093a) && wj50.m88271j(this.f47094b, daq0Var.f47094b) && this.f47095c == daq0Var.f47095c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47095c) + s571.m77243b(this.f47093a.hashCode() * 31, 31, this.f47094b);
    }
}
