package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class cff0 implements ytx0 {

    /* JADX INFO: renamed from: a */
    public static final cff0 f37340a = new cff0();
    public static final Parcelable.Creator<cff0> CREATOR = new r4f0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ytx0
    public final List getRules() {
        return h6f.m46715L(Rule.DISALLOW_IF_CAR_CONNECTED, Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, Rule.DISALLOW_IF_CONTEXT_SWITCHED);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
