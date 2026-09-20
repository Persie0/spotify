package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wxv0 {

    /* JADX INFO: renamed from: a */
    public final String f256135a;

    /* JADX INFO: renamed from: b */
    public final List f256136b;

    /* JADX INFO: renamed from: c */
    public final byv0 f256137c;

    public wxv0(String str, List list, byv0 byv0Var) {
        this.f256135a = str;
        this.f256136b = list;
        this.f256137c = byv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxv0)) {
            return false;
        }
        wxv0 wxv0Var = (wxv0) obj;
        return wj50.m88271j(this.f256135a, wxv0Var.f256135a) && wj50.m88271j(this.f256136b, wxv0Var.f256136b) && wj50.m88271j(this.f256137c, wxv0Var.f256137c);
    }

    public final int hashCode() {
        return this.f256137c.hashCode() + s571.m77244c(this.f256135a.hashCode() * 31, 31, this.f256136b);
    }
}
