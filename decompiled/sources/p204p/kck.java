package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class kck implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121504a;

    public /* synthetic */ kck(int i) {
        this.f121504a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f121504a) {
            case 0:
                return new lck(parcel.readInt() != 0);
            case 1:
                parcel.readInt();
                return mck.f142173a;
            case 2:
                return new sfk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new jgk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new pgk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new tgk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new dhk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new ehk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new khk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                parcel.readInt();
                return qjk.f189264a;
            case 10:
                parcel.readInt();
                return rjk.f199844a;
            case 11:
                parcel.readInt();
                return tjk.f220940a;
            case 12:
                parcel.readInt();
                return ujk.f231048a;
            case 13:
                parcel.readInt();
                return vjk.f242006a;
            case 14:
                parcel.readInt();
                return wjk.f251980a;
            case 15:
                Parcelable.Creator<pla1> creator = pla1.CREATOR;
                return new akk(creator.createFromParcel(parcel), (sjk) parcel.readParcelable(akk.class.getClassLoader()), (xjk) parcel.readParcelable(akk.class.getClassLoader()), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            case 16:
                return new ckk(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : gkk.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                return new cpk(parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new crk((b370) parcel.readParcelable(crk.class.getClassLoader()), parcel.readInt() != 0, (voc1) parcel.readParcelable(crk.class.getClassLoader()), (hrk) parcel.readParcelable(crk.class.getClassLoader()));
            case 19:
                return new drk((b370) parcel.readParcelable(drk.class.getClassLoader()), (voc1) parcel.readParcelable(drk.class.getClassLoader()));
            case 20:
                parcel.readInt();
                return erk.f62143a;
            case 21:
                parcel.readInt();
                return frk.f72497a;
            case 22:
                parcel.readInt();
                return grk.f83776a;
            case 23:
                return new mwk(parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(mwk.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new owk(string, arrayList, string2, string3);
            case 25:
                owk owkVar = (owk) parcel.readParcelable(xwk.class.getClassLoader());
                String string4 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iM31715d2 = 0;
                while (iM31715d2 != i2) {
                    iM31715d2 = c7h0.m31715d(dxk.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new xwk(owkVar, string4, arrayList2);
            case 26:
                return new dxk((mwk) parcel.readParcelable(dxk.class.getClassLoader()), parcel.readInt() != 0);
            case 27:
                return new hxk(parcel.readString());
            case 28:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i3 = parcel.readInt();
                vl00 vl00VarValueOf = vl00.valueOf(parcel.readString());
                t931 t931VarCreateFromParcel = t931.CREATOR.createFromParcel(parcel);
                sqb sqbVarCreateFromParcel = parcel.readInt() == 0 ? null : sqb.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                int iM31715d3 = 0;
                while (iM31715d3 != i8) {
                    iM31715d3 = c7h0.m31715d(mqs.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new uyk(string5, string6, null, i3, vl00VarValueOf, t931VarCreateFromParcel, sqbVarCreateFromParcel, i4, i5, i6, i7, string7, string8, arrayList3, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt(), 4);
            default:
                return new yyk(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f121504a) {
            case 0:
                return new lck[i];
            case 1:
                return new mck[i];
            case 2:
                return new sfk[i];
            case 3:
                return new jgk[i];
            case 4:
                return new pgk[i];
            case 5:
                return new tgk[i];
            case 6:
                return new dhk[i];
            case 7:
                return new ehk[i];
            case 8:
                return new khk[i];
            case 9:
                return new qjk[i];
            case 10:
                return new rjk[i];
            case 11:
                return new tjk[i];
            case 12:
                return new ujk[i];
            case 13:
                return new vjk[i];
            case 14:
                return new wjk[i];
            case 15:
                return new akk[i];
            case 16:
                return new ckk[i];
            case 17:
                return new cpk[i];
            case 18:
                return new crk[i];
            case 19:
                return new drk[i];
            case 20:
                return new erk[i];
            case 21:
                return new frk[i];
            case 22:
                return new grk[i];
            case 23:
                return new mwk[i];
            case 24:
                return new owk[i];
            case 25:
                return new xwk[i];
            case 26:
                return new dxk[i];
            case 27:
                return new hxk[i];
            case 28:
                return new uyk[i];
            default:
                return new yyk[i];
        }
    }
}
