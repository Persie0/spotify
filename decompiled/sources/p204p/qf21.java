package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qf21 {

    /* JADX INFO: renamed from: a */
    public final List f188104a;

    /* JADX INFO: renamed from: b */
    public final List f188105b;

    /* JADX INFO: renamed from: c */
    public final List f188106c;

    /* JADX INFO: renamed from: d */
    public final Map f188107d;

    public qf21(List list, List list2, List list3, Map map) {
        this.f188104a = list;
        this.f188105b = list2;
        this.f188106c = list3;
        this.f188107d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf21)) {
            return false;
        }
        qf21 qf21Var = (qf21) obj;
        return wj50.m88271j(this.f188104a, qf21Var.f188104a) && wj50.m88271j(this.f188105b, qf21Var.f188105b) && wj50.m88271j(this.f188106c, qf21Var.f188106c) && wj50.m88271j(this.f188107d, qf21Var.f188107d);
    }

    public final int hashCode() {
        return this.f188107d.hashCode() + s571.m77244c(s571.m77244c(this.f188104a.hashCode() * 31, 31, this.f188105b), 31, this.f188106c);
    }
}
