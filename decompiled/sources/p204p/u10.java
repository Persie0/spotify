package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u10 {

    /* JADX INFO: renamed from: a */
    public final int f225633a;

    public /* synthetic */ u10(int i) {
        this.f225633a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u10) {
            return this.f225633a == ((u10) obj).f225633a;
        }
        return false;
    }

    public final int hashCode() {
        return edb.m38547C(this.f225633a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContextMenuButtonFeature(entityType=");
        int i = this.f225633a;
        if (i == 1) {
            str = "ALBUM";
        } else if (i == 2) {
            str = "AUDIOBOOK";
        } else if (i == 3) {
            str = "PLAYLIST";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EPISODE";
        } else {
            str = "TRACK";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
