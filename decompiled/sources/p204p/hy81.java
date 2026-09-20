package p204p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: classes5.dex */
public final class hy81 {

    /* JADX INFO: renamed from: a */
    public final int f96499a;

    /* JADX INFO: renamed from: b */
    public final String f96500b;

    /* JADX INFO: renamed from: c */
    public final int f96501c;

    /* JADX INFO: renamed from: d */
    public final BetamaxTranscoderException f96502d;

    public hy81(int i, String str, int i2, BetamaxTranscoderException betamaxTranscoderException) {
        this.f96499a = i;
        this.f96500b = str;
        this.f96501c = i2;
        this.f96502d = betamaxTranscoderException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy81)) {
            return false;
        }
        hy81 hy81Var = (hy81) obj;
        return this.f96499a == hy81Var.f96499a && wj50.m88271j(this.f96500b, hy81Var.f96500b) && this.f96501c == hy81Var.f96501c && this.f96502d.equals(hy81Var.f96502d);
    }

    public final int hashCode() {
        return this.f96502d.hashCode() + f710.m40938f(this.f96501c, s571.m77243b(Integer.hashCode(this.f96499a) * 31, 31, this.f96500b), 31);
    }
}
