package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class y590 implements z590 {

    /* JADX INFO: renamed from: a */
    public final Set f269378a;

    public y590(Set set) {
        this.f269378a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y590) && wj50.m88271j(this.f269378a, ((y590) obj).f269378a);
    }

    public final int hashCode() {
        return this.f269378a.hashCode();
    }
}
