package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ohb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f165385a;

    /* JADX INFO: renamed from: b */
    public final String f165386b;

    public ohb(boolean z, String str) {
        this.f165385a = z;
        this.f165386b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohb)) {
            return false;
        }
        ohb ohbVar = (ohb) obj;
        return this.f165385a == ohbVar.f165385a && wj50.m88271j(this.f165386b, ohbVar.f165386b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f165385a) * 31;
        String str = this.f165386b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
