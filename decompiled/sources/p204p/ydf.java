package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ydf implements zdf {

    /* JADX INFO: renamed from: a */
    public final String f271745a;

    /* JADX INFO: renamed from: b */
    public final String f271746b;

    public ydf(String str, String str2) {
        this.f271745a = str;
        this.f271746b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydf)) {
            return false;
        }
        ydf ydfVar = (ydf) obj;
        return wj50.m88271j(this.f271745a, ydfVar.f271745a) && wj50.m88271j(this.f271746b, ydfVar.f271746b);
    }

    public final int hashCode() {
        return this.f271746b.hashCode() + (this.f271745a.hashCode() * 31);
    }
}
