package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes7.dex */
public abstract class oz80 {

    /* JADX INFO: renamed from: a */
    public static final st80 f172189a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29494F();
        top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
        f172189a = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, pt80.f181071a, null, null, 0, null, 494);
    }
}
