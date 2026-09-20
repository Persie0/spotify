package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ik50 {

    /* JADX INFO: renamed from: a */
    public final String f103023a;

    /* JADX INFO: renamed from: b */
    public final String f103024b;

    /* JADX INFO: renamed from: c */
    public final String f103025c;

    /* JADX INFO: renamed from: d */
    public final Map f103026d;

    public ik50(Map map, String str, String str2, String str3) {
        this.f103023a = str;
        this.f103024b = str2;
        this.f103025c = str3;
        this.f103026d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik50)) {
            return false;
        }
        ik50 ik50Var = (ik50) obj;
        return wj50.m88271j(this.f103023a, ik50Var.f103023a) && wj50.m88271j(this.f103024b, ik50Var.f103024b) && wj50.m88271j(this.f103025c, ik50Var.f103025c) && wj50.m88271j(this.f103026d, ik50Var.f103026d);
    }

    public final int hashCode() {
        return this.f103026d.hashCode() + s571.m77243b(s571.m77243b(this.f103023a.hashCode() * 31, 31, this.f103024b), 31, this.f103025c);
    }
}
