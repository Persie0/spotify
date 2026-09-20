package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class enk implements gnk {

    /* JADX INFO: renamed from: a */
    public final int f61171a;

    public enk(int i) {
        this.f61171a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gnk gnkVar = (gnk) obj;
        if (gnkVar instanceof cnk) {
            return -1;
        }
        if (gnkVar instanceof enk) {
            return -wj50.m88282u(this.f61171a, ((enk) gnkVar).f61171a);
        }
        if ((gnkVar instanceof dnk) || (gnkVar instanceof fnk)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enk) && this.f61171a == ((enk) obj).f61171a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61171a);
    }
}
