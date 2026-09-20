package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class baz0 implements ina0 {

    /* JADX INFO: renamed from: a */
    public final String f25365a;

    /* JADX INFO: renamed from: b */
    public final String f25366b;

    /* JADX INFO: renamed from: c */
    public final String f25367c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f25368d;

    public baz0(String str, String str2, String str3, ArrayList arrayList) {
        this.f25365a = str;
        this.f25366b = str2;
        this.f25367c = str3;
        this.f25368d = arrayList;
    }

    @Override // p204p.ina0
    /* JADX INFO: renamed from: a */
    public final String mo28603a() {
        return this.f25365a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baz0)) {
            return false;
        }
        baz0 baz0Var = (baz0) obj;
        return wj50.m88271j(this.f25365a, baz0Var.f25365a) && wj50.m88271j(this.f25366b, baz0Var.f25366b) && wj50.m88271j(this.f25367c, baz0Var.f25367c) && this.f25368d.equals(baz0Var.f25368d);
    }

    public final int hashCode() {
        String str = this.f25365a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f25366b);
        String str2 = this.f25367c;
        return this.f25368d.hashCode() + ((iM77243b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
