package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ie5 {

    /* JADX INFO: renamed from: a */
    public final int f101318a;

    public ie5(int i) {
        this.f101318a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie5) && this.f101318a == ((ie5) obj).f101318a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101318a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("AppWidgetId(appWidgetId="), this.f101318a, ')');
    }
}
