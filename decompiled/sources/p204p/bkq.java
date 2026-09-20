package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bkq {

    /* JADX INFO: renamed from: a */
    public final akq f28003a;

    /* JADX INFO: renamed from: b */
    public final List f28004b;

    public bkq(akq akqVar, List list) {
        this.f28003a = akqVar;
        this.f28004b = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m29720a() {
        return this.f28004b;
    }

    /* JADX INFO: renamed from: b */
    public final akq m29721b() {
        return this.f28003a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkq)) {
            return false;
        }
        bkq bkqVar = (bkq) obj;
        return wj50.m88271j(this.f28003a, bkqVar.f28003a) && wj50.m88271j(this.f28004b, bkqVar.f28004b);
    }

    public final int hashCode() {
        return this.f28004b.hashCode() + (this.f28003a.hashCode() * 31);
    }
}
