package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class oum0 implements Parcelable {
    public static final num0 CREATOR = new num0();

    /* JADX INFO: renamed from: a */
    public final xx50 f170312a;

    public oum0(xx50 xx50Var) {
        this.f170312a = xx50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        xx50 xx50Var = this.f170312a;
        parcel.writeString(xx50Var.f266863a);
        parcel.writeString(xx50Var.f266864b);
        parcel.writeString(oq40.m67600s(xx50Var.f266865c));
        parcel.writeString(oq40.m67601t(xx50Var.f266866d));
        parcel.writeByte(xx50Var.f266867e ? (byte) 1 : (byte) 0);
        vx50 vx50Var = xx50Var.f266869g;
        parcel.writeByte(vx50Var.f245619a ? (byte) 1 : (byte) 0);
        parcel.writeByte(vx50Var.f245620b ? (byte) 1 : (byte) 0);
        wx50 wx50Var = vx50Var.f245621c;
        parcel.writeString(wx50Var != null ? wx50Var.f255937a : null);
    }
}
