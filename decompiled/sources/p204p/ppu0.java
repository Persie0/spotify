package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ppu0 {

    /* JADX INFO: renamed from: a */
    public final List f180107a;

    /* JADX INFO: renamed from: b */
    public final String f180108b;

    /* JADX INFO: renamed from: c */
    public final String f180109c;

    public ppu0(String str, List list, String str2) {
        this.f180107a = list;
        this.f180108b = str;
        this.f180109c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppu0)) {
            return false;
        }
        ppu0 ppu0Var = (ppu0) obj;
        return wj50.m88271j(this.f180107a, ppu0Var.f180107a) && wj50.m88271j(this.f180108b, ppu0Var.f180108b) && wj50.m88271j(this.f180109c, ppu0Var.f180109c);
    }

    public final int hashCode() {
        return this.f180109c.hashCode() + s571.m77243b(this.f180107a.hashCode() * 31, 31, this.f180108b);
    }
}
