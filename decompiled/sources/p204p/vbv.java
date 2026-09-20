package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;

/* JADX INFO: loaded from: classes5.dex */
public final class vbv implements Parcelable {
    public static final Parcelable.Creator<vbv> CREATOR = new m8v(5);

    /* JADX INFO: renamed from: a */
    public final String f239585a;

    /* JADX INFO: renamed from: b */
    public final EntityType f239586b;

    public vbv(String str, EntityType entityType) {
        this.f239585a = str;
        this.f239586b = entityType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbv)) {
            return false;
        }
        vbv vbvVar = (vbv) obj;
        return wj50.m88271j(this.f239585a, vbvVar.f239585a) && this.f239586b == vbvVar.f239586b;
    }

    public final int hashCode() {
        return this.f239586b.hashCode() + (this.f239585a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239585a);
        parcel.writeString(this.f239586b.name());
    }
}
