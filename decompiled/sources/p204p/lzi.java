package p204p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX INFO: loaded from: classes.dex */
public final class lzi extends AbstractC2206o9 {

    /* JADX INFO: renamed from: a */
    public final int f138370a;

    /* JADX INFO: renamed from: b */
    public final int f138371b;

    /* JADX INFO: renamed from: c */
    public final PendingIntent f138372c;

    /* JADX INFO: renamed from: d */
    public final String f138373d;

    /* JADX INFO: renamed from: e */
    public final Integer f138374e;

    /* JADX INFO: renamed from: f */
    public static final lzi f138369f = new lzi(0, null, null);
    public static final Parcelable.Creator<lzi> CREATOR = new c5f1(9);

    public lzi(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f138370a = i;
        this.f138371b = i2;
        this.f138372c = pendingIntent;
        this.f138373d = str;
        this.f138374e = num;
    }

    /* JADX INFO: renamed from: k */
    public static String m60322k(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return SearchEndpointResponseKt.RESULT_SUCCESS;
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lzi)) {
            return false;
        }
        lzi lziVar = (lzi) obj;
        return this.f138371b == lziVar.f138371b && mvl0.m62956s(this.f138372c, lziVar.f138372c) && mvl0.m62956s(this.f138373d, lziVar.f138373d) && mvl0.m62956s(this.f138374e, lziVar.f138374e);
    }

    public final int hashCode() {
        return mvl0.m62961x(Integer.valueOf(this.f138371b), this.f138372c, this.f138373d, this.f138374e);
    }

    public final String toString() {
        a9i0 a9i0VarM62936D = mvl0.m62936D(this);
        a9i0VarM62936D.m25120b(m60322k(this.f138371b), "statusCode");
        a9i0VarM62936D.m25120b(this.f138372c, "resolution");
        a9i0VarM62936D.m25120b(this.f138373d, "message");
        a9i0VarM62936D.m25120b(this.f138374e, "clientMethodKey");
        return a9i0VarM62936D.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26302H(parcel, 1, this.f138370a);
        alf1.m26302H(parcel, 2, this.f138371b);
        alf1.m26307M(parcel, 3, this.f138372c, i);
        alf1.m26308N(parcel, 4, this.f138373d);
        alf1.m26304J(parcel, 5, this.f138374e);
        alf1.m26331n(iM26329l, parcel);
    }

    public lzi(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
