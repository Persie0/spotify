package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bpb {

    /* JADX INFO: renamed from: a */
    public final uku f29391a;

    /* JADX INFO: renamed from: b */
    public final uku f29392b;

    /* JADX INFO: renamed from: c */
    public final String f29393c;

    /* JADX INFO: renamed from: d */
    public final wwu f29394d;

    /* JADX INFO: renamed from: e */
    public final String f29395e;

    /* JADX INFO: renamed from: f */
    public final boolean f29396f;

    public bpb(uku ukuVar, uku ukuVar2, String str, wwu wwuVar, String str2, boolean z) {
        this.f29391a = ukuVar;
        this.f29392b = ukuVar2;
        this.f29393c = str;
        this.f29394d = wwuVar;
        this.f29395e = str2;
        this.f29396f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpb)) {
            return false;
        }
        bpb bpbVar = (bpb) obj;
        return wj50.m88271j(this.f29391a, bpbVar.f29391a) && wj50.m88271j(this.f29392b, bpbVar.f29392b) && wj50.m88271j(this.f29393c, bpbVar.f29393c) && wj50.m88271j(this.f29394d, bpbVar.f29394d) && wj50.m88271j(this.f29395e, bpbVar.f29395e) && this.f29396f == bpbVar.f29396f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29396f) + s571.m77243b((this.f29394d.hashCode() + s571.m77243b((this.f29392b.hashCode() + (this.f29391a.hashCode() * 31)) * 31, 31, this.f29393c)) * 31, 31, this.f29395e);
    }
}
