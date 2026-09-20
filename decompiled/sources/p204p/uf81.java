package p204p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class uf81 {

    /* JADX INFO: renamed from: a */
    public final String f229721a;

    /* JADX INFO: renamed from: b */
    public final EsOfflinePlugin$IdentifyResponse.Result f229722b;

    public uf81(String str, EsOfflinePlugin$IdentifyResponse.Result result) {
        this.f229721a = str;
        this.f229722b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf81)) {
            return false;
        }
        uf81 uf81Var = (uf81) obj;
        return wj50.m88271j(this.f229721a, uf81Var.f229721a) && wj50.m88271j(this.f229722b, uf81Var.f229722b);
    }

    public final int hashCode() {
        return this.f229722b.hashCode() + (this.f229721a.hashCode() * 31);
    }
}
