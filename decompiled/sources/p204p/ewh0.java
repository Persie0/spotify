package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ewh0 {

    /* JADX INFO: renamed from: a */
    public final boolean f63552a;

    /* JADX INFO: renamed from: b */
    public final List f63553b;

    /* JADX INFO: renamed from: c */
    public final List f63554c;

    public ewh0(List list, List list2, boolean z) {
        this.f63552a = z;
        this.f63553b = list;
        this.f63554c = list2;
    }

    /* JADX INFO: renamed from: a */
    public static ewh0 m40143a(ewh0 ewh0Var, boolean z, List list, int i) {
        if ((i & 2) != 0) {
            list = ewh0Var.f63553b;
        }
        List list2 = ewh0Var.f63554c;
        ewh0Var.getClass();
        return new ewh0(list, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewh0)) {
            return false;
        }
        ewh0 ewh0Var = (ewh0) obj;
        return this.f63552a == ewh0Var.f63552a && wj50.m88271j(this.f63553b, ewh0Var.f63553b) && wj50.m88271j(this.f63554c, ewh0Var.f63554c);
    }

    public final int hashCode() {
        return this.f63554c.hashCode() + s571.m77244c(Boolean.hashCode(this.f63552a) * 31, 31, this.f63553b);
    }
}
