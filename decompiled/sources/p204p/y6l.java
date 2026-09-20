package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class y6l {

    /* JADX INFO: renamed from: a */
    public final String f269867a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f269868b;

    /* JADX INFO: renamed from: c */
    public final String f269869c;

    /* JADX INFO: renamed from: d */
    public final List f269870d;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public y6l(String str, xcl0 xcl0Var, String str2, List list) {
        this.f269867a = str;
        this.f269868b = xcl0Var;
        this.f269869c = str2;
        this.f269870d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6l)) {
            return false;
        }
        y6l y6lVar = (y6l) obj;
        return wj50.m88271j(this.f269867a, y6lVar.f269867a) && wj50.m88271j(this.f269868b, y6lVar.f269868b) && wj50.m88271j(this.f269869c, y6lVar.f269869c) && wj50.m88271j(this.f269870d, y6lVar.f269870d);
    }

    public final int hashCode() {
        int iHashCode = (this.f269868b.hashCode() + (this.f269867a.hashCode() * 31)) * 31;
        String str = this.f269869c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f269870d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
