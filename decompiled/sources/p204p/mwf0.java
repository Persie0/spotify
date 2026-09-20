package p204p;

import com.spotify.playlistmixing.endpoints.PlaylistMixDuplicationError;
import com.spotify.playlistmixing.proto.DuplicateMixRequest;
import com.spotify.playlistmixing.proto.DuplicateMixResponse;
import com.spotify.playlistmixing.proto.TransitionOverride;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class mwf0 implements kwf0 {

    /* JADX INFO: renamed from: a */
    public final nwf0 f147783a;

    /* JADX INFO: renamed from: b */
    public final r991 f147784b;

    public mwf0(nwf0 nwf0Var, r991 r991Var) {
        this.f147783a = nwf0Var;
        this.f147784b = r991Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m63011a(String str, b791 b791Var, String str2, boolean z, ibk ibkVar) {
        lwf0 lwf0Var;
        if (ibkVar instanceof lwf0) {
            lwf0Var = (lwf0) ibkVar;
            int i = lwf0Var.f137564c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwf0Var.f137564c = i - Integer.MIN_VALUE;
            } else {
                lwf0Var = new lwf0(this, ibkVar);
            }
        } else {
            lwf0Var = new lwf0(this, ibkVar);
        }
        Object objM96567o = lwf0Var.f137562a;
        int i2 = lwf0Var.f137564c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                aks aksVarM19382q = DuplicateMixRequest.m19382q();
                aksVarM19382q.m26259r(str);
                aksVarM19382q.m26258q(z);
                if (b791Var != null && str2 != null) {
                    q991 q991VarM19441p = TransitionOverride.m19441p();
                    q991VarM19441p.m72358m(l6l.m58361j(str2));
                    this.f147784b.getClass();
                    q991VarM19441p.m72359q(r991.m75018c(b791Var));
                    aksVarM19382q.m26257m((TransitionOverride) q991VarM19441p.build());
                }
                DuplicateMixRequest duplicateMixRequest = (DuplicateMixRequest) aksVarM19382q.build();
                nwf0 nwf0Var = this.f147783a;
                wj50.m88279p(duplicateMixRequest);
                Single<DuplicateMixResponse> singleTimeout = nwf0Var.m65763a(duplicateMixRequest).timeout(5L, TimeUnit.SECONDS);
                lwf0Var.f137564c = 1;
                objM96567o = zn91.m96567o(singleTimeout, lwf0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return ((DuplicateMixResponse) objM96567o).getPlaylistUri();
        } catch (Exception unused) {
            return new c6x0(PlaylistMixDuplicationError.DuplicateCreationFailed.f6469a);
        }
    }
}
