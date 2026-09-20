package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class y260 implements a360 {

    /* JADX INFO: renamed from: a */
    public final String f268470a;

    public y260(String str) {
        this.f268470a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y260) && wj50.m88271j(this.f268470a, ((y260) obj).f268470a);
    }

    public final int hashCode() {
        return this.f268470a.hashCode() + (Integer.hashCode(R.string.jam_manage_participants_roles_sheet_host_jam_title) * 31);
    }
}
