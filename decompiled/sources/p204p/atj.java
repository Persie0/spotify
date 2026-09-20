package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class atj implements ctj {

    /* JADX INFO: renamed from: a */
    public final ysj f19698a;

    /* JADX INFO: renamed from: b */
    public final boolean f19699b;

    public atj(ysj ysjVar, boolean z) {
        this.f19698a = ysjVar;
        this.f19699b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atj)) {
            return false;
        }
        atj atjVar = (atj) obj;
        return wj50.m88271j(this.f19698a, atjVar.f19698a) && this.f19699b == atjVar.f19699b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19699b) + (this.f19698a.hashCode() * 31);
    }
}
