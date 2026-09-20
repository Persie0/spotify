package p204p;

import com.comscore.streaming.ContentType;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ph30 {

    /* JADX INFO: renamed from: a */
    public final String f177456a;

    /* JADX INFO: renamed from: b */
    public final String f177457b;

    /* JADX INFO: renamed from: c */
    public final String f177458c;

    /* JADX INFO: renamed from: d */
    public final String f177459d;

    /* JADX INFO: renamed from: e */
    public final int f177460e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f177461f;

    /* JADX INFO: renamed from: g */
    public final List f177462g;

    /* JADX INFO: renamed from: h */
    public final String f177463h;

    /* JADX INFO: renamed from: i */
    public final String f177464i;

    public ph30(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f177456a = str;
        this.f177457b = str2;
        this.f177458c = str3;
        this.f177459d = str4;
        this.f177460e = i;
        this.f177461f = arrayList;
        this.f177462g = arrayList2;
        this.f177463h = str5;
        this.f177464i = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m69937a() {
        if (this.f177458c.length() == 0) {
            return "";
        }
        int length = this.f177456a.length() + 3;
        String str = this.f177464i;
        return str.substring(wl51.m88457G0(str, ':', length, 4) + 1, wl51.m88457G0(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: b */
    public final String m69938b() {
        int length = this.f177456a.length() + 3;
        String str = this.f177464i;
        int iM88457G0 = wl51.m88457G0(str, '/', length, 4);
        return str.substring(iM88457G0, a0f1.m24344e(iM88457G0, str, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m69939c() {
        int length = this.f177456a.length() + 3;
        String str = this.f177464i;
        int iM88457G0 = wl51.m88457G0(str, '/', length, 4);
        int iM24344e = a0f1.m24344e(iM88457G0, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM88457G0 < iM24344e) {
            int i = iM88457G0 + 1;
            int iM24343d = a0f1.m24343d('/', i, iM24344e, str);
            arrayList.add(str.substring(i, iM24343d));
            iM88457G0 = iM24343d;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m69940d() {
        if (this.f177462g == null) {
            return null;
        }
        String str = this.f177464i;
        int iM88457G0 = wl51.m88457G0(str, '?', 0, 6) + 1;
        return str.substring(iM88457G0, a0f1.m24343d('#', iM88457G0, str.length(), str));
    }

    /* JADX INFO: renamed from: e */
    public final String m69941e() {
        if (this.f177457b.length() == 0) {
            return "";
        }
        int length = this.f177456a.length() + 3;
        String str = this.f177464i;
        return str.substring(length, a0f1.m24344e(length, str, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ph30) && wj50.m88271j(((ph30) obj).f177464i, this.f177464i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m69942f() {
        return wj50.m88271j(this.f177456a, pka1.f178421b);
    }

    /* JADX INFO: renamed from: g */
    public final rth m69943g() {
        int i;
        String strSubstring;
        rth rthVar = new rth();
        String str = this.f177456a;
        rthVar.f202590e = str;
        rthVar.f202591f = m69941e();
        rthVar.f202592g = m69937a();
        rthVar.f202593h = this.f177459d;
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals(pka1.f178421b) ? 443 : -1;
        }
        int i2 = this.f177460e;
        rthVar.f202587b = i2 != i ? i2 : -1;
        ArrayList arrayList = rthVar.f202588c;
        arrayList.clear();
        arrayList.addAll(m69939c());
        rthVar.m76386g(m69940d());
        if (this.f177463h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f177464i;
            strSubstring = str2.substring(wl51.m88457G0(str2, '#', 0, 6) + 1);
        }
        rthVar.f202594i = strSubstring;
        return rthVar;
    }

    /* JADX INFO: renamed from: h */
    public final String m69944h() {
        rth rthVar;
        try {
            rthVar = new rth();
            rthVar.m76391l(this, "/...");
        } catch (IllegalArgumentException unused) {
            rthVar = null;
        }
        wj50.m88279p(rthVar);
        rthVar.f202591f = g0b1.m43267i("", 0, 0, ContentType.USER_GENERATED_LIVE, " \"':;<=>@[]^`{}|/\\?#");
        rthVar.f202592g = g0b1.m43267i("", 0, 0, ContentType.USER_GENERATED_LIVE, " \"':;<=>@[]^`{}|/\\?#");
        return rthVar.m76382c().f177464i;
    }

    public final int hashCode() {
        return this.f177464i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final URI m69945i() {
        rth rthVarM69943g = m69943g();
        ArrayList arrayList = rthVarM69943g.f202588c;
        String str = (String) rthVarM69943g.f202593h;
        rthVarM69943g.f202593h = str != null ? dq60.m36614n("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, g0b1.m43267i((String) arrayList.get(i), 0, 0, 99, "[]"));
        }
        ArrayList arrayList2 = rthVarM69943g.f202589d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? g0b1.m43267i(str2, 0, 0, 67, "\\^`{|}") : null);
            }
        }
        String str3 = (String) rthVarM69943g.f202594i;
        rthVarM69943g.f202594i = str3 != null ? g0b1.m43267i(str3, 0, 0, 35, " \"#<>\\^`{|}") : null;
        String string = rthVarM69943g.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
                wj50.m88279p(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.f177464i;
    }
}
