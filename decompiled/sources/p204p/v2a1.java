package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;

/* JADX INFO: loaded from: classes2.dex */
public final class v2a1 implements Parcelable {
    public static final Parcelable.Creator<v2a1> CREATOR = new u2a1(0);

    /* JADX INFO: renamed from: a */
    public final String f236592a;

    /* JADX INFO: renamed from: b */
    public final String f236593b;

    /* JADX INFO: renamed from: c */
    public final TriggerType f236594c;

    /* JADX INFO: renamed from: d */
    public final String f236595d;

    /* JADX INFO: renamed from: e */
    public final String f236596e;

    public v2a1(String str, String str2, TriggerType triggerType, String str3, String str4) {
        this.f236592a = str;
        this.f236593b = str2;
        this.f236594c = triggerType;
        this.f236595d = str3;
        this.f236596e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2a1)) {
            return false;
        }
        v2a1 v2a1Var = (v2a1) obj;
        return wj50.m88271j(this.f236592a, v2a1Var.f236592a) && wj50.m88271j(this.f236593b, v2a1Var.f236593b) && this.f236594c == v2a1Var.f236594c && wj50.m88271j(this.f236595d, v2a1Var.f236595d) && wj50.m88271j(this.f236596e, v2a1Var.f236596e);
    }

    public final int hashCode() {
        return this.f236596e.hashCode() + s571.m77243b((this.f236594c.hashCode() + s571.m77243b(this.f236592a.hashCode() * 31, 31, this.f236593b)) * 31, 31, this.f236595d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236592a);
        parcel.writeString(this.f236593b);
        this.f236594c.writeToParcel(parcel, i);
        parcel.writeString(this.f236595d);
        parcel.writeString(this.f236596e);
    }
}
