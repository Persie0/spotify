package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pjy implements yjy {

    /* JADX INFO: renamed from: a */
    public final String f178324a;

    /* JADX INFO: renamed from: b */
    public final String f178325b;

    public pjy(String str, String str2) {
        this.f178324a = str;
        this.f178325b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjy)) {
            return false;
        }
        pjy pjyVar = (pjy) obj;
        return wj50.m88271j(this.f178324a, pjyVar.f178324a) && wj50.m88271j(this.f178325b, pjyVar.f178325b);
    }

    public final int hashCode() {
        return this.f178325b.hashCode() + (this.f178324a.hashCode() * 31);
    }
}
