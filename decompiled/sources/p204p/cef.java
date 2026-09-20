package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cef extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f37116b;

    /* JADX INFO: renamed from: c */
    public final String f37117c;

    /* JADX INFO: renamed from: d */
    public final String f37118d;

    public cef(String str, String str2, String str3) {
        super("COMM");
        this.f37116b = str;
        this.f37117c = str2;
        this.f37118d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cef.class == obj.getClass()) {
            cef cefVar = (cef) obj;
            if (Objects.equals(this.f37117c, cefVar.f37117c) && Objects.equals(this.f37116b, cefVar.f37116b) && Objects.equals(this.f37118d, cefVar.f37118d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f37116b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f37117c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37118d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": language=" + this.f37116b + ", description=" + this.f37117c + ", text=" + this.f37118d;
    }
}
