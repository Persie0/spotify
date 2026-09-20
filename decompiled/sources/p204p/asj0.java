package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class asj0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final asj0 f19465a = new asj0();
    public static final Parcelable.Creator<asj0> CREATOR = new fgj0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof asj0);
    }

    public final int hashCode() {
        return 489558045;
    }

    public final String toString() {
        return "NotesSharingReminderPageResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
