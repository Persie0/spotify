package p204p;

import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i221 {

    /* JADX INFO: renamed from: a */
    public static final PlaylistRequestDecorationPolicy f97709a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26432C();
        top0VarM18421v.m81214v(amp0VarM18396H);
        f97709a = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }
}
