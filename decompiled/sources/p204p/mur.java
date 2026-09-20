package p204p;

import com.spotify.adsinternal.adscore.model.Format;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mur implements ro0 {

    /* JADX INFO: renamed from: a */
    public final ro0 f147420a;

    /* JADX INFO: renamed from: b */
    public final String f147421b;

    /* JADX INFO: renamed from: c */
    public final kur f147422c;

    /* JADX INFO: renamed from: d */
    public final lur f147423d;

    /* JADX INFO: renamed from: e */
    public final List f147424e;

    /* JADX INFO: renamed from: f */
    public final String f147425f;

    /* JADX INFO: renamed from: g */
    public final Format f147426g;

    /* JADX INFO: renamed from: h */
    public final String f147427h;

    /* JADX INFO: renamed from: i */
    public final String f147428i;

    public mur(fh0 fh0Var, String str, kur kurVar, lur lurVar, List list, String str2, Format format, String str3, String str4) {
        this.f147420a = fh0Var;
        this.f147421b = str;
        this.f147422c = kurVar;
        this.f147423d = lurVar;
        this.f147424e = list;
        this.f147425f = str2;
        this.f147426g = format;
        this.f147427h = str3;
        this.f147428i = str4;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f147420a.mo29280c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mur)) {
            return false;
        }
        mur murVar = (mur) obj;
        return wj50.m88271j(this.f147420a, murVar.f147420a) && wj50.m88271j(this.f147421b, murVar.f147421b) && wj50.m88271j(this.f147422c, murVar.f147422c) && wj50.m88271j(this.f147423d, murVar.f147423d) && wj50.m88271j(this.f147424e, murVar.f147424e) && wj50.m88271j(this.f147425f, murVar.f147425f) && this.f147426g == murVar.f147426g && wj50.m88271j(this.f147427h, murVar.f147427h) && wj50.m88271j(this.f147428i, murVar.f147428i);
    }

    public final int hashCode() {
        return this.f147428i.hashCode() + s571.m77243b((this.f147426g.hashCode() + s571.m77243b(s571.m77244c((this.f147423d.hashCode() + ((this.f147422c.hashCode() + s571.m77243b(this.f147420a.hashCode() * 31, 31, this.f147421b)) * 31)) * 31, 31, this.f147424e), 31, this.f147425f)) * 31, 31, this.f147427h);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f147420a.mo29283j();
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f147420a.mo29285l();
    }
}
