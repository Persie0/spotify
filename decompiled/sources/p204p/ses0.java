package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ses0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f208385a;

    public ses0(String str) {
        this.f208385a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ses0) && wj50.m88271j(this.f208385a, ((ses0) obj).f208385a);
    }

    public final int hashCode() {
        String str = this.f208385a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
