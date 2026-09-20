package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class txd {

    /* JADX INFO: renamed from: a */
    public final frd f224682a;

    /* JADX INFO: renamed from: b */
    public final List f224683b;

    /* JADX INFO: renamed from: c */
    public final boolean f224684c;

    /* JADX INFO: renamed from: d */
    public final abd f224685d;

    /* JADX INFO: renamed from: e */
    public final boolean f224686e;

    /* JADX INFO: renamed from: f */
    public final String f224687f;

    /* JADX INFO: renamed from: g */
    public final String f224688g;

    public txd(frd frdVar, List list, boolean z, abd abdVar, boolean z2, String str, String str2) {
        this.f224682a = frdVar;
        this.f224683b = list;
        this.f224684c = z;
        this.f224685d = abdVar;
        this.f224686e = z2;
        this.f224687f = str;
        this.f224688g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txd)) {
            return false;
        }
        txd txdVar = (txd) obj;
        return wj50.m88271j(this.f224682a, txdVar.f224682a) && wj50.m88271j(this.f224683b, txdVar.f224683b) && this.f224684c == txdVar.f224684c && wj50.m88271j(this.f224685d, txdVar.f224685d) && this.f224686e == txdVar.f224686e && wj50.m88271j(this.f224687f, txdVar.f224687f) && wj50.m88271j(this.f224688g, txdVar.f224688g);
    }

    public final int hashCode() {
        frd frdVar = this.f224682a;
        int iM77245d = s571.m77245d(s571.m77244c((frdVar == null ? 0 : frdVar.hashCode()) * 31, 31, this.f224683b), 31, this.f224684c);
        abd abdVar = this.f224685d;
        int iM77245d2 = s571.m77245d((iM77245d + (abdVar == null ? 0 : abdVar.hashCode())) * 31, 31, this.f224686e);
        String str = this.f224687f;
        int iHashCode = (iM77245d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f224688g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
