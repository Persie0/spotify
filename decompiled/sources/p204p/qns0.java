package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class qns0 extends uns0 {
    public static final Parcelable.Creator<qns0> CREATOR = new wds0(2);

    /* JADX INFO: renamed from: b */
    public final String f190695b;

    /* JADX INFO: renamed from: c */
    public final String f190696c;

    /* JADX INFO: renamed from: d */
    public final String f190697d;

    public qns0(String str, String str2, String str3) {
        super(null);
        this.f190695b = str;
        this.f190696c = str2;
        this.f190697d = str3;
    }

    @Override // p204p.uns0
    /* JADX INFO: renamed from: c */
    public final String mo73361c() {
        return this.f190695b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qns0)) {
            return false;
        }
        qns0 qns0Var = (qns0) obj;
        return wj50.m88271j(this.f190695b, qns0Var.f190695b) && wj50.m88271j(this.f190696c, qns0Var.f190696c) && wj50.m88271j(this.f190697d, qns0Var.f190697d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f190695b.hashCode() * 31, 31, this.f190696c);
        String str = this.f190697d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f190695b);
        parcel.writeString(this.f190696c);
        parcel.writeString(this.f190697d);
    }
}
