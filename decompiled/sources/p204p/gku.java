package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gku {

    /* JADX INFO: renamed from: a */
    public final String f80913a;

    /* JADX INFO: renamed from: b */
    public final peu f80914b;

    public gku(String str, peu peuVar) {
        this.f80913a = str;
        this.f80914b = peuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gku)) {
            return false;
        }
        gku gkuVar = (gku) obj;
        return wj50.m88271j(this.f80913a, gkuVar.f80913a) && wj50.m88271j(this.f80914b, gkuVar.f80914b);
    }

    public final int hashCode() {
        return this.f80914b.hashCode() + (this.f80913a.hashCode() * 31);
    }
}
