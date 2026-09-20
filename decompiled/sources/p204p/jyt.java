package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class jyt implements nyt {

    /* JADX INFO: renamed from: a */
    public final String f117485a;

    /* JADX INFO: renamed from: b */
    public final Set f117486b;

    public jyt(String str, Set set) {
        this.f117485a = str;
        this.f117486b = set;
    }

    @Override // p204p.nyt
    /* JADX INFO: renamed from: a */
    public final String mo54816a() {
        return this.f117485a;
    }

    @Override // p204p.nyt
    /* JADX INFO: renamed from: b */
    public final Set mo54817b() {
        return this.f117486b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyt)) {
            return false;
        }
        jyt jytVar = (jyt) obj;
        return wj50.m88271j(this.f117485a, jytVar.f117485a) && wj50.m88271j(this.f117486b, jytVar.f117486b);
    }

    @Override // p204p.nyt
    public final int getStatus() {
        return 2;
    }

    public final int hashCode() {
        return this.f117486b.hashCode() + (this.f117485a.hashCode() * 31);
    }
}
