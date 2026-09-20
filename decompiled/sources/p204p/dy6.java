package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dy6 {

    /* JADX INFO: renamed from: a */
    public final boolean f54197a;

    /* JADX INFO: renamed from: b */
    public final String f54198b;

    public dy6(boolean z, String str) {
        this.f54197a = z;
        this.f54198b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy6)) {
            return false;
        }
        dy6 dy6Var = (dy6) obj;
        return this.f54197a == dy6Var.f54197a && wj50.m88271j(this.f54198b, dy6Var.f54198b);
    }

    public final int hashCode() {
        return this.f54198b.hashCode() + (Boolean.hashCode(this.f54197a) * 31);
    }
}
