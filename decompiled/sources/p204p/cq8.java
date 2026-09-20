package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class cq8 implements Parcelable {
    public static final Parcelable.Creator<cq8> CREATOR = new yi8(19);

    /* JADX INFO: renamed from: L0 */
    public int f40777L0;

    /* JADX INFO: renamed from: M0 */
    public int f40778M0;

    /* JADX INFO: renamed from: N0 */
    public int f40779N0;

    /* JADX INFO: renamed from: X */
    public int f40780X;

    /* JADX INFO: renamed from: Y */
    public int f40781Y;

    /* JADX INFO: renamed from: Z */
    public int f40782Z;

    /* JADX INFO: renamed from: a */
    public int f40783a;

    /* JADX INFO: renamed from: b */
    public int f40784b;

    /* JADX INFO: renamed from: c */
    public int f40785c;

    /* JADX INFO: renamed from: d */
    public int f40786d;

    /* JADX INFO: renamed from: e */
    public int f40787e;

    /* JADX INFO: renamed from: f */
    public String f40788f;

    /* JADX INFO: renamed from: g */
    public int f40789g;

    /* JADX INFO: renamed from: h */
    public int f40790h;

    /* JADX INFO: renamed from: i */
    public int f40791i;

    /* JADX INFO: renamed from: t */
    public boolean f40792t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40783a);
        parcel.writeInt(this.f40784b);
        parcel.writeInt(this.f40785c);
        parcel.writeInt(this.f40786d);
        parcel.writeInt(this.f40787e);
        parcel.writeString(this.f40788f.toString());
        parcel.writeInt(this.f40789g);
        parcel.writeInt(this.f40791i);
        parcel.writeInt(this.f40780X);
        parcel.writeInt(this.f40781Y);
        parcel.writeInt(this.f40782Z);
        parcel.writeInt(this.f40777L0);
        parcel.writeInt(this.f40778M0);
        parcel.writeInt(this.f40779N0);
        parcel.writeInt(this.f40792t ? 1 : 0);
    }
}
