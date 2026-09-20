package p204p;

import com.spotify.player.model.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class l0l0 {

    /* JADX INFO: renamed from: a */
    public final Context f128469a;

    /* JADX INFO: renamed from: b */
    public final boolean f128470b;

    public l0l0(Context context, boolean z) {
        this.f128469a = context;
        this.f128470b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0l0)) {
            return false;
        }
        l0l0 l0l0Var = (l0l0) obj;
        return wj50.m88271j(this.f128469a, l0l0Var.f128469a) && this.f128470b == l0l0Var.f128470b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128470b) + (this.f128469a.hashCode() * 31);
    }
}
