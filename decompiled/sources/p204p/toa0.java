package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class toa0 {

    /* JADX INFO: renamed from: a */
    public final String f222210a;

    /* JADX INFO: renamed from: b */
    public final String f222211b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f222212c;

    public toa0(String str, String str2, ArrayList arrayList) {
        this.f222210a = str;
        this.f222211b = str2;
        this.f222212c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toa0)) {
            return false;
        }
        toa0 toa0Var = (toa0) obj;
        return wj50.m88271j(this.f222210a, toa0Var.f222210a) && wj50.m88271j(this.f222211b, toa0Var.f222211b) && this.f222212c.equals(toa0Var.f222212c);
    }

    public final int hashCode() {
        return this.f222212c.hashCode() + s571.m77243b(this.f222210a.hashCode() * 31, 31, this.f222211b);
    }
}
