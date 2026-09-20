package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c441 {

    /* JADX INFO: renamed from: a */
    public final String f33843a;

    /* JADX INFO: renamed from: b */
    public final boolean f33844b;

    /* JADX INFO: renamed from: c */
    public final boolean f33845c;

    public c441(String str, boolean z, boolean z2) {
        this.f33843a = str;
        this.f33844b = z;
        this.f33845c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c441)) {
            return false;
        }
        c441 c441Var = (c441) obj;
        return wj50.m88271j(this.f33843a, c441Var.f33843a) && this.f33844b == c441Var.f33844b && this.f33845c == c441Var.f33845c;
    }

    public final int hashCode() {
        String str = this.f33843a;
        return Boolean.hashCode(this.f33845c) + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f33844b);
    }
}
