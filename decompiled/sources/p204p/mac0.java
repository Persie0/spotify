package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mac0 implements nac0 {

    /* JADX INFO: renamed from: a */
    public final List f141553a;

    public mac0(List list) {
        this.f141553a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mac0) && wj50.m88271j(this.f141553a, ((mac0) obj).f141553a);
    }

    public final int hashCode() {
        return this.f141553a.hashCode();
    }
}
