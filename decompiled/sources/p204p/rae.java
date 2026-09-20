package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class rae implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197291a;

    public /* synthetic */ rae(int i) {
        this.f197291a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f197291a) {
            case 0:
                return new sae(parcel.readString(), (sv50) parcel.readParcelable(sae.class.getClassLoader()));
            case 1:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Parcelable.Creator<o6e> creator = o6e.CREATOR;
                return new tae(string, string2, string3, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (yjc) parcel.readParcelable(tae.class.getClassLoader()), parcel.readInt() == 0 ? null : jae.CREATOR.createFromParcel(parcel));
            case 2:
                return new kee(parcel.readString(), parcel.readInt() != 0);
            case 3:
                return new afe(parcel.readString(), parcel.readString());
            case 4:
                return new cke(parcel);
            case 5:
                return new ume(((mu71) parcel.readParcelable(ume.class.getClassLoader())).f147265a, ((mu71) parcel.readParcelable(ume.class.getClassLoader())).f147265a, parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new ene(parcel.readString(), parcel.createStringArrayList());
            case 7:
                return new zne(parcel.readString());
            case 8:
                return new lre(parcel.readString(), parcel.readString());
            case 9:
                return new xye(parcel.readInt() != 0);
            case 10:
                return new k2f(parcel.readString());
            case 11:
                return new s7f(wab0.CREATOR.createFromParcel(parcel), sbb0.CREATOR.createFromParcel(parcel));
            case 12:
                return new w7f(rfg1.m75432b(parcel.readInt()), rfg1.m75432b(parcel.readInt()), rfg1.m75432b(parcel.readInt()), rfg1.m75432b(parcel.readInt()), rfg1.m75432b(parcel.readInt()));
            case 13:
                return new b8f(parcel.readInt(), parcel.readInt());
            case 14:
                return new c8f(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 15:
                return new ajf(parcel.readString(), parcel.readString());
            case 16:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new qmf(string4, string5, z, parcel.readInt() != 0, (xm70) parcel.readParcelable(qmf.class.getClassLoader()));
            case 17:
                return new ztf(parcel.readInt());
            case 18:
                parcel.readInt();
                return auf.f19927a;
            case 19:
                parcel.readInt();
                return buf.f31129a;
            case 20:
                return new cuf(parcel.readInt());
            case 21:
                return new cqh(parcel.readString(), parcel.readString());
            case 22:
                return new yrh(parcel.readString(), parcel.readString(), parcel.readString(), (avo0) ((Parcelable) parcel.readTypedObject(avo0.CREATOR)));
            case 23:
                String string6 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(tth.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new auh(string6, arrayList);
            case 24:
                return new kuh(parcel.readString(), eoo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 25:
                return new ouh(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (h2i) parcel.readParcelable(ouh.class.getClassLoader()));
            case 26:
                return new hyh(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : hto.valueOf(parcel.readString()));
            case 27:
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("UNSPECIFIED")) {
                    i = 1;
                } else if (string7.equals("RESERVED")) {
                    i = 2;
                } else if (string7.equals("FCFS")) {
                    i = 3;
                } else if (string7.equals("WAITLISTED")) {
                    i = 4;
                } else if (string7.equals("PURCHASED")) {
                    i = 5;
                } else if (string7.equals("INELIGIBLE")) {
                    i = 6;
                } else if (string7.equals("SOLD_OUT")) {
                    i = 7;
                } else if (string7.equals("CANCELLED")) {
                    i = 8;
                } else {
                    if (!string7.equals("SALE_ENDED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.ConcertCampaignStatus.".concat(string7));
                    }
                    i = 9;
                }
                return new uyh(i, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 28:
                parcel.readInt();
                return d2i.f44568a;
            default:
                return new e2i(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f197291a) {
            case 0:
                return new sae[i];
            case 1:
                return new tae[i];
            case 2:
                return new kee[i];
            case 3:
                return new afe[i];
            case 4:
                return new cke[i];
            case 5:
                return new ume[i];
            case 6:
                return new ene[i];
            case 7:
                return new zne[i];
            case 8:
                return new lre[i];
            case 9:
                return new xye[i];
            case 10:
                return new k2f[i];
            case 11:
                return new s7f[i];
            case 12:
                return new w7f[i];
            case 13:
                return new b8f[i];
            case 14:
                return new c8f[i];
            case 15:
                return new ajf[i];
            case 16:
                return new qmf[i];
            case 17:
                return new ztf[i];
            case 18:
                return new auf[i];
            case 19:
                return new buf[i];
            case 20:
                return new cuf[i];
            case 21:
                return new cqh[i];
            case 22:
                return new yrh[i];
            case 23:
                return new auh[i];
            case 24:
                return new kuh[i];
            case 25:
                return new ouh[i];
            case 26:
                return new hyh[i];
            case 27:
                return new uyh[i];
            case 28:
                return new d2i[i];
            default:
                return new e2i[i];
        }
    }
}
