package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class qb60 {

    /* JADX INFO: renamed from: a */
    public final String f187019a;

    /* JADX INFO: renamed from: b */
    public final boolean f187020b;

    public qb60(String str, int i) {
        boolean z = (i & 8) == 0;
        this.f187019a = str;
        this.f187020b = z;
    }

    public final boolean equals(Object obj) {
        Object objValueOf = Integer.valueOf(R.string.f5908x4c0cc338);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb60)) {
            return false;
        }
        qb60 qb60Var = (qb60) obj;
        return objValueOf.equals(objValueOf) && wj50.m88271j(this.f187019a, qb60Var.f187019a) && this.f187020b == qb60Var.f187020b;
    }

    public final int hashCode() {
        int iHashCode = (Integer.valueOf(R.string.f5908x4c0cc338).hashCode() + (Integer.hashCode(R.string.jam_manage_participants_sheet_auto_invite_people_nearby_title) * 31)) * 31;
        String str = this.f187019a;
        return Boolean.hashCode(this.f187020b) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
