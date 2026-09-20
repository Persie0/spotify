package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class w270 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247259a;

    public /* synthetic */ w270(int i) {
        this.f247259a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f247259a) {
            case 0:
                return new x270(parcel.readString());
            case 1:
                return new y270(parcel.readString());
            case 2:
                return new z270((h891) parcel.readParcelable(z270.class.getClassLoader()));
            case 3:
                return new p370(parcel.readString(), (h891) parcel.readParcelable(p370.class.getClassLoader()), parcel.readString(), parcel.readString(), (b370) parcel.readParcelable(p370.class.getClassLoader()), (dlx) parcel.readParcelable(p370.class.getClassLoader()), parcel.readInt() != 0);
            case 4:
                return new o670(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 5:
                return new ne70(parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new oe70(string, string2, string3, string4, z, parcel.readInt() != 0, parcel.readInt() == 0 ? null : ne70.CREATOR.createFromParcel(parcel));
            case 7:
                return new bf70(parcel.readString(), parcel.readString());
            case 8:
                return new ff70(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 9:
                return new tf70(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 10:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(ff70.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new jg70(string5, string6, arrayList, parcel.readInt() != 0);
            case 11:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(tf70.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("TYPED")) {
                    i = 1;
                } else {
                    if (!string8.equals("LEGACY_CALLBACK")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.languagepicker.page.LanguagePickerResultDeliveryMode.".concat(string8));
                    }
                    i = 2;
                }
                return new ng70(string7, i, arrayList2);
            case 12:
                return new qg70(parcel.readString());
            case 13:
                return new rg70(parcel.readString());
            case 14:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d3 = 0;
                while (iM31715d3 != i4) {
                    iM31715d3 = c7h0.m31715d(ul70.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new fl70(string9, string10, string11, arrayList3, parcel.readInt() == 0 ? null : pjn0.CREATOR.createFromParcel(parcel));
            case 15:
                return new kl70(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new ll70(parcel.readString(), kl70.CREATOR.createFromParcel(parcel), parcel.readString());
            case 17:
                return new tl70(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            case 18:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                boolean z2 = true;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                int iM75732f = 0;
                while (iM75732f != i5) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new ul70(string12, string13, z2, linkedHashMap, parcel.readInt() != 0 ? z2 : false, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (b791) parcel.readParcelable(ul70.class.getClassLoader()));
            case 19:
                return new sm70(parcel.readString());
            case 20:
                return new tm70(parcel.readString());
            case 21:
                return new um70(parcel.readString(), (p0k) parcel.readParcelable(um70.class.getClassLoader()), (z650) parcel.readSerializable());
            case 22:
                parcel.readInt();
                return vm70.f242715a;
            case 23:
                return new wm70(parcel.readString());
            case 24:
                return new nz70(parcel.readString(), parcel.readString(), parcel.readString(), (duf) parcel.readParcelable(nz70.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), a831.m25027s(parcel.readString()));
            case 25:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM31715d4 = 0;
                while (iM31715d4 != i6) {
                    iM31715d4 = c7h0.m31715d(nz70.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                return new oz70(arrayList4, parcel.readInt() == 0 ? null : nz70.CREATOR.createFromParcel(parcel), parcel.readString());
            case 26:
                return new j580(parcel.readInt(), parcel.readInt(), (agr0) parcel.readParcelable(j580.class.getClassLoader()), (b370) parcel.readParcelable(j580.class.getClassLoader()), (dlx) parcel.readParcelable(j580.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                return new k580((b370) parcel.readParcelable(k580.class.getClassLoader()), (agr0) parcel.readParcelable(k580.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (dlx) parcel.readParcelable(k580.class.getClassLoader()));
            case 28:
                return new l580(m580.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            default:
                return m580.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f247259a) {
            case 0:
                return new x270[i];
            case 1:
                return new y270[i];
            case 2:
                return new z270[i];
            case 3:
                return new p370[i];
            case 4:
                return new o670[i];
            case 5:
                return new ne70[i];
            case 6:
                return new oe70[i];
            case 7:
                return new bf70[i];
            case 8:
                return new ff70[i];
            case 9:
                return new tf70[i];
            case 10:
                return new jg70[i];
            case 11:
                return new ng70[i];
            case 12:
                return new qg70[i];
            case 13:
                return new rg70[i];
            case 14:
                return new fl70[i];
            case 15:
                return new kl70[i];
            case 16:
                return new ll70[i];
            case 17:
                return new tl70[i];
            case 18:
                return new ul70[i];
            case 19:
                return new sm70[i];
            case 20:
                return new tm70[i];
            case 21:
                return new um70[i];
            case 22:
                return new vm70[i];
            case 23:
                return new wm70[i];
            case 24:
                return new nz70[i];
            case 25:
                return new oz70[i];
            case 26:
                return new j580[i];
            case 27:
                return new k580[i];
            case 28:
                return new l580[i];
            default:
                return new m580[i];
        }
    }
}
