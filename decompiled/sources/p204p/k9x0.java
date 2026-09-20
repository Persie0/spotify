package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k9x0 implements p9x0 {

    /* JADX INFO: renamed from: a */
    public final Set f120719a;

    public k9x0(Set set) {
        this.f120719a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9x0) && wj50.m88271j(this.f120719a, ((k9x0) obj).f120719a);
    }

    public final int hashCode() {
        return this.f120719a.hashCode();
    }
}
