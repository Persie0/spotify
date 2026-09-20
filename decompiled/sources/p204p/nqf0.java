package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nqf0 implements pqf0 {

    /* JADX INFO: renamed from: a */
    public final String f157270a;

    public nqf0(String str) {
        this.f157270a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqf0) && wj50.m88271j(this.f157270a, ((nqf0) obj).f157270a);
    }

    public final int hashCode() {
        return this.f157270a.hashCode();
    }
}
