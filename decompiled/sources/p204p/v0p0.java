package p204p;

import com.spotify.mobius.Connection;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class v0p0 implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f236096a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zv41 f236097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c9k f236098c;

    public v0p0(zv41 zv41Var, c9k c9kVar) {
        this.f236097b = zv41Var;
        this.f236098c = c9kVar;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        boolean z;
        switch (this.f236096a) {
            case 0:
                this.f236097b.m97090l(((fsx) obj).getEntityUri());
                return;
            default:
                fsx fsxVar = (fsx) obj;
                String entityUri = fsxVar.getEntityUri();
                if (fsxVar instanceof esx) {
                    z = ((esx) fsxVar).f62516e;
                } else if (fsxVar instanceof dsx) {
                    z = ((dsx) fsxVar).f52660f;
                } else {
                    if (!(fsxVar instanceof csx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                this.f236097b.m97091m(null, new pqm0(entityUri, Boolean.valueOf(z)));
                return;
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        switch (this.f236096a) {
            case 0:
                tf60 tf60Var = (tf60) this.f236098c.f35578a.mo26595B(gk40.f80712X0);
                if (tf60Var != null) {
                    tf60Var.mo26601e(null);
                }
                break;
            default:
                tf60 tf60Var2 = (tf60) this.f236098c.f35578a.mo26595B(gk40.f80712X0);
                if (tf60Var2 != null) {
                    tf60Var2.mo26601e(null);
                }
                break;
        }
    }

    public v0p0(zv41 zv41Var, w0p0 w0p0Var, c9k c9kVar) {
        this.f236097b = zv41Var;
        this.f236098c = c9kVar;
    }
}
