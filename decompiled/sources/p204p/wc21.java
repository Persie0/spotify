package p204p;

import com.spotify.mobius.Init;

/* JADX INFO: loaded from: classes10.dex */
public final class wc21 {

    /* JADX INFO: renamed from: a */
    public final qe70 f249941a;

    /* JADX INFO: renamed from: b */
    public final Object f249942b;

    /* JADX INFO: renamed from: c */
    public final Init f249943c;

    /* JADX INFO: renamed from: d */
    public final gh00 f249944d;

    public /* synthetic */ wc21(gh00 gh00Var, gh00 gh00Var2, Init init) {
        this(gh00Var, gh00Var2, init, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc21)) {
            return false;
        }
        wc21 wc21Var = (wc21) obj;
        return wj50.m88271j(this.f249941a, wc21Var.f249941a) && wj50.m88271j(this.f249942b, wc21Var.f249942b) && wj50.m88271j(this.f249943c, wc21Var.f249943c) && wj50.m88271j(this.f249944d, wc21Var.f249944d);
    }

    public final int hashCode() {
        int iHashCode = (this.f249943c.hashCode() + dq60.m36604d(this.f249941a.hashCode() * 31, 31, this.f249942b)) * 31;
        gh00 gh00Var = this.f249944d;
        return iHashCode + (gh00Var == null ? 0 : gh00Var.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wc21(gh00 gh00Var, gh00 gh00Var2, Init init, gh00 gh00Var3) {
        this.f249941a = (qe70) gh00Var;
        this.f249942b = gh00Var2;
        this.f249943c = init;
        this.f249944d = gh00Var3;
    }
}
