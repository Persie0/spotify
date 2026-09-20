package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class aj40 implements Parcelable {
    public static final Parcelable.Creator<aj40> CREATOR = new n6f1(25);

    /* JADX INFO: renamed from: a */
    public final UUID f16167a;

    public aj40(UUID uuid) {
        this.f16167a = uuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj40) && wj50.m88271j(this.f16167a, ((aj40) obj).f16167a);
    }

    public final int hashCode() {
        return this.f16167a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f16167a);
    }
}
