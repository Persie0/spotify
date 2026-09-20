package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dum0 implements Parcelable {
    public static final cum0 CREATOR = new cum0();

    /* JADX INFO: renamed from: a */
    public final bx50 f53234a;

    public dum0(bx50 bx50Var) {
        this.f53234a = bx50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bx50 bx50Var = this.f53234a;
        parcel.writeString(bx50Var.f31786a);
        parcel.writeString(bx50Var.f31787b);
        parcel.writeString(bx50Var.f31788c);
        parcel.writeByte(bx50Var.f31789d ? (byte) 1 : (byte) 0);
        parcel.writeByte(bx50Var.f31790e ? (byte) 1 : (byte) 0);
    }
}
