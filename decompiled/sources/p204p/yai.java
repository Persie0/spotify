package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yai implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f270905a;

    /* JADX INFO: renamed from: b */
    public final String f270906b;

    public yai(String str, String str2) {
        this.f270905a = str;
        this.f270906b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yai)) {
            return false;
        }
        yai yaiVar = (yai) obj;
        return wj50.m88271j(this.f270905a, yaiVar.f270905a) && wj50.m88271j(this.f270906b, yaiVar.f270906b);
    }

    public final int hashCode() {
        return this.f270906b.hashCode() + (this.f270905a.hashCode() * 31);
    }
}
