package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ikj0 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final CharSequence f103129a;

    public ikj0(CharSequence charSequence) {
        this.f103129a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return (char) 8226;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f103129a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f103129a.subSequence(i, i2);
    }
}
