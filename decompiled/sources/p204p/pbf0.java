package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pbf0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<pbf0> CREATOR = new tne1(29);

    /* JADX INFO: renamed from: a */
    public final int f175801a;

    /* JADX INFO: renamed from: b */
    public final int f175802b;

    /* JADX INFO: renamed from: c */
    public final int f175803c;

    /* JADX INFO: renamed from: d */
    public final long f175804d;

    /* JADX INFO: renamed from: e */
    public final long f175805e;

    /* JADX INFO: renamed from: f */
    public final String f175806f;

    /* JADX INFO: renamed from: g */
    public final String f175807g;

    /* JADX INFO: renamed from: h */
    public final int f175808h;

    /* JADX INFO: renamed from: i */
    public final int f175809i;

    public pbf0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f175801a = i;
        this.f175802b = i2;
        this.f175803c = i3;
        this.f175804d = j;
        this.f175805e = j2;
        this.f175806f = str;
        this.f175807g = str2;
        this.f175808h = i4;
        this.f175809i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f175801a);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f175802b);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f175803c);
        alf1.m26313S(parcel, 4, 8);
        parcel.writeLong(this.f175804d);
        alf1.m26313S(parcel, 5, 8);
        parcel.writeLong(this.f175805e);
        alf1.m26308N(parcel, 6, this.f175806f);
        alf1.m26308N(parcel, 7, this.f175807g);
        alf1.m26313S(parcel, 8, 4);
        parcel.writeInt(this.f175808h);
        alf1.m26313S(parcel, 9, 4);
        parcel.writeInt(this.f175809i);
        alf1.m26316V(iM26314T, parcel);
    }
}
