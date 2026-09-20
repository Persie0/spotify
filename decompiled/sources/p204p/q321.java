package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class q321 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184781a;

    public /* synthetic */ q321(int i) {
        this.f184781a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        switch (this.f184781a) {
            case 0:
                return new r321(parcel.readString(), parcel.readString());
            case 1:
                return new s321(parcel.readString());
            case 2:
                return new y321(parcel.readString(), (x321) parcel.readParcelable(y321.class.getClassLoader()));
            case 3:
                return new t321(parcel.readString(), parcel.readString());
            case 4:
                return new u321(parcel.readString(), parcel.readString());
            case 5:
                parcel.readInt();
                return v321.f236755a;
            case 6:
                return new w321(parcel.readString());
            case 7:
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new b421(z3, parcel.readInt() != 0, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readInt(), parcel.readInt() != 0 ? z3 : false, TermsConditionAcceptance.valueOf(parcel.readString()), PrivacyPolicyAcceptance.valueOf(parcel.readString()), MarketingMessagesOption.valueOf(parcel.readString()), parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readString());
            case 8:
                j621 j621Var = (j621) parcel.readParcelable(k621.class.getClassLoader());
                h1u h1uVarCreateFromParcel = h1u.CREATOR.createFromParcel(parcel);
                w9n0 w9n0VarCreateFromParcel = w9n0.CREATOR.createFromParcel(parcel);
                ic2 ic2VarCreateFromParcel = ic2.CREATOR.createFromParcel(parcel);
                xz00 xz00VarCreateFromParcel = xz00.CREATOR.createFromParcel(parcel);
                mui0 mui0VarCreateFromParcel = mui0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                String string = parcel.readString();
                rk7 rk7VarValueOf = rk7.valueOf(parcel.readString());
                boolean z4 = z2;
                int i = parcel.readInt();
                kiq0 kiq0Var = (kiq0) parcel.readParcelable(k621.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new k621(j621Var, h1uVarCreateFromParcel, w9n0VarCreateFromParcel, ic2VarCreateFromParcel, xz00VarCreateFromParcel, mui0VarCreateFromParcel, z, string, rk7VarValueOf, i, kiq0Var, z4, parcel.readString(), parcel.readString());
            case 9:
                return new h621((b421) parcel.readParcelable(h621.class.getClassLoader()));
            case 10:
                return new i621((b421) parcel.readParcelable(i621.class.getClassLoader()));
            case 11:
                jbz0 jbz0VarCreateFromParcel = jbz0.CREATOR.createFromParcel(parcel);
                z2c z2cVarCreateFromParcel = z2c.CREATOR.createFromParcel(parcel);
                long j = parcel.readLong();
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                int iM64020m = 0;
                while (iM64020m != i2) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new za21(jbz0VarCreateFromParcel, z2cVarCreateFromParcel, j, linkedHashSet);
            case 12:
                return new wb21(parcel.readString(), (Intent) parcel.readParcelable(wb21.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return pd21.f176339a;
            case 14:
                parcel.readInt();
                return qd21.f187465a;
            case 15:
                return new sd21(csc1.valueOf(parcel.readString()));
            case 16:
                parcel.readInt();
                return td21.f219218a;
            case 17:
                z2c z2cVarCreateFromParcel2 = z2c.CREATOR.createFromParcel(parcel);
                long j2 = parcel.readLong();
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int iM64020m2 = 0;
                while (iM64020m2 != i3) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet2, iM64020m2, 1);
                }
                return new ok21(z2cVarCreateFromParcel2, j2, linkedHashSet2);
            case 18:
                return new tl21(parcel.readString());
            case 19:
                return new ul21(ol21.valueOf(parcel.readString()));
            case 20:
                return new wl21(ol21.valueOf(parcel.readString()));
            case 21:
                return new em21(parcel.readString());
            case 22:
                return new xp21(parcel.readString(), zo21.valueOf(parcel.readString()));
            case 23:
                return new gq21(parcel.readString());
            case 24:
                String string2 = parcel.readString();
                up60 up60VarMo54112b = string2 == null ? null : qpv0.f191387a.mo54112b(Class.forName(string2));
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    String string3 = parcel.readString();
                    arrayList.add(string3 == null ? null : qpv0.f191387a.mo54112b(Class.forName(string3)));
                }
                return new xs21(up60VarMo54112b, arrayList);
            case 25:
                return new f931(parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : e931.CREATOR.createFromParcel(parcel));
            case 26:
                return new e931(parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM31715d = 0;
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(zz10.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new t931(arrayList2, mkr.valueOf(parcel.readString()));
            case 28:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM31715d2 = 0;
                while (iM31715d2 != i7) {
                    iM31715d2 = c7h0.m31715d(hfz0.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new qb31(arrayList3);
            default:
                return new gc31(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f184781a) {
            case 0:
                return new r321[i];
            case 1:
                return new s321[i];
            case 2:
                return new y321[i];
            case 3:
                return new t321[i];
            case 4:
                return new u321[i];
            case 5:
                return new v321[i];
            case 6:
                return new w321[i];
            case 7:
                return new b421[i];
            case 8:
                return new k621[i];
            case 9:
                return new h621[i];
            case 10:
                return new i621[i];
            case 11:
                return new za21[i];
            case 12:
                return new wb21[i];
            case 13:
                return new pd21[i];
            case 14:
                return new qd21[i];
            case 15:
                return new sd21[i];
            case 16:
                return new td21[i];
            case 17:
                return new ok21[i];
            case 18:
                return new tl21[i];
            case 19:
                return new ul21[i];
            case 20:
                return new wl21[i];
            case 21:
                return new em21[i];
            case 22:
                return new xp21[i];
            case 23:
                return new gq21[i];
            case 24:
                return new xs21[i];
            case 25:
                return new f931[i];
            case 26:
                return new e931[i];
            case 27:
                return new t931[i];
            case 28:
                return new qb31[i];
            default:
                return new gc31[i];
        }
    }
}
