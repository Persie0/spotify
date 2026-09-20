package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hm7 implements Parcelable {
    public static final Parcelable.Creator<hm7> CREATOR = new na7(10);

    /* JADX INFO: renamed from: a */
    public final String f92849a;

    /* JADX INFO: renamed from: b */
    public final String f92850b;

    /* JADX INFO: renamed from: c */
    public final jm7 f92851c;

    /* JADX INFO: renamed from: d */
    public final im7 f92852d;

    /* JADX INFO: renamed from: e */
    public final String f92853e;

    public hm7(String str, String str2) {
        zn91.m96544c0(str, "token");
        zn91.m96544c0(str2, "expectedNonce");
        boolean zM90984p = false;
        List listM88477a1 = wl51.m88477a1(str, new String[]{"."}, 0, 6);
        if (listM88477a1.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str3 = (String) listM88477a1.get(0);
        String str4 = (String) listM88477a1.get(1);
        String str5 = (String) listM88477a1.get(2);
        this.f92849a = str;
        this.f92850b = str2;
        jm7 jm7Var = new jm7(str3);
        this.f92851c = jm7Var;
        this.f92852d = new im7(str4, str2);
        try {
            String strM90979j = xhf1.m90979j(jm7Var.f113783c);
            if (strM90979j != null) {
                zM90984p = xhf1.m90984p(xhf1.m90978i(strM90979j), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!zM90984p) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f92853e = str5;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m47931c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f92849a);
        jSONObject.put("expected_nonce", this.f92850b);
        jm7 jm7Var = this.f92851c;
        jm7Var.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", jm7Var.f113781a);
        jSONObject2.put("typ", jm7Var.f113782b);
        jSONObject2.put("kid", jm7Var.f113783c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f92852d.m51088c());
        jSONObject.put("signature", this.f92853e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm7)) {
            return false;
        }
        hm7 hm7Var = (hm7) obj;
        return wj50.m88271j(this.f92849a, hm7Var.f92849a) && wj50.m88271j(this.f92850b, hm7Var.f92850b) && wj50.m88271j(this.f92851c, hm7Var.f92851c) && wj50.m88271j(this.f92852d, hm7Var.f92852d) && wj50.m88271j(this.f92853e, hm7Var.f92853e);
    }

    public final int hashCode() {
        return this.f92853e.hashCode() + ((this.f92852d.hashCode() + ((this.f92851c.hashCode() + s571.m77243b(s571.m77243b(527, 31, this.f92849a), 31, this.f92850b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92849a);
        parcel.writeString(this.f92850b);
        parcel.writeParcelable(this.f92851c, i);
        parcel.writeParcelable(this.f92852d, i);
        parcel.writeString(this.f92853e);
    }

    public hm7(Parcel parcel) {
        String string = parcel.readString();
        zn91.m96548e0(string, "token");
        this.f92849a = string;
        String string2 = parcel.readString();
        zn91.m96548e0(string2, "expectedNonce");
        this.f92850b = string2;
        Parcelable parcelable = parcel.readParcelable(jm7.class.getClassLoader());
        if (parcelable != null) {
            this.f92851c = (jm7) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(im7.class.getClassLoader());
            if (parcelable2 != null) {
                this.f92852d = (im7) parcelable2;
                String string3 = parcel.readString();
                zn91.m96548e0(string3, "signature");
                this.f92853e = string3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
