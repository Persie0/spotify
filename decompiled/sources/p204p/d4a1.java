package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class d4a1 implements e4a1 {

    /* JADX INFO: renamed from: a */
    public final String f45122a;

    /* JADX INFO: renamed from: b */
    public final String f45123b;

    public d4a1(String str, String str2) {
        this.f45122a = str;
        this.f45123b = str2;
    }

    @Override // p204p.e4a1
    /* JADX INFO: renamed from: a */
    public final List mo31431a() {
        return Collections.singletonList(this.f45123b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4a1)) {
            return false;
        }
        d4a1 d4a1Var = (d4a1) obj;
        return wj50.m88271j(this.f45122a, d4a1Var.f45122a) && wj50.m88271j(this.f45123b, d4a1Var.f45123b);
    }

    public final int hashCode() {
        return this.f45123b.hashCode() + (this.f45122a.hashCode() * 31);
    }
}
