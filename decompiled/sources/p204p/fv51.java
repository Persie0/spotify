package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class fv51 {

    /* JADX INFO: renamed from: a */
    public final String f73680a;

    /* JADX INFO: renamed from: b */
    public final Boolean f73681b;

    /* JADX INFO: renamed from: c */
    public final int f73682c;

    /* JADX INFO: renamed from: d */
    public final int f73683d;

    /* JADX INFO: renamed from: e */
    public final int f73684e;

    /* JADX INFO: renamed from: f */
    public final String f73685f;

    /* JADX INFO: renamed from: g */
    public final boolean f73686g;

    /* JADX INFO: renamed from: h */
    public final String f73687h;

    /* JADX INFO: renamed from: i */
    public final String f73688i;

    public /* synthetic */ fv51(String str) {
        this(str, null, 0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public final String m42757a() {
        return this.f73685f;
    }

    /* JADX INFO: renamed from: b */
    public final int m42758b() {
        return this.f73684e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42759c() {
        return this.f73686g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fv51)) {
            return false;
        }
        fv51 fv51Var = (fv51) obj;
        return fv51Var.f73686g == this.f73686g && wj50.m88271j(fv51Var.f73685f, this.f73685f) && fv51Var.f73682c == this.f73682c && fv51Var.f73683d == this.f73683d && fv51Var.f73684e == this.f73684e;
    }

    public final int hashCode() {
        return (this.f73685f.hashCode() * 31) + (this.f73686g ? 1 : 0);
    }

    public fv51(String str, Boolean bool, int i, int i2, int i3) {
        List listM44518y;
        Collection collectionM43714b1;
        this.f73680a = str;
        this.f73681b = bool;
        this.f73682c = i;
        this.f73683d = i2;
        this.f73684e = i3;
        Pattern patternCompile = Pattern.compile("-x-");
        wl51.m88474X0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listM44518y = arrayList;
        } else {
            listM44518y = geg1.m44518y(str.toString());
        }
        if (!listM44518y.isEmpty()) {
            ListIterator listIterator = listM44518y.listIterator(listM44518y.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionM43714b1 = lau.f131415a;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    collectionM43714b1 = g6f.m43714b1(listM44518y, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            collectionM43714b1 = lau.f131415a;
            break;
        }
        String[] strArr = (String[]) collectionM43714b1.toArray(new String[0]);
        if (strArr.length == 1) {
            this.f73685f = this.f73680a;
            this.f73686g = wj50.m88271j(this.f73681b, Boolean.TRUE);
        } else {
            this.f73685f = strArr[0];
            this.f73686g = "cc".equals(strArr[1]);
        }
        this.f73687h = s571.m77250i(this.f73685f, this.f73686g ? "-x-cc" : "");
        this.f73688i = this.f73685f.length() >= 2 ? this.f73685f.substring(0, 2) : "";
    }
}
