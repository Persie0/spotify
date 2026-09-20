package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s4o0 {

    /* JADX INFO: renamed from: a */
    public final String f205620a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f205621b;

    public s4o0(String str, ArrayList arrayList) {
        this.f205620a = str;
        this.f205621b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4o0)) {
            return false;
        }
        s4o0 s4o0Var = (s4o0) obj;
        return wj50.m88271j(this.f205620a, s4o0Var.f205620a) && this.f205621b.equals(s4o0Var.f205621b);
    }

    public final int hashCode() {
        return this.f205621b.hashCode() + (this.f205620a.hashCode() * 31);
    }
}
