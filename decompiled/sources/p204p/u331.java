package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u331 {

    /* JADX INFO: renamed from: a */
    public final Boolean f226265a;

    public /* synthetic */ u331() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u331) && wj50.m88271j(this.f226265a, ((u331) obj).f226265a);
    }

    public final int hashCode() {
        Boolean bool = this.f226265a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public u331(Boolean bool) {
        this.f226265a = bool;
    }
}
