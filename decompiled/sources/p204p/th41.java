package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class th41 implements Parcelable {
    public static final Parcelable.Creator<th41> CREATOR = new ln31(28);

    /* JADX INFO: renamed from: a */
    public int f220321a;

    /* JADX INFO: renamed from: b */
    public int f220322b;

    /* JADX INFO: renamed from: c */
    public int f220323c;

    /* JADX INFO: renamed from: d */
    public int[] f220324d;

    /* JADX INFO: renamed from: e */
    public int f220325e;

    /* JADX INFO: renamed from: f */
    public int[] f220326f;

    /* JADX INFO: renamed from: g */
    public ArrayList f220327g;

    /* JADX INFO: renamed from: h */
    public boolean f220328h;

    /* JADX INFO: renamed from: i */
    public boolean f220329i;

    /* JADX INFO: renamed from: t */
    public boolean f220330t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f220321a);
        parcel.writeInt(this.f220322b);
        parcel.writeInt(this.f220323c);
        if (this.f220323c > 0) {
            parcel.writeIntArray(this.f220324d);
        }
        parcel.writeInt(this.f220325e);
        if (this.f220325e > 0) {
            parcel.writeIntArray(this.f220326f);
        }
        parcel.writeInt(this.f220328h ? 1 : 0);
        parcel.writeInt(this.f220329i ? 1 : 0);
        parcel.writeInt(this.f220330t ? 1 : 0);
        parcel.writeList(this.f220327g);
    }
}
