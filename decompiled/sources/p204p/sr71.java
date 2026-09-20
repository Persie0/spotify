package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.UserTimeline;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class sr71 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f213254a;

    public /* synthetic */ sr71(int i) {
        this.f213254a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f213254a) {
            case 0:
                return new tr71(UserTimeline.m11484t(parcel.createByteArray()), parcel.readInt());
            case 1:
                return new mu71(parcel.readLong());
            case 2:
                return new ou71(parcel.readLong());
            case 3:
                return new nu71(parcel.readLong());
            case 4:
                return new ru71(parcel.readLong());
            case 5:
                return new tu71(parcel.readLong());
            case 6:
                return new sv71(parcel.readLong(), parcel.readInt(), parcel.readString());
            case 7:
                return new vv71(parcel.readString());
            case 8:
                return new yv71(parcel.readString());
            case 9:
                return new bw71(parcel.readInt(), parcel.readString());
            case 10:
                parcel.readInt();
                return cw71.INSTANCE;
            case 11:
                return new fw71(parcel.readInt(), parcel.readString(), parcel.readString());
            case 12:
                return new ax71(parcel.readInt(), parcel.readString());
            case 13:
                return new bx71(parcel.readString(), parcel.readString());
            case 14:
                parcel.readInt();
                return yz71.f277726a;
            case 15:
                return new zz71(parcel.readInt() != 0);
            case 16:
                parcel.readInt();
                return b081.f21799a;
            case 17:
                return new c081((s511) parcel.readParcelable(c081.class.getClassLoader()));
            case 18:
                parcel.readInt();
                return d081.f43812a;
            case 19:
                parcel.readInt();
                return z081.f278018a;
            case 20:
                bo01 bo01Var = (bo01) parcel.readParcelable(a181.class.getClassLoader());
                lu71 lu71VarM1966t = Timestamp.m1966t();
                lu71VarM1966t.m59943q(parcel.readLong());
                lu71VarM1966t.m59942m(parcel.readInt());
                return new a181(bo01Var, (Timestamp) lu71VarM1966t.build(), parcel.readString(), o511.valueOf(parcel.readString()));
            case 21:
                return new d181(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
            case 22:
                n1s0 n1s0VarCreateFromParcel = n1s0.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(hyy.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new b281(n1s0VarCreateFromParcel, arrayList);
            case 23:
                return new k581(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 24:
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iM31715d2 = 0;
                while (iM31715d2 != i2) {
                    iM31715d2 = c7h0.m31715d(o581.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new m581(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), arrayList2);
            case 25:
                String string = parcel.readString();
                String string2 = parcel.readString();
                duf dufVar = (duf) parcel.readParcelable(o581.class.getClassLoader());
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                fuz0 fuz0Var = (fuz0) parcel.readParcelable(o581.class.getClassLoader());
                int iM31715d3 = 0;
                int iM25027s = parcel.readInt() == 0 ? 0 : a831.m25027s(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iM31715d3 != i4) {
                    iM31715d3 = c7h0.m31715d(k581.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new o581(string, string2, dufVar, string3, i3, string4, string5, fuz0Var, iM25027s, arrayList3);
            case 26:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d4 = 0;
                while (iM31715d4 != i5) {
                    iM31715d4 = c7h0.m31715d(o581.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                lu71 lu71VarM1966t2 = Timestamp.m1966t();
                lu71VarM1966t2.m59943q(parcel.readLong());
                lu71VarM1966t2.m59942m(parcel.readInt());
                return new p581(arrayList4, numValueOf, (Timestamp) lu71VarM1966t2.build(), parcel.readString());
            case 27:
                return new a881(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iM31715d5 = 0;
                while (iM31715d5 != i6) {
                    iM31715d5 = c7h0.m31715d(e881.CREATOR, parcel, arrayList5, iM31715d5, 1);
                }
                return new c881(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), arrayList5);
            default:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                fuz0 fuz0Var2 = (fuz0) parcel.readParcelable(e881.class.getClassLoader());
                duf dufVar2 = (duf) parcel.readParcelable(e881.class.getClassLoader());
                String string8 = parcel.readString();
                int i7 = parcel.readInt();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                fuz0 fuz0Var3 = (fuz0) parcel.readParcelable(e881.class.getClassLoader());
                String string11 = parcel.readString();
                int iM31715d6 = 0;
                int iM25027s2 = parcel.readInt() == 0 ? 0 : a831.m25027s(parcel.readString());
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                while (iM31715d6 != i8) {
                    iM31715d6 = c7h0.m31715d(a881.CREATOR, parcel, arrayList6, iM31715d6, 1);
                    i8 = i8;
                }
                return new e881(string6, string7, fuz0Var2, dufVar2, string8, i7, string9, string10, fuz0Var3, string11, iM25027s2, arrayList6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f213254a) {
            case 0:
                return new tr71[i];
            case 1:
                return new mu71[i];
            case 2:
                return new ou71[i];
            case 3:
                return new nu71[i];
            case 4:
                return new ru71[i];
            case 5:
                return new tu71[i];
            case 6:
                return new sv71[i];
            case 7:
                return new vv71[i];
            case 8:
                return new yv71[i];
            case 9:
                return new bw71[i];
            case 10:
                return new cw71[i];
            case 11:
                return new fw71[i];
            case 12:
                return new ax71[i];
            case 13:
                return new bx71[i];
            case 14:
                return new yz71[i];
            case 15:
                return new zz71[i];
            case 16:
                return new b081[i];
            case 17:
                return new c081[i];
            case 18:
                return new d081[i];
            case 19:
                return new z081[i];
            case 20:
                return new a181[i];
            case 21:
                return new d181[i];
            case 22:
                return new b281[i];
            case 23:
                return new k581[i];
            case 24:
                return new m581[i];
            case 25:
                return new o581[i];
            case 26:
                return new p581[i];
            case 27:
                return new a881[i];
            case 28:
                return new c881[i];
            default:
                return new e881[i];
        }
    }
}
