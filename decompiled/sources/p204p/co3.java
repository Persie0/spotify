package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class co3 {

    /* JADX INFO: renamed from: a */
    public final String f40159a;

    /* JADX INFO: renamed from: b */
    public final String f40160b;

    public co3(String str, String str2) {
        this.f40159a = str;
        this.f40160b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co3)) {
            return false;
        }
        co3 co3Var = (co3) obj;
        return wj50.m88271j(this.f40159a, co3Var.f40159a) && wj50.m88271j(this.f40160b, co3Var.f40160b);
    }

    public final int hashCode() {
        return this.f40160b.hashCode() + (this.f40159a.hashCode() * 31);
    }
}
