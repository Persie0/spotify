package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.qz */
/* JADX INFO: loaded from: classes10.dex */
public final class C2319qz implements a10 {

    /* JADX INFO: renamed from: a */
    public final List f194071a;

    public C2319qz(List list) {
        this.f194071a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2319qz) && wj50.m88271j(this.f194071a, ((C2319qz) obj).f194071a);
    }

    public final int hashCode() {
        return this.f194071a.hashCode();
    }
}
