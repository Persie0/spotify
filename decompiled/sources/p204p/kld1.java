package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class kld1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<kld1> CREATOR = new tne1(25);

    /* JADX INFO: renamed from: a */
    public final int f123874a;

    /* JADX INFO: renamed from: b */
    public final Uri f123875b;

    /* JADX INFO: renamed from: c */
    public final int f123876c;

    /* JADX INFO: renamed from: d */
    public final int f123877d;

    public kld1(int i, Uri uri, int i2, int i3) {
        this.f123874a = i;
        this.f123875b = uri;
        this.f123876c = i2;
        this.f123877d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof kld1)) {
            kld1 kld1Var = (kld1) obj;
            if (mvl0.m62956s(this.f123875b, kld1Var.f123875b) && this.f123876c == kld1Var.f123876c && this.f123877d == kld1Var.f123877d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f123875b, Integer.valueOf(this.f123876c), Integer.valueOf(this.f123877d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.f123875b.toString();
        StringBuilder sbM36619s = dq60.m36619s(this.f123876c, this.f123877d, "Image ", "x", " ");
        sbM36619s.append(string);
        return sbM36619s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(this.f123874a);
        alf1.m26307M(parcel, 2, this.f123875b, i);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f123876c);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f123877d);
        alf1.m26316V(iM26314T, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kld1(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        this(1, uri, iOptInt, iOptInt2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (iOptInt < 0 || iOptInt2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }
}
