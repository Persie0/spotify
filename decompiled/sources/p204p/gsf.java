package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gsf {

    /* JADX INFO: renamed from: a */
    public final String f83950a;

    /* JADX INFO: renamed from: b */
    public final String f83951b;

    /* JADX INFO: renamed from: c */
    public final boolean f83952c;

    /* JADX INFO: renamed from: d */
    public final List f83953d;

    public gsf(String str, String str2, List list, boolean z) {
        this.f83950a = str;
        this.f83951b = str2;
        this.f83952c = z;
        this.f83953d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsf)) {
            return false;
        }
        gsf gsfVar = (gsf) obj;
        return wj50.m88271j(this.f83950a, gsfVar.f83950a) && wj50.m88271j(this.f83951b, gsfVar.f83951b) && this.f83952c == gsfVar.f83952c && wj50.m88271j(this.f83953d, gsfVar.f83953d);
    }

    public final int hashCode() {
        return this.f83953d.hashCode() + s571.m77245d(s571.m77243b(this.f83950a.hashCode() * 31, 31, this.f83951b), 31, this.f83952c);
    }
}
