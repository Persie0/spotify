package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: classes7.dex */
public final class mqh0 implements oqh0 {

    /* JADX INFO: renamed from: a */
    public final RetrofitMaker f146287a;

    /* JADX INFO: renamed from: b */
    public final hv31 f146288b;

    public mqh0(RetrofitMaker retrofitMaker, hv31 hv31Var) {
        this.f146287a = retrofitMaker;
        this.f146288b = hv31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqh0)) {
            return false;
        }
        mqh0 mqh0Var = (mqh0) obj;
        return wj50.m88271j(this.f146287a, mqh0Var.f146287a) && wj50.m88271j(this.f146288b, mqh0Var.f146288b);
    }

    public final int hashCode() {
        return this.f146288b.hashCode() + (this.f146287a.hashCode() * 31);
    }
}
