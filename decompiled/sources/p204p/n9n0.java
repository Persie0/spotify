package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class n9n0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151829a;

    public /* synthetic */ n9n0(int i) {
        this.f151829a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f151829a) {
            case 0:
                return new o9n0(parcel.readString());
            case 1:
                return new p9n0(parcel.readString());
            case 2:
                return new q9n0(parcel.readString());
            case 3:
                return new r9n0(parcel.readString());
            case 4:
                return new s9n0(parcel.readString());
            case 5:
                return new t9n0(parcel.readString());
            case 6:
                return new u9n0(parcel.readString());
            case 7:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(l580.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new pdn0(string, string2, string3, string4, string5, arrayList, parcel.readInt() == 0 ? null : mmr.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 8:
                Parcelable.Creator<qen0> creator = qen0.CREATOR;
                String str = creator.createFromParcel(parcel).f187975a;
                qen0 qen0VarCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                String str2 = qen0VarCreateFromParcel != null ? qen0VarCreateFromParcel.f187975a : null;
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int iM9h = 0;
                boolean z = parcel.readInt() != 0;
                AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(parcel.createStringArrayList());
                n300 n300VarCreateFromParcel = n300.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(pen0.class, parcel, arrayList2, iM9h, 1);
                }
                return new pen0(str, str2, string6, string7, string8, z, abstractC2524w8M67546C, n300VarCreateFromParcel, opo.m67546C(arrayList2), parcel.readInt() != 0 ? lqm0.CREATOR.createFromParcel(parcel) : null);
            case 9:
                return new qen0(parcel.readString());
            case 10:
                return new ren0(parcel.readString());
            case 11:
                String str3 = lfn0.CREATOR.createFromParcel(parcel).f132979a;
                String string9 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iM9h2 = 0;
                while (iM9h2 != i3) {
                    iM9h2 = AbstractC0000a.m9h(sen0.class, parcel, arrayList3, iM9h2, 1);
                }
                AbstractC2524w8 abstractC2524w8M67546C2 = opo.m67546C(arrayList3);
                zgx0 zgx0Var = (zgx0) parcel.readParcelable(sen0.class.getClassLoader());
                return new sen0(str3, string9, abstractC2524w8M67546C2, zgx0Var != null ? zgx0Var.f282732a : null, (mmr) parcel.readParcelable(sen0.class.getClassLoader()), parcel.readString());
            case 12:
                kfn0 kfn0VarCreateFromParcel = kfn0.CREATOR.createFromParcel(parcel);
                qen0 qen0VarCreateFromParcel2 = parcel.readInt() == 0 ? null : qen0.CREATOR.createFromParcel(parcel);
                String str4 = qen0VarCreateFromParcel2 != null ? qen0VarCreateFromParcel2.f187975a : null;
                n300 n300VarCreateFromParcel2 = parcel.readInt() == 0 ? null : n300.CREATOR.createFromParcel(parcel);
                ehr0 ehr0Var = (ehr0) parcel.readParcelable(ten0.class.getClassLoader());
                String string10 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                boolean z4 = parcel.readInt() != 0 ? true : z2;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                nt81 nt81VarCreateFromParcel = nt81.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i4);
                int iM9h3 = 0;
                while (true) {
                    nt81 nt81Var = nt81VarCreateFromParcel;
                    if (iM9h3 == i4) {
                        AbstractC2524w8 abstractC2524w8M67546C3 = opo.m67546C(arrayList4);
                        mmr mmrVar = (mmr) parcel.readParcelable(ten0.class.getClassLoader());
                        zgx0 zgx0Var2 = (zgx0) parcel.readParcelable(ten0.class.getClassLoader());
                        String str5 = zgx0Var2 != null ? zgx0Var2.f282732a : null;
                        p580 p580VarCreateFromParcel = p580.CREATOR.createFromParcel(parcel);
                        hlq hlqVarCreateFromParcel = parcel.readInt() == 0 ? null : hlq.CREATOR.createFromParcel(parcel);
                        String str6 = hlqVarCreateFromParcel != null ? hlqVarCreateFromParcel.f92727a : null;
                        jvw0 jvw0VarCreateFromParcel = parcel.readInt() == 0 ? null : jvw0.CREATOR.createFromParcel(parcel);
                        return new ten0(kfn0VarCreateFromParcel, str4, n300VarCreateFromParcel2, ehr0Var, string10, numValueOf, z3, z2, z4, z2, nt81Var, abstractC2524w8M67546C3, mmrVar, str5, p580VarCreateFromParcel, str6, jvw0VarCreateFromParcel != null ? jvw0VarCreateFromParcel.f116536a : null, parcel.readInt() == 0 ? null : ygn0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : lqm0.CREATOR.createFromParcel(parcel));
                    }
                    iM9h3 = AbstractC0000a.m9h(ten0.class, parcel, arrayList4, iM9h3, 1);
                    nt81VarCreateFromParcel = nt81Var;
                }
                break;
            case 13:
                String str7 = lfn0.CREATOR.createFromParcel(parcel).f132979a;
                String string11 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                int iM9h4 = 0;
                while (iM9h4 != i5) {
                    iM9h4 = AbstractC0000a.m9h(uen0.class, parcel, arrayList5, iM9h4, 1);
                }
                AbstractC2524w8 abstractC2524w8M67546C4 = opo.m67546C(arrayList5);
                zgx0 zgx0Var3 = (zgx0) parcel.readParcelable(uen0.class.getClassLoader());
                return new uen0(str7, string11, abstractC2524w8M67546C4, zgx0Var3 != null ? zgx0Var3.f282732a : null, (mmr) parcel.readParcelable(uen0.class.getClassLoader()));
            case 14:
                String str8 = lfn0.CREATOR.createFromParcel(parcel).f132979a;
                String string12 = parcel.readString();
                pfn0 pfn0VarCreateFromParcel = pfn0.CREATOR.createFromParcel(parcel);
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i6);
                int iM31715d2 = 0;
                while (iM31715d2 != i6) {
                    iM31715d2 = c7h0.m31715d(pen0.CREATOR, parcel, arrayList6, iM31715d2, 1);
                }
                return new kfn0(str8, string12, pfn0VarCreateFromParcel, string13, string14, opo.m67546C(arrayList6));
            case 15:
                return new lfn0(parcel.readString());
            case 16:
                return new mfn0(parcel.readString());
            case 17:
                return new pfn0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new qfn0(parcel);
            case 19:
                return new jgn0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new xgn0(parcel.readString());
            case 21:
                bhn0 bhn0VarCreateFromParcel = parcel.readInt() == 0 ? null : bhn0.CREATOR.createFromParcel(parcel);
                boolean z5 = parcel.readInt() != 0;
                ahn0 ahn0VarCreateFromParcel = parcel.readInt() == 0 ? null : ahn0.CREATOR.createFromParcel(parcel);
                String str9 = ahn0VarCreateFromParcel != null ? ahn0VarCreateFromParcel.f15724a : null;
                xgn0 xgn0VarCreateFromParcel = parcel.readInt() == 0 ? null : xgn0.CREATOR.createFromParcel(parcel);
                return new ygn0(bhn0VarCreateFromParcel, z5, str9, xgn0VarCreateFromParcel != null ? xgn0VarCreateFromParcel.f261342a : null);
            case 22:
                return new ahn0(parcel.readString());
            case 23:
                return new bhn0(parcel.readString(), parcel.readString());
            case 24:
                return new chn0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                return new thn0(parcel.readString(), (yn3) parcel.readParcelable(thn0.class.getClassLoader()), parcel.readLong());
            case 26:
                return new uhn0(parcel.readString(), parcel.readString());
            case 27:
                return new vhn0(parcel.readString());
            case 28:
                return new djn0(parcel.readLong(), parcel.readString());
            default:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i7);
                int iM31715d3 = 0;
                while (iM31715d3 != i7) {
                    iM31715d3 = c7h0.m31715d(hjn0.CREATOR, parcel, arrayList7, iM31715d3, 1);
                }
                return new ijn0(string15, string16, opo.m67546C(arrayList7), parcel.readInt() == 0 ? null : gjn0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : djn0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? fjn0.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f151829a) {
            case 0:
                return new o9n0[i];
            case 1:
                return new p9n0[i];
            case 2:
                return new q9n0[i];
            case 3:
                return new r9n0[i];
            case 4:
                return new s9n0[i];
            case 5:
                return new t9n0[i];
            case 6:
                return new u9n0[i];
            case 7:
                return new pdn0[i];
            case 8:
                return new pen0[i];
            case 9:
                return new qen0[i];
            case 10:
                return new ren0[i];
            case 11:
                return new sen0[i];
            case 12:
                return new ten0[i];
            case 13:
                return new uen0[i];
            case 14:
                return new kfn0[i];
            case 15:
                return new lfn0[i];
            case 16:
                return new mfn0[i];
            case 17:
                return new pfn0[i];
            case 18:
                return new qfn0[i];
            case 19:
                return new jgn0[i];
            case 20:
                return new xgn0[i];
            case 21:
                return new ygn0[i];
            case 22:
                return new ahn0[i];
            case 23:
                return new bhn0[i];
            case 24:
                return new chn0[i];
            case 25:
                return new thn0[i];
            case 26:
                return new uhn0[i];
            case 27:
                return new vhn0[i];
            case 28:
                return new djn0[i];
            default:
                return new ijn0[i];
        }
    }
}
