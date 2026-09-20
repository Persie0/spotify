package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class l911 {

    /* JADX INFO: renamed from: a */
    public final String f130979a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f130980b;

    public l911(String str, ArrayList arrayList) {
        this.f130979a = str;
        this.f130980b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l911)) {
            return false;
        }
        l911 l911Var = (l911) obj;
        return wj50.m88271j(this.f130979a, l911Var.f130979a) && this.f130980b.equals(l911Var.f130980b);
    }

    public final int hashCode() {
        return this.f130980b.hashCode() + (this.f130979a.hashCode() * 31);
    }
}
