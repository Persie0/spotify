package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f197020a;

    public r9d(String str) {
        this.f197020a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9d) && wj50.m88271j(this.f197020a, ((r9d) obj).f197020a);
    }

    public final int hashCode() {
        return this.f197020a.hashCode();
    }
}
