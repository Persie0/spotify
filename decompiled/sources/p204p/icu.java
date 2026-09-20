package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class icu implements guj {

    /* JADX INFO: renamed from: a */
    public final String f100886a;

    /* JADX INFO: renamed from: b */
    public final String f100887b;

    /* JADX INFO: renamed from: c */
    public final String f100888c;

    /* JADX INFO: renamed from: d */
    public final String f100889d;

    public icu(String str, String str2, String str3, String str4) {
        this.f100886a = str;
        this.f100887b = str2;
        this.f100888c = str3;
        this.f100889d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icu)) {
            return false;
        }
        icu icuVar = (icu) obj;
        return wj50.m88271j(this.f100886a, icuVar.f100886a) && wj50.m88271j(this.f100887b, icuVar.f100887b) && wj50.m88271j(this.f100888c, icuVar.f100888c) && wj50.m88271j(this.f100889d, icuVar.f100889d);
    }

    public final int hashCode() {
        int iHashCode = this.f100886a.hashCode() * 31;
        String str = this.f100887b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f100888c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f100889d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
