package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bzg1 implements ezg1 {

    /* JADX INFO: renamed from: a */
    public static final bzg1 f32495a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bzg1[] f32496b;

    static {
        bzg1 bzg1Var = new bzg1("INSTANCE", 0);
        f32495a = bzg1Var;
        f32496b = new bzg1[]{bzg1Var};
    }

    public static bzg1[] values() {
        return (bzg1[]) f32496b.clone();
    }

    @Override // p204p.ezg1
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo31032a(byte[] bArr, int i) {
        if (ordinal() != 0) {
            throw null;
        }
        byte b = bArr[i + 7];
        return ((((long) bArr[i + 6]) & 255) << 48) | ((b & 255) << 56) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
    }
}
