package p204p;

import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class gwl0 {

    /* JADX INFO: renamed from: a */
    public final s7o0 f85035a;

    /* JADX INFO: renamed from: b */
    public final z69 f85036b;

    /* JADX INFO: renamed from: c */
    public final h50 f85037c;

    /* JADX INFO: renamed from: d */
    public final tga1 f85038d;

    /* JADX INFO: renamed from: e */
    public final boolean f85039e;

    /* JADX INFO: renamed from: f */
    public final boolean f85040f;

    /* JADX INFO: renamed from: g */
    public final boolean f85041g;

    /* JADX INFO: renamed from: h */
    public final boolean f85042h;

    /* JADX INFO: renamed from: i */
    public final boolean f85043i;

    /* JADX INFO: renamed from: j */
    public final List f85044j;

    /* JADX INFO: renamed from: k */
    public final zlv0 f85045k;

    public gwl0(s7o0 s7o0Var, z69 z69Var, h50 h50Var, tga1 tga1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, zlv0 zlv0Var, int i) {
        int i2 = i & 1;
        List list = lau.f131415a;
        s7o0 s7o0Var2 = i2 != 0 ? new s7o0("", false, "", "", list, new h50(null, null, null, null, null, 0.0f, null, null, null, 0, null, Entity.SERP_METADATA_FIELD_NUMBER), list) : s7o0Var;
        z69 z69Var2 = (i & 2) != 0 ? new z69(null, null, 15) : z69Var;
        h50 h50Var2 = (i & 4) != 0 ? new h50(null, null, null, null, null, 0.0f, null, null, null, 0, null, Entity.SERP_METADATA_FIELD_NUMBER) : h50Var;
        tga1 tga1Var2 = (i & 8) != 0 ? new tga1() : tga1Var;
        boolean z6 = (i & 16) != 0 ? false : z;
        boolean z7 = (i & 64) != 0 ? false : z2;
        boolean z8 = (i & 128) != 0 ? false : z3;
        boolean z9 = (i & 256) != 0 ? false : z4;
        boolean z10 = (i & 512) == 0 ? z5 : false;
        list = (i & 1024) == 0 ? arrayList : list;
        zlv0 zlv0Var2 = (i & 2048) == 0 ? zlv0Var : null;
        this.f85035a = s7o0Var2;
        this.f85036b = z69Var2;
        this.f85037c = h50Var2;
        this.f85038d = tga1Var2;
        this.f85039e = z6;
        this.f85040f = z7;
        this.f85041g = z8;
        this.f85042h = z9;
        this.f85043i = z10;
        this.f85044j = list;
        this.f85045k = zlv0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwl0)) {
            return false;
        }
        gwl0 gwl0Var = (gwl0) obj;
        return wj50.m88271j(this.f85035a, gwl0Var.f85035a) && wj50.m88271j(this.f85036b, gwl0Var.f85036b) && wj50.m88271j(this.f85037c, gwl0Var.f85037c) && wj50.m88271j(this.f85038d, gwl0Var.f85038d) && this.f85039e == gwl0Var.f85039e && this.f85040f == gwl0Var.f85040f && this.f85041g == gwl0Var.f85041g && this.f85042h == gwl0Var.f85042h && this.f85043i == gwl0Var.f85043i && wj50.m88271j(this.f85044j, gwl0Var.f85044j) && wj50.m88271j(this.f85045k, gwl0Var.f85045k);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f85038d.hashCode() + ((this.f85037c.hashCode() + ((this.f85036b.hashCode() + (this.f85035a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f85039e), 31, false), 31, this.f85040f), 31, this.f85041g), 31, this.f85042h), 31, this.f85043i), 31, this.f85044j);
        zlv0 zlv0Var = this.f85045k;
        return iM77244c + (zlv0Var != null ? zlv0Var.hashCode() : 0);
    }
}
