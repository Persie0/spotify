package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kdl extends AbstractC1861fi {

    /* JADX INFO: renamed from: b */
    public final String f121692b;

    /* JADX INFO: renamed from: c */
    public final ka61 f121693c;

    public kdl(String str, ka61 ka61Var) {
        super(str);
        this.f121692b = str;
        this.f121693c = ka61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdl)) {
            return false;
        }
        kdl kdlVar = (kdl) obj;
        return wj50.m88271j(this.f121692b, kdlVar.f121692b) && wj50.m88271j(this.f121693c, kdlVar.f121693c);
    }

    public final int hashCode() {
        return this.f121693c.hashCode() + (this.f121692b.hashCode() * 31);
    }
}
