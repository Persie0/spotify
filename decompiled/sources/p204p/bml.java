package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bml implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f28569a;

    /* JADX INFO: renamed from: b */
    public final aml f28570b;

    /* JADX INFO: renamed from: c */
    public final String f28571c;

    /* JADX INFO: renamed from: d */
    public final String f28572d;

    /* JADX INFO: renamed from: e */
    public final yll f28573e;

    /* JADX INFO: renamed from: f */
    public final String f28574f;

    public bml(String str, aml amlVar, String str2, String str3, yll yllVar, String str4) {
        this.f28569a = str;
        this.f28570b = amlVar;
        this.f28571c = str2;
        this.f28572d = str3;
        this.f28573e = yllVar;
        this.f28574f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bml)) {
            return false;
        }
        bml bmlVar = (bml) obj;
        return wj50.m88271j(this.f28569a, bmlVar.f28569a) && wj50.m88271j(this.f28570b, bmlVar.f28570b) && wj50.m88271j(this.f28571c, bmlVar.f28571c) && wj50.m88271j(this.f28572d, bmlVar.f28572d) && wj50.m88271j(this.f28573e, bmlVar.f28573e) && wj50.m88271j(this.f28574f, bmlVar.f28574f);
    }

    public final int hashCode() {
        return this.f28574f.hashCode() + ((this.f28573e.hashCode() + s571.m77243b(s571.m77243b((this.f28570b.hashCode() + (this.f28569a.hashCode() * 31)) * 31, 31, this.f28571c), 31, this.f28572d)) * 31);
    }
}
