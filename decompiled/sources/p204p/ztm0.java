package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ztm0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        String string = parcel.readString();
        wj50.m88279p(string);
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        wj50.m88279p(arrayListCreateStringArrayList);
        ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListCreateStringArrayList, 10));
        for (String str : arrayListCreateStringArrayList) {
            wj50.m88279p(str);
            arrayList.add(xw50.valueOf(str));
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        String string2 = parcel.readString();
        wj50.m88279p(string2);
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(bum0.f31165a);
        wj50.m88279p(arrayListCreateTypedArrayList);
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListCreateTypedArrayList, 10));
        Iterator it = arrayListCreateTypedArrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((dum0) it.next()).f53234a);
        }
        oum0.CREATOR.getClass();
        xx50 xx50Var = num0.m65709a(parcel).f170312a;
        ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(bum0.f31166b);
        wj50.m88279p(arrayListCreateTypedArrayList2);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayListCreateTypedArrayList2, 10));
        Iterator it2 = arrayListCreateTypedArrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((kum0) it2.next()).f126642a);
        }
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z2 = true;
            z = true;
        } else {
            z = true;
        }
        return new aum0(new cx50(string, setM43736n1, string2, arrayList2, xx50Var, arrayList3, z2, new zw50(parcel.readByte() != 0 ? z : z2, parcel.readByte() != 0 ? z : z2, parcel.readByte() != 0 ? z : z2, parcel.readByte() != 0 ? z : false)));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new aum0[i];
    }
}
