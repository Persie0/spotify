package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class uz1 implements yz1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f235399a;

    /* JADX INFO: renamed from: b */
    public final String f235400b;

    /* JADX INFO: renamed from: c */
    public final boolean f235401c;

    public uz1(String str, ArrayList arrayList, boolean z) {
        this.f235399a = arrayList;
        this.f235400b = str;
        this.f235401c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz1)) {
            return false;
        }
        uz1 uz1Var = (uz1) obj;
        return this.f235399a.equals(uz1Var.f235399a) && wj50.m88271j(this.f235400b, uz1Var.f235400b) && this.f235401c == uz1Var.f235401c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235401c) + s571.m77243b(this.f235399a.hashCode() * 31, 31, this.f235400b);
    }
}
