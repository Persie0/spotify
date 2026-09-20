package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class nc51 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152438a;

    public /* synthetic */ nc51(int i) {
        this.f152438a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.f152438a) {
            case 0:
                parcel.readInt();
                return oc51.f163816a;
            case 1:
                parcel.readInt();
                return pc51.f175960a;
            case 2:
                parcel.readInt();
                return qc51.f187256a;
            case 3:
                return new pd51(parcel.readInt(), (rc51) parcel.readParcelable(pd51.class.getClassLoader()), parcel.readInt(), hdn0.valueOf(parcel.readString()), kb51.CREATOR.createFromParcel(parcel));
            case 4:
                la51 la51Var = (la51) parcel.readParcelable(zf51.class.getClassLoader());
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                hdn0 hdn0VarValueOf = hdn0.valueOf(parcel.readString());
                z6s0 z6s0VarValueOf = z6s0.valueOf(parcel.readString());
                boolean z = false;
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new zf51(la51Var, i5, i6, hdn0VarValueOf, z6s0VarValueOf, z3, z, z2, z, parcel.readInt() != 0, tu01.valueOf(parcel.readString()));
            case 5:
                parcel.readInt();
                return ng51.f153562a;
            case 6:
                return new ch51(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (voc1) parcel.readParcelable(ch51.class.getClassLoader()));
            case 7:
                return new ji51(parcel);
            case 8:
                return parcel.readString();
            case 9:
                return new tm51(parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
            case 10:
                return new um51(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new vm51(parcel.readString(), parcel.readInt());
            case 12:
                return new wm51(parcel.readString(), parcel.readString(), xm51.CREATOR.createFromParcel(parcel));
            case 13:
                return new xm51(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (zt91) parcel.readSerializable());
            case 14:
                return new zm51(parcel.readString(), parcel.readString(), xm51.CREATOR.createFromParcel(parcel));
            case 15:
                return new an51(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), xm51.CREATOR.createFromParcel(parcel));
            case 16:
                return new bn51(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), xm51.CREATOR.createFromParcel(parcel));
            case 17:
                return new cn51(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 18:
                return new dn51(parcel.readString(), xm51.CREATOR.createFromParcel(parcel));
            case 19:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("Loading")) {
                    i = 1;
                } else {
                    if (!string.equals("Empty")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.songdna.elements.trackliststatuselement.TrackListStatusElement.Status.".concat(string));
                    }
                    i = 2;
                }
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("Popular")) {
                    i2 = 1;
                } else {
                    if (!string2.equals("Collaboration")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.songdna.elements.trackliststatuselement.TrackListStatusElement.TrackType.".concat(string2));
                    }
                    i2 = 2;
                }
                return new en51(i, i2, parcel.readInt());
            case 20:
                return new fn51(parcel.readInt(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), xm51.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.readInt();
                return new fo51();
            case 22:
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("Loop")) {
                    i3 = 1;
                } else if (string3.equals("Spinback")) {
                    i3 = 2;
                } else {
                    if (!string3.equals("VinylStop")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.playlistmixing.model.StyleBlockType.".concat(string3));
                    }
                    i3 = 3;
                }
                return new kq51(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), i3);
            case 23:
                return mq51.valueOf(parcel.readString());
            case 24:
                return new ss51(parcel.readString(), parcel.readString(), parcel.readString(), (d0n0) parcel.readParcelable(ss51.class.getClassLoader()), (b370) parcel.readParcelable(ss51.class.getClassLoader()), parcel.readString(), (dlx) parcel.readParcelable(ss51.class.getClassLoader()));
            case 25:
                return new pt51(parcel.readString(), parcel.readInt() == 0 ? null : jtk0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? hjr0.CREATOR.createFromParcel(parcel) : null);
            case 26:
                return new uu51((voc1) parcel.readParcelable(uu51.class.getClassLoader()), parcel.readString(), (zam0) parcel.readValue(uu51.class.getClassLoader()), parcel.readInt() != 0);
            case 27:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("None")) {
                    i4 = 1;
                } else {
                    if (!string6.equals("AutoGenerated")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.betamax.subtitlesimpl.element.SubtitlesPageElement.LanguageSuffix.".concat(string6));
                    }
                    i4 = 2;
                }
                return new wx51(string4, string5, z4, i4);
            case 28:
                String string7 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i7);
                int iM31715d = 0;
                while (iM31715d != i7) {
                    iM31715d = c7h0.m31715d(wx51.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new xx51(string7, arrayList);
            default:
                return new my51(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f152438a) {
            case 0:
                return new oc51[i];
            case 1:
                return new pc51[i];
            case 2:
                return new qc51[i];
            case 3:
                return new pd51[i];
            case 4:
                return new zf51[i];
            case 5:
                return new ng51[i];
            case 6:
                return new ch51[i];
            case 7:
                return new ji51[i];
            case 8:
                return new String[i];
            case 9:
                return new tm51[i];
            case 10:
                return new um51[i];
            case 11:
                return new vm51[i];
            case 12:
                return new wm51[i];
            case 13:
                return new xm51[i];
            case 14:
                return new zm51[i];
            case 15:
                return new an51[i];
            case 16:
                return new bn51[i];
            case 17:
                return new cn51[i];
            case 18:
                return new dn51[i];
            case 19:
                return new en51[i];
            case 20:
                return new fn51[i];
            case 21:
                return new fo51[i];
            case 22:
                return new kq51[i];
            case 23:
                return new mq51[i];
            case 24:
                return new ss51[i];
            case 25:
                return new pt51[i];
            case 26:
                return new uu51[i];
            case 27:
                return new wx51[i];
            case 28:
                return new xx51[i];
            default:
                return new my51[i];
        }
    }
}
