package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qos {

    /* JADX INFO: renamed from: a */
    public static final PlaylistRequestDecorationPolicy f191035a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29524j0();
        bjp0VarM18365h0.m29496H();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        f191035a = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }
}
