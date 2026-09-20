package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.appauthorization.sso.ClientIdentity$ValidationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cke implements Parcelable {
    public static final Parcelable.Creator<cke> CREATOR = new rae(4);

    /* JADX INFO: renamed from: a */
    public final String f38937a;

    /* JADX INFO: renamed from: b */
    public final String f38938b;

    public cke(String str, String str2) {
        this.f38937a = str;
        this.f38938b = str2;
    }

    /* JADX INFO: renamed from: c */
    public static Signature m33119c(Context context, String str) throws ClientIdentity$ValidationException {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length == 1) {
                return signatureArr[0];
            }
            throw new ClientIdentity$ValidationException("Multiple certificates found");
        } catch (PackageManager.NameNotFoundException e) {
            throw new ClientIdentity$ValidationException(e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cke)) {
            return false;
        }
        cke ckeVar = (cke) obj;
        return Objects.equals(this.f38937a, ckeVar.f38937a) && Objects.equals(this.f38938b, ckeVar.f38938b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38937a, this.f38938b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38937a);
        parcel.writeString(this.f38938b);
    }

    public cke(Parcel parcel) {
        this.f38937a = parcel.readString();
        this.f38938b = parcel.readString();
    }
}
