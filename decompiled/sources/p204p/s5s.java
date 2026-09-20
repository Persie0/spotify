package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s5s implements v5s {

    /* JADX INFO: renamed from: a */
    public final Set f205899a;

    public s5s(Set set) {
        this.f205899a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5s) && wj50.m88271j(this.f205899a, ((s5s) obj).f205899a);
    }

    public final int hashCode() {
        return this.f205899a.hashCode();
    }
}
