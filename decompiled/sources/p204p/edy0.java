package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class edy0 implements gdy0 {

    /* JADX INFO: renamed from: a */
    public final Exception f58627a;

    public edy0(Exception exc) {
        this.f58627a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edy0) && wj50.m88271j(this.f58627a, ((edy0) obj).f58627a);
    }

    public final int hashCode() {
        return this.f58627a.hashCode();
    }
}
