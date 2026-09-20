package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pd71 {

    /* JADX INFO: renamed from: a */
    public final int f176377a;

    /* JADX INFO: renamed from: b */
    public final String f176378b;

    /* JADX INFO: renamed from: c */
    public final f271 f176379c;

    /* JADX INFO: renamed from: d */
    public final boolean f176380d;

    public pd71(int i, String str, f271 f271Var, boolean z) {
        this.f176377a = i;
        this.f176378b = str;
        this.f176379c = f271Var;
        this.f176380d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd71)) {
            return false;
        }
        pd71 pd71Var = (pd71) obj;
        return this.f176377a == pd71Var.f176377a && wj50.m88271j(this.f176378b, pd71Var.f176378b) && wj50.m88271j(this.f176379c, pd71Var.f176379c) && this.f176380d == pd71Var.f176380d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176380d) + ((this.f176379c.hashCode() + s571.m77243b(Integer.hashCode(this.f176377a) * 31, 31, this.f176378b)) * 31);
    }
}
