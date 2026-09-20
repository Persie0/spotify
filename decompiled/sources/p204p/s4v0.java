package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public enum s4v0 implements Parcelable {
    SAVED("saved"),
    SHARED("shared"),
    PLAYED("played"),
    AUTO_GENERATED("auto_generated"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("");

    public static final Parcelable.Creator<s4v0> CREATOR = new h1v0(3);

    /* JADX INFO: renamed from: a */
    public final String f205648a;

    s4v0(String str) {
        this.f205648a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
