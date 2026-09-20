package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c48 extends hhg1 {

    /* JADX INFO: renamed from: d */
    public final boolean f33863d;

    public c48(boolean z) {
        this.f33863d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c48) && this.f33863d == ((c48) obj).f33863d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33863d);
    }
}
