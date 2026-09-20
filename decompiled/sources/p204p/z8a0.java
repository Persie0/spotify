package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class z8a0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280424a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        switch (this.f280424a) {
            case 0:
                return new d9a0((Throwable) parcel.readSerializable());
            case 1:
                return new a9a0(parcel.readString());
            case 2:
                parcel.readInt();
                return f9a0.f67209a;
            case 3:
                parcel.readInt();
                return h9a0.f88906a;
            case 4:
                parcel.readInt();
                return i9a0.f99965a;
            case 5:
                return new l9a0(parcel.readParcelable(l9a0.class.getClassLoader()));
            case 6:
                return new m9a0(FetchMode.valueOf(parcel.readString()));
            case 7:
                parcel.readInt();
                return n9a0.f151762a;
            case 8:
                return new o9a0(FetchMode.valueOf(parcel.readString()));
            case 9:
                return new p9a0(FetchMode.valueOf(parcel.readString()), (i8a0) parcel.readParcelable(p9a0.class.getClassLoader()));
            case 10:
                parcel.readInt();
                return r9a0.f196963a;
            case 11:
                parcel.readInt();
                return new u9a0();
            case 12:
                return new v9a0(FetchMode.valueOf(parcel.readString()));
            case 13:
                parcel.readInt();
                return q9a0.f186550a;
            case 14:
                parcel.readInt();
                return x9a0.f259307a;
            case 15:
                parcel.readInt();
                return y9a0.f270549a;
            case 16:
                return new xca0(parcel.readInt());
            case 17:
                return new uea0(parcel.readString(), parcel.readString());
            case 18:
                return new vea0(parcel.readString());
            case 19:
                return new wea0(parcel.readString());
            case 20:
                return new yea0((xea0) parcel.readParcelable(yea0.class.getClassLoader()), parcel.readFloat(), parcel.readString(), parcel.readString());
            case 21:
                return new qfa0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            case 22:
                vla0 vla0VarCreateFromParcel = parcel.readInt() == 0 ? null : vla0.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("NOT_REQUESTED")) {
                    i = 1;
                } else if (string2.equals("REQUESTING")) {
                    i = 2;
                } else {
                    if (!string2.equals("COMPLETED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.bluejay.onboarding.customization.steps.location.logic.LocationRequestStatus.".concat(string2));
                    }
                    i = 3;
                }
                return new uga0(vla0VarCreateFromParcel, string, i);
            case 23:
                String string3 = parcel.readString();
                qfa0 qfa0VarCreateFromParcel = parcel.readInt() == 0 ? null : qfa0.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iM31715d = 0;
                int iM31715d2 = 0;
                while (iM31715d2 != i4) {
                    iM31715d2 = c7h0.m31715d(qfa0.CREATOR, parcel, arrayList, iM31715d2, 1);
                }
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("IDLE")) {
                    i2 = 1;
                } else if (string5.equals("SEARCHING")) {
                    i2 = 2;
                } else if (string5.equals("HAS_RESULTS")) {
                    i2 = 3;
                } else if (string5.equals("NO_RESULTS")) {
                    i2 = 4;
                } else {
                    if (!string5.equals(SearchEndpointResponseKt.RESULT_ERROR)) {
                        throw new IllegalArgumentException("No enum constant com.spotify.trendingnearyou.locationsearch.domain.SearchState.".concat(string5));
                    }
                    i2 = 5;
                }
                int i5 = i2;
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(qfa0.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new wka0(string3, qfa0VarCreateFromParcel, string4, arrayList, i5, arrayList2);
            case 24:
                return new fla0(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 25:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("DEFAULT")) {
                    i3 = 1;
                } else if (string7.equals("SET_PREFERRED")) {
                    i3 = 2;
                } else {
                    if (!string7.equals("SET_BROWSE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.liveevents.locationsearch.domain.LocationSearchPageState.".concat(string7));
                    }
                    i3 = 3;
                }
                return new gla0(string6, i3);
            case 26:
                return new hla0(parcel.readString());
            case 27:
                return new ila0((d510) parcel.readParcelable(ila0.class.getClassLoader()));
            case 28:
                return new vla0(parcel.readString(), parcel.readInt() != 0);
            default:
                return new zla0(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f280424a) {
            case 0:
                return new d9a0[i];
            case 1:
                return new a9a0[i];
            case 2:
                return new f9a0[i];
            case 3:
                return new h9a0[i];
            case 4:
                return new i9a0[i];
            case 5:
                return new l9a0[i];
            case 6:
                return new m9a0[i];
            case 7:
                return new n9a0[i];
            case 8:
                return new o9a0[i];
            case 9:
                return new p9a0[i];
            case 10:
                return new r9a0[i];
            case 11:
                return new u9a0[i];
            case 12:
                return new v9a0[i];
            case 13:
                return new q9a0[i];
            case 14:
                return new x9a0[i];
            case 15:
                return new y9a0[i];
            case 16:
                return new xca0[i];
            case 17:
                return new uea0[i];
            case 18:
                return new vea0[i];
            case 19:
                return new wea0[i];
            case 20:
                return new yea0[i];
            case 21:
                return new qfa0[i];
            case 22:
                return new uga0[i];
            case 23:
                return new wka0[i];
            case 24:
                return new fla0[i];
            case 25:
                return new gla0[i];
            case 26:
                return new hla0[i];
            case 27:
                return new ila0[i];
            case 28:
                return new vla0[i];
            default:
                return new zla0[i];
        }
    }
}
