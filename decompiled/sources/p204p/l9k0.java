package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l9k0 {

    /* JADX INFO: renamed from: a */
    public final up60 f131140a;

    /* JADX INFO: renamed from: b */
    public final Bundle f131141b;

    public l9k0(up60 up60Var, Bundle bundle) {
        this.f131140a = up60Var;
        this.f131141b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9k0)) {
            return false;
        }
        l9k0 l9k0Var = (l9k0) obj;
        return wj50.m88271j(this.f131140a, l9k0Var.f131140a) && wj50.m88271j(this.f131141b, l9k0Var.f131141b);
    }

    public final int hashCode() {
        return this.f131141b.hashCode() + (this.f131140a.hashCode() * 31);
    }
}
