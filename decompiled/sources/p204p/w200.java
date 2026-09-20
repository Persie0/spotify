package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class w200 extends x200 {
    public static final Parcelable.Creator<w200> CREATOR = new ygz(23);

    /* JADX INFO: renamed from: a */
    public final List f247200a;

    public w200(List list) {
        this.f247200a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f247200a);
    }
}
