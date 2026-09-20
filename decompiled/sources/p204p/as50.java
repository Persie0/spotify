package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class as50 {

    /* JADX INFO: renamed from: a */
    public final int f19305a;

    /* JADX INFO: renamed from: b */
    public final ahc f19306b;

    /* JADX INFO: renamed from: c */
    public final List f19307c;

    /* JADX INFO: renamed from: d */
    public final Integer f19308d;

    /* JADX INFO: renamed from: e */
    public final g7o0 f19309e;

    public as50(int i, ahc ahcVar, ArrayList arrayList, Integer num, g7o0 g7o0Var) {
        this.f19305a = i;
        this.f19306b = ahcVar;
        this.f19307c = arrayList;
        this.f19308d = num;
        this.f19309e = g7o0Var;
    }

    /* JADX INFO: renamed from: a */
    public final uv50 m27062a(int i) {
        g7o0 g7o0Var;
        if (i == 0) {
            return this.f19306b;
        }
        int i2 = i - 1;
        List list = this.f19307c;
        if (i2 < list.size()) {
            return (uv50) list.get(i2);
        }
        if (i2 != 0 || (g7o0Var = this.f19309e) == null) {
            throw new IndexOutOfBoundsException();
        }
        return g7o0Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m27063b() {
        int size;
        List list = this.f19307c;
        if (list.isEmpty()) {
            size = this.f19309e != null ? 1 : 0;
        } else {
            Integer num = this.f19308d;
            size = (num == null || list.size() <= num.intValue()) ? list.size() : num.intValue();
        }
        return 1 + size;
    }
}
