package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class anv {

    /* JADX INFO: renamed from: a */
    public final CharSequence f17506a;

    /* JADX INFO: renamed from: b */
    public final dnv f17507b;

    /* JADX INFO: renamed from: c */
    public final boolean f17508c;

    public anv(CharSequence charSequence, dnv dnvVar, bnv bnvVar, bnv bnvVar2, boolean z) {
        this.f17506a = charSequence;
        this.f17507b = dnvVar;
        this.f17508c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anv)) {
            return false;
        }
        anv anvVar = (anv) obj;
        return wj50.m88271j(this.f17506a, anvVar.f17506a) && this.f17507b.equals(anvVar.f17507b) && wj50.m88271j(null, null) && wj50.m88271j(null, null) && this.f17508c == anvVar.f17508c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17508c) + ((env.f61233a.hashCode() + ((this.f17507b.hashCode() + (this.f17506a.hashCode() * 31)) * 31)) * 29791);
    }
}
