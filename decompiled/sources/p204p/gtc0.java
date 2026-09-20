package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gtc0 {

    /* JADX INFO: renamed from: a */
    public final String f84136a;

    /* JADX INFO: renamed from: b */
    public final String f84137b;

    public gtc0(String str, String str2) {
        this.f84136a = str;
        this.f84137b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtc0)) {
            return false;
        }
        gtc0 gtc0Var = (gtc0) obj;
        return wj50.m88271j(this.f84136a, gtc0Var.f84136a) && wj50.m88271j(this.f84137b, gtc0Var.f84137b);
    }

    public final int hashCode() {
        return this.f84137b.hashCode() + ((((nk2.GENPODS_PROMPT_CHAT.hashCode() + (this.f84136a.hashCode() * 31)) * 31) + 937185458) * 31);
    }
}
