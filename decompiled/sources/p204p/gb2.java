package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gb2 implements hb2 {

    /* JADX INFO: renamed from: a */
    public final String f78172a;

    public gb2(String str) {
        this.f78172a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb2) && wj50.m88271j(this.f78172a, ((gb2) obj).f78172a);
    }

    public final int hashCode() {
        return this.f78172a.hashCode();
    }
}
