package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dsx implements fsx {

    /* JADX INFO: renamed from: a */
    public final long f52655a;

    /* JADX INFO: renamed from: b */
    public final String f52656b;

    /* JADX INFO: renamed from: c */
    public final qrx f52657c;

    /* JADX INFO: renamed from: d */
    public final boolean f52658d;

    /* JADX INFO: renamed from: e */
    public final asx f52659e;

    /* JADX INFO: renamed from: f */
    public final boolean f52660f;

    /* JADX INFO: renamed from: g */
    public final vrx f52661g;

    /* JADX INFO: renamed from: h */
    public final String f52662h;

    /* JADX INFO: renamed from: i */
    public final String f52663i;

    /* JADX INFO: renamed from: j */
    public final String f52664j;

    /* JADX INFO: renamed from: k */
    public final List f52665k;

    /* JADX INFO: renamed from: l */
    public final boolean f52666l;

    public dsx(long j, String str, qrx qrxVar, boolean z, asx asxVar, boolean z2, vrx vrxVar, String str2, String str3, String str4, List list, boolean z3) {
        this.f52655a = j;
        this.f52656b = str;
        this.f52657c = qrxVar;
        this.f52658d = z;
        this.f52659e = asxVar;
        this.f52660f = z2;
        this.f52661g = vrxVar;
        this.f52662h = str2;
        this.f52663i = str3;
        this.f52664j = str4;
        this.f52665k = list;
        this.f52666l = z3;
    }

    /* JADX INFO: renamed from: b */
    public static dsx m36788b(dsx dsxVar, long j, String str, qrx qrxVar, boolean z, asx asxVar, boolean z2, vrx vrxVar, String str2, String str3, String str4, List list, boolean z3, int i) {
        long j2 = (i & 1) != 0 ? dsxVar.f52655a : j;
        String str5 = (i & 2) != 0 ? dsxVar.f52656b : str;
        qrx qrxVar2 = (i & 4) != 0 ? dsxVar.f52657c : qrxVar;
        boolean z4 = (i & 8) != 0 ? dsxVar.f52658d : z;
        asx asxVar2 = (i & 16) != 0 ? dsxVar.f52659e : asxVar;
        boolean z5 = (i & 32) != 0 ? dsxVar.f52660f : z2;
        vrx vrxVar2 = (i & 64) != 0 ? dsxVar.f52661g : vrxVar;
        String str6 = (i & 128) != 0 ? dsxVar.f52662h : str2;
        String str7 = (i & 256) != 0 ? dsxVar.f52663i : str3;
        String str8 = (i & 512) != 0 ? dsxVar.f52664j : str4;
        List list2 = (i & 1024) != 0 ? dsxVar.f52665k : list;
        boolean z6 = (i & 2048) != 0 ? dsxVar.f52666l : z3;
        dsxVar.getClass();
        return new dsx(j2, str5, qrxVar2, z4, asxVar2, z5, vrxVar2, str6, str7, str8, list2, z6);
    }

    @Override // p204p.fsx
    /* JADX INFO: renamed from: a */
    public final qrx mo33784a() {
        return this.f52657c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsx)) {
            return false;
        }
        dsx dsxVar = (dsx) obj;
        return this.f52655a == dsxVar.f52655a && wj50.m88271j(this.f52656b, dsxVar.f52656b) && wj50.m88271j(this.f52657c, dsxVar.f52657c) && this.f52658d == dsxVar.f52658d && wj50.m88271j(this.f52659e, dsxVar.f52659e) && this.f52660f == dsxVar.f52660f && this.f52661g == dsxVar.f52661g && wj50.m88271j(this.f52662h, dsxVar.f52662h) && wj50.m88271j(this.f52663i, dsxVar.f52663i) && wj50.m88271j(this.f52664j, dsxVar.f52664j) && wj50.m88271j(this.f52665k, dsxVar.f52665k) && this.f52666l == dsxVar.f52666l;
    }

    @Override // p204p.fsx
    public final String getEntityUri() {
        return this.f52656b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f52661g.hashCode() + s571.m77245d((this.f52659e.hashCode() + s571.m77245d((this.f52657c.hashCode() + s571.m77243b(Long.hashCode(this.f52655a) * 31, 31, this.f52656b)) * 31, 31, this.f52658d)) * 31, 31, this.f52660f)) * 31, 31, this.f52662h);
        String str = this.f52663i;
        return Boolean.hashCode(this.f52666l) + s571.m77244c(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f52664j), 31, this.f52665k);
    }
}
