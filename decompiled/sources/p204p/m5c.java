package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m5c {

    /* JADX INFO: renamed from: a */
    public final String f140182a;

    /* JADX INFO: renamed from: b */
    public final String f140183b;

    public m5c(String str, String str2) {
        this.f140182a = str;
        this.f140183b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5c)) {
            return false;
        }
        m5c m5cVar = (m5c) obj;
        return wj50.m88271j(this.f140182a, m5cVar.f140182a) && wj50.m88271j(this.f140183b, m5cVar.f140183b);
    }

    public final int hashCode() {
        return this.f140183b.hashCode() + (this.f140182a.hashCode() * 31);
    }
}
