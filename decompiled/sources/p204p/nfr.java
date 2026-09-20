package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class nfr {
    public static final mfr Companion = new mfr();

    /* JADX INFO: renamed from: h */
    public static final fr70[] f153413h = {q3d0.m72078I(2, ajq.f16307M0), null, null, null, null, null, q3d0.m72078I(2, ajq.f16308N0)};

    /* JADX INFO: renamed from: a */
    public final List f153414a;

    /* JADX INFO: renamed from: b */
    public final String f153415b;

    /* JADX INFO: renamed from: c */
    public final String f153416c;

    /* JADX INFO: renamed from: d */
    public final String f153417d;

    /* JADX INFO: renamed from: e */
    public final String f153418e;

    /* JADX INFO: renamed from: f */
    public final hme f153419f;

    /* JADX INFO: renamed from: g */
    public final List f153420g;

    public /* synthetic */ nfr(int i, List list, String str, String str2, String str3, String str4, hme hmeVar, List list2) {
        if (2 != (i & 2)) {
            edo.m38617p(i, 2, lfr.f132998a.getDescriptor());
            throw null;
        }
        int i2 = i & 1;
        lau lauVar = lau.f131415a;
        if (i2 == 0) {
            this.f153414a = lauVar;
        } else {
            this.f153414a = list;
        }
        this.f153415b = str;
        if ((i & 4) == 0) {
            this.f153416c = null;
        } else {
            this.f153416c = str2;
        }
        if ((i & 8) == 0) {
            this.f153417d = null;
        } else {
            this.f153417d = str3;
        }
        if ((i & 16) == 0) {
            this.f153418e = "MOBILE_CLIENT";
        } else {
            this.f153418e = str4;
        }
        if ((i & 32) == 0) {
            this.f153419f = null;
        } else {
            this.f153419f = hmeVar;
        }
        if ((i & 64) == 0) {
            this.f153420g = lauVar;
        } else {
            this.f153420g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfr)) {
            return false;
        }
        nfr nfrVar = (nfr) obj;
        return wj50.m88271j(this.f153414a, nfrVar.f153414a) && wj50.m88271j(this.f153415b, nfrVar.f153415b) && wj50.m88271j(this.f153416c, nfrVar.f153416c) && wj50.m88271j(this.f153417d, nfrVar.f153417d) && wj50.m88271j(this.f153418e, nfrVar.f153418e) && wj50.m88271j(this.f153419f, nfrVar.f153419f) && wj50.m88271j(this.f153420g, nfrVar.f153420g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f153414a.hashCode() * 31, 31, this.f153415b);
        String str = this.f153416c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153417d;
        int iM77243b2 = s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f153418e);
        hme hmeVar = this.f153419f;
        return this.f153420g.hashCode() + ((iM77243b2 + (hmeVar != null ? hmeVar.hashCode() : 0)) * 31);
    }

    public nfr(List list, String str, String str2, String str3, hme hmeVar, List list2) {
        this.f153414a = list;
        this.f153415b = str;
        this.f153416c = str2;
        this.f153417d = str3;
        this.f153418e = "MOBILE_CLIENT";
        this.f153419f = hmeVar;
        this.f153420g = list2;
    }
}
