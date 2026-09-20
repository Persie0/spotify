package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nak {

    /* JADX INFO: renamed from: a */
    public final sak f152082a;

    /* JADX INFO: renamed from: b */
    public final qak f152083b;

    public nak(qak qakVar, sak sakVar) {
        this.f152082a = sakVar;
        this.f152083b = qakVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak)) {
            return false;
        }
        nak nakVar = (nak) obj;
        return wj50.m88271j(this.f152082a, nakVar.f152082a) && wj50.m88271j(this.f152083b, nakVar.f152083b);
    }

    public final int hashCode() {
        sak sakVar = this.f152082a;
        return this.f152083b.f186893a.hashCode() + ((sakVar == null ? 0 : sakVar.hashCode()) * 31);
    }
}
