package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mjl implements njl {

    /* JADX INFO: renamed from: a */
    public final String f144286a;

    /* JADX INFO: renamed from: b */
    public final int f144287b;

    public mjl(String str, int i) {
        this.f144286a = str;
        this.f144287b = i;
    }

    @Override // p204p.njl
    /* JADX INFO: renamed from: a */
    public final int mo59170a() {
        return this.f144287b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjl)) {
            return false;
        }
        mjl mjlVar = (mjl) obj;
        return wj50.m88271j(this.f144286a, mjlVar.f144286a) && this.f144287b == mjlVar.f144287b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f144287b) + (this.f144286a.hashCode() * 31);
    }
}
