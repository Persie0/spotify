package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class htj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f95051a;

    /* JADX INFO: renamed from: b */
    public final ae50 f95052b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f95053c;

    public htj(String str, ae50 ae50Var, ArrayList arrayList) {
        this.f95051a = str;
        this.f95052b = ae50Var;
        this.f95053c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htj)) {
            return false;
        }
        htj htjVar = (htj) obj;
        return wj50.m88271j(this.f95051a, htjVar.f95051a) && this.f95052b.equals(htjVar.f95052b) && this.f95053c.equals(htjVar.f95053c);
    }

    public final int hashCode() {
        String str = this.f95051a;
        return this.f95053c.hashCode() + ((this.f95052b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }
}
