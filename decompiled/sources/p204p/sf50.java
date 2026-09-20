package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class sf50 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f208467b;

    /* JADX INFO: renamed from: c */
    public final String f208468c;

    /* JADX INFO: renamed from: d */
    public final String f208469d;

    public sf50(String str, String str2, String str3) {
        super("----");
        this.f208467b = str;
        this.f208468c = str2;
        this.f208469d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sf50.class == obj.getClass()) {
            sf50 sf50Var = (sf50) obj;
            if (Objects.equals(this.f208468c, sf50Var.f208468c) && Objects.equals(this.f208467b, sf50Var.f208467b) && Objects.equals(this.f208469d, sf50Var.f208469d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f208467b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f208468c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f208469d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": domain=" + this.f208467b + ", description=" + this.f208468c;
    }
}
