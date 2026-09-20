package p196j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: renamed from: j$.time.format.k */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public class C1563k {

    /* JADX INFO: renamed from: a */
    public String f10727a;

    /* JADX INFO: renamed from: b */
    public String f10728b;

    /* JADX INFO: renamed from: c */
    public final char f10729c;

    /* JADX INFO: renamed from: d */
    public C1563k f10730d;

    /* JADX INFO: renamed from: e */
    public C1563k f10731e;

    public C1563k(String str, String str2, C1563k c1563k) {
        this.f10727a = str;
        this.f10728b = str2;
        this.f10730d = c1563k;
        if (str.isEmpty()) {
            this.f10729c = (char) 65535;
        } else {
            this.f10729c = this.f10727a.charAt(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24077a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f10727a.length() && mo24074b(str.charAt(i), this.f10727a.charAt(i))) {
            i++;
        }
        if (i != this.f10727a.length()) {
            C1563k c1563kMo24075d = mo24075d(this.f10727a.substring(i), this.f10728b, this.f10730d);
            this.f10727a = str.substring(0, i);
            this.f10730d = c1563kMo24075d;
            if (i >= str.length()) {
                this.f10728b = str2;
                return true;
            }
            this.f10730d.f10731e = mo24075d(str.substring(i), str2, null);
            this.f10728b = null;
            return true;
        }
        if (i >= str.length()) {
            this.f10728b = str2;
            return true;
        }
        String strSubstring = str.substring(i);
        for (C1563k c1563k = this.f10730d; c1563k != null; c1563k = c1563k.f10731e) {
            if (mo24074b(c1563k.f10729c, strSubstring.charAt(0))) {
                return c1563k.m24077a(strSubstring, str2);
            }
        }
        C1563k c1563kMo24075d2 = mo24075d(strSubstring, str2, null);
        c1563kMo24075d2.f10731e = this.f10730d;
        this.f10730d = c1563kMo24075d2;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo24074b(char c, char c2) {
        return c == c2;
    }

    /* JADX INFO: renamed from: c */
    public final String m24078c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo24076e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f10727a.length() + index;
        C1563k c1563k = this.f10730d;
        if (c1563k != null && length2 != length) {
            while (!mo24074b(c1563k.f10729c, charSequence.charAt(length2))) {
                c1563k = c1563k.f10731e;
                if (c1563k == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strM24078c = c1563k.m24078c(charSequence, parsePosition);
            if (strM24078c != null) {
                return strM24078c;
            }
        }
        parsePosition.setIndex(length2);
        return this.f10728b;
    }

    /* JADX INFO: renamed from: d */
    public C1563k mo24075d(String str, String str2, C1563k c1563k) {
        return new C1563k(str, str2, c1563k);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo24076e(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f10727a, i);
        }
        int length = this.f10727a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!mo24074b(this.f10727a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
