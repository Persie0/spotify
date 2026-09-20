package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jlv0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f113691a;

    /* JADX INFO: renamed from: b */
    public final HashMap f113692b;

    /* JADX INFO: renamed from: c */
    public final HashMap f113693c;

    public jlv0(HashMap map, HashMap map2, HashMap map3) {
        this.f113691a = map;
        this.f113692b = map2;
        this.f113693c = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlv0)) {
            return false;
        }
        jlv0 jlv0Var = (jlv0) obj;
        return this.f113691a.equals(jlv0Var.f113691a) && this.f113692b.equals(jlv0Var.f113692b) && this.f113693c.equals(jlv0Var.f113693c);
    }

    public final int hashCode() {
        return this.f113693c.hashCode() + ((this.f113692b.hashCode() + (this.f113691a.hashCode() * 31)) * 31);
    }
}
