package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gt40 {

    /* JADX INFO: renamed from: a */
    public final String f84088a;

    public gt40(String str) {
        this.f84088a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt40) && this.f84088a.equals(((gt40) obj).f84088a);
    }

    public final int hashCode() {
        return this.f84088a.hashCode() + 457835084;
    }
}
