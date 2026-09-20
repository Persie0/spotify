package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xl80 extends yl80 {

    /* JADX INFO: renamed from: a */
    public final String f263064a;

    /* JADX INFO: renamed from: b */
    public final sb71 f263065b;

    /* JADX INFO: renamed from: c */
    public final gm80 f263066c;

    public xl80(String str, sb71 sb71Var, gm80 gm80Var) {
        this.f263064a = str;
        this.f263065b = sb71Var;
        this.f263066c = gm80Var;
    }

    @Override // p204p.yl80
    /* JADX INFO: renamed from: a */
    public final gm80 mo88503a() {
        return this.f263066c;
    }

    @Override // p204p.yl80
    /* JADX INFO: renamed from: b */
    public final sb71 mo88504b() {
        return this.f263065b;
    }

    /* JADX INFO: renamed from: c */
    public final String m91391c() {
        return this.f263064a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl80)) {
            return false;
        }
        xl80 xl80Var = (xl80) obj;
        return wj50.m88271j(this.f263064a, xl80Var.f263064a) && wj50.m88271j(this.f263065b, xl80Var.f263065b) && wj50.m88271j(this.f263066c, xl80Var.f263066c);
    }

    public final int hashCode() {
        int iHashCode = this.f263064a.hashCode() * 31;
        sb71 sb71Var = this.f263065b;
        int iHashCode2 = (iHashCode + (sb71Var != null ? sb71Var.hashCode() : 0)) * 31;
        gm80 gm80Var = this.f263066c;
        return iHashCode2 + (gm80Var != null ? gm80Var.hashCode() : 0);
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("LinkAnnotation.Url(url="), this.f263064a, ')');
    }

    public /* synthetic */ xl80(String str, sb71 sb71Var, gm80 gm80Var, int i) {
        this(str, (i & 2) != 0 ? null : sb71Var, (i & 4) != 0 ? null : gm80Var);
    }
}
