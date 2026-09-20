package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vad1 {

    /* JADX INFO: renamed from: a */
    public final ved1 f239255a;

    public vad1(ved1 ved1Var) {
        this.f239255a = ved1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vad1) && wj50.m88271j(this.f239255a, ((vad1) obj).f239255a);
    }

    public final int hashCode() {
        ved1 ved1Var = this.f239255a;
        if (ved1Var == null) {
            return 0;
        }
        return ved1Var.hashCode();
    }
}
