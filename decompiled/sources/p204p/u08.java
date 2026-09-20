package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u08 {

    /* JADX INFO: renamed from: f */
    public static final u08 f225403f;

    /* JADX INFO: renamed from: a */
    public final long f225404a;

    /* JADX INFO: renamed from: b */
    public final int f225405b;

    /* JADX INFO: renamed from: c */
    public final int f225406c;

    /* JADX INFO: renamed from: d */
    public final long f225407d;

    /* JADX INFO: renamed from: e */
    public final int f225408e;

    static {
        cxe cxeVar = new cxe(10);
        cxeVar.m34289W();
        cxeVar.m34287U();
        cxeVar.m34285S();
        cxeVar.m34286T();
        cxeVar.m34288V();
        f225403f = cxeVar.m34295g();
    }

    public u08(long j, int i, int i2, long j2, int i3) {
        this.f225404a = j;
        this.f225405b = i;
        this.f225406c = i2;
        this.f225407d = j2;
        this.f225408e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u08) {
            u08 u08Var = (u08) obj;
            if (this.f225404a == u08Var.f225404a && this.f225405b == u08Var.f225405b && this.f225406c == u08Var.f225406c && this.f225407d == u08Var.f225407d && this.f225408e == u08Var.f225408e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f225404a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f225405b) * 1000003) ^ this.f225406c) * 1000003;
        long j2 = this.f225407d;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f225408e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f225404a);
        sb.append(", loadBatchSize=");
        sb.append(this.f225405b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f225406c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f225407d);
        sb.append(", maxBlobByteSizePerRow=");
        return klh.m56832d(this.f225408e, "}", sb);
    }
}
