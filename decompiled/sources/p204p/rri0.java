package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class rri0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202064a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        dd41 dd41VarM74726U;
        int i;
        switch (this.f202064a) {
            case 0:
                return new sri0(parcel.readString(), parcel.readString());
            case 1:
                return new tri0(parcel.readString());
            case 2:
                return new uri0(parcel.readInt() != 0);
            case 3:
                return new usi0(parcel.readInt() != 0);
            case 4:
                return new mui0((lui0) parcel.readParcelable(mui0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (AbstractC1808eb) parcel.readParcelable(mui0.class.getClassLoader()));
            case 5:
                parcel.readInt();
                return jui0.f116116b;
            case 6:
                return new kui0(parcel.readString());
            case 7:
                return new wxi0(parcel);
            case 8:
                return new n1j0(parcel.readString(), parcel.readString());
            case 9:
                wwu wwuVar = (wwu) parcel.readParcelable(p3j0.class.getClassLoader());
                int i2 = parcel.readInt();
                voc1 voc1Var = (voc1) parcel.readParcelable(p3j0.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                return new p3j0(wwuVar, i2, voc1Var, z2, parcel.readInt() == 0 ? z : true);
            case 10:
                parcel.readInt();
                return b5j0.f23599a;
            case 11:
                parcel.readInt();
                return c5j0.f34195a;
            case 12:
                return new d5j0((Intent) parcel.readParcelable(d5j0.class.getClassLoader()));
            case 13:
                return new v8j0(parcel.readString(), parcel.readBundle(v8j0.class.getClassLoader()));
            case 14:
                b3j0 b3j0VarM50537p = igg1.m50537p(parcel);
                int iM75742p = rkh0.m75742p(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(ehg1.m38970j(parcel));
                }
                return new y8j0(b3j0VarM50537p, iM75742p, z3, arrayList);
            case 15:
                String string = parcel.readString();
                if (string != null) {
                    Set set = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(string);
                } else {
                    dd41VarM74726U = null;
                }
                return new w9j0(dd41VarM74726U);
            case 16:
                parcel.readInt();
                return naj0.f152081a;
            case 17:
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("CAST")) {
                    i = 1;
                } else if (string2.equals("SPEAKER")) {
                    i = 2;
                } else if (string2.equals("GAME_CONSOLE")) {
                    i = 3;
                } else if (string2.equals("TV")) {
                    i = 4;
                } else if (string2.equals("AVR")) {
                    i = 5;
                } else if (string2.equals("HOME_THING")) {
                    i = 6;
                } else if (string2.equals("AUTOMOBILE")) {
                    i = 7;
                } else {
                    if (!string2.equals("HEADPHONES")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.nearbydevicespermissions.usecase.api.NearbyDevicesPermissionAction.Trigger.DeviceConnected.Type.".concat(string2));
                    }
                    i = 8;
                }
                return new oaj0(i);
            case 18:
                parcel.readInt();
                return paj0.f175544a;
            case 19:
                parcel.readInt();
                return qaj0.f186892a;
            case 20:
                parcel.readInt();
                return raj0.f197334a;
            case 21:
                parcel.readInt();
                return saj0.f207223a;
            case 22:
                return new ecj0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 23:
                return new gcj0(ecj0.CREATOR.createFromParcel(parcel));
            case 24:
                return new gdj0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (taj0) parcel.readParcelable(gdj0.class.getClassLoader()));
            case 25:
                return new idj0(gdj0.CREATOR.createFromParcel(parcel));
            case 26:
                int i5 = parcel.readInt();
                String string3 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM31715d = 0;
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(qdj0.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new rdj0(i5, string3, arrayList2, parcel.readInt() != 0, (taj0) parcel.readParcelable(rdj0.class.getClassLoader()), parcel.readInt() != 0);
            case 27:
                return new qdj0((wwu) parcel.readParcelable(qdj0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 28:
                return new tdj0(rdj0.CREATOR.createFromParcel(parcel));
            default:
                parcel.readInt();
                return kfj0.f122177a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f202064a) {
            case 0:
                return new sri0[i];
            case 1:
                return new tri0[i];
            case 2:
                return new uri0[i];
            case 3:
                return new usi0[i];
            case 4:
                return new mui0[i];
            case 5:
                return new jui0[i];
            case 6:
                return new kui0[i];
            case 7:
                return new wxi0[i];
            case 8:
                return new n1j0[i];
            case 9:
                return new p3j0[i];
            case 10:
                return new b5j0[i];
            case 11:
                return new c5j0[i];
            case 12:
                return new d5j0[i];
            case 13:
                return new v8j0[i];
            case 14:
                return new y8j0[i];
            case 15:
                return new w9j0[i];
            case 16:
                return new naj0[i];
            case 17:
                return new oaj0[i];
            case 18:
                return new paj0[i];
            case 19:
                return new qaj0[i];
            case 20:
                return new raj0[i];
            case 21:
                return new saj0[i];
            case 22:
                return new ecj0[i];
            case 23:
                return new gcj0[i];
            case 24:
                return new gdj0[i];
            case 25:
                return new idj0[i];
            case 26:
                return new rdj0[i];
            case 27:
                return new qdj0[i];
            case 28:
                return new tdj0[i];
            default:
                return new kfj0[i];
        }
    }
}
