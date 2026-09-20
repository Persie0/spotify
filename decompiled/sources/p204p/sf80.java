package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sf80 implements uf80 {

    /* JADX INFO: renamed from: a */
    public final wf80 f208496a;

    public sf80(wf80 wf80Var) {
        this.f208496a = wf80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf80) && wj50.m88271j(this.f208496a, ((sf80) obj).f208496a);
    }

    public final int hashCode() {
        return this.f208496a.hashCode();
    }
}
