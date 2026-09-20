package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m081 extends AbstractC2202o5 {
    public static final Parcelable.Creator<m081> CREATOR = new fb31(18);

    /* JADX INFO: renamed from: c */
    public int f138563c;

    /* JADX INFO: renamed from: d */
    public boolean f138564d;

    public m081(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f138563c = parcel.readInt();
        this.f138564d = parcel.readInt() != 0;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f138563c);
        parcel.writeInt(this.f138564d ? 1 : 0);
    }

    public m081(Parcelable parcelable) {
        super(parcelable);
    }
}
