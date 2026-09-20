package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class bbv implements moc1 {

    /* JADX INFO: renamed from: a */
    public final int f25662a;

    /* JADX INFO: renamed from: b */
    public final Date f25663b;

    /* JADX INFO: renamed from: c */
    public final Date f25664c;

    public bbv(int i, Date date, Date date2) {
        this.f25662a = i;
        this.f25663b = date;
        this.f25664c = date2;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbv)) {
            return false;
        }
        bbv bbvVar = (bbv) obj;
        return this.f25662a == bbvVar.f25662a && wj50.m88271j(this.f25663b, bbvVar.f25663b) && wj50.m88271j(this.f25664c, bbvVar.f25664c);
    }

    public final int hashCode() {
        return this.f25664c.hashCode() + ((this.f25663b.hashCode() + (Integer.hashCode(this.f25662a) * 31)) * 31);
    }
}
