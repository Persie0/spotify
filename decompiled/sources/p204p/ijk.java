package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ijk implements jjk {

    /* JADX INFO: renamed from: a */
    public final String f102816a;

    public ijk(String str) {
        this.f102816a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijk) && wj50.m88271j(this.f102816a, ((ijk) obj).f102816a);
    }

    public final int hashCode() {
        return this.f102816a.hashCode();
    }
}
