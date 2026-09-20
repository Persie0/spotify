package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class hji {

    /* JADX INFO: renamed from: a */
    public final String f92054a;

    /* JADX INFO: renamed from: b */
    public final yjx0 f92055b;

    /* JADX INFO: renamed from: c */
    public final zvm0 f92056c;

    /* JADX INFO: renamed from: d */
    public final ExternalAccessoryDescription f92057d;

    /* JADX INFO: renamed from: e */
    public final Set f92058e;

    public hji(String str, yjx0 yjx0Var, zvm0 zvm0Var, ExternalAccessoryDescription externalAccessoryDescription, Set set) {
        this.f92054a = str;
        this.f92055b = yjx0Var;
        this.f92056c = zvm0Var;
        this.f92057d = externalAccessoryDescription;
        this.f92058e = set;
    }

    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription m47688a() {
        return this.f92057d;
    }

    /* JADX INFO: renamed from: b */
    public final String m47689b() {
        return this.f92054a;
    }

    /* JADX INFO: renamed from: c */
    public final zvm0 m47690c() {
        return this.f92056c;
    }

    /* JADX INFO: renamed from: d */
    public final yjx0 m47691d() {
        return this.f92055b;
    }

    /* JADX INFO: renamed from: e */
    public final Set m47692e() {
        return this.f92058e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hji)) {
            return false;
        }
        hji hjiVar = (hji) obj;
        return wj50.m88271j(this.f92054a, hjiVar.f92054a) && wj50.m88271j(this.f92055b, hjiVar.f92055b) && wj50.m88271j(this.f92056c, hjiVar.f92056c) && wj50.m88271j(this.f92057d, hjiVar.f92057d) && wj50.m88271j(this.f92058e, hjiVar.f92058e);
    }

    public final int hashCode() {
        return this.f92058e.hashCode() + ((this.f92057d.hashCode() + s571.m77243b((this.f92055b.hashCode() + (this.f92054a.hashCode() * 31)) * 31, 31, this.f92056c.f286742a)) * 31);
    }
}
