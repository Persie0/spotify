package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d0c0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43843a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f43845c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f43846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0c0(String str, String str2, boolean z) {
        super(1);
        this.f43844b = str;
        this.f43845c = str2;
        this.f43846d = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String string;
        switch (this.f43843a) {
            case 0:
                w4h0 w4h0Var = (w4h0) obj;
                boolean z = this.f43846d;
                String str = this.f43845c;
                String str2 = this.f43844b;
                if (z) {
                    dv91 dv91Var = new dv91("hit", 1);
                    String string2 = str2 != null ? str2.toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    pqm0 pqm0Var = new pqm0("playlist", string2);
                    string = str != null ? str.toString() : null;
                    return new av91("", "", dv91Var, new bv91("remove_user_as_playlist_collaborator", 1, kkc0.m56695h0(pqm0Var, new pqm0("user_to_be_removed_as_collaborator", string != null ? string : ""))), w4h0Var.f247830a, st91.f213865b, System.currentTimeMillis());
                }
                dv91 dv91Var2 = new dv91("hit", 1);
                String string3 = str2 != null ? str2.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                pqm0 pqm0Var2 = new pqm0("playlist", string3);
                string = str != null ? str.toString() : null;
                return new av91("", "", dv91Var2, new bv91("make_user_a_playlist_collaborator", 1, kkc0.m56695h0(pqm0Var2, new pqm0("user_to_be_made_collaborator", string != null ? string : ""))), w4h0Var.f247830a, st91.f213865b, System.currentTimeMillis());
            default:
                cqx cqxVar = (cqx) obj;
                cqxVar.m33646a(this.f43844b, eua1.class, false);
                String str3 = this.f43845c;
                if (str3.length() > 0) {
                    cqxVar.m33646a(str3, erc1.class, false);
                    if (this.f43846d) {
                        cqxVar.m33646a(str3, v140.class, false);
                    }
                    cqxVar.m33646a(str3, ok11.class, false);
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0c0(boolean z, String str, String str2) {
        super(1);
        this.f43846d = z;
        this.f43844b = str;
        this.f43845c = str2;
    }
}
