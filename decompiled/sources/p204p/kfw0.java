package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kfw0 implements lfw0 {

    /* JADX INFO: renamed from: a */
    public final Set f122235a;

    public kfw0(Set set) {
        this.f122235a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfw0) && wj50.m88271j(this.f122235a, ((kfw0) obj).f122235a);
    }

    public final int hashCode() {
        return this.f122235a.hashCode();
    }
}
