package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class llv0 {

    /* JADX INFO: renamed from: a */
    public final ifs f134715a;

    /* JADX INFO: renamed from: b */
    public final List f134716b;

    public llv0(ifs ifsVar, List list) {
        this.f134715a = ifsVar;
        this.f134716b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llv0)) {
            return false;
        }
        llv0 llv0Var = (llv0) obj;
        return wj50.m88271j(this.f134715a, llv0Var.f134715a) && wj50.m88271j(this.f134716b, llv0Var.f134716b);
    }

    public final int hashCode() {
        return this.f134716b.hashCode() + (this.f134715a.hashCode() * 31);
    }

    public /* synthetic */ llv0(ifs ifsVar) {
        this(ifsVar, lau.f131415a);
    }
}
