package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ji61 {

    /* JADX INFO: renamed from: a */
    public final String f112679a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f112680b;

    public ji61(String str, ArrayList arrayList) {
        this.f112679a = str;
        this.f112680b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji61)) {
            return false;
        }
        ji61 ji61Var = (ji61) obj;
        return wj50.m88271j(this.f112679a, ji61Var.f112679a) && this.f112680b.equals(ji61Var.f112680b);
    }

    public final int hashCode() {
        return this.f112680b.hashCode() + (this.f112679a.hashCode() * 31);
    }
}
