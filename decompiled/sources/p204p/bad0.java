package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bad0 implements cad0 {

    /* JADX INFO: renamed from: a */
    public final String f25176a;

    public bad0(String str) {
        this.f25176a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bad0) && wj50.m88271j(this.f25176a, ((bad0) obj).f25176a);
    }

    public final int hashCode() {
        return this.f25176a.hashCode();
    }
}
