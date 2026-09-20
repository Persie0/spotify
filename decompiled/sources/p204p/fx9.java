package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fx9 implements hx9 {

    /* JADX INFO: renamed from: a */
    public final String f74297a;

    public fx9(String str) {
        this.f74297a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx9) && wj50.m88271j(this.f74297a, ((fx9) obj).f74297a);
    }

    public final int hashCode() {
        String str = this.f74297a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
