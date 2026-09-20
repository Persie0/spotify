package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cum0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        wj50.m88279p(string);
        String string2 = parcel.readString();
        wj50.m88279p(string2);
        return new dum0(new bx50(string, string2, parcel.readString(), parcel.readByte() != 0, parcel.readByte() != 0));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new dum0[i];
    }
}
