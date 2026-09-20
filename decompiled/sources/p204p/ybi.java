package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ybi implements jci {

    /* JADX INFO: renamed from: a */
    public final String f271185a;

    public ybi(String str) {
        this.f271185a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybi) && wj50.m88271j(this.f271185a, ((ybi) obj).f271185a);
    }

    public final int hashCode() {
        return this.f271185a.hashCode();
    }
}
