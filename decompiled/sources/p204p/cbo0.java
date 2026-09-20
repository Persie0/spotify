package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cbo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f36170a;

    public cbo0(String str) {
        this.f36170a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbo0) && wj50.m88271j(this.f36170a, ((cbo0) obj).f36170a);
    }

    public final int hashCode() {
        return this.f36170a.hashCode();
    }
}
