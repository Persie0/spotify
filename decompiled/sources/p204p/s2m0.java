package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s2m0 {

    /* JADX INFO: renamed from: a */
    public final String f205032a;

    public s2m0(String str) {
        this.f205032a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2m0) && wj50.m88271j(this.f205032a, ((s2m0) obj).f205032a);
    }

    public final int hashCode() {
        String str = this.f205032a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
