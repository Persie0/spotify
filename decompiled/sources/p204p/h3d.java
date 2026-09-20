package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class h3d extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i3d f87214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3d(i3d i3dVar, int i) {
        super(1);
        this.f87213a = i;
        this.f87214b = i3dVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f87213a) {
            case 0:
                String str = (String) obj;
                i3d i3dVar = this.f87214b;
                kv91 kv91VarM49603z1 = i3dVar.m49603z1();
                bbg0 bbg0Var = i3dVar.f98135U1;
                bbg0Var.getClass();
                yt91 yt91VarM96903c = bbg0Var.f25561b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("terms_of_use_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str.toString();
                if (string == null) {
                    string = "";
                }
                kv91VarM49603z1.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                i3d.m49602y1(i3dVar, str);
                break;
            default:
                String str2 = (String) obj;
                i3d i3dVar2 = this.f87214b;
                kv91 kv91VarM49603z2 = i3dVar2.m49603z1();
                bbg0 bbg0Var2 = i3dVar2.f98135U1;
                bbg0Var2.getClass();
                yt91 yt91VarM96903c2 = bbg0Var2.f25561b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("platform_rules_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str2.toString();
                if (string2 == null) {
                    string2 = "";
                }
                kv91VarM49603z2.mo57453r(new av91("", "", dv91Var2, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string2)), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
                i3d.m49602y1(i3dVar2, str2);
                break;
        }
        return w2a1.f247311a;
    }
}
