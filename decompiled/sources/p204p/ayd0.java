package p204p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class ayd0 {

    /* JADX INFO: renamed from: e */
    public static final urv0 f21209e = new urv0("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final urv0 f21210f = new urv0(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f21211a;

    /* JADX INFO: renamed from: b */
    public final String f21212b;

    /* JADX INFO: renamed from: c */
    public final String f21213c;

    /* JADX INFO: renamed from: d */
    public final String[] f21214d;

    public ayd0(String str, String str2, String str3, String[] strArr) {
        this.f21211a = str;
        this.f21212b = str2;
        this.f21213c = str3;
        this.f21214d = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final Charset m27513a(Charset charset) {
        String str;
        String[] strArr = this.f21214d;
        int i = 0;
        int iM92097r = xtm0.m92097r(0, strArr.length - 1, 2);
        if (iM92097r < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!bm51.m29797h0(strArr[i], "charset", true)) {
                if (i == iM92097r) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ayd0) && wj50.m88271j(((ayd0) obj).f21211a, this.f21211a);
    }

    public final int hashCode() {
        return this.f21211a.hashCode();
    }

    public final String toString() {
        return this.f21211a;
    }
}
