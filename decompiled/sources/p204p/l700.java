package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l700 implements Parcelable {
    public static final Parcelable.Creator<l700> CREATOR = new k700(0);

    /* JADX INFO: renamed from: a */
    public ArrayList f130519a;

    /* JADX INFO: renamed from: b */
    public ArrayList f130520b;

    /* JADX INFO: renamed from: c */
    public zi8[] f130521c;

    /* JADX INFO: renamed from: d */
    public int f130522d;

    /* JADX INFO: renamed from: e */
    public String f130523e = null;

    /* JADX INFO: renamed from: f */
    public ArrayList f130524f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public ArrayList f130525g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public ArrayList f130526h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f130519a);
        parcel.writeStringList(this.f130520b);
        parcel.writeTypedArray(this.f130521c, i);
        parcel.writeInt(this.f130522d);
        parcel.writeString(this.f130523e);
        parcel.writeStringList(this.f130524f);
        parcel.writeTypedList(this.f130525g);
        parcel.writeTypedList(this.f130526h);
    }
}
