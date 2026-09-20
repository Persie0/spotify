package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bms {

    /* JADX INFO: renamed from: a */
    public final tld0 f28611a;

    /* JADX INFO: renamed from: b */
    public final List f28612b;

    public bms(tld0 tld0Var, List list) {
        this.f28611a = tld0Var;
        this.f28612b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bms)) {
            return false;
        }
        bms bmsVar = (bms) obj;
        return wj50.m88271j(this.f28611a, bmsVar.f28611a) && wj50.m88271j(this.f28612b, bmsVar.f28612b);
    }

    public final int hashCode() {
        return this.f28612b.hashCode() + (this.f28611a.hashCode() * 31);
    }
}
