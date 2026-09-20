package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class d0g0 implements f0g0 {

    /* JADX INFO: renamed from: a */
    public final List f43894a;

    public d0g0(List list) {
        this.f43894a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0g0) && wj50.m88271j(this.f43894a, ((d0g0) obj).f43894a);
    }

    public final int hashCode() {
        return this.f43894a.hashCode();
    }
}
