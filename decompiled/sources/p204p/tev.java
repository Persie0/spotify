package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class tev {

    /* JADX INFO: renamed from: a */
    public final boolean f219794a;

    /* JADX INFO: renamed from: b */
    public final boolean f219795b;

    /* JADX INFO: renamed from: c */
    public final List f219796c;

    /* JADX INFO: renamed from: d */
    public final boolean f219797d;

    /* JADX INFO: renamed from: e */
    public final Set f219798e;

    public tev(boolean z, boolean z2, List list, boolean z3, Set set) {
        this.f219794a = z;
        this.f219795b = z2;
        this.f219796c = list;
        this.f219797d = z3;
        this.f219798e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tev)) {
            return false;
        }
        tev tevVar = (tev) obj;
        return this.f219794a == tevVar.f219794a && this.f219795b == tevVar.f219795b && wj50.m88271j(this.f219796c, tevVar.f219796c) && this.f219797d == tevVar.f219797d && wj50.m88271j(this.f219798e, tevVar.f219798e);
    }

    public final int hashCode() {
        return this.f219798e.hashCode() + s571.m77245d(s571.m77244c(s571.m77245d(Boolean.hashCode(this.f219794a) * 31, 31, this.f219795b), 31, this.f219796c), 31, this.f219797d);
    }
}
