package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class jca implements Parcelable {
    public static final Parcelable.Creator<jca> CREATOR = new dc9(18);

    /* JADX INFO: renamed from: a */
    public final wwu f111027a;

    /* JADX INFO: renamed from: b */
    public final String f111028b;

    /* JADX INFO: renamed from: c */
    public final String f111029c;

    /* JADX INFO: renamed from: d */
    public final String f111030d;

    /* JADX INFO: renamed from: e */
    public final String f111031e;

    /* JADX INFO: renamed from: f */
    public final String f111032f;

    /* JADX INFO: renamed from: g */
    public final boolean f111033g;

    /* JADX INFO: renamed from: h */
    public final String f111034h;

    public jca(wwu wwuVar, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.f111027a = wwuVar;
        this.f111028b = str;
        this.f111029c = str2;
        this.f111030d = str3;
        this.f111031e = str4;
        this.f111032f = str5;
        this.f111033g = z;
        this.f111034h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jca)) {
            return false;
        }
        jca jcaVar = (jca) obj;
        return wj50.m88271j(this.f111027a, jcaVar.f111027a) && wj50.m88271j(this.f111028b, jcaVar.f111028b) && wj50.m88271j(this.f111029c, jcaVar.f111029c) && wj50.m88271j(this.f111030d, jcaVar.f111030d) && wj50.m88271j(this.f111031e, jcaVar.f111031e) && wj50.m88271j(this.f111032f, jcaVar.f111032f) && this.f111033g == jcaVar.f111033g && wj50.m88271j(this.f111034h, jcaVar.f111034h);
    }

    public final int hashCode() {
        wwu wwuVar = this.f111027a;
        return this.f111034h.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((wwuVar == null ? 0 : wwuVar.hashCode()) * 31, 31, this.f111028b), 31, this.f111029c), 31, this.f111030d), 31, this.f111031e), 31, this.f111032f), 31, this.f111033g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f111027a, i);
        parcel.writeString(this.f111028b);
        parcel.writeString(this.f111029c);
        parcel.writeString(this.f111030d);
        parcel.writeString(this.f111031e);
        parcel.writeString(this.f111032f);
        parcel.writeInt(this.f111033g ? 1 : 0);
        parcel.writeString(this.f111034h);
    }
}
