package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class dob0 implements eob0 {

    /* JADX INFO: renamed from: a */
    public final Map f51004a;

    public dob0(Map map) {
        this.f51004a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dob0) && wj50.m88271j(this.f51004a, ((dob0) obj).f51004a);
    }

    public final int hashCode() {
        return this.f51004a.hashCode();
    }
}
