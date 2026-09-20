package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yuq {

    /* JADX INFO: renamed from: a */
    public final String f276436a;

    /* JADX INFO: renamed from: b */
    public final sm50 f276437b;

    /* JADX INFO: renamed from: c */
    public final String f276438c;

    /* JADX INFO: renamed from: d */
    public final boolean f276439d;

    public yuq(String str, sm50 sm50Var, String str2, boolean z) {
        this.f276436a = str;
        this.f276437b = sm50Var;
        this.f276438c = str2;
        this.f276439d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuq)) {
            return false;
        }
        yuq yuqVar = (yuq) obj;
        return wj50.m88271j(this.f276436a, yuqVar.f276436a) && wj50.m88271j(this.f276437b, yuqVar.f276437b) && wj50.m88271j(this.f276438c, yuqVar.f276438c) && this.f276439d == yuqVar.f276439d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276439d) + s571.m77243b(s571.m77244c(this.f276436a.hashCode() * 31, 31, this.f276437b.f210567a), 31, this.f276438c);
    }
}
