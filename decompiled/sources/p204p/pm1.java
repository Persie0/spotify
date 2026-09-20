package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class pm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f178858a;

    public pm1(Set set) {
        this.f178858a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm1) && wj50.m88271j(this.f178858a, ((pm1) obj).f178858a);
    }

    public final int hashCode() {
        return this.f178858a.hashCode();
    }
}
