package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cf6 implements of6 {

    /* JADX INFO: renamed from: a */
    public final List f37275a;

    public cf6(List list) {
        this.f37275a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf6) && wj50.m88271j(this.f37275a, ((cf6) obj).f37275a);
    }

    public final int hashCode() {
        return this.f37275a.hashCode();
    }
}
