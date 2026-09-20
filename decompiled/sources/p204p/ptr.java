package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ptr {

    /* JADX INFO: renamed from: a */
    public final String f181237a;

    /* JADX INFO: renamed from: b */
    public final f5u f181238b;

    /* JADX INFO: renamed from: c */
    public final fh0 f181239c;

    /* JADX INFO: renamed from: d */
    public final String f181240d;

    /* JADX INFO: renamed from: e */
    public final String f181241e;

    /* JADX INFO: renamed from: f */
    public final String f181242f;

    /* JADX INFO: renamed from: g */
    public final String f181243g;

    public ptr(String str, f5u f5uVar, fh0 fh0Var, String str2, String str3, String str4, String str5) {
        this.f181237a = str;
        this.f181238b = f5uVar;
        this.f181239c = fh0Var;
        this.f181240d = str2;
        this.f181241e = str3;
        this.f181242f = str4;
        this.f181243g = str5;
    }

    /* JADX INFO: renamed from: a */
    public final f5u m71011a() {
        return this.f181238b;
    }

    /* JADX INFO: renamed from: b */
    public final String m71012b() {
        return this.f181237a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptr)) {
            return false;
        }
        ptr ptrVar = (ptr) obj;
        return wj50.m88271j(this.f181237a, ptrVar.f181237a) && wj50.m88271j(this.f181238b, ptrVar.f181238b) && wj50.m88271j(this.f181239c, ptrVar.f181239c) && wj50.m88271j(this.f181240d, ptrVar.f181240d) && wj50.m88271j(this.f181241e, ptrVar.f181241e) && wj50.m88271j(this.f181242f, ptrVar.f181242f) && wj50.m88271j(this.f181243g, ptrVar.f181243g);
    }

    public final int hashCode() {
        return this.f181243g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((this.f181239c.hashCode() + ((this.f181238b.hashCode() + (this.f181237a.hashCode() * 31)) * 31)) * 31, 31, this.f181240d), 31, this.f181241e), 31, this.f181242f);
    }
}
