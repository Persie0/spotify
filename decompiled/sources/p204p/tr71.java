package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.UserTimeline;

/* JADX INFO: loaded from: classes7.dex */
public final class tr71 implements Parcelable {
    public static final Parcelable.Creator<tr71> CREATOR = new sr71(0);

    /* JADX INFO: renamed from: a */
    public final UserTimeline f223006a;

    /* JADX INFO: renamed from: b */
    public final int f223007b;

    public tr71(UserTimeline userTimeline, int i) {
        this.f223006a = userTimeline;
        this.f223007b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr71)) {
            return false;
        }
        tr71 tr71Var = (tr71) obj;
        return wj50.m88271j(this.f223006a, tr71Var.f223006a) && this.f223007b == tr71Var.f223007b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223007b) + (this.f223006a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f223006a.toByteArray());
        parcel.writeInt(this.f223007b);
    }
}
