package p204p;

import com.spotify.common.uri.SpotifyUriParserException;

/* JADX INFO: loaded from: classes.dex */
public final class mf41 {

    /* JADX INFO: renamed from: f */
    public static final String[] f142954f = {"http://spotify.com/", "https://spotify.com/", "http://open.spotify.com/", "https://open.spotify.com/"};

    /* JADX INFO: renamed from: a */
    public final String f142955a;

    /* JADX INFO: renamed from: b */
    public final boolean f142956b = true;

    /* JADX INFO: renamed from: c */
    public final CharSequence f142957c;

    /* JADX INFO: renamed from: d */
    public final String f142958d;

    /* JADX INFO: renamed from: e */
    public int f142959e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v14 */
    public mf41(String str) {
        int length;
        int iIndexOf = str.indexOf("?");
        int i = 0;
        String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
        this.f142955a = strSubstring;
        this.f142958d = iIndexOf == -1 ? null : str.substring(iIndexOf);
        if (strSubstring.startsWith("spotify:")) {
            length = 8;
            if (strSubstring.startsWith("//", 8)) {
                length = 10;
            }
        } else if (strSubstring.startsWith("https://www.spotify.com/")) {
            length = 24;
        } else {
            while (true) {
                if (i >= 4) {
                    throw m61610c("Spotify uri doesn't start with a proper prefix");
                }
                String str2 = f142954f[i];
                if (strSubstring.startsWith(str2)) {
                    length = str2.length();
                    break;
                }
                i++;
            }
        }
        this.f142959e = length;
        ?? jf41Var = this.f142955a;
        while (length < jf41Var.length()) {
            char cCharAt = jf41Var.charAt(length);
            if (cCharAt == '%' || cCharAt == '+') {
                while (length < jf41Var.length()) {
                    m61613f(jf41Var.charAt(length), length);
                    length++;
                }
                jf41Var = new jf41(jf41Var, new if41(this));
                break;
            }
            m61613f(jf41Var.charAt(length), length);
            length++;
        }
        this.f142957c = jf41Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61608a() {
        return this.f142959e >= this.f142957c.length();
    }

    /* JADX INFO: renamed from: b */
    public final String m61609b() {
        if (m61608a()) {
            throw m61610c("End of Spotify uri reached unexpectedly");
        }
        int i = this.f142959e;
        String str = this.f142955a;
        int iIndexOf = str.indexOf(58, i);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(47, this.f142959e);
        }
        CharSequence charSequence = this.f142957c;
        if (iIndexOf == -1) {
            iIndexOf = charSequence.length();
        }
        int iMin = Math.min(iIndexOf, charSequence.length());
        this.f142959e = Math.min(charSequence.length(), iMin + 1);
        return charSequence.subSequence(i, iMin).toString();
    }

    /* JADX INFO: renamed from: c */
    public final SpotifyUriParserException m61610c(String str) {
        return new SpotifyUriParserException(klh.m56834f(str, ": ", this.f142955a), this.f142956b);
    }

    /* JADX INFO: renamed from: d */
    public final String m61611d() {
        if (m61608a()) {
            throw m61610c("End of Spotify uri reached unexpectedly");
        }
        int i = this.f142959e;
        CharSequence charSequence = this.f142957c;
        return charSequence.subSequence(i, charSequence.length()).toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m61612e() {
        if (m61608a()) {
            throw m61610c("End of Spotify uri reached unexpectedly");
        }
        int i = this.f142959e;
        CharSequence charSequence = this.f142957c;
        this.f142959e = charSequence.length();
        return charSequence.subSequence(i, charSequence.length()).toString();
    }

    /* JADX INFO: renamed from: f */
    public final void m61613f(int i, int i2) {
        if (i < 33 || i > 126) {
            throw m61610c(i == 32 ? "Spotify uri contained space" : s571.m77246e(i2, "Spotify uri contained non-ASCII characters at position "));
        }
    }
}
