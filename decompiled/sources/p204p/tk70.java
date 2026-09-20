package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tk70 implements al70 {

    /* JADX INFO: renamed from: a */
    public final String f221093a;

    public tk70(String str) {
        this.f221093a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk70) && wj50.m88271j(this.f221093a, ((tk70) obj).f221093a);
    }

    public final int hashCode() {
        String str = this.f221093a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
