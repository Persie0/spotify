package p204p;

import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class d5d implements h5d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f45398a;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public d5d(ArrayList arrayList) {
        this.f45398a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5d) && this.f45398a.equals(((d5d) obj).f45398a);
    }

    public final int hashCode() {
        return this.f45398a.hashCode();
    }
}
