package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yjf0 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final int f273359a;

    public yjf0(int i) {
        this.f273359a = i;
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: b */
    public final mic1 mo24736b(Class cls) {
        if (cls.isAssignableFrom(zjf0.class)) {
            return new zjf0(this.f273359a);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
