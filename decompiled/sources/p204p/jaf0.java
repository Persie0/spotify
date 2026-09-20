package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jaf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final zh20 f110456b;

    public jaf0(zh20 zh20Var) {
        super(false);
        this.f110456b = zh20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jaf0) && wj50.m88271j(this.f110456b, ((jaf0) obj).f110456b);
    }

    public final int hashCode() {
        return this.f110456b.hashCode();
    }
}
