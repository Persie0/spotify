package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class cnk implements gnk {

    /* JADX INFO: renamed from: a */
    public final int f40035a;

    public cnk(int i) {
        this.f40035a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gnk gnkVar = (gnk) obj;
        if (gnkVar instanceof cnk) {
            return -wj50.m88282u(this.f40035a, ((cnk) gnkVar).f40035a);
        }
        if ((gnkVar instanceof enk) || (gnkVar instanceof dnk) || (gnkVar instanceof fnk)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnk) && this.f40035a == ((cnk) obj).f40035a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40035a);
    }
}
