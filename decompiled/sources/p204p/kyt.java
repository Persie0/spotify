package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class kyt implements nyt {

    /* JADX INFO: renamed from: a */
    public final String f127911a;

    public kyt(String str) {
        this.f127911a = str;
    }

    @Override // p204p.nyt
    /* JADX INFO: renamed from: a */
    public final String mo54816a() {
        return this.f127911a;
    }

    @Override // p204p.nyt
    /* JADX INFO: renamed from: b */
    public final Set mo54817b() {
        return gbu.f78413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyt) && wj50.m88271j(this.f127911a, ((kyt) obj).f127911a);
    }

    @Override // p204p.nyt
    public final int getStatus() {
        return 1;
    }

    public final int hashCode() {
        return this.f127911a.hashCode();
    }
}
