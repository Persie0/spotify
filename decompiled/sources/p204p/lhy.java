package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lhy implements ohy {
    public static final Parcelable.Creator<lhy> CREATOR = new p7y(12);

    /* JADX INFO: renamed from: X */
    public final ghy f133663X;

    /* JADX INFO: renamed from: a */
    public final String f133664a;

    /* JADX INFO: renamed from: b */
    public final String f133665b;

    /* JADX INFO: renamed from: c */
    public final String f133666c;

    /* JADX INFO: renamed from: d */
    public final String f133667d;

    /* JADX INFO: renamed from: e */
    public final String f133668e;

    /* JADX INFO: renamed from: f */
    public final Integer f133669f;

    /* JADX INFO: renamed from: g */
    public final String f133670g;

    /* JADX INFO: renamed from: h */
    public final String f133671h;

    /* JADX INFO: renamed from: i */
    public final String f133672i;

    /* JADX INFO: renamed from: t */
    public final jhy f133673t;

    public lhy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, jhy jhyVar, ghy ghyVar) {
        this.f133664a = str;
        this.f133665b = str2;
        this.f133666c = str3;
        this.f133667d = str4;
        this.f133668e = str5;
        this.f133669f = num;
        this.f133670g = str6;
        this.f133671h = str7;
        this.f133672i = str8;
        this.f133673t = jhyVar;
        this.f133663X = ghyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhy)) {
            return false;
        }
        lhy lhyVar = (lhy) obj;
        return wj50.m88271j(this.f133664a, lhyVar.f133664a) && wj50.m88271j(this.f133665b, lhyVar.f133665b) && wj50.m88271j(this.f133666c, lhyVar.f133666c) && wj50.m88271j(this.f133667d, lhyVar.f133667d) && wj50.m88271j(this.f133668e, lhyVar.f133668e) && wj50.m88271j(this.f133669f, lhyVar.f133669f) && wj50.m88271j(this.f133670g, lhyVar.f133670g) && wj50.m88271j(this.f133671h, lhyVar.f133671h) && wj50.m88271j(this.f133672i, lhyVar.f133672i) && wj50.m88271j(this.f133673t, lhyVar.f133673t) && wj50.m88271j(this.f133663X, lhyVar.f133663X);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f133664a.hashCode() * 31, 31, this.f133665b);
        String str = this.f133666c;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f133667d), 31, this.f133668e);
        Integer num = this.f133669f;
        return this.f133663X.hashCode() + ((this.f133673t.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((iM77243b2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f133670g), 31, this.f133671h), 31, this.f133672i)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f133664a);
        parcel.writeString(this.f133665b);
        parcel.writeString(this.f133666c);
        parcel.writeString(this.f133667d);
        parcel.writeString(this.f133668e);
        Integer num = this.f133669f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f133670g);
        parcel.writeString(this.f133671h);
        parcel.writeString(this.f133672i);
        parcel.writeParcelable(this.f133673t, i);
        parcel.writeParcelable(this.f133663X, i);
    }
}
