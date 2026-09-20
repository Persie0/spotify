package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vw1 extends AbstractC1861fi {

    /* JADX INFO: renamed from: b */
    public final String f245375b;

    public vw1(String str) {
        super(str);
        this.f245375b = str;
    }

    @Override // p204p.AbstractC1861fi
    /* JADX INFO: renamed from: b */
    public final String mo41686b() {
        return this.f245375b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw1) && wj50.m88271j(this.f245375b, ((vw1) obj).f245375b);
    }

    public final int hashCode() {
        return this.f245375b.hashCode();
    }
}
