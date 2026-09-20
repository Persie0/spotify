package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class oiv {

    /* JADX INFO: renamed from: a */
    public final Set f165901a;

    public oiv(Set set) {
        this.f165901a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oiv) && wj50.m88271j(this.f165901a, ((oiv) obj).f165901a);
    }

    public final int hashCode() {
        return this.f165901a.hashCode();
    }
}
