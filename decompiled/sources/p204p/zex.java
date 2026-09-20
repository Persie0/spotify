package p204p;

import com.spotify.mobius.Connection;

/* JADX INFO: loaded from: classes2.dex */
public final class zex implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f282146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f282147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di41 f282148c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hb11 f282149d;

    public zex(Object obj, nlv0 nlv0Var, di41 di41Var, hb11 hb11Var) {
        this.f282146a = obj;
        this.f282147b = nlv0Var;
        this.f282148c = di41Var;
        this.f282149d = hb11Var;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f282149d.mo46962a(obj);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        Object obj = this.f282146a;
        nlv0 nlv0Var = this.f282147b;
        di41 di41Var = this.f282148c;
        synchronized (obj) {
            if (!nlv0Var.f155174a) {
                nlv0Var.f155174a = true;
                di41Var.mo26601e(null);
            }
        }
    }
}
