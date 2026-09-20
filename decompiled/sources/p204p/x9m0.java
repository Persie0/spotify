package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class x9m0 {

    /* JADX INFO: renamed from: a */
    public final String f259399a;

    /* JADX INFO: renamed from: b */
    public final String f259400b;

    /* JADX INFO: renamed from: c */
    public final Object f259401c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f259402d;

    /* JADX INFO: renamed from: e */
    public final String f259403e;

    /* JADX INFO: renamed from: f */
    public final String f259404f;

    /* JADX INFO: renamed from: g */
    public final String f259405g;

    public x9m0(String str, String str2, Map map, LinkedHashMap linkedHashMap, String str3, String str4, String str5) {
        this.f259399a = str;
        this.f259400b = str2;
        this.f259401c = map;
        this.f259402d = linkedHashMap;
        this.f259403e = str3;
        this.f259404f = str4;
        this.f259405g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9m0)) {
            return false;
        }
        x9m0 x9m0Var = (x9m0) obj;
        return wj50.m88271j(this.f259399a, x9m0Var.f259399a) && wj50.m88271j(this.f259400b, x9m0Var.f259400b) && this.f259401c.equals(x9m0Var.f259401c) && this.f259402d.equals(x9m0Var.f259402d) && wj50.m88271j(this.f259403e, x9m0Var.f259403e) && wj50.m88271j(this.f259404f, x9m0Var.f259404f) && this.f259405g.equals(x9m0Var.f259405g);
    }

    public final int hashCode() {
        return this.f259405g.hashCode() + s571.m77243b(s571.m77243b((this.f259402d.hashCode() + dq60.m36604d(s571.m77243b(this.f259399a.hashCode() * 31, 31, this.f259400b), 31, this.f259401c)) * 31, 31, this.f259403e), 31, this.f259404f);
    }
}
