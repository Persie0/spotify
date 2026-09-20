package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class yts implements Parcelable {
    public static final Parcelable.Creator<yts> CREATOR = new f9s(12);

    /* JADX INFO: renamed from: a */
    public final String f276203a;

    /* JADX INFO: renamed from: b */
    public final String f276204b;

    /* JADX INFO: renamed from: c */
    public final String f276205c;

    public yts(String str, String str2, String str3) {
        this.f276203a = str;
        this.f276204b = str2;
        this.f276205c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m94642c() {
        return this.f276204b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yts)) {
            return false;
        }
        yts ytsVar = (yts) obj;
        return wj50.m88271j(this.f276203a, ytsVar.f276203a) && wj50.m88271j(this.f276204b, ytsVar.f276204b) && wj50.m88271j(this.f276205c, ytsVar.f276205c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f276203a.hashCode() * 31, 31, this.f276204b);
        String str = this.f276205c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f276203a);
        parcel.writeString(this.f276204b);
        parcel.writeString(this.f276205c);
    }
}
