package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class msf0 {

    /* JADX INFO: renamed from: a */
    public final String f146761a;

    /* JADX INFO: renamed from: b */
    public final String f146762b;

    /* JADX INFO: renamed from: c */
    public final boolean f146763c;

    /* JADX INFO: renamed from: d */
    public final Map f146764d;

    public msf0(String str, String str2, boolean z, Map map) {
        this.f146761a = str;
        this.f146762b = str2;
        this.f146763c = z;
        this.f146764d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msf0)) {
            return false;
        }
        msf0 msf0Var = (msf0) obj;
        return wj50.m88271j(this.f146761a, msf0Var.f146761a) && wj50.m88271j(this.f146762b, msf0Var.f146762b) && this.f146763c == msf0Var.f146763c && wj50.m88271j(this.f146764d, msf0Var.f146764d);
    }

    public final int hashCode() {
        return this.f146764d.hashCode() + s571.m77245d(s571.m77243b(this.f146761a.hashCode() * 31, 31, this.f146762b), 31, this.f146763c);
    }
}
