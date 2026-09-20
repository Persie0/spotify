package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gmf0 implements imf0 {

    /* JADX INFO: renamed from: a */
    public final String f81393a;

    public gmf0(String str) {
        this.f81393a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmf0) && wj50.m88271j(this.f81393a, ((gmf0) obj).f81393a);
    }

    public final int hashCode() {
        return this.f81393a.hashCode();
    }
}
