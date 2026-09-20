package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class l3s0 {

    /* JADX INFO: renamed from: a */
    public final String f129421a;

    /* JADX INFO: renamed from: b */
    public final String f129422b;

    /* JADX INFO: renamed from: c */
    public final List f129423c;

    public l3s0(String str, List list, String str2) {
        this.f129421a = str;
        this.f129422b = str2;
        this.f129423c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3s0)) {
            return false;
        }
        l3s0 l3s0Var = (l3s0) obj;
        return wj50.m88271j(this.f129421a, l3s0Var.f129421a) && wj50.m88271j(this.f129422b, l3s0Var.f129422b) && wj50.m88271j(this.f129423c, l3s0Var.f129423c);
    }

    public final int hashCode() {
        return this.f129423c.hashCode() + s571.m77243b(this.f129421a.hashCode() * 31, 31, this.f129422b);
    }
}
