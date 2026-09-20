package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bky {

    /* JADX INFO: renamed from: a */
    public final zjy f28038a;

    /* JADX INFO: renamed from: b */
    public final boolean f28039b;

    /* JADX INFO: renamed from: c */
    public final boolean f28040c;

    public bky(zjy zjyVar, boolean z, boolean z2) {
        this.f28038a = zjyVar;
        this.f28039b = z;
        this.f28040c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static bky m29726a(bky bkyVar, zjy zjyVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            zjyVar = bkyVar.f28038a;
        }
        if ((i & 2) != 0) {
            z = bkyVar.f28039b;
        }
        if ((i & 4) != 0) {
            z2 = bkyVar.f28040c;
        }
        bkyVar.getClass();
        return new bky(zjyVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bky)) {
            return false;
        }
        bky bkyVar = (bky) obj;
        return wj50.m88271j(this.f28038a, bkyVar.f28038a) && this.f28039b == bkyVar.f28039b && this.f28040c == bkyVar.f28040c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28040c) + s571.m77245d(this.f28038a.hashCode() * 31, 31, this.f28039b);
    }
}
