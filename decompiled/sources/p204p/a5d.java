package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a5d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f12490a;

    /* JADX INFO: renamed from: b */
    public final List f12491b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public a5d(String str, List list) {
        this.f12490a = str;
        this.f12491b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5d)) {
            return false;
        }
        a5d a5dVar = (a5d) obj;
        return wj50.m88271j(this.f12490a, a5dVar.f12490a) && wj50.m88271j(this.f12491b, a5dVar.f12491b);
    }

    public final int hashCode() {
        return this.f12491b.hashCode() + (this.f12490a.hashCode() * 31);
    }
}
