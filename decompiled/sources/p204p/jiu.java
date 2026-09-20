package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jiu {

    /* JADX INFO: renamed from: a */
    public final ufu f112823a;

    /* JADX INFO: renamed from: b */
    public final m0v f112824b;

    /* JADX INFO: renamed from: c */
    public final tku f112825c;

    /* JADX INFO: renamed from: d */
    public final dku f112826d;

    public jiu(ufu ufuVar, m0v m0vVar, tku tkuVar, dku dkuVar) {
        this.f112823a = ufuVar;
        this.f112824b = m0vVar;
        this.f112825c = tkuVar;
        this.f112826d = dkuVar;
    }

    /* JADX INFO: renamed from: a */
    public static jiu m53470a(jiu jiuVar, ufu ufuVar, m0v m0vVar, int i) {
        if ((i & 1) != 0) {
            ufuVar = jiuVar.f112823a;
        }
        if ((i & 2) != 0) {
            m0vVar = jiuVar.f112824b;
        }
        tku tkuVar = jiuVar.f112825c;
        dku dkuVar = jiuVar.f112826d;
        jiuVar.getClass();
        return new jiu(ufuVar, m0vVar, tkuVar, dkuVar);
    }

    /* JADX INFO: renamed from: b */
    public final m0v m53471b() {
        return this.f112824b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiu)) {
            return false;
        }
        jiu jiuVar = (jiu) obj;
        return wj50.m88271j(this.f112823a, jiuVar.f112823a) && wj50.m88271j(this.f112824b, jiuVar.f112824b) && wj50.m88271j(this.f112825c, jiuVar.f112825c) && wj50.m88271j(this.f112826d, jiuVar.f112826d);
    }

    public final int hashCode() {
        return this.f112826d.hashCode() + ((this.f112825c.hashCode() + ((this.f112824b.hashCode() + (this.f112823a.hashCode() * 31)) * 31)) * 31);
    }
}
