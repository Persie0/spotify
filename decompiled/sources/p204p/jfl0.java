package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class jfl0 extends mfl0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f111935a;

    /* JADX INFO: renamed from: b */
    public final String f111936b;

    public jfl0(ArrayList arrayList, String str) {
        this.f111935a = arrayList;
        this.f111936b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfl0)) {
            return false;
        }
        jfl0 jfl0Var = (jfl0) obj;
        return this.f111935a.equals(jfl0Var.f111935a) && wj50.m88271j(this.f111936b, jfl0Var.f111936b);
    }

    public final int hashCode() {
        return this.f111936b.hashCode() + (this.f111935a.hashCode() * 31);
    }
}
