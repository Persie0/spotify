package p204p;

import com.spotify.common.uri.SpotifyUriParserException;

/* JADX INFO: loaded from: classes7.dex */
public final class r9k {

    /* JADX INFO: renamed from: a */
    public final gf41 f197070a;

    public r9k(String str) {
        gf41 gf41Var;
        if (str == null || str.length() == 0) {
            gf41Var = null;
        } else {
            try {
                gf41Var = new gf41(str);
            } catch (SpotifyUriParserException unused) {
                gf41Var = null;
            }
        }
        this.f197070a = gf41Var;
    }

    public final boolean equals(Object obj) {
        gf41 gf41Var;
        gf41 gf41Var2;
        if (!(obj instanceof r9k) || (gf41Var = this.f197070a) == null || (gf41Var2 = ((r9k) obj).f197070a) == null) {
            return false;
        }
        if (gf41Var.m44579i(gf41Var2)) {
            return true;
        }
        return tg1.m80723m(gf41Var.toString()) && tg1.m80723m(gf41Var2.toString());
    }

    public final int hashCode() {
        gf41 gf41Var = this.f197070a;
        if (gf41Var == null) {
            return 1;
        }
        df41 df41Var = gf41Var.f79270c;
        if (df41Var != df41.PLAYLIST && df41Var != df41.PLAYLIST_V2) {
            return gf41Var.hashCode();
        }
        String str = gf41Var.f79272e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        gf41 gf41Var = this.f197070a;
        String string = gf41Var != null ? gf41Var.toString() : null;
        return (string == null || string.length() == 0) ? "<empty>" : string;
    }
}
