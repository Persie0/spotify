package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gg80 {

    /* JADX INFO: renamed from: a */
    public final String f79569a;

    /* JADX INFO: renamed from: b */
    public final String f79570b;

    /* JADX INFO: renamed from: c */
    public final int f79571c;

    public gg80(String str, String str2, int i) {
        this.f79569a = str;
        this.f79570b = str2;
        this.f79571c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg80)) {
            return false;
        }
        gg80 gg80Var = (gg80) obj;
        return wj50.m88271j(this.f79569a, gg80Var.f79569a) && wj50.m88271j(this.f79570b, gg80Var.f79570b) && this.f79571c == gg80Var.f79571c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79571c) + s571.m77243b(this.f79569a.hashCode() * 31, 31, this.f79570b);
    }
}
