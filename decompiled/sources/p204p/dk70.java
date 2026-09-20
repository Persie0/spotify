package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class dk70 {

    /* JADX INFO: renamed from: a */
    public final String f49901a;

    /* JADX INFO: renamed from: b */
    public final String f49902b;

    /* JADX INFO: renamed from: c */
    public final boolean f49903c;

    /* JADX INFO: renamed from: d */
    public final Map f49904d;

    /* JADX INFO: renamed from: e */
    public final boolean f49905e;

    public dk70(String str, String str2, boolean z, Map map, boolean z2) {
        this.f49901a = str;
        this.f49902b = str2;
        this.f49903c = z;
        this.f49904d = map;
        this.f49905e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk70)) {
            return false;
        }
        dk70 dk70Var = (dk70) obj;
        return wj50.m88271j(this.f49901a, dk70Var.f49901a) && wj50.m88271j(this.f49902b, dk70Var.f49902b) && this.f49903c == dk70Var.f49903c && wj50.m88271j(this.f49904d, dk70Var.f49904d) && this.f49905e == dk70Var.f49905e;
    }

    public final int hashCode() {
        int iHashCode = this.f49901a.hashCode() * 31;
        String str = this.f49902b;
        return Boolean.hashCode(this.f49905e) + edb.m38557f(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f49903c), 31, this.f49904d);
    }
}
