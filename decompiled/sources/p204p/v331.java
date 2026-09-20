package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class v331 {

    /* JADX INFO: renamed from: a */
    public final String f236766a;

    /* JADX INFO: renamed from: b */
    public final String f236767b;

    /* JADX INFO: renamed from: c */
    public final List f236768c;

    public v331(String str, List list, String str2) {
        this.f236766a = str;
        this.f236767b = str2;
        this.f236768c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v331)) {
            return false;
        }
        v331 v331Var = (v331) obj;
        return wj50.m88271j(this.f236766a, v331Var.f236766a) && wj50.m88271j(this.f236767b, v331Var.f236767b) && wj50.m88271j(this.f236768c, v331Var.f236768c);
    }

    public final int hashCode() {
        return this.f236768c.hashCode() + s571.m77243b(this.f236766a.hashCode() * 31, 31, this.f236767b);
    }
}
