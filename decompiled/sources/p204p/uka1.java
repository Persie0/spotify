package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class uka1 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f231270b;

    /* JADX INFO: renamed from: c */
    public final String f231271c;

    public uka1(String str, String str2, String str3) {
        super(str);
        this.f231270b = str2;
        this.f231271c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uka1.class == obj.getClass()) {
            uka1 uka1Var = (uka1) obj;
            if (this.f215378a.equals(uka1Var.f215378a) && Objects.equals(this.f231270b, uka1Var.f231270b) && Objects.equals(this.f231271c, uka1Var.f231271c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(527, 31, this.f215378a);
        String str = this.f231270b;
        int iHashCode = (iM77243b + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f231271c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": url=" + this.f231271c;
    }
}
