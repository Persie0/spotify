package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mgs extends AbstractC2202o5 {
    public static final Parcelable.Creator<mgs> CREATOR = new fb31(6);

    /* JADX INFO: renamed from: c */
    public int f143615c;

    /* JADX INFO: renamed from: d */
    public int f143616d;

    /* JADX INFO: renamed from: e */
    public int f143617e;

    /* JADX INFO: renamed from: f */
    public int f143618f;

    /* JADX INFO: renamed from: g */
    public int f143619g;

    public mgs(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f143615c = 0;
        this.f143615c = parcel.readInt();
        this.f143616d = parcel.readInt();
        this.f143617e = parcel.readInt();
        this.f143618f = parcel.readInt();
        this.f143619g = parcel.readInt();
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f143615c);
        parcel.writeInt(this.f143616d);
        parcel.writeInt(this.f143617e);
        parcel.writeInt(this.f143618f);
        parcel.writeInt(this.f143619g);
    }

    public mgs(Parcelable parcelable) {
        super(parcelable);
        this.f143615c = 0;
    }
}
