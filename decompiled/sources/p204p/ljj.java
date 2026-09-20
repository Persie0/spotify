package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ljj implements kkj {

    /* JADX INFO: renamed from: a */
    public final String f134093a;

    /* JADX INFO: renamed from: b */
    public final String f134094b;

    public ljj(String str, String str2) {
        this.f134093a = str;
        this.f134094b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljj)) {
            return false;
        }
        ljj ljjVar = (ljj) obj;
        return wj50.m88271j(this.f134093a, ljjVar.f134093a) && wj50.m88271j(this.f134094b, ljjVar.f134094b);
    }

    public final int hashCode() {
        return this.f134094b.hashCode() + (this.f134093a.hashCode() * 31);
    }
}
