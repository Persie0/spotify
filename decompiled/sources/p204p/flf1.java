package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class flf1 implements wrf1 {

    /* JADX INFO: renamed from: a */
    public static final flf1 f70766a = new flf1();

    @Override // p204p.wrf1
    public final ytf1 zzb(Class cls) {
        if (!qlf1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (ytf1) qlf1.m73180c(cls.asSubclass(qlf1.class)).mo58162b(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p204p.wrf1
    public final boolean zzc(Class cls) {
        return qlf1.class.isAssignableFrom(cls);
    }
}
