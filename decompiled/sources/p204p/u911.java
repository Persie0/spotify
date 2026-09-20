package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class u911 {

    /* JADX INFO: renamed from: a */
    public final String f228055a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f228056b;

    public u911(String str, ArrayList arrayList) {
        this.f228055a = str;
        this.f228056b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u911)) {
            return false;
        }
        u911 u911Var = (u911) obj;
        return wj50.m88271j(this.f228055a, u911Var.f228055a) && this.f228056b.equals(u911Var.f228056b);
    }

    public final int hashCode() {
        return this.f228056b.hashCode() + (this.f228055a.hashCode() * 31);
    }
}
