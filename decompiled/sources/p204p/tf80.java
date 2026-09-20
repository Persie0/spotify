package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tf80 implements uf80 {

    /* JADX INFO: renamed from: a */
    public final wf80 f219880a;

    public tf80(wf80 wf80Var) {
        this.f219880a = wf80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tf80) && wj50.m88271j(this.f219880a, ((tf80) obj).f219880a);
    }

    public final int hashCode() {
        return this.f219880a.hashCode();
    }
}
