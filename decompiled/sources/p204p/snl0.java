package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class snl0 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final int f210958a;

    /* JADX INFO: renamed from: b */
    public final int f210959b;

    /* JADX INFO: renamed from: c */
    public final Date f210960c;

    /* JADX INFO: renamed from: d */
    public final Date f210961d;

    public snl0(int i, int i2, Date date, Date date2) {
        this.f210958a = i;
        this.f210959b = i2;
        this.f210960c = date;
        this.f210961d = date2;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snl0)) {
            return false;
        }
        snl0 snl0Var = (snl0) obj;
        return this.f210958a == snl0Var.f210958a && this.f210959b == snl0Var.f210959b && wj50.m88271j(this.f210960c, snl0Var.f210960c) && wj50.m88271j(this.f210961d, snl0Var.f210961d);
    }

    public final int hashCode() {
        return this.f210961d.hashCode() + ((this.f210960c.hashCode() + mt60.m62800g(this.f210959b, Integer.hashCode(this.f210958a) * 31, 31)) * 31);
    }
}
