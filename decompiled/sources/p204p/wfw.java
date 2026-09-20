package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class wfw implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250915a;

    public /* synthetic */ wfw(int i) {
        this.f250915a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        s6j0 s6j0Var;
        int i;
        int i2;
        switch (this.f250915a) {
            case 0:
                parcel.readInt();
                return xfw.f261107a;
            case 1:
                parcel.readInt();
                return yfw.f272359a;
            case 2:
                s6j0 s6j0Var2 = null;
                if (parcel.readInt() != 0) {
                    Serializable serializable = parcel.readSerializable();
                    kbm0 kbm0Var = serializable instanceof kbm0 ? (kbm0) serializable : null;
                    if (kbm0Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string = parcel.readString();
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    s6j0Var2 = new s6j0(kbm0Var, new r6j0(string, parcel.readString(), parcel.readString()), parcel.readInt() != 0, 4);
                }
                return new bsw(s6j0Var2);
            case 3:
                s6j0 s6j0Var3 = null;
                if (parcel.readInt() != 0) {
                    Serializable serializable2 = parcel.readSerializable();
                    kbm0 kbm0Var2 = serializable2 instanceof kbm0 ? (kbm0) serializable2 : null;
                    if (kbm0Var2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = parcel.readString();
                    if (string2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    s6j0Var3 = new s6j0(kbm0Var2, new r6j0(string2, parcel.readString(), parcel.readString()), parcel.readInt() != 0, 4);
                }
                return new csw(s6j0Var3);
            case 4:
                return new hsw(parcel.readString());
            case 5:
                return new mvw((z650) parcel.readSerializable());
            case 6:
                return new zvw(igg1.m50537p(parcel));
            case 7:
                if (parcel.readInt() != 0) {
                    Serializable serializable3 = parcel.readSerializable();
                    kbm0 kbm0Var3 = serializable3 instanceof kbm0 ? (kbm0) serializable3 : null;
                    if (kbm0Var3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string3 = parcel.readString();
                    if (string3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    s6j0Var = new s6j0(kbm0Var3, new r6j0(string3, parcel.readString(), parcel.readString()), parcel.readInt() != 0, 4);
                } else {
                    s6j0Var = null;
                }
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(ehg1.m38970j(parcel));
                }
                return new eww(s6j0Var, arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 8:
                return new fww(igg1.m50537p(parcel));
            case 9:
                return new h5x(parcel.readLong(), parcel.readString(), parcel.readString());
            case 10:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                d510 d510Var = (d510) parcel.readParcelable(qcx.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM9h = 0;
                while (iM9h != i5) {
                    iM9h = AbstractC0000a.m9h(qcx.class, parcel, arrayList2, iM9h, 1);
                }
                return new qcx(string4, string5, d510Var, arrayList2);
            case 11:
                parcel.readInt();
                return aix.f16102b;
            case 12:
                parcel.readInt();
                return bix.f27558b;
            case 13:
                parcel.readInt();
                return blx.f28299a;
            case 14:
                return new clx(parcel.readString());
            case 15:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("Idle")) {
                    i = 1;
                } else if (string9.equals("Replacing")) {
                    i = 2;
                } else {
                    if (!string9.equals("Replaced")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.playlistmixing.extendedversionspage.domain.ReplacementState.".concat(string9));
                    }
                    i = 3;
                }
                return new rsx(i, string6, string7, z, string8);
            case 16:
                return new r0y(parcel.readInt(), parcel.readString(), parcel.readString());
            case 17:
                return new j6y(parcel.readString(), parcel.readString(), parcel.readString(), (i6y) parcel.readParcelable(j6y.class.getClassLoader()));
            case 18:
                return new g6y(parcel.readInt());
            case 19:
                return new h6y(parcel.readInt());
            case 20:
                return new m6y(parcel.readInt());
            case 21:
                parcel.readInt();
                return n6y.f150981a;
            case 22:
                parcel.readInt();
                return o6y.f162437a;
            case 23:
                parcel.readInt();
                return y6y.f269914a;
            case 24:
                parcel.readInt();
                return z6y.f280015a;
            case 25:
                parcel.readInt();
                return a7y.f13147a;
            case 26:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string13 = parcel.readString();
                p6y p6yVar = (p6y) parcel.readParcelable(d7y.class.getClassLoader());
                String string14 = parcel.readString();
                if (string14 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string14.equals("FACE")) {
                    i2 = 1;
                } else if (string14.equals("BACK_BUTTON")) {
                    i2 = 2;
                } else {
                    if (!string14.equals("NONE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.profile.elements.faceheader.api.FaceHeaderElement.IconType.".concat(string14));
                    }
                    i2 = 3;
                }
                return new d7y(string10, string11, string12, numValueOf, string13, p6yVar, i2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (b7y) parcel.readParcelable(d7y.class.getClassLoader()), parcel.createStringArrayList());
            case 27:
                return new q7y(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new r7y(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new s7y(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f250915a) {
            case 0:
                return new xfw[i];
            case 1:
                return new yfw[i];
            case 2:
                return new bsw[i];
            case 3:
                return new csw[i];
            case 4:
                return new hsw[i];
            case 5:
                return new mvw[i];
            case 6:
                return new zvw[i];
            case 7:
                return new eww[i];
            case 8:
                return new fww[i];
            case 9:
                return new h5x[i];
            case 10:
                return new qcx[i];
            case 11:
                return new aix[i];
            case 12:
                return new bix[i];
            case 13:
                return new blx[i];
            case 14:
                return new clx[i];
            case 15:
                return new rsx[i];
            case 16:
                return new r0y[i];
            case 17:
                return new j6y[i];
            case 18:
                return new g6y[i];
            case 19:
                return new h6y[i];
            case 20:
                return new m6y[i];
            case 21:
                return new n6y[i];
            case 22:
                return new o6y[i];
            case 23:
                return new y6y[i];
            case 24:
                return new z6y[i];
            case 25:
                return new a7y[i];
            case 26:
                return new d7y[i];
            case 27:
                return new q7y[i];
            case 28:
                return new r7y[i];
            default:
                return new s7y[i];
        }
    }
}
