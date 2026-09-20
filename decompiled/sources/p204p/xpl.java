package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class xpl implements ypl {

    /* JADX INFO: renamed from: a */
    public final String f264681a;

    /* JADX INFO: renamed from: b */
    public final String f264682b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f264683c;

    public xpl(String str, String str2, ArrayList arrayList) {
        this.f264681a = str;
        this.f264682b = str2;
        this.f264683c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpl)) {
            return false;
        }
        xpl xplVar = (xpl) obj;
        return wj50.m88271j(this.f264681a, xplVar.f264681a) && wj50.m88271j(this.f264682b, xplVar.f264682b) && this.f264683c.equals(xplVar.f264683c);
    }

    public final int hashCode() {
        int iHashCode = this.f264681a.hashCode() * 31;
        String str = this.f264682b;
        return this.f264683c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
