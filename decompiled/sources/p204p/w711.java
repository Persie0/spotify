package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class w711 implements x711 {

    /* JADX INFO: renamed from: a */
    public final int f248512a;

    /* JADX INFO: renamed from: b */
    public final List f248513b;

    /* JADX INFO: renamed from: c */
    public final boolean f248514c;

    /* JADX INFO: renamed from: d */
    public final int f248515d;

    /* JADX INFO: renamed from: e */
    public final xcl0 f248516e;

    /* JADX INFO: renamed from: f */
    public final String f248517f;

    /* JADX INFO: renamed from: g */
    public final jjw0 f248518g;

    /* JADX INFO: renamed from: h */
    public final String f248519h;

    public w711(int i, List list, boolean z, int i2, xcl0 xcl0Var, String str, jjw0 jjw0Var) {
        this.f248512a = i;
        this.f248513b = list;
        this.f248514c = z;
        this.f248515d = i2;
        this.f248516e = xcl0Var;
        this.f248517f = str;
        this.f248518g = jjw0Var;
        this.f248519h = str;
    }

    @Override // p204p.x711
    /* JADX INFO: renamed from: a */
    public final xcl0 mo84822a() {
        return this.f248516e;
    }

    @Override // p204p.x711
    /* JADX INFO: renamed from: b */
    public final List mo84823b() {
        return this.f248513b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w711)) {
            return false;
        }
        w711 w711Var = (w711) obj;
        return this.f248512a == w711Var.f248512a && wj50.m88271j(this.f248513b, w711Var.f248513b) && this.f248514c == w711Var.f248514c && this.f248515d == w711Var.f248515d && wj50.m88271j(this.f248516e, w711Var.f248516e) && wj50.m88271j(this.f248517f, w711Var.f248517f) && this.f248518g.equals(w711Var.f248518g);
    }

    @Override // p204p.x711
    public final String getChatUri() {
        return this.f248517f;
    }

    @Override // p204p.x711
    public final String getDestination() {
        return this.f248519h;
    }

    @Override // p204p.x711
    public final boolean getEnabled() {
        return this.f248514c;
    }

    @Override // p204p.x711
    public final int getPosition() {
        return this.f248512a;
    }

    public final int hashCode() {
        return this.f248518g.hashCode() + s571.m77243b((this.f248516e.hashCode() + f710.m40938f(this.f248515d, s571.m77245d(s571.m77244c(Integer.hashCode(this.f248512a) * 31, 31, this.f248513b), 31, this.f248514c), 31)) * 31, 31, this.f248517f);
    }
}
