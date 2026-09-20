package p204p;

import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class v8d implements lad {

    /* JADX INFO: renamed from: a */
    public final Map f238473a;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public v8d(Map map) {
        this.f238473a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8d) && wj50.m88271j(this.f238473a, ((v8d) obj).f238473a);
    }

    public final int hashCode() {
        return this.f238473a.hashCode();
    }
}
