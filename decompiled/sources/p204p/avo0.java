package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class avo0 implements Parcelable {
    public static final Parcelable.Creator<avo0> CREATOR = new igo0(15);

    /* JADX INFO: renamed from: a */
    public final String f20232a;

    /* JADX INFO: renamed from: b */
    public final String f20233b;

    /* JADX INFO: renamed from: c */
    public final String f20234c;

    /* JADX INFO: renamed from: d */
    public final String f20235d;

    /* JADX INFO: renamed from: e */
    public final String f20236e;

    /* JADX INFO: renamed from: f */
    public final String f20237f;

    /* JADX INFO: renamed from: g */
    public final String f20238g;

    /* JADX INFO: renamed from: h */
    public final int f20239h;

    public avo0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f20232a = str6;
        this.f20233b = str;
        this.f20234c = str2;
        this.f20235d = str3;
        this.f20236e = str4;
        this.f20237f = str5;
        this.f20238g = str7;
        this.f20239h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20233b);
        parcel.writeString(this.f20234c);
        parcel.writeString(this.f20235d);
        parcel.writeString(this.f20236e);
        parcel.writeString(this.f20237f);
        parcel.writeString(this.f20232a);
        parcel.writeString(this.f20238g);
        parcel.writeInt(this.f20239h);
    }
}
