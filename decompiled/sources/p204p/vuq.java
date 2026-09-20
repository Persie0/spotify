package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vuq implements xuq {

    /* JADX INFO: renamed from: a */
    public final String f245061a;

    public vuq(String str) {
        this.f245061a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuq) && wj50.m88271j(this.f245061a, ((vuq) obj).f245061a);
    }

    public final int hashCode() {
        return this.f245061a.hashCode();
    }
}
