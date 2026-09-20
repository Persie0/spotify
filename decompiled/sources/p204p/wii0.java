package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wii0 {

    /* JADX INFO: renamed from: a */
    public final String f251636a;

    /* JADX INFO: renamed from: b */
    public final List f251637b;

    public wii0(String str, ae50 ae50Var) {
        this.f251636a = str;
        this.f251637b = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wii0)) {
            return false;
        }
        wii0 wii0Var = (wii0) obj;
        return wj50.m88271j(this.f251636a, wii0Var.f251636a) && wj50.m88271j(this.f251637b, wii0Var.f251637b);
    }

    public final int hashCode() {
        return this.f251637b.hashCode() + (this.f251636a.hashCode() * 31);
    }
}
