package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class lyv0 {

    /* JADX INFO: renamed from: a */
    public final String f138122a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f138123b;

    public lyv0(String str, ArrayList arrayList) {
        this.f138122a = str;
        this.f138123b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyv0)) {
            return false;
        }
        lyv0 lyv0Var = (lyv0) obj;
        return wj50.m88271j(this.f138122a, lyv0Var.f138122a) && this.f138123b.equals(lyv0Var.f138123b);
    }

    public final int hashCode() {
        return this.f138123b.hashCode() + (this.f138122a.hashCode() * 31);
    }
}
