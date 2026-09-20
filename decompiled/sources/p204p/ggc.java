package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ggc {

    /* JADX INFO: renamed from: a */
    public final String f79630a;

    /* JADX INFO: renamed from: b */
    public final String f79631b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f79632c;

    public ggc(String str, String str2, ArrayList arrayList) {
        this.f79630a = str;
        this.f79631b = str2;
        this.f79632c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggc)) {
            return false;
        }
        ggc ggcVar = (ggc) obj;
        return wj50.m88271j(this.f79630a, ggcVar.f79630a) && wj50.m88271j(this.f79631b, ggcVar.f79631b) && this.f79632c.equals(ggcVar.f79632c);
    }

    public final int hashCode() {
        return this.f79632c.hashCode() + s571.m77243b(this.f79630a.hashCode() * 31, 31, this.f79631b);
    }
}
