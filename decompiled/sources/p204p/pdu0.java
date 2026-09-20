package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pdu0 implements qdu0 {

    /* JADX INFO: renamed from: a */
    public final sdu0 f176549a;

    public pdu0(sdu0 sdu0Var) {
        this.f176549a = sdu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdu0) && wj50.m88271j(this.f176549a, ((pdu0) obj).f176549a);
    }

    public final int hashCode() {
        return this.f176549a.f208087a.hashCode();
    }
}
