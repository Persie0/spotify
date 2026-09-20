package p204p;

import android.content.Context;
import com.spotify.clientoptinproxy.p045v1.SendClientActionRequest;
import com.spotify.clientoptinproxy.p045v1.SendClientActionResponse;
import com.spotify.music.R;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class orl0 implements mrl0 {

    /* JADX INFO: renamed from: a */
    public final Context f168621a;

    /* JADX INFO: renamed from: b */
    public final zle f168622b;

    /* JADX INFO: renamed from: c */
    public final q831 f168623c;

    public orl0(Context context, zle zleVar, q831 q831Var) {
        this.f168621a = context;
        this.f168622b = zleVar;
        this.f168623c = q831Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m67698a(String str, Map map, boolean z, ibk ibkVar) {
        nrl0 nrl0Var;
        if (ibkVar instanceof nrl0) {
            nrl0Var = (nrl0) ibkVar;
            int i = nrl0Var.f157583c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrl0Var.f157583c = i - Integer.MIN_VALUE;
            } else {
                nrl0Var = new nrl0(this, ibkVar);
            }
        } else {
            nrl0Var = new nrl0(this, ibkVar);
        }
        Object objM96364a = nrl0Var.f157581a;
        int i2 = nrl0Var.f157583c;
        if (i2 == 0) {
            bga.m29073P(objM96364a);
            fqz0 fqz0VarM6772q = SendClientActionRequest.m6772q();
            fqz0VarM6772q.m42448q(str);
            fqz0VarM6772q.m42449r(z);
            if (map != null) {
                fqz0VarM6772q.m42447m(map);
            }
            SendClientActionRequest sendClientActionRequest = (SendClientActionRequest) fqz0VarM6772q.build();
            nrl0Var.f157583c = 1;
            objM96364a = this.f168622b.m96364a(sendClientActionRequest, nrl0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96364a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96364a);
        }
        SendClientActionResponse sendClientActionResponse = (SendClientActionResponse) objM96364a;
        if (sendClientActionResponse.m6774o()) {
            throw new IllegalStateException(edb.m38564m("OptIn action failed: ", sendClientActionResponse.m6773n().getMessage()));
        }
        g631 g631Var = new g631(null, this.f168621a.getString(R.string.opt_in_out_response_saved), null, null, null, null, null, null, false);
        q831 q831Var = this.f168623c;
        if (q831Var.m72301f()) {
            q831Var.m72305j(g631Var);
        } else {
            q831Var.m72307m(g631Var);
        }
        return w2a1.f247311a;
    }
}
