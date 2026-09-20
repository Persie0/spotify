package p204p;

import android.net.Uri;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: classes10.dex */
public final class p611 implements kb9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f174270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s611 f174271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f174272c;

    public p611(sir0 sir0Var, s611 s611Var, String str) {
        this.f174270a = sir0Var;
        this.f174271b = s611Var;
        this.f174272c = str;
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: b */
    public final void mo35543b(long j, long j2) {
        this.f174271b.f205984h = j2;
        this.f174270a.mo30231j(new ry81((int) j));
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: c */
    public final void mo35544c(long j, int i, String str) {
        int iM38547C = edb.m38547C(i);
        sir0 sir0Var = this.f174270a;
        if (iM38547C == 2) {
            sir0Var.mo30231j(new sy81(str));
            return;
        }
        if (iM38547C == 3) {
            sir0Var.mo30231j(new py81(Uri.parse(this.f174272c.concat(".mp4"))));
            sir0Var.mo30210A(null);
        } else {
            if (iM38547C != 4) {
                return;
            }
            sir0Var.mo30231j(oy81.f171695a);
            sir0Var.mo30210A(null);
        }
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: g */
    public final void mo35546g(BetamaxTranscoderException betamaxTranscoderException, long j) {
        qy81 qy81Var = new qy81(betamaxTranscoderException);
        sir0 sir0Var = this.f174270a;
        sir0Var.mo30231j(qy81Var);
        sir0Var.mo30210A(null);
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: f */
    public final void mo35545f(long j, boolean z) {
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: a */
    public final void mo35542a(int i, long j, long j2) {
    }
}
