package p204p;

import android.database.SQLException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t29 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f216460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f216461c;

    public /* synthetic */ t29(Object obj, boolean z, int i) {
        this.f216459a = i;
        this.f216461c = obj;
        this.f216460b = z;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        hqi0 hqi0VarM38275i;
        switch (this.f216459a) {
            case 0:
                hqi0 hqi0Var = (hqi0) this.f216461c;
                boolean z = this.f216460b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (z) {
                    hqi0Var.mo46962a(w2a1Var);
                }
                return w2a1Var;
            case 1:
                bzi bziVar = (bzi) this.f216461c;
                String str = this.f216460b ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                bziVar.f32503b.m38255d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                bziVar.f32502a.m38255d(sb);
                try {
                    mif1.m61859L(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i = bziVar.f32508g;
                    if (i == 1) {
                        throw e;
                    }
                    if (i == 2) {
                        e.printStackTrace();
                    }
                    return w2a1.f247311a;
                }
            case 2:
                eh00 eh00Var = (eh00) this.f216461c;
                if (this.f216460b) {
                    eh00Var.invoke();
                }
                return w2a1.f247311a;
            case 3:
                ea4 ea4Var = (ea4) this.f216461c;
                boolean z2 = this.f216460b;
                w2a1 w2a1Var2 = w2a1.f247311a;
                if (z2 && (hqi0VarM38275i = ea4Var.m38275i()) != null) {
                    ((hb11) hqi0VarM38275i).mo46962a(w2a1Var2);
                }
                return w2a1Var2;
            case 4:
                aqz aqzVar = (aqz) this.f216461c;
                if (this.f216460b) {
                    aqz.m26907b(aqzVar);
                }
                return w2a1.f247311a;
            default:
                ((gh00) this.f216461c).invoke(Boolean.valueOf(!this.f216460b));
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ t29(boolean z, Object obj, int i) {
        this.f216459a = i;
        this.f216460b = z;
        this.f216461c = obj;
    }
}
