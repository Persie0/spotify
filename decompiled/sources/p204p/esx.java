package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class esx implements fsx {

    /* JADX INFO: renamed from: a */
    public final long f62512a;

    /* JADX INFO: renamed from: b */
    public final String f62513b;

    /* JADX INFO: renamed from: c */
    public final qrx f62514c;

    /* JADX INFO: renamed from: d */
    public final boolean f62515d;

    /* JADX INFO: renamed from: e */
    public final boolean f62516e;

    /* JADX INFO: renamed from: f */
    public final vrx f62517f;

    /* JADX INFO: renamed from: g */
    public final boolean f62518g;

    public /* synthetic */ esx(long j, String str, qrx qrxVar, boolean z) {
        this(j, str, qrxVar, z, false, vrx.f244273a, false);
    }

    /* JADX INFO: renamed from: b */
    public static esx m39922b(esx esxVar, long j, String str, qrx qrxVar, boolean z, boolean z2, vrx vrxVar, boolean z3, int i) {
        if ((i & 1) != 0) {
            j = esxVar.f62512a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = esxVar.f62513b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            qrxVar = esxVar.f62514c;
        }
        qrx qrxVar2 = qrxVar;
        if ((i & 8) != 0) {
            z = esxVar.f62515d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = esxVar.f62516e;
        }
        boolean z5 = z2;
        vrx vrxVar2 = (i & 32) != 0 ? esxVar.f62517f : vrxVar;
        boolean z6 = (i & 64) != 0 ? esxVar.f62518g : z3;
        esxVar.getClass();
        return new esx(j2, str2, qrxVar2, z4, z5, vrxVar2, z6);
    }

    @Override // p204p.fsx
    /* JADX INFO: renamed from: a */
    public final qrx mo33784a() {
        return this.f62514c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esx)) {
            return false;
        }
        esx esxVar = (esx) obj;
        return this.f62512a == esxVar.f62512a && wj50.m88271j(this.f62513b, esxVar.f62513b) && wj50.m88271j(this.f62514c, esxVar.f62514c) && this.f62515d == esxVar.f62515d && this.f62516e == esxVar.f62516e && this.f62517f == esxVar.f62517f && this.f62518g == esxVar.f62518g;
    }

    @Override // p204p.fsx
    public final String getEntityUri() {
        return this.f62513b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62518g) + ((this.f62517f.hashCode() + s571.m77245d(s571.m77245d((this.f62514c.hashCode() + s571.m77243b(Long.hashCode(this.f62512a) * 31, 31, this.f62513b)) * 31, 31, this.f62515d), 31, this.f62516e)) * 31);
    }

    public esx(long j, String str, qrx qrxVar, boolean z, boolean z2, vrx vrxVar, boolean z3) {
        this.f62512a = j;
        this.f62513b = str;
        this.f62514c = qrxVar;
        this.f62515d = z;
        this.f62516e = z2;
        this.f62517f = vrxVar;
        this.f62518g = z3;
    }
}
