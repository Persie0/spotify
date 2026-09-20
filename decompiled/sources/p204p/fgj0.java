package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fgj0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69333a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f69333a) {
            case 0:
                ggj0 ggj0Var = new ggj0(parcel);
                ggj0Var.f79686a = parcel.readInt();
                return ggj0Var;
            case 1:
                return new qij0(parcel.readLong());
            case 2:
                return new xij0(parcel.readString(), parcel.readBundle(xij0.class.getClassLoader()));
            case 3:
                return new jnj0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new cqj0(parcel.readInt() != 0, parcel.readString(), parcel.readString(), dqj0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 5:
                return new dqj0(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 6:
                return new zrj0(parcel.readString());
            case 7:
                parcel.readInt();
                return asj0.f19465a;
            case 8:
                return new vsj0(parcel.readString(), m70.valueOf(parcel.readString()));
            case 9:
                return new lvj0(parcel.readString(), parcel.readString());
            case 10:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(ira1.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new ovj0(arrayList);
            case 11:
                parcel.readInt();
                return pvj0.INSTANCE;
            case 12:
                return new svj0(ira1.CREATOR.createFromParcel(parcel), lvj0.CREATOR.createFromParcel(parcel));
            case 13:
                return fyj0.valueOf(parcel.readString());
            case 14:
                return new q0k0(parcel.readString(), (fyj0) parcel.readParcelable(q0k0.class.getClassLoader()));
            case 15:
                return new r0k0(parcel.readInt() != 0, parcel.readString());
            case 16:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d2 = 0;
                while (iM31715d2 != i4) {
                    iM31715d2 = c7h0.m31715d(qsj0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new w0k0(parcel.readString(), parcel.readString(), arrayList2);
            case 17:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("CDP_ALBUM")) {
                    i = 1;
                } else if (string5.equals("LE_EVENT")) {
                    i = 2;
                } else if (string5.equals("LE_ARTIST_EVENTS")) {
                    i = 3;
                } else if (string5.equals("NOTIFICATION_PREFERENCE_SETTINGS_TOGGLE")) {
                    i = 4;
                } else if (string5.equals("AUDIOBOOK_PRERELEASE_PRESAVE_BUTTON")) {
                    i = 5;
                } else if (string5.equals("NPV_PRERELEASE_PRESAVE_BUTTON")) {
                    i = 6;
                } else if (string5.equals("MARQUEE_PRERELEASE_PRESAVE_BUTTON")) {
                    i = 7;
                } else {
                    if (!string5.equals("MESSAGING_NOTIFICATION_OPT_IN_NUDGE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.notifications.permissions.NotificationPermissionDialogReason.".concat(string5));
                    }
                    i = 8;
                }
                return new y0k0(i, string, string2, string3, string4);
            case 18:
                parcel.readInt();
                return c4k0.f33969a;
            case 19:
                return new d4k0(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z = false;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("Track")) {
                    i2 = 1;
                } else if (string9.equals("Episode")) {
                    i2 = 2;
                } else if (string9.equals("Ad")) {
                    i2 = 3;
                } else {
                    if (!string9.equals("Unknown")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.xrprojected.ui.model.TrackType.".concat(string9));
                    }
                    i2 = 4;
                }
                String string10 = parcel.readString();
                int i5 = i2;
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                boolean z3 = true;
                double d = parcel.readDouble();
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new mhk0(string6, string7, string8, z, z2, i5, string10, j, j2, j3, d, z3, z3, z3, z3);
            case 21:
                return new ipk0(parcel.readString());
            case 22:
                return new nsk0(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 23:
                return new btk0((atk0) parcel.readParcelable(btk0.class.getClassLoader()));
            case 24:
                return new ysk0((agw) parcel.readParcelable(ysk0.class.getClassLoader()));
            case 25:
                return new zsk0(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 26:
                return new jtk0(parcel.readString(), parcel.readString());
            case 27:
                return new cuk0(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 28:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                boolean z4 = true;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new duk0(string11, string12, string13, arrayListCreateStringArrayList, z4, parcel.readInt() != 0);
            default:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                boolean z5 = false;
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new pxk0(string14, string15, string16, z5, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f69333a) {
            case 0:
                return new ggj0[i];
            case 1:
                return new qij0[i];
            case 2:
                return new xij0[i];
            case 3:
                return new jnj0[i];
            case 4:
                return new cqj0[i];
            case 5:
                return new dqj0[i];
            case 6:
                return new zrj0[i];
            case 7:
                return new asj0[i];
            case 8:
                return new vsj0[i];
            case 9:
                return new lvj0[i];
            case 10:
                return new ovj0[i];
            case 11:
                return new pvj0[i];
            case 12:
                return new svj0[i];
            case 13:
                return new fyj0[i];
            case 14:
                return new q0k0[i];
            case 15:
                return new r0k0[i];
            case 16:
                return new w0k0[i];
            case 17:
                return new y0k0[i];
            case 18:
                return new c4k0[i];
            case 19:
                return new d4k0[i];
            case 20:
                return new mhk0[i];
            case 21:
                return new ipk0[i];
            case 22:
                return new nsk0[i];
            case 23:
                return new btk0[i];
            case 24:
                return new ysk0[i];
            case 25:
                return new zsk0[i];
            case 26:
                return new jtk0[i];
            case 27:
                return new cuk0[i];
            case 28:
                return new duk0[i];
            default:
                return new pxk0[i];
        }
    }
}
