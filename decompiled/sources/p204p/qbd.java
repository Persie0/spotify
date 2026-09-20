package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qbd implements sbd {

    /* JADX INFO: renamed from: a */
    public final String f187064a;

    /* JADX INFO: renamed from: b */
    public final String f187065b;

    /* JADX INFO: renamed from: c */
    public final String f187066c;

    /* JADX INFO: renamed from: d */
    public final pbd f187067d;

    /* JADX INFO: renamed from: e */
    public final akk f187068e;

    public qbd(String str, String str2, String str3, pbd pbdVar, akk akkVar) {
        this.f187064a = str;
        this.f187065b = str2;
        this.f187066c = str3;
        this.f187067d = pbdVar;
        this.f187068e = akkVar;
    }

    @Override // p204p.sbd
    /* JADX INFO: renamed from: a */
    public final String mo72492a() {
        return this.f187065b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbd)) {
            return false;
        }
        qbd qbdVar = (qbd) obj;
        return wj50.m88271j(this.f187064a, qbdVar.f187064a) && wj50.m88271j(this.f187065b, qbdVar.f187065b) && wj50.m88271j(this.f187066c, qbdVar.f187066c) && wj50.m88271j(this.f187067d, qbdVar.f187067d) && wj50.m88271j(this.f187068e, qbdVar.f187068e);
    }

    public final int hashCode() {
        return this.f187068e.hashCode() + ((this.f187067d.hashCode() + s571.m77243b(s571.m77243b(this.f187064a.hashCode() * 31, 31, this.f187065b), 31, this.f187066c)) * 31);
    }
}
