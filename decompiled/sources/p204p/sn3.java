package p204p;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class sn3 {

    /* JADX INFO: renamed from: a */
    public final String f210789a;

    /* JADX INFO: renamed from: b */
    public final String f210790b;

    /* JADX INFO: renamed from: c */
    public final boolean f210791c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1861fi f210792d;

    /* JADX INFO: renamed from: e */
    public final EnumSet f210793e;

    public sn3(String str, String str2, boolean z, AbstractC1861fi abstractC1861fi, EnumSet enumSet) {
        this.f210789a = str;
        this.f210790b = str2;
        this.f210791c = z;
        this.f210792d = abstractC1861fi;
        this.f210793e = enumSet;
    }

    /* JADX INFO: renamed from: a */
    public final String m78541a() {
        return this.f210790b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1861fi m78542b() {
        return this.f210792d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m78543c(String str, String str2) {
        b1x0 b1x0Var;
        Object next;
        if (!this.f210790b.equals(str2)) {
            return false;
        }
        Iterator it = b1x0.f22435e.iterator();
        do {
            b1x0Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((b1x0) next).f22436a.equals(str));
        b1x0 b1x0Var2 = (b1x0) next;
        if (b1x0Var2 == null) {
            na6.m63957e("No resource found for name: ".concat(str));
        } else {
            b1x0Var = b1x0Var2;
        }
        return this.f210793e.contains(b1x0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn3)) {
            return false;
        }
        sn3 sn3Var = (sn3) obj;
        return this.f210789a.equals(sn3Var.f210789a) && this.f210790b.equals(sn3Var.f210790b) && this.f210791c == sn3Var.f210791c && this.f210792d.equals(sn3Var.f210792d) && this.f210793e.equals(sn3Var.f210793e);
    }

    public final int hashCode() {
        return this.f210793e.hashCode() + ((this.f210792d.hashCode() + s571.m77245d(s571.m77243b(this.f210789a.hashCode() * 31, 31, this.f210790b), 31, this.f210791c)) * 31);
    }
}
