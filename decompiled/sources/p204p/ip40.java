package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ip40 implements jp40 {

    /* JADX INFO: renamed from: a */
    public final String f104380a;

    /* JADX INFO: renamed from: b */
    public final String f104381b;

    public ip40(String str, String str2) {
        this.f104380a = str;
        this.f104381b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip40)) {
            return false;
        }
        ip40 ip40Var = (ip40) obj;
        return wj50.m88271j(this.f104380a, ip40Var.f104380a) && wj50.m88271j(this.f104381b, ip40Var.f104381b);
    }

    public final int hashCode() {
        return this.f104381b.hashCode() + (this.f104380a.hashCode() * 31);
    }
}
