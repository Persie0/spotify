package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class wfa implements Parcelable {
    public static final Parcelable.Creator<wfa> CREATOR;

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f250772a;

    static {
        int i = MessageResponseToken.$stable;
        CREATOR = new dc9(29);
    }

    public wfa(MessageResponseToken messageResponseToken) {
        this.f250772a = messageResponseToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfa) && wj50.m88271j(this.f250772a, ((wfa) obj).f250772a);
    }

    public final int hashCode() {
        return this.f250772a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f250772a, i);
    }
}
