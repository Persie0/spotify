package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hi0 implements ro0 {

    /* JADX INFO: renamed from: a */
    public final ro0 f91624a;

    /* JADX INFO: renamed from: b */
    public final di0 f91625b;

    /* JADX INFO: renamed from: c */
    public final Object f91626c;

    /* JADX INFO: renamed from: d */
    public final String f91627d;

    /* JADX INFO: renamed from: e */
    public final bi0 f91628e;

    /* JADX INFO: renamed from: f */
    public final String f91629f;

    /* JADX INFO: renamed from: g */
    public final String f91630g;

    /* JADX INFO: renamed from: h */
    public final String f91631h;

    /* JADX INFO: renamed from: i */
    public final String f91632i;

    public hi0(fh0 fh0Var, di0 di0Var, List list, String str, bi0 bi0Var, String str2, String str3, String str4, String str5) {
        this.f91624a = fh0Var;
        this.f91625b = di0Var;
        this.f91626c = list;
        this.f91627d = str;
        this.f91628e = bi0Var;
        this.f91629f = str2;
        this.f91630g = str3;
        this.f91631h = str4;
        this.f91632i = str5;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f91624a.mo29280c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return wj50.m88271j(this.f91624a, hi0Var.f91624a) && this.f91625b.equals(hi0Var.f91625b) && this.f91626c.equals(hi0Var.f91626c) && wj50.m88271j(this.f91627d, hi0Var.f91627d) && this.f91628e.equals(hi0Var.f91628e) && wj50.m88271j(this.f91629f, hi0Var.f91629f) && wj50.m88271j(this.f91630g, hi0Var.f91630g) && wj50.m88271j(this.f91631h, hi0Var.f91631h) && wj50.m88271j(this.f91632i, hi0Var.f91632i);
    }

    public final int hashCode() {
        return this.f91632i.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((this.f91628e.hashCode() + s571.m77243b(dq60.m36604d((this.f91625b.hashCode() + (this.f91624a.hashCode() * 31)) * 31, 31, this.f91626c), 31, this.f91627d)) * 31, 31, this.f91629f), 31, this.f91630g), 31, this.f91631h);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f91624a.mo29283j();
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f91624a.mo29285l();
    }
}
