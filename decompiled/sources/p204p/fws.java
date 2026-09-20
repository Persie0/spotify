package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fws implements jws {

    /* JADX INFO: renamed from: a */
    public final List f74157a;

    /* JADX INFO: renamed from: b */
    public final bws f74158b;

    public fws(List list, bws bwsVar) {
        this.f74157a = list;
        this.f74158b = bwsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fws)) {
            return false;
        }
        fws fwsVar = (fws) obj;
        return wj50.m88271j(this.f74157a, fwsVar.f74157a) && this.f74158b.equals(fwsVar.f74158b);
    }

    public final int hashCode() {
        return this.f74158b.hashCode() + (this.f74157a.hashCode() * 31);
    }
}
