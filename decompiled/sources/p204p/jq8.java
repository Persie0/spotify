package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jq8 extends kq8 {

    /* JADX INFO: renamed from: a */
    public final qsj f114844a;

    public jq8(qsj qsjVar) {
        this.f114844a = qsjVar;
    }

    @Override // p204p.kq8
    /* JADX INFO: renamed from: a */
    public final int mo42399a() {
        return 32;
    }

    /* JADX INFO: renamed from: b */
    public final qsj m54082b() {
        return this.f114844a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq8) && this.f114844a == ((jq8) obj).f114844a;
    }

    public final int hashCode() {
        return this.f114844a.hashCode();
    }
}
