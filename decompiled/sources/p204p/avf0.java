package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class avf0 {

    /* JADX INFO: renamed from: a */
    public final String f20181a;

    /* JADX INFO: renamed from: b */
    public final String f20182b;

    public avf0(String str, String str2) {
        this.f20181a = str;
        this.f20182b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avf0)) {
            return false;
        }
        avf0 avf0Var = (avf0) obj;
        return wj50.m88271j(this.f20181a, avf0Var.f20181a) && wj50.m88271j(this.f20182b, avf0Var.f20182b);
    }

    public final int hashCode() {
        return this.f20182b.hashCode() + (this.f20181a.hashCode() * 31);
    }
}
