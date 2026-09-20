package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class s71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f206256a;

    /* JADX INFO: renamed from: b */
    public final boolean f206257b;

    /* JADX INFO: renamed from: c */
    public final String f206258c;

    public s71(String str, ArrayList arrayList, boolean z) {
        this.f206256a = arrayList;
        this.f206257b = z;
        this.f206258c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s71)) {
            return false;
        }
        s71 s71Var = (s71) obj;
        return this.f206256a.equals(s71Var.f206256a) && this.f206257b == s71Var.f206257b && wj50.m88271j(this.f206258c, s71Var.f206258c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f206256a.hashCode() * 31, 31, this.f206257b);
        String str = this.f206258c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
