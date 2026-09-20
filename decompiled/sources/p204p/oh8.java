package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class oh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final Set f165366a;

    public oh8(Set set) {
        this.f165366a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh8) && wj50.m88271j(this.f165366a, ((oh8) obj).f165366a);
    }

    public final int hashCode() {
        return this.f165366a.hashCode();
    }
}
