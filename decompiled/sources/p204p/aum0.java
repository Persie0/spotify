package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class aum0 implements Parcelable {
    public static final ztm0 CREATOR = new ztm0();

    /* JADX INFO: renamed from: a */
    public final cx50 f19985a;

    public aum0(cx50 cx50Var) {
        this.f19985a = cx50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cx50 cx50Var = this.f19985a;
        String str = cx50Var.f42907a;
        zw50 zw50Var = cx50Var.f42915i;
        parcel.writeString(str);
        Set set = cx50Var.f42908b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((xw50) it.next()).name());
        }
        parcel.writeStringList(arrayList);
        parcel.writeString(cx50Var.f42909c);
        List list = cx50Var.f42910d;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new dum0((bx50) it2.next()));
        }
        parcel.writeTypedList(arrayList2);
        xx50 xx50Var = cx50Var.f42911e;
        String str2 = xx50Var.f266863a;
        vx50 vx50Var = xx50Var.f266869g;
        parcel.writeString(str2);
        parcel.writeString(xx50Var.f266864b);
        parcel.writeString(oq40.m67600s(xx50Var.f266865c));
        parcel.writeString(oq40.m67601t(xx50Var.f266866d));
        parcel.writeByte(xx50Var.f266867e ? (byte) 1 : (byte) 0);
        parcel.writeByte(vx50Var.f245619a ? (byte) 1 : (byte) 0);
        parcel.writeByte(vx50Var.f245620b ? (byte) 1 : (byte) 0);
        wx50 wx50Var = vx50Var.f245621c;
        parcel.writeString(wx50Var != null ? wx50Var.f255937a : null);
        List list2 = cx50Var.f42912f;
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new kum0((ax50) it3.next()));
        }
        parcel.writeTypedList(arrayList3);
        parcel.writeByte(cx50Var.f42913g ? (byte) 1 : (byte) 0);
        parcel.writeByte(zw50Var.f286922a ? (byte) 1 : (byte) 0);
        parcel.writeByte(zw50Var.f286923b ? (byte) 1 : (byte) 0);
        parcel.writeByte(zw50Var.f286924c ? (byte) 1 : (byte) 0);
        parcel.writeByte(zw50Var.f286925d ? (byte) 1 : (byte) 0);
    }
}
