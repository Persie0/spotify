package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cat {

    /* JADX INFO: renamed from: a */
    public final String f35927a;

    /* JADX INFO: renamed from: b */
    public final String f35928b;

    public cat(String str, String str2) {
        this.f35927a = str;
        this.f35928b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cat)) {
            return false;
        }
        cat catVar = (cat) obj;
        return wj50.m88271j(this.f35927a, catVar.f35927a) && wj50.m88271j(this.f35928b, catVar.f35928b);
    }

    public final int hashCode() {
        return this.f35928b.hashCode() + (this.f35927a.hashCode() * 31);
    }
}
