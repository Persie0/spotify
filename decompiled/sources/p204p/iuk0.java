package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class iuk0 implements juk0 {

    /* JADX INFO: renamed from: a */
    public final String f105984a;

    /* JADX INFO: renamed from: b */
    public final String f105985b;

    /* JADX INFO: renamed from: c */
    public final String f105986c;

    /* JADX INFO: renamed from: d */
    public final wwu f105987d;

    public iuk0(String str, String str2, String str3, wwu wwuVar) {
        this.f105984a = str;
        this.f105985b = str2;
        this.f105986c = str3;
        this.f105987d = wwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuk0)) {
            return false;
        }
        iuk0 iuk0Var = (iuk0) obj;
        return this.f105984a.equals(iuk0Var.f105984a) && wj50.m88271j(this.f105985b, iuk0Var.f105985b) && this.f105986c.equals(iuk0Var.f105986c) && wj50.m88271j(this.f105987d, iuk0Var.f105987d);
    }

    public final int hashCode() {
        return this.f105987d.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(R.string.offline_available_songs_title) * 31, 31, this.f105984a), 31, this.f105985b), 31, this.f105986c);
    }
}
