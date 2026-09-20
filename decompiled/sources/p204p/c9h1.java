package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum c9h1 implements naf1 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f35569a;

    c9h1(int i) {
        this.f35569a = i;
    }

    /* JADX INFO: renamed from: a */
    public static c9h1 m31959a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f35569a);
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f35569a;
        }
        abf1.m25350a();
        throw null;
    }
}
