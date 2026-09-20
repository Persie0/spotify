package p204p;

import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class yc90 extends dfy {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f271431d;

    /* JADX WARN: Illegal instructions before constructor call */
    public yc90(int i) {
        this.f271431d = i;
        switch (i) {
            case 1:
                bps0 bps0Var = bps0.f29602a;
                aps0 aps0Var = aps0.f18006a;
                super("Spotify.Feature.PromptedPlaylist", h6f.m46715L(bps0Var, aps0Var), kkc0.m56695h0(new pqm0(bps0Var, new f50("Spotify.Feature.PromptedPlaylist", "view_prompt", null, 114)), new pqm0(aps0Var, new f50("Spotify.Feature.PromptedPlaylist", "generate", oub.f170240b, 82))));
                break;
            case 2:
                uux0 uux0Var = uux0.f234297c;
                uux0 uux0Var2 = uux0.f234296b;
                super("Spotify.Feature.RunningMode", h6f.m46715L(uux0Var, uux0Var2), kkc0.m56695h0(new pqm0(uux0Var, new f50("Spotify.Feature.RunningMode", "view", null, 98)), new pqm0(uux0Var2, new f50("Spotify.Feature.RunningMode", "generate", oub.f170241c, 66))));
                break;
            default:
                r890 r890Var = r890.f196740a;
                super("Spotify.Feature.ListeningActivity", Collections.singletonList(r890Var), Collections.singletonMap(r890Var, new f50("listening-activity", "access_listening_activity", null, 116)));
                break;
        }
    }

    @Override // p204p.bfy
    /* JADX INFO: renamed from: a */
    public final g40 mo29042a(bji bjiVar) {
        switch (this.f271431d) {
            case 0:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!((ze90) bjiVar.mo29483e(xc90.f260165b)).m95976k()) {
                    linkedHashSet.add(r890.f196740a);
                }
                return new g40(linkedHashSet);
            case 1:
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                if (!((ee4) bjiVar.mo29483e(xc90.f260167d)).m38642a()) {
                    linkedHashSet2.add(bps0.f29602a);
                }
                l54 l54Var = (l54) bjiVar.mo29483e(xc90.f260168e);
                boolean zM58195d = l54Var.m58195d();
                if (l54Var.m58194c()) {
                    zM58195d = true;
                }
                if (!zM58195d) {
                    linkedHashSet2.add(aps0.f18006a);
                }
                return new g40(linkedHashSet2);
            default:
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                if (!((b84) bjiVar.mo29483e(xc90.f260169f)).m28411b()) {
                    linkedHashSet3.add(uux0.f234297c);
                }
                if (!((b84) bjiVar.mo29483e(xc90.f260170g)).m28411b()) {
                    linkedHashSet3.add(uux0.f234296b);
                }
                return new g40(linkedHashSet3);
        }
    }
}
