package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes7.dex */
public final class cwe0 extends fwe0 {
    public static final Parcelable.Creator<cwe0> CREATOR;

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f42726a;

    static {
        int i = MessageResponseToken.$stable;
        CREATOR = new ube0(22);
    }

    public cwe0(MessageResponseToken messageResponseToken) {
        this.f42726a = messageResponseToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwe0) && wj50.m88271j(this.f42726a, ((cwe0) obj).f42726a);
    }

    public final int hashCode() {
        return this.f42726a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42726a, i);
    }
}
