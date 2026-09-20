package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ryw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f203974a;

    public ryw(String str) {
        this.f203974a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryw) && wj50.m88271j(this.f203974a, ((ryw) obj).f203974a);
    }

    public final int hashCode() {
        return this.f203974a.hashCode();
    }
}
