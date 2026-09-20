package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cvl {

    /* JADX INFO: renamed from: a */
    public final xam f42477a;

    /* JADX INFO: renamed from: b */
    public final int f42478b;

    /* JADX INFO: renamed from: c */
    public final tdu f42479c;

    public cvl(xam xamVar) {
        this(xamVar, 0, new pdu(Integer.valueOf(R.string.settings_disabled_reason_loading), null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvl)) {
            return false;
        }
        cvl cvlVar = (cvl) obj;
        return wj50.m88271j(this.f42477a, cvlVar.f42477a) && this.f42478b == cvlVar.f42478b && wj50.m88271j(this.f42479c, cvlVar.f42479c);
    }

    public final int hashCode() {
        return this.f42479c.hashCode() + mt60.m62800g(this.f42478b, this.f42477a.hashCode() * 31, 31);
    }

    public cvl(xam xamVar, int i, tdu tduVar) {
        this.f42477a = xamVar;
        this.f42478b = i;
        this.f42479c = tduVar;
    }

    public cvl(xam xamVar, bvl bvlVar) {
        this(xamVar, bvlVar.f31391a, bvlVar.f31392b);
    }
}
