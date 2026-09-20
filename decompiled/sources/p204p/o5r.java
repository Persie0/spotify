package p204p;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o5r implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162055a;

    public /* synthetic */ o5r(int i) {
        this.f162055a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Boolean boolValueOf;
        int i;
        switch (this.f162055a) {
            case 0:
                p5r p5rVar = new p5r();
                p5rVar.f174208a = parcel.readString();
                p5rVar.f174209b = parcel.readString();
                p5rVar.f174210c = parcel.readString();
                p5rVar.f174211d = parcel.readLong();
                p5rVar.f174212e = parcel.readLong();
                return p5rVar;
            case 1:
                return new s5r(parcel);
            case 2:
                l6r l6rVar = new l6r();
                l6rVar.m58385c(parcel);
                return l6rVar;
            case 3:
                o6r o6rVar = new o6r();
                int iDataPosition = parcel.dataPosition();
                int i2 = parcel.readInt();
                try {
                    if (i2 < 4) {
                        throw new BadParcelableException("Parcelable too small");
                    }
                    if (parcel.dataPosition() - iDataPosition < i2) {
                        o6rVar.f162403a = parcel.readString();
                        if (parcel.dataPosition() - iDataPosition < i2) {
                            o6rVar.f162404b = parcel.readString();
                            if (parcel.dataPosition() - iDataPosition < i2) {
                                o6rVar.f162405c = parcel.readLong();
                                if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i2) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                                parcel.setDataPosition(iDataPosition + i2);
                            } else {
                                if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i2) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                                parcel.setDataPosition(iDataPosition + i2);
                            }
                        } else {
                            if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i2) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                            parcel.setDataPosition(iDataPosition + i2);
                        }
                    } else {
                        if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i2) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel.setDataPosition(iDataPosition + i2);
                    }
                    return o6rVar;
                } catch (Throwable th) {
                    if (iDataPosition > Alert.DURATION_SHOW_INDEFINITELY - i2) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                    parcel.setDataPosition(iDataPosition + i2);
                    throw th;
                }
            case 4:
                return new y7r(z7r.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : o86.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 5:
                return new a8r(c8r.valueOf(parcel.readString()));
            case 6:
                return new b8r(z7r.valueOf(parcel.readString()), (o86) parcel.readParcelable(b8r.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 7:
                return new t9r(parcel.readString(), parcel.readInt() != 0);
            case 8:
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                f5r f5rVarCreateFromParcel = f5r.CREATOR.createFromParcel(parcel);
                a1x0 a1x0VarCreateFromParcel = a1x0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = true;
                    z2 = true;
                } else {
                    z = true;
                    z2 = z3;
                }
                return new fgr(z4, z3, f5rVarCreateFromParcel, a1x0VarCreateFromParcel, z2, parcel.readInt() != 0 ? z : false, parcel.readLong());
            case 9:
                parcel.readInt();
                return shr.f209251a;
            case 10:
                return new uhr(parcel.readString());
            case 11:
                return new whr(parcel.readString());
            case 12:
                return new mmr(parcel.readString());
            case 13:
                return new wnr(parcel.readString());
            case 14:
                return new xnr(parcel.readString());
            case 15:
                return new cpr(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new epr(parcel.readInt(), (f931) parcel.readParcelable(epr.class.getClassLoader()));
            case 17:
                String string = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                int iM75732f = 0;
                while (iM75732f != i3) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new jpr(string, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 18:
                String string2 = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
                int iM75732f2 = 0;
                while (iM75732f2 != i4) {
                    iM75732f2 = rkh0.m75732f(parcel, linkedHashMap2, parcel.readString(), iM75732f2, 1);
                }
                return new kpr(string2, linkedHashMap2, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 19:
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i5);
                int iM75732f3 = 0;
                while (true) {
                    if (iM75732f3 == i5) {
                        return new lpr(linkedHashMap3, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                    }
                    iM75732f3 = rkh0.m75732f(parcel, linkedHashMap3, parcel.readString(), iM75732f3, 1);
                }
                break;
            case 20:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i6);
                int iM75732f4 = 0;
                while (iM75732f4 != i6) {
                    iM75732f4 = rkh0.m75732f(parcel, linkedHashMap4, parcel.readString(), iM75732f4, 1);
                }
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new mpr(string3, string4, linkedHashMap4, z5, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 21:
                String string5 = parcel.readString();
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(i7);
                int iM75732f5 = 0;
                while (iM75732f5 != i7) {
                    iM75732f5 = rkh0.m75732f(parcel, linkedHashMap5, parcel.readString(), iM75732f5, 1);
                }
                return new npr(string5, linkedHashMap5, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 22:
                String string6 = parcel.readString();
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i8);
                int iM75732f6 = 0;
                while (iM75732f6 != i8) {
                    iM75732f6 = rkh0.m75732f(parcel, linkedHashMap6, parcel.readString(), iM75732f6, 1);
                }
                return new opr(string6, linkedHashMap6, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 23:
                return new err(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 24:
                return new nvr(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C2125mf.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : u17.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? w17.CREATOR.createFromParcel(parcel) : null);
            case 25:
                parcel.readInt();
                return cyr.f43342a;
            case 26:
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("VOICE")) {
                    i = 1;
                } else {
                    if (!string7.equals("TEXT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.endless.sillywalk.interactivitynavigator.InteractivityContainerNavigator.InputMode.".concat(string7));
                    }
                    i = 2;
                }
                return new kzr(i);
            case 27:
                return new k5s(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new k8s(parcel.readString(), parcel.readString());
            default:
                return new j9s(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f162055a) {
            case 0:
                return new p5r[i];
            case 1:
                return new s5r[i];
            case 2:
                return new l6r[i];
            case 3:
                return new o6r[i];
            case 4:
                return new y7r[i];
            case 5:
                return new a8r[i];
            case 6:
                return new b8r[i];
            case 7:
                return new t9r[i];
            case 8:
                return new fgr[i];
            case 9:
                return new shr[i];
            case 10:
                return new uhr[i];
            case 11:
                return new whr[i];
            case 12:
                return new mmr[i];
            case 13:
                return new wnr[i];
            case 14:
                return new xnr[i];
            case 15:
                return new cpr[i];
            case 16:
                return new epr[i];
            case 17:
                return new jpr[i];
            case 18:
                return new kpr[i];
            case 19:
                return new lpr[i];
            case 20:
                return new mpr[i];
            case 21:
                return new npr[i];
            case 22:
                return new opr[i];
            case 23:
                return new err[i];
            case 24:
                return new nvr[i];
            case 25:
                return new cyr[i];
            case 26:
                return new kzr[i];
            case 27:
                return new k5s[i];
            case 28:
                return new k8s[i];
            default:
                return new j9s[i];
        }
    }
}
