package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dj8 implements Parcelable {
    public static final Parcelable.Creator<dj8> CREATOR = new yi8(1);

    /* JADX INFO: renamed from: a */
    public final ArrayList f49608a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f49609b;

    public dj8(ArrayList arrayList, ArrayList arrayList2) {
        this.f49608a = arrayList;
        this.f49609b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f49608a);
        parcel.writeTypedList(this.f49609b);
    }

    public dj8(Parcel parcel) {
        this.f49608a = parcel.createStringArrayList();
        this.f49609b = parcel.createTypedArrayList(zi8.CREATOR);
    }
}
