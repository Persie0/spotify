package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class osf0 {

    /* JADX INFO: renamed from: a */
    public final msf0 f168810a;

    /* JADX INFO: renamed from: b */
    public final msf0 f168811b;

    /* JADX INFO: renamed from: c */
    public final String f168812c;

    /* JADX INFO: renamed from: d */
    public final Map f168813d;

    public osf0(msf0 msf0Var, msf0 msf0Var2, String str, Map map) {
        this.f168810a = msf0Var;
        this.f168811b = msf0Var2;
        this.f168812c = str;
        this.f168813d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osf0)) {
            return false;
        }
        osf0 osf0Var = (osf0) obj;
        return wj50.m88271j(this.f168810a, osf0Var.f168810a) && wj50.m88271j(this.f168811b, osf0Var.f168811b) && wj50.m88271j(this.f168812c, osf0Var.f168812c) && wj50.m88271j(this.f168813d, osf0Var.f168813d);
    }

    public final int hashCode() {
        return this.f168813d.hashCode() + s571.m77243b((this.f168811b.hashCode() + (this.f168810a.hashCode() * 31)) * 31, 31, this.f168812c);
    }
}
