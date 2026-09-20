package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aad0 implements cad0 {

    /* JADX INFO: renamed from: a */
    public final String f13822a;

    public aad0(String str) {
        this.f13822a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aad0) && wj50.m88271j(this.f13822a, ((aad0) obj).f13822a);
    }

    public final int hashCode() {
        return this.f13822a.hashCode();
    }
}
