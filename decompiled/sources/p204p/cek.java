package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cek {

    /* JADX INFO: renamed from: a */
    public final fdk f37145a;

    /* JADX INFO: renamed from: b */
    public final fdk f37146b;

    /* JADX INFO: renamed from: c */
    public final fdk f37147c;

    public cek(fdk fdkVar, fdk fdkVar2, fdk fdkVar3) {
        this.f37145a = fdkVar;
        this.f37146b = fdkVar2;
        this.f37147c = fdkVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cek)) {
            return false;
        }
        cek cekVar = (cek) obj;
        return wj50.m88271j(this.f37145a, cekVar.f37145a) && wj50.m88271j(this.f37146b, cekVar.f37146b) && wj50.m88271j(this.f37147c, cekVar.f37147c);
    }

    public final int hashCode() {
        fdk fdkVar = this.f37145a;
        int iHashCode = (fdkVar == null ? 0 : fdkVar.hashCode()) * 31;
        fdk fdkVar2 = this.f37146b;
        int iHashCode2 = (iHashCode + (fdkVar2 == null ? 0 : fdkVar2.hashCode())) * 31;
        fdk fdkVar3 = this.f37147c;
        return iHashCode2 + (fdkVar3 != null ? fdkVar3.hashCode() : 0);
    }
}
