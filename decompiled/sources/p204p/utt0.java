package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class utt0 {

    /* JADX INFO: renamed from: a */
    public final ptt0 f233993a;

    public utt0(ptt0 ptt0Var) {
        this.f233993a = ptt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utt0) && wj50.m88271j(this.f233993a, ((utt0) obj).f233993a);
    }

    public final int hashCode() {
        ptt0 ptt0Var = this.f233993a;
        if (ptt0Var == null) {
            return 0;
        }
        return ptt0Var.hashCode();
    }
}
