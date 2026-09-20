package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cv00 implements mv00 {

    /* JADX INFO: renamed from: a */
    public final String f42262a;

    public cv00(String str) {
        this.f42262a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv00) && wj50.m88271j(this.f42262a, ((cv00) obj).f42262a);
    }

    public final int hashCode() {
        String str = this.f42262a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
