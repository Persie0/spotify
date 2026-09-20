package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class dnk implements gnk {

    /* JADX INFO: renamed from: a */
    public final int f50848a;

    public dnk(int i) {
        this.f50848a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gnk gnkVar = (gnk) obj;
        if ((gnkVar instanceof cnk) || (gnkVar instanceof enk)) {
            return -1;
        }
        if (gnkVar instanceof dnk) {
            return -wj50.m88282u(this.f50848a, ((dnk) gnkVar).f50848a);
        }
        if (gnkVar instanceof fnk) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnk) && this.f50848a == ((dnk) obj).f50848a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50848a);
    }
}
