package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final y7z0 f88712a;

    public h8i(y7z0 y7z0Var) {
        this.f88712a = y7z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8i) && wj50.m88271j(this.f88712a, ((h8i) obj).f88712a);
    }

    public final int hashCode() {
        return this.f88712a.hashCode();
    }
}
