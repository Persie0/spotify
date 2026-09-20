package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class bn1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f28673a;

    public bn1(Set set) {
        this.f28673a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn1) && wj50.m88271j(this.f28673a, ((bn1) obj).f28673a);
    }

    public final int hashCode() {
        return this.f28673a.hashCode();
    }
}
