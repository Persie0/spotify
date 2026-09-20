package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jhk0 implements lhk0 {

    /* JADX INFO: renamed from: a */
    public final String f112499a;

    /* JADX INFO: renamed from: b */
    public final List f112500b;

    /* JADX INFO: renamed from: c */
    public final String f112501c;

    public jhk0(String str, List list, String str2) {
        this.f112499a = str;
        this.f112500b = list;
        this.f112501c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhk0)) {
            return false;
        }
        jhk0 jhk0Var = (jhk0) obj;
        return wj50.m88271j(this.f112499a, jhk0Var.f112499a) && wj50.m88271j(this.f112500b, jhk0Var.f112500b) && wj50.m88271j(this.f112501c, jhk0Var.f112501c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f112499a.hashCode() * 31, 31, this.f112500b);
        String str = this.f112501c;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }
}
