package androidx.media3.session.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p204p.qi5;

/* JADX INFO: loaded from: classes3.dex */
public final class LegacyParcelableUtil {
    private LegacyParcelableUtil() {
    }

    public static <T extends Parcelable, U extends Parcelable> T convert(U u, Parcelable.Creator<T> creator) {
        if (u == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            u.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends Parcelable, U extends Parcelable> ArrayList<T> convertList(List<U> list, Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        qi5 qi5Var = (ArrayList<T>) new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            qi5Var.add(convert(list.get(i), creator));
        }
        return qi5Var;
    }
}
