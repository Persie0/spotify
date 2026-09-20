package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class saw implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f207283a;

    /* JADX INFO: renamed from: b */
    public final String f207284b;

    public saw(String str, ae50 ae50Var) {
        this.f207283a = ae50Var;
        this.f207284b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saw)) {
            return false;
        }
        saw sawVar = (saw) obj;
        return wj50.m88271j(this.f207283a, sawVar.f207283a) && wj50.m88271j(this.f207284b, sawVar.f207284b);
    }

    public final int hashCode() {
        return this.f207284b.hashCode() + (this.f207283a.hashCode() * 31);
    }
}
