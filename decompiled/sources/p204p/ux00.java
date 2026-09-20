package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class ux00 extends amg1 {

    /* JADX INFO: renamed from: c */
    public final String f234764c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f234765d;

    public ux00(String str, LinkedHashMap linkedHashMap) {
        this.f234764c = str;
        this.f234765d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux00)) {
            return false;
        }
        ux00 ux00Var = (ux00) obj;
        return wj50.m88271j(this.f234764c, ux00Var.f234764c) && this.f234765d.equals(ux00Var.f234765d);
    }

    public final int hashCode() {
        return this.f234765d.hashCode() + (this.f234764c.hashCode() * 31);
    }
}
