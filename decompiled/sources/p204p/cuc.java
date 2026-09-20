package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cuc extends ztc {

    /* JADX INFO: renamed from: b */
    public static final int f42085b = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: c */
    public static final cuc f42086c = new cuc("CharMatcher.whitespace()");

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f42085b) == c;
    }
}
