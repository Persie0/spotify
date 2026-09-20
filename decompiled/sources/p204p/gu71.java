package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gu71 implements v3u {

    /* JADX INFO: renamed from: a */
    public final v5u f84401a;

    public gu71(v5u v5uVar) {
        this.f84401a = v5uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu71) && wj50.m88271j(this.f84401a, ((gu71) obj).f84401a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f84401a.f237647a);
    }
}
