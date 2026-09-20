package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ivl0 {

    /* JADX INFO: renamed from: a */
    public final Context f106232a;

    /* JADX INFO: renamed from: b */
    public final ci21 f106233b;

    /* JADX INFO: renamed from: c */
    public final ray0 f106234c;

    /* JADX INFO: renamed from: d */
    public final int f106235d;

    /* JADX INFO: renamed from: e */
    public final String f106236e;

    /* JADX INFO: renamed from: f */
    public final ywy f106237f;

    /* JADX INFO: renamed from: g */
    public final h4b f106238g;

    /* JADX INFO: renamed from: h */
    public final h4b f106239h;

    /* JADX INFO: renamed from: i */
    public final h4b f106240i;

    /* JADX INFO: renamed from: j */
    public final h5y f106241j;

    public ivl0(Context context, ci21 ci21Var, ray0 ray0Var, int i, String str, ywy ywyVar, h4b h4bVar, h4b h4bVar2, h4b h4bVar3, h5y h5yVar) {
        this.f106232a = context;
        this.f106233b = ci21Var;
        this.f106234c = ray0Var;
        this.f106235d = i;
        this.f106236e = str;
        this.f106237f = ywyVar;
        this.f106238g = h4bVar;
        this.f106239h = h4bVar2;
        this.f106240i = h4bVar3;
        this.f106241j = h5yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivl0)) {
            return false;
        }
        ivl0 ivl0Var = (ivl0) obj;
        return wj50.m88271j(this.f106232a, ivl0Var.f106232a) && wj50.m88271j(this.f106233b, ivl0Var.f106233b) && this.f106234c == ivl0Var.f106234c && this.f106235d == ivl0Var.f106235d && wj50.m88271j(this.f106236e, ivl0Var.f106236e) && wj50.m88271j(this.f106237f, ivl0Var.f106237f) && this.f106238g == ivl0Var.f106238g && this.f106239h == ivl0Var.f106239h && this.f106240i == ivl0Var.f106240i && wj50.m88271j(this.f106241j, ivl0Var.f106241j);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f106235d, (this.f106234c.hashCode() + ((this.f106233b.hashCode() + (this.f106232a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.f106236e;
        return this.f106241j.f87925a.hashCode() + ((this.f106240i.hashCode() + ((this.f106239h.hashCode() + ((this.f106238g.hashCode() + ((this.f106237f.hashCode() + ((iM40938f + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f106232a + ", size=" + this.f106233b + ", scale=" + this.f106234c + ", precision=" + m5p0.m60879k(this.f106235d) + ", diskCacheKey=" + this.f106236e + ", fileSystem=" + this.f106237f + ", memoryCachePolicy=" + this.f106238g + ", diskCachePolicy=" + this.f106239h + ", networkCachePolicy=" + this.f106240i + ", extras=" + this.f106241j + ')';
    }
}
