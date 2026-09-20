package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ni20 implements oi20 {

    /* JADX INFO: renamed from: a */
    public final String f154163a;

    /* JADX INFO: renamed from: b */
    public final String f154164b;

    public ni20(String str, String str2) {
        this.f154163a = str;
        this.f154164b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m64551a() {
        return this.f154164b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni20)) {
            return false;
        }
        ni20 ni20Var = (ni20) obj;
        return wj50.m88271j(this.f154163a, ni20Var.f154163a) && wj50.m88271j(this.f154164b, ni20Var.f154164b);
    }

    public final int hashCode() {
        return this.f154164b.hashCode() + (this.f154163a.hashCode() * 31);
    }
}
