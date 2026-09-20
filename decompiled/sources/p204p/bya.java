package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bya extends vya {

    /* JADX INFO: renamed from: a */
    public final i85 f32117a;

    public bya(i85 i85Var) {
        this.f32117a = i85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bya) && wj50.m88271j(this.f32117a, ((bya) obj).f32117a);
    }

    public final int hashCode() {
        return this.f32117a.hashCode();
    }
}
