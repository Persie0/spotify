package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class thb {

    /* JADX INFO: renamed from: a */
    public final int f220385a;

    /* JADX INFO: renamed from: b */
    public final String f220386b;

    /* JADX INFO: renamed from: c */
    public final String f220387c;

    /* JADX INFO: renamed from: d */
    public final String f220388d;

    /* JADX INFO: renamed from: e */
    public final String f220389e;

    /* JADX INFO: renamed from: f */
    public final String f220390f;

    /* JADX INFO: renamed from: g */
    public final String f220391g;

    /* JADX INFO: renamed from: h */
    public final String f220392h;

    /* JADX INFO: renamed from: i */
    public final boolean f220393i;

    /* JADX INFO: renamed from: j */
    public final f5u f220394j;

    /* JADX INFO: renamed from: k */
    public final String f220395k;

    public thb(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, f5u f5uVar, String str8) {
        this.f220385a = i;
        this.f220386b = str;
        this.f220387c = str2;
        this.f220388d = str3;
        this.f220389e = str4;
        this.f220390f = str5;
        this.f220391g = str6;
        this.f220392h = str7;
        this.f220393i = z;
        this.f220394j = f5uVar;
        this.f220395k = str8;
    }

    /* JADX INFO: renamed from: a */
    public final String m80832a() {
        return this.f220390f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thb)) {
            return false;
        }
        thb thbVar = (thb) obj;
        return this.f220385a == thbVar.f220385a && wj50.m88271j(this.f220386b, thbVar.f220386b) && wj50.m88271j(this.f220387c, thbVar.f220387c) && wj50.m88271j(this.f220388d, thbVar.f220388d) && wj50.m88271j(this.f220389e, thbVar.f220389e) && wj50.m88271j(this.f220390f, thbVar.f220390f) && wj50.m88271j(this.f220391g, thbVar.f220391g) && wj50.m88271j(this.f220392h, thbVar.f220392h) && this.f220393i == thbVar.f220393i && wj50.m88271j(this.f220394j, thbVar.f220394j) && wj50.m88271j(this.f220395k, thbVar.f220395k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f220385a) * 31, 31, this.f220386b), 31, this.f220387c);
        String str = this.f220388d;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f220389e), 31, this.f220390f);
        String str2 = this.f220391g;
        int iHashCode = (iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f220392h;
        int iM77245d = s571.m77245d((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f220393i);
        f5u f5uVar = this.f220394j;
        int iHashCode2 = (iM77245d + (f5uVar == null ? 0 : f5uVar.hashCode())) * 31;
        String str4 = this.f220395k;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
