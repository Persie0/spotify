package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qdl0 implements rdl0 {

    /* JADX INFO: renamed from: a */
    public final String f187708a;

    /* JADX INFO: renamed from: b */
    public final String f187709b;

    /* JADX INFO: renamed from: c */
    public final String f187710c;

    public qdl0(String str, String str2, String str3) {
        this.f187708a = str;
        this.f187709b = str2;
        this.f187710c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdl0)) {
            return false;
        }
        qdl0 qdl0Var = (qdl0) obj;
        return wj50.m88271j(this.f187708a, qdl0Var.f187708a) && wj50.m88271j(this.f187709b, qdl0Var.f187709b) && wj50.m88271j(this.f187710c, qdl0Var.f187710c);
    }

    public final int hashCode() {
        return this.f187710c.hashCode() + s571.m77243b(this.f187708a.hashCode() * 31, 31, this.f187709b);
    }
}
