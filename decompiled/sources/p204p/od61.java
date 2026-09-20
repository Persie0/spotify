package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class od61 implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f164111a;

    public od61(int i) {
        this.f164111a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od61) && this.f164111a == ((od61) obj).f164111a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164111a);
    }
}
