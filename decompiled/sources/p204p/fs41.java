package p204p;

import com.spotify.thestage.vtec.datasource.Site;

/* JADX INFO: loaded from: classes10.dex */
public final class fs41 extends hs41 {

    /* JADX INFO: renamed from: a */
    public final Site f72768a;

    /* JADX INFO: renamed from: b */
    public final String f72769b;

    /* JADX INFO: renamed from: c */
    public final String f72770c;

    public fs41(Site site, String str, String str2) {
        this.f72768a = site;
        this.f72769b = str;
        this.f72770c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m42539a() {
        return this.f72769b;
    }

    /* JADX INFO: renamed from: b */
    public final Site m42540b() {
        return this.f72768a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs41)) {
            return false;
        }
        fs41 fs41Var = (fs41) obj;
        return wj50.m88271j(this.f72768a, fs41Var.f72768a) && wj50.m88271j(this.f72769b, fs41Var.f72769b) && wj50.m88271j(this.f72770c, fs41Var.f72770c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f72768a.hashCode() * 31, 31, this.f72769b);
        String str = this.f72770c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
