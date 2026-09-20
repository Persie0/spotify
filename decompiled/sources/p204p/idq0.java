package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class idq0 implements odq0 {

    /* JADX INFO: renamed from: a */
    public final Set f101203a;

    public idq0(Set set) {
        this.f101203a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idq0) && wj50.m88271j(this.f101203a, ((idq0) obj).f101203a);
    }

    public final int hashCode() {
        return this.f101203a.hashCode();
    }
}
