package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cgt0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<cgt0> CREATOR = new xvf1(24);

    /* JADX INFO: renamed from: e */
    public static final long f37789e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final Uri f37790a;

    /* JADX INFO: renamed from: b */
    public final Bundle f37791b;

    /* JADX INFO: renamed from: c */
    public byte[] f37792c;

    /* JADX INFO: renamed from: d */
    public long f37793d;

    static {
        new SecureRandom();
    }

    public cgt0(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f37790a = uri;
        this.f37791b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        ig31.m50506x(classLoader);
        bundle.setClassLoader(classLoader);
        this.f37792c = bArr;
        this.f37793d = j;
    }

    /* JADX INFO: renamed from: h */
    public final Map m32737h() {
        HashMap map = new HashMap();
        Bundle bundle = this.f37791b;
        for (String str : bundle.keySet()) {
            map.put(str, (Asset) bundle.getParcelable(str));
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: k */
    public final void m32738k(String str, Asset asset) {
        ig31.m50506x(str);
        this.f37791b.putParcelable(str, asset);
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f37792c;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Bundle bundle = this.f37791b;
        sb.append(", numAssets=" + bundle.size());
        sb.append(", uri=".concat(String.valueOf(this.f37790a)));
        sb.append(", syncDeadline=" + this.f37793d);
        if (!zIsLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : bundle.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(bundle.getParcelable(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ig31.m50507y(parcel, "dest must not be null");
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26307M(parcel, 2, this.f37790a, i);
        alf1.m26297C(parcel, 4, this.f37791b);
        alf1.m26298D(parcel, 5, this.f37792c);
        alf1.m26305K(parcel, 6, this.f37793d);
        alf1.m26331n(iM26329l, parcel);
    }
}
