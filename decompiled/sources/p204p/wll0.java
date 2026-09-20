package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class wll0 {

    /* JADX INFO: renamed from: a */
    public final String f252576a;

    /* JADX INFO: renamed from: b */
    public final String f252577b;

    /* JADX INFO: renamed from: c */
    public final List f252578c;

    /* JADX INFO: renamed from: d */
    public final boolean f252579d;

    public wll0(String str, String str2, ArrayList arrayList, boolean z) {
        this.f252576a = str;
        this.f252577b = str2;
        this.f252578c = arrayList;
        this.f252579d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wll0)) {
            return false;
        }
        wll0 wll0Var = (wll0) obj;
        return wj50.m88271j(this.f252576a, wll0Var.f252576a) && wj50.m88271j(this.f252577b, wll0Var.f252577b) && wj50.m88271j(this.f252578c, wll0Var.f252578c) && this.f252579d == wll0Var.f252579d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252579d) + s571.m77244c(s571.m77243b(this.f252576a.hashCode() * 31, 31, this.f252577b), 31, this.f252578c);
    }
}
