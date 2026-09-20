package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class pwd implements rwd {

    /* JADX INFO: renamed from: a */
    public final String f181989a;

    /* JADX INFO: renamed from: b */
    public final akk f181990b;

    /* JADX INFO: renamed from: c */
    public final List f181991c;

    /* JADX INFO: renamed from: d */
    public final boolean f181992d;

    /* JADX INFO: renamed from: e */
    public final boolean f181993e;

    public pwd(String str, akk akkVar, List list, boolean z, boolean z2) {
        this.f181989a = str;
        this.f181990b = akkVar;
        this.f181991c = list;
        this.f181992d = z;
        this.f181993e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwd)) {
            return false;
        }
        pwd pwdVar = (pwd) obj;
        return wj50.m88271j(this.f181989a, pwdVar.f181989a) && wj50.m88271j(this.f181990b, pwdVar.f181990b) && wj50.m88271j(this.f181991c, pwdVar.f181991c) && this.f181992d == pwdVar.f181992d && this.f181993e == pwdVar.f181993e;
    }

    public final int hashCode() {
        String str = this.f181989a;
        return Boolean.hashCode(this.f181993e) + s571.m77245d(s571.m77244c((this.f181990b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f181991c), 31, this.f181992d);
    }
}
