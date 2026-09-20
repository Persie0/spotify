package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bwa0 implements Parcelable {
    public static final Parcelable.Creator<bwa0> CREATOR = new ama0(17);

    /* JADX INFO: renamed from: a */
    public final int f31594a;

    /* JADX INFO: renamed from: b */
    public final C1893gd f31595b;

    /* JADX INFO: renamed from: c */
    public final hm7 f31596c;

    /* JADX INFO: renamed from: d */
    public final String f31597d;

    /* JADX INFO: renamed from: e */
    public final String f31598e;

    /* JADX INFO: renamed from: f */
    public final awa0 f31599f;

    /* JADX INFO: renamed from: g */
    public Map f31600g;

    /* JADX INFO: renamed from: h */
    public HashMap f31601h;

    public bwa0(awa0 awa0Var, int i, C1893gd c1893gd, hm7 hm7Var, String str, String str2) {
        this.f31599f = awa0Var;
        this.f31595b = c1893gd;
        this.f31596c = hm7Var;
        this.f31597d = str;
        this.f31594a = i;
        this.f31598e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f31594a;
        if (i2 == 1) {
            str = SearchEndpointResponseKt.RESULT_SUCCESS;
        } else if (i2 == 2) {
            str = "CANCEL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = SearchEndpointResponseKt.RESULT_ERROR;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f31595b, i);
        parcel.writeParcelable(this.f31596c, i);
        parcel.writeString(this.f31597d);
        parcel.writeString(this.f31598e);
        parcel.writeParcelable(this.f31599f, i);
        n0b1.m63360S(parcel, this.f31600g);
        n0b1.m63360S(parcel, this.f31601h);
    }

    public bwa0(Parcel parcel) {
        int i;
        String string = parcel.readString();
        string = string == null ? "error" : string;
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals(SearchEndpointResponseKt.RESULT_SUCCESS)) {
            i = 1;
        } else if (string.equals("CANCEL")) {
            i = 2;
        } else {
            if (!string.equals(SearchEndpointResponseKt.RESULT_ERROR)) {
                throw new IllegalArgumentException("No enum constant com.facebook.login.LoginClient.Result.Code.".concat(string));
            }
            i = 3;
        }
        this.f31594a = i;
        this.f31595b = (C1893gd) parcel.readParcelable(C1893gd.class.getClassLoader());
        this.f31596c = (hm7) parcel.readParcelable(hm7.class.getClassLoader());
        this.f31597d = parcel.readString();
        this.f31598e = parcel.readString();
        this.f31599f = (awa0) parcel.readParcelable(awa0.class.getClassLoader());
        this.f31600g = n0b1.m63348G(parcel);
        this.f31601h = n0b1.m63348G(parcel);
    }
}
