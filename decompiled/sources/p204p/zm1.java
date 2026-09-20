package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f284117a;

    public zm1(String str) {
        this.f284117a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm1) && wj50.m88271j(this.f284117a, ((zm1) obj).f284117a);
    }

    public final int hashCode() {
        return this.f284117a.hashCode();
    }
}
