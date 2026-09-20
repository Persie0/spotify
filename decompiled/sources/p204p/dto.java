package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dto implements eto {

    /* JADX INFO: renamed from: a */
    public final String f52877a;

    /* JADX INFO: renamed from: b */
    public final String f52878b;

    public dto(String str, String str2) {
        this.f52877a = str;
        this.f52878b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dto)) {
            return false;
        }
        dto dtoVar = (dto) obj;
        return wj50.m88271j(this.f52877a, dtoVar.f52877a) && wj50.m88271j(this.f52878b, dtoVar.f52878b);
    }

    public final int hashCode() {
        return this.f52878b.hashCode() + (this.f52877a.hashCode() * 31);
    }
}
