package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class ra90 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197239a;

    public /* synthetic */ ra90(int i) {
        this.f197239a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        switch (this.f197239a) {
            case 0:
                parcel.readInt();
                return sa90.f207161a;
            case 1:
                parcel.readInt();
                return ta90.f218523a;
            case 2:
                return new ua90(parcel.readInt());
            case 3:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(xa90.class, parcel, arrayList, iM9h, 1);
                }
                va90 va90Var = (va90) parcel.readParcelable(xa90.class.getClassLoader());
                long j = parcel.readLong();
                boolean z4 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(oa90.valueOf(parcel.readString()));
                }
                return new xa90(arrayList, va90Var, j, z4, linkedHashSet);
            case 4:
                parcel.readInt();
                return fb90.f67765a;
            case 5:
                return new hb90(parcel.readString());
            case 6:
                return new ib90(parcel.readInt() != 0);
            case 7:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z = true;
                    z3 = true;
                } else {
                    z = false;
                    z2 = false;
                    z3 = true;
                }
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z2 = z3;
                }
                if (parcel.readInt() == 0) {
                    z3 = z2;
                }
                return new sc90(string, string2, string3, z, j2, z2, z3, parcel.readString());
            case 8:
                parcel.readInt();
                return ud90.f229211a;
            case 9:
                return new yg90(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 10:
                return new ch90(yg90.CREATOR.createFromParcel(parcel), jj90.CREATOR.createFromParcel(parcel), li90.CREATOR.createFromParcel(parcel), ipk0.CREATOR.createFromParcel(parcel));
            case 11:
                return new li90(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new jj90(parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                fuz0 fuz0Var = (fuz0) parcel.readParcelable(rj90.class.getClassLoader());
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int iM9h2 = 0;
                while (iM9h2 != i7) {
                    iM9h2 = AbstractC0000a.m9h(rj90.class, parcel, arrayList2, iM9h2, 1);
                }
                return new rj90(fuz0Var, i5, i6, arrayList2, parcel.readFloat(), parcel.readFloat(), parcel.createStringArrayList(), parcel.readInt(), parcel.readString(), parcel.readString());
            case 14:
                parcel.readInt();
                return do90.f50992a;
            case 15:
                parcel.readInt();
                return eo90.f61346a;
            case 16:
                parcel.readInt();
                return fo90.f71476a;
            case 17:
                parcel.readInt();
                return go90.f82917a;
            case 18:
                parcel.readInt();
                return io90.f104160a;
            case 19:
                parcel.readInt();
                return jo90.f114374a;
            case 20:
                parcel.readInt();
                return uo90.f232359a;
            case 21:
                parcel.readInt();
                return vo90.f243430a;
            case 22:
                return new jt90(parcel.readString(), parcel.readInt() != 0);
            case 23:
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    i = 0;
                } else {
                    String string5 = parcel.readString();
                    if (string5 == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (!string5.equals("SHARE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.liveroom.livestreampage.InitialAction.".concat(string5));
                    }
                    i = 1;
                }
                return new ox90(string4, i);
            case 24:
                return new k3a0(parcel.readString());
            case 25:
                parcel.readInt();
                return l3a0.f129252a;
            case 26:
                parcel.readInt();
                return n3a0.f149985a;
            case 27:
                return new i8a0(parcel.readString());
            case 28:
                parcel.readInt();
                return w8a0.f248889a;
            default:
                return new x8a0((xkx0) parcel.readParcelable(x8a0.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f197239a) {
            case 0:
                return new sa90[i];
            case 1:
                return new ta90[i];
            case 2:
                return new ua90[i];
            case 3:
                return new xa90[i];
            case 4:
                return new fb90[i];
            case 5:
                return new hb90[i];
            case 6:
                return new ib90[i];
            case 7:
                return new sc90[i];
            case 8:
                return new ud90[i];
            case 9:
                return new yg90[i];
            case 10:
                return new ch90[i];
            case 11:
                return new li90[i];
            case 12:
                return new jj90[i];
            case 13:
                return new rj90[i];
            case 14:
                return new do90[i];
            case 15:
                return new eo90[i];
            case 16:
                return new fo90[i];
            case 17:
                return new go90[i];
            case 18:
                return new io90[i];
            case 19:
                return new jo90[i];
            case 20:
                return new uo90[i];
            case 21:
                return new vo90[i];
            case 22:
                return new jt90[i];
            case 23:
                return new ox90[i];
            case 24:
                return new k3a0[i];
            case 25:
                return new l3a0[i];
            case 26:
                return new n3a0[i];
            case 27:
                return new i8a0[i];
            case 28:
                return new w8a0[i];
            default:
                return new x8a0[i];
        }
    }
}
