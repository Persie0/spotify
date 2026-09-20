package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yh7 {

    /* JADX INFO: renamed from: a */
    public final String f272751a;

    public yh7(String str) {
        this.f272751a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh7) && this.f272751a.equals(((yh7) obj).f272751a);
    }

    public final int hashCode() {
        return this.f272751a.hashCode() - 623937421;
    }
}
