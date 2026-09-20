package p204p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;

/* JADX INFO: loaded from: classes10.dex */
public final class gap0 {

    /* JADX INFO: renamed from: a */
    public final nbm0 f78086a;

    public gap0(nbm0 nbm0Var) {
        this.f78086a = nbm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final EsLoggingParams$LoggingParams m44179a(long j, d850 d850Var) {
        z650 z650Var;
        ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
        kbm0 kbm0Var = this.f78086a.get();
        String str = null;
        String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str2 == null) {
            str2 = "";
        }
        ilwVarM17768t.m51044q(str2);
        if (d850Var != null && (z650Var = d850Var.f46380a) != null) {
            str = z650Var.f279709a;
        }
        ilwVarM17768t.m51043m(str != null ? str : "");
        umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
        umwVarM17777q.m83492m(j);
        ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
        return (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
    }
}
