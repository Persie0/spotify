package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wdj implements ndj {
    public static final Parcelable.Creator<wdj> CREATOR = new wcj(14);

    /* JADX INFO: renamed from: a */
    public final String f250292a;

    /* JADX INFO: renamed from: b */
    public final rv01 f250293b;

    /* JADX INFO: renamed from: c */
    public final String f250294c;

    /* JADX INFO: renamed from: d */
    public final vdj f250295d;

    /* JADX INFO: renamed from: e */
    public final nsk0 f250296e;

    /* JADX INFO: renamed from: f */
    public final String f250297f;

    /* JADX INFO: renamed from: g */
    public final String f250298g;

    public wdj(String str, rv01 rv01Var, String str2, vdj vdjVar, nsk0 nsk0Var, String str3, String str4) {
        this.f250292a = str;
        this.f250293b = rv01Var;
        this.f250294c = str2;
        this.f250295d = vdjVar;
        this.f250296e = nsk0Var;
        this.f250297f = str3;
        this.f250298g = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m87846c() {
        return this.f250297f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final String m87847e() {
        return this.f250292a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdj)) {
            return false;
        }
        wdj wdjVar = (wdj) obj;
        return wj50.m88271j(this.f250292a, wdjVar.f250292a) && wj50.m88271j(this.f250293b, wdjVar.f250293b) && wj50.m88271j(this.f250294c, wdjVar.f250294c) && wj50.m88271j(this.f250295d, wdjVar.f250295d) && wj50.m88271j(this.f250296e, wdjVar.f250296e) && wj50.m88271j(this.f250297f, wdjVar.f250297f) && wj50.m88271j(this.f250298g, wdjVar.f250298g);
    }

    /* JADX INFO: renamed from: g */
    public final String m87848g() {
        return this.f250294c;
    }

    /* JADX INFO: renamed from: h */
    public final String m87849h() {
        return this.f250298g;
    }

    public final int hashCode() {
        int iHashCode = (this.f250293b.hashCode() + (this.f250292a.hashCode() * 31)) * 31;
        String str = this.f250294c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        vdj vdjVar = this.f250295d;
        int iHashCode3 = (iHashCode2 + (vdjVar == null ? 0 : vdjVar.hashCode())) * 31;
        nsk0 nsk0Var = this.f250296e;
        int iHashCode4 = (iHashCode3 + (nsk0Var == null ? 0 : nsk0Var.hashCode())) * 31;
        String str2 = this.f250297f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f250298g;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j */
    public final vdj m87850j() {
        return this.f250295d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250292a);
        parcel.writeParcelable(this.f250293b, i);
        parcel.writeString(this.f250294c);
        parcel.writeParcelable(this.f250295d, i);
        nsk0 nsk0Var = this.f250296e;
        if (nsk0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nsk0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f250297f);
        parcel.writeString(this.f250298g);
    }

    public /* synthetic */ wdj(String str, rv01 rv01Var, String str2, vdj vdjVar, nsk0 nsk0Var, String str3, String str4, int i) {
        this(str, (i & 2) != 0 ? zu01.f286314a : rv01Var, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : vdjVar, (i & 16) != 0 ? null : nsk0Var, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
