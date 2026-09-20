package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xco {

    /* JADX INFO: renamed from: a */
    public final String f260264a;

    /* JADX INFO: renamed from: b */
    public final String f260265b;

    /* JADX INFO: renamed from: c */
    public final String f260266c;

    /* JADX INFO: renamed from: d */
    public final boolean f260267d;

    /* JADX INFO: renamed from: e */
    public final boolean f260268e;

    /* JADX INFO: renamed from: f */
    public final Map f260269f;

    public xco(String str, String str2, String str3, boolean z, boolean z2, Map map) {
        this.f260264a = str;
        this.f260265b = str2;
        this.f260266c = str3;
        this.f260267d = z;
        this.f260268e = z2;
        this.f260269f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xco)) {
            return false;
        }
        xco xcoVar = (xco) obj;
        return wj50.m88271j(this.f260264a, xcoVar.f260264a) && wj50.m88271j(this.f260265b, xcoVar.f260265b) && wj50.m88271j(this.f260266c, xcoVar.f260266c) && this.f260267d == xcoVar.f260267d && this.f260268e == xcoVar.f260268e && wj50.m88271j(this.f260269f, xcoVar.f260269f);
    }

    public final int hashCode() {
        return this.f260269f.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f260264a.hashCode() * 31, 31, this.f260265b), 31, this.f260266c), 31, this.f260267d), 31, this.f260268e);
    }
}
