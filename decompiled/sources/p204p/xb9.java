package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xb9 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f259866e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f259867a;

    /* JADX INFO: renamed from: b */
    public final int f259868b;

    /* JADX INFO: renamed from: c */
    public int f259869c;

    /* JADX INFO: renamed from: d */
    public char f259870d;

    static {
        for (int i = 0; i < 1792; i++) {
            f259866e[i] = Character.getDirectionality(i);
        }
    }

    public xb9(CharSequence charSequence) {
        this.f259867a = charSequence;
        this.f259868b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m90307a() {
        int i = this.f259869c - 1;
        CharSequence charSequence = this.f259867a;
        char cCharAt = charSequence.charAt(i);
        this.f259870d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f259869c);
            this.f259869c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f259869c--;
        char c = this.f259870d;
        return c < 1792 ? f259866e[c] : Character.getDirectionality(c);
    }
}
