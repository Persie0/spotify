package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class fnk implements gnk {

    /* JADX INFO: renamed from: a */
    public final int f71314a;

    public fnk(int i) {
        this.f71314a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gnk gnkVar = (gnk) obj;
        if ((gnkVar instanceof cnk) || (gnkVar instanceof enk) || (gnkVar instanceof dnk)) {
            return -1;
        }
        if (!(gnkVar instanceof fnk)) {
            throw new NoWhenBranchMatchedException();
        }
        return -wj50.m88282u(this.f71314a, ((fnk) gnkVar).f71314a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnk) && this.f71314a == ((fnk) obj).f71314a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71314a);
    }
}
