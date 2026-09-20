package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zel implements ffl {

    /* JADX INFO: renamed from: a */
    public final CharSequence f282049a;

    public zel(CharSequence charSequence) {
        this.f282049a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zel) && wj50.m88271j(this.f282049a, ((zel) obj).f282049a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f282049a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }
}
