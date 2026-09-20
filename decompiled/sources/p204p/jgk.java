package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jgk implements Parcelable {
    public static final Parcelable.Creator<jgk> CREATOR = new kck(3);

    /* JADX INFO: renamed from: a */
    public final String f112203a;

    /* JADX INFO: renamed from: b */
    public final String f112204b;

    /* JADX INFO: renamed from: c */
    public final String f112205c;

    /* JADX INFO: renamed from: d */
    public final String f112206d;

    /* JADX INFO: renamed from: e */
    public final String f112207e;

    public jgk(String str, String str2, String str3, String str4, String str5) {
        this.f112203a = str;
        this.f112204b = str2;
        this.f112205c = str3;
        this.f112206d = str4;
        this.f112207e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgk)) {
            return false;
        }
        jgk jgkVar = (jgk) obj;
        return wj50.m88271j(this.f112203a, jgkVar.f112203a) && wj50.m88271j(this.f112204b, jgkVar.f112204b) && wj50.m88271j(this.f112205c, jgkVar.f112205c) && wj50.m88271j(this.f112206d, jgkVar.f112206d) && wj50.m88271j(this.f112207e, jgkVar.f112207e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f112203a.hashCode() * 31, 31, this.f112204b);
        String str = this.f112205c;
        return this.f112207e.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f112206d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112203a);
        parcel.writeString(this.f112204b);
        parcel.writeString(this.f112205c);
        parcel.writeString(this.f112206d);
        parcel.writeString(this.f112207e);
    }
}
