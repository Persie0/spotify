package p204p;

import android.content.ComponentName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dnx0 {

    /* JADX INFO: renamed from: a */
    public final List f50887a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f50888b;

    /* JADX INFO: renamed from: c */
    public final ComponentName f50889c;

    public dnx0(List list, ComponentName componentName, ComponentName componentName2, int i) {
        list = (i & 1) != 0 ? lau.f131415a : list;
        componentName = (i & 2) != 0 ? null : componentName;
        componentName2 = (i & 4) != 0 ? null : componentName2;
        this.f50887a = list;
        this.f50888b = componentName;
        this.f50889c = componentName2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnx0)) {
            return false;
        }
        dnx0 dnx0Var = (dnx0) obj;
        return wj50.m88271j(this.f50887a, dnx0Var.f50887a) && wj50.m88271j(this.f50888b, dnx0Var.f50888b) && wj50.m88271j(this.f50889c, dnx0Var.f50889c);
    }

    public final int hashCode() {
        int iHashCode = this.f50887a.hashCode() * 31;
        ComponentName componentName = this.f50888b;
        int iHashCode2 = (iHashCode + (componentName == null ? 0 : componentName.hashCode())) * 31;
        ComponentName componentName2 = this.f50889c;
        return Boolean.hashCode(false) + ((iHashCode2 + (componentName2 == null ? 0 : componentName2.hashCode())) * 31);
    }
}
