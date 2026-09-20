package p204p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class vv01 {

    /* JADX INFO: renamed from: a */
    public final Object f245107a;

    /* JADX INFO: renamed from: b */
    public final Object f245108b;

    /* JADX INFO: renamed from: c */
    public final Map f245109c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f245110d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f245111e;

    public vv01(List list, List list2, Map map, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f245107a = list;
        this.f245108b = list2;
        this.f245109c = map;
        this.f245110d = linkedHashMap;
        this.f245111e = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv01)) {
            return false;
        }
        vv01 vv01Var = (vv01) obj;
        return this.f245107a.equals(vv01Var.f245107a) && this.f245108b.equals(vv01Var.f245108b) && this.f245109c.equals(vv01Var.f245109c) && this.f245110d.equals(vv01Var.f245110d) && this.f245111e.equals(vv01Var.f245111e);
    }

    public final int hashCode() {
        return this.f245111e.hashCode() + ((this.f245110d.hashCode() + edb.m38557f(dq60.m36604d(this.f245107a.hashCode() * 31, 31, this.f245108b), 31, this.f245109c)) * 31);
    }
}
