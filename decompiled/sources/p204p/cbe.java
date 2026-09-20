package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cbe {

    /* JADX INFO: renamed from: a */
    public final String f36099a;

    public cbe(String str) {
        this.f36099a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbe) && wj50.m88271j(this.f36099a, ((cbe) obj).f36099a);
    }

    public final int hashCode() {
        return this.f36099a.hashCode();
    }
}
