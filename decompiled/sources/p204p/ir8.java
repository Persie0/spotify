package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ir8 implements kr8 {

    /* JADX INFO: renamed from: a */
    public final Object f104926a;

    public ir8(List list) {
        this.f104926a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir8) && this.f104926a.equals(((ir8) obj).f104926a);
    }

    public final int hashCode() {
        return this.f104926a.hashCode();
    }
}
