package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class r57 {

    /* JADX INFO: renamed from: a */
    public final String f195979a;

    /* JADX INFO: renamed from: b */
    public final Integer f195980b;

    /* JADX INFO: renamed from: c */
    public final String f195981c;

    /* JADX INFO: renamed from: d */
    public final String f195982d;

    public r57(String str, String str2, Integer num, String str3) {
        this.f195979a = str;
        this.f195980b = num;
        this.f195981c = str2;
        this.f195982d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m74806a() {
        return this.f195981c;
    }

    /* JADX INFO: renamed from: b */
    public final String m74807b() {
        return this.f195982d;
    }

    /* JADX INFO: renamed from: c */
    public final String m74808c() {
        return this.f195979a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m74809d() {
        return this.f195980b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r57)) {
            return false;
        }
        r57 r57Var = (r57) obj;
        return wj50.m88271j(this.f195979a, r57Var.f195979a) && wj50.m88271j(this.f195980b, r57Var.f195980b) && wj50.m88271j(this.f195981c, r57Var.f195981c) && wj50.m88271j(this.f195982d, r57Var.f195982d);
    }

    public final int hashCode() {
        String str = this.f195979a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f195980b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f195981c;
        return this.f195982d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ r57(Integer num, String str, String str2) {
        this(str, str2, num, UUID.randomUUID().toString());
    }
}
