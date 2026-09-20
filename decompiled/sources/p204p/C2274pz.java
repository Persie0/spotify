package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.pz */
/* JADX INFO: loaded from: classes10.dex */
public final class C2274pz implements a10 {

    /* JADX INFO: renamed from: a */
    public final List f183561a;

    public C2274pz(List list) {
        this.f183561a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2274pz) && wj50.m88271j(this.f183561a, ((C2274pz) obj).f183561a);
    }

    public final int hashCode() {
        return this.f183561a.hashCode();
    }
}
