package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class rus0 {

    /* JADX INFO: renamed from: a */
    public final String f202903a;

    /* JADX INFO: renamed from: b */
    public final String f202904b;

    /* JADX INFO: renamed from: c */
    public final int f202905c;

    /* JADX INFO: renamed from: d */
    public final c4m f202906d;

    /* JADX INFO: renamed from: e */
    public final Map f202907e;

    public rus0(String str, String str2, int i, c4m c4mVar, Map map) {
        this.f202903a = str;
        this.f202904b = str2;
        this.f202905c = i;
        this.f202906d = c4mVar;
        this.f202907e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rus0)) {
            return false;
        }
        rus0 rus0Var = (rus0) obj;
        return wj50.m88271j(this.f202903a, rus0Var.f202903a) && wj50.m88271j(this.f202904b, rus0Var.f202904b) && this.f202905c == rus0Var.f202905c && wj50.m88271j(this.f202906d, rus0Var.f202906d) && wj50.m88271j(this.f202907e, rus0Var.f202907e);
    }

    public final int hashCode() {
        String str = this.f202903a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f202904b;
        int iM40938f = f710.m40938f(this.f202905c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        c4m c4mVar = this.f202906d;
        return this.f202907e.hashCode() + ((iM40938f + (c4mVar != null ? c4mVar.hashCode() : 0)) * 31);
    }
}
