package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dl1 {

    /* JADX INFO: renamed from: a */
    public final String f50081a;

    /* JADX INFO: renamed from: b */
    public final boolean f50082b;

    /* JADX INFO: renamed from: c */
    public final boolean f50083c;

    public dl1(String str, boolean z, boolean z2) {
        this.f50081a = str;
        this.f50082b = z;
        this.f50083c = z2;
    }

    /* JADX INFO: renamed from: a */
    public final String m36338a() {
        return this.f50081a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36339b() {
        return this.f50082b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36340c() {
        return this.f50083c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1Var = (dl1) obj;
        return wj50.m88271j(this.f50081a, dl1Var.f50081a) && this.f50082b == dl1Var.f50082b && this.f50083c == dl1Var.f50083c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50083c) + s571.m77245d(this.f50081a.hashCode() * 31, 31, this.f50082b);
    }
}
