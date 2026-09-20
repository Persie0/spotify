package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ouh implements Parcelable {
    public static final Parcelable.Creator<ouh> CREATOR = new rae(25);

    /* JADX INFO: renamed from: a */
    public final String f170289a;

    /* JADX INFO: renamed from: b */
    public final String f170290b;

    /* JADX INFO: renamed from: c */
    public final String f170291c;

    /* JADX INFO: renamed from: d */
    public final String f170292d;

    /* JADX INFO: renamed from: e */
    public final h2i f170293e;

    /* JADX INFO: renamed from: f */
    public final String f170294f;

    public ouh(String str, String str2, String str3, String str4, String str5, h2i h2iVar) {
        this.f170289a = str;
        this.f170290b = str2;
        this.f170291c = str3;
        this.f170292d = str4;
        this.f170293e = h2iVar;
        this.f170294f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouh)) {
            return false;
        }
        ouh ouhVar = (ouh) obj;
        return wj50.m88271j(this.f170289a, ouhVar.f170289a) && wj50.m88271j(this.f170290b, ouhVar.f170290b) && wj50.m88271j(this.f170291c, ouhVar.f170291c) && wj50.m88271j(this.f170292d, ouhVar.f170292d) && wj50.m88271j(this.f170293e, ouhVar.f170293e) && wj50.m88271j(this.f170294f, ouhVar.f170294f);
    }

    public final int hashCode() {
        return this.f170294f.hashCode() + ((this.f170293e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f170289a.hashCode() * 31, 31, this.f170290b), 31, this.f170291c), 31, this.f170292d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170289a);
        parcel.writeString(this.f170290b);
        parcel.writeString(this.f170291c);
        parcel.writeString(this.f170292d);
        parcel.writeParcelable(this.f170293e, i);
        parcel.writeString(this.f170294f);
    }
}
