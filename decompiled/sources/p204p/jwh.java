package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jwh {

    /* JADX INFO: renamed from: a */
    public final String f116644a;

    /* JADX INFO: renamed from: b */
    public final String f116645b;

    public jwh(String str, String str2) {
        this.f116644a = str;
        this.f116645b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwh)) {
            return false;
        }
        jwh jwhVar = (jwh) obj;
        return wj50.m88271j(this.f116644a, jwhVar.f116644a) && wj50.m88271j(this.f116645b, jwhVar.f116645b);
    }

    public final int hashCode() {
        return this.f116645b.hashCode() + (this.f116644a.hashCode() * 31);
    }
}
