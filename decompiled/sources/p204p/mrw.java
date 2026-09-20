package p204p;

import com.spotify.player.esperanto.internal.PlayerInternalError;
import com.spotify.player.esperanto.proto.EsPlay$PlayPreparedRequest;
import com.spotify.player.model.command.PlaySessionCommand;
import com.spotify.player.model.command.options.PlayOptions;
import io.reactivex.rxjava3.core.Single;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class mrw {

    /* JADX INFO: renamed from: a */
    public final r7k f146622a;

    /* JADX INFO: renamed from: b */
    public final msa0 f146623b;

    /* JADX INFO: renamed from: c */
    public final String f146624c;

    /* JADX INFO: renamed from: d */
    public final boolean f146625d;

    /* JADX INFO: renamed from: e */
    public boolean f146626e;

    public mrw(r7k r7kVar, msa0 msa0Var, String str, boolean z) {
        this.f146622a = r7kVar;
        this.f146623b = msa0Var;
        this.f146624c = str;
        this.f146625d = z;
    }

    /* JADX INFO: renamed from: a */
    public final Single m62646a(PlaySessionCommand playSessionCommand) {
        xmw xmwVarM17789r = EsPlay$PlayPreparedRequest.m17789r();
        xmwVarM17789r.m91481s(this.f146624c);
        xmwVarM17789r.m91478m(wvf1.m89117u(this.f146623b.m62706a(playSessionCommand.loggingParams())));
        if (playSessionCommand.playOptions().mo49279c()) {
            xmwVarM17789r.m91480r(k3h1.m55266y((PlayOptions) playSessionCommand.playOptions().mo49278b()));
            xmwVarM17789r.m91479q(lhg1.m58986m(((PlayOptions) playSessionCommand.playOptions().mo49278b()).commandOptions()));
        }
        this.f146626e = true;
        return this.f146622a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "PlayPrepared", (EsPlay$PlayPreparedRequest) xmwVarM17789r.build()).map(uwk.f234669Q0).map(o5h1.f161993b1);
    }

    public final void finalize() {
        if (!this.f146626e) {
            throw new PlayerInternalError(new Throwable(String.format("PreparedSession '%s' has not been destroyed", Arrays.copyOf(new Object[]{this.f146624c}, 1))));
        }
    }
}
