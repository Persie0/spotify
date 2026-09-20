package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class h600 implements Parcelable {
    public static final Parcelable.Creator<h600> CREATOR = new n6f1(22);

    /* JADX INFO: renamed from: a */
    public String f87940a;

    /* JADX INFO: renamed from: b */
    public final String f87941b;

    /* JADX INFO: renamed from: c */
    public final String f87942c;

    /* JADX INFO: renamed from: d */
    public final zzq0 f87943d;

    /* JADX INFO: renamed from: e */
    public final m05 f87944e;

    public h600(String str, String str2, String str3, zzq0 zzq0Var, m05 m05Var) {
        this.f87940a = str;
        this.f87941b = str2;
        this.f87942c = str3;
        this.f87943d = zzq0Var;
        this.f87944e = m05Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87940a);
        parcel.writeString(this.f87941b);
        parcel.writeString(this.f87942c);
        parcel.writeParcelable(this.f87943d, i);
        parcel.writeParcelable(this.f87944e, i);
    }
}
